package moxi.core.demo.service.wallet.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import moxi.core.demo.model.task.TaskDO;
import moxi.core.demo.model.wallet.CustomerWalletLogTemp;
import moxi.core.demo.model.wallet.TCustomerWallet;
import moxi.core.demo.dao.wallet.TCustomerWalletMapper;
import moxi.core.demo.model.wallet.TCustomerWalletLog;
import moxi.core.demo.service.wallet.ICustomerWalletLogTempService;
import moxi.core.demo.service.wallet.ITCustomerWalletLogService;
import moxi.core.demo.service.wallet.ITCustomerWalletService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 客户资产 服务实现类
 * </p>
 *
 * @author winter
 * @since 2019-01-25
 */
@Service
@Slf4j
public class TCustomerWalletServiceImpl extends ServiceImpl<TCustomerWalletMapper, TCustomerWallet> implements ITCustomerWalletService {

    @Resource
    private ITCustomerWalletLogService itCustomerWalletLogService;


    @Resource
    private ICustomerWalletLogTempService customerWalletLogTempService;

    @Resource(name = "customerWalletLog")
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;



    //  TCustomerWalletLogService.insetLogThreadQueue 将临时表 整理进入 资产流水日志表
    public Boolean insetLogThreadQueue(){
        // 查询所有 有记录的客户id不重复
        List<String> customerIdList = customerWalletLogTempService.customerIdList();

        for (String customerId : customerIdList) {
            threadPoolTaskExecutor.execute(()->{
                TaskDO taskDO = new TaskDO();
                taskDO.setCustomerId(customerId);
                //  查询某个客户的所有资产记录
                List<CustomerWalletLogTemp> customerWalletLogTempList = customerWalletLogTempService.list(taskDO);
                //插入记录

                Boolean result = insertCustomerWalletLog(customerWalletLogTempList);

            });
        }



        return true;
    }


    private Boolean insertCustomerWalletLog(List<CustomerWalletLogTemp> customerWalletLogTempList){

//        List<TCustomerWalletLog> tCustomerWalletLogList = new ArrayList<>();

        for (CustomerWalletLogTemp customerWalletLogTemp : customerWalletLogTempList) {
//            TCustomerWallet tCustomerWallet = new TCustomerWallet();
            switch (customerWalletLogTemp.getType()){
                case "CASH_RECEIPT":
                    // 现金收款
                    if (customerWalletLogTemp.getAmount().compareTo(new BigDecimal("0")) >= 0){
                        addCustomerAvailble(
                                customerWalletLogTemp.getCustomerId(), customerWalletLogTemp.getProductId(), customerWalletLogTemp.getAmount(),
                                customerWalletLogTemp.getType(), customerWalletLogTemp.getOrderId(), customerWalletLogTemp.getCreateTime()
                        );
                    }else{
                        subtractCustomerAvailble(
                                customerWalletLogTemp.getCustomerId(), customerWalletLogTemp.getProductId(), customerWalletLogTemp.getAmount().abs(),
                                customerWalletLogTemp.getType(), customerWalletLogTemp.getOrderId(), customerWalletLogTemp.getCreateTime()
                        );
                    }
                    break;
                case "NON_CASH_RECEIPT" :
                    //非现金收款
                    addCustomerAvailble(
                            customerWalletLogTemp.getCustomerId(), customerWalletLogTemp.getProductId(), customerWalletLogTemp.getAmount(),
                            customerWalletLogTemp.getType(), customerWalletLogTemp.getOrderId(), customerWalletLogTemp.getCreateTime()
                    );break;
                case "RETREAT":
                    //退领
                    subtractCustomerAvailble(
                            customerWalletLogTemp.getCustomerId(), customerWalletLogTemp.getProductId(), customerWalletLogTemp.getAmount().abs(),
                            customerWalletLogTemp.getType(), customerWalletLogTemp.getOrderId(), customerWalletLogTemp.getCreateTime()
                    );break;
                case "REFUND":
                    //退款
                    subtractCustomerAvailble(
                            customerWalletLogTemp.getCustomerId(), customerWalletLogTemp.getProductId(), customerWalletLogTemp.getAmount().abs(),
                            customerWalletLogTemp.getType(), customerWalletLogTemp.getOrderId(), customerWalletLogTemp.getCreateTime()
                    );break;
                case "TASK":
                    //任务
                    subtractCustomerAvailble(
                            customerWalletLogTemp.getCustomerId(), customerWalletLogTemp.getProductId(), customerWalletLogTemp.getAmount().abs(),
                            customerWalletLogTemp.getType(), customerWalletLogTemp.getOrderId(), customerWalletLogTemp.getCreateTime()
                    );break;
                case "PENALTY":
                    //违约金
                    subtractCustomerAvailble(
                            customerWalletLogTemp.getCustomerId(), customerWalletLogTemp.getProductId(), customerWalletLogTemp.getAmount().abs(),
                            customerWalletLogTemp.getType(), customerWalletLogTemp.getOrderId(), customerWalletLogTemp.getCreateTime()
                    );break;

                default:
                        log.error("未知类型=========");
            }

        }
        return true;
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean subtractCustomerAvailble(String customerId, String productId, BigDecimal amount, String type, String orderId, Long time) {
        TCustomerWallet tCustomerWallet = isCustomerAssetsExist(customerId, productId);
        //check customer available
        //subtract customer availble
        // write log
//        this.isAvailable(tCustomerWallet.getAvailable(), amount)
        this.subtractAvailble(tCustomerWallet, customerId, productId, amount)
                .subtractWriteWalletLog(tCustomerWallet, type, orderId, amount, time);

        return true;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean addCustomerAvailble(String customerId, String productId, BigDecimal amount, String type, String orderId, Long time) {
        TCustomerWallet tCustomerWallet = isCustomerAssetsExist(customerId, productId);
        //subtract customer availble
        // write log
        this.addAvailble(tCustomerWallet, customerId, productId, amount)
                .addWriteWalletLog(tCustomerWallet, type, orderId, amount, time);
        return true;
    }

    /**
     * 写入日志
     * */
    private void subtractWriteWalletLog(TCustomerWallet customerWallet, String type,
                                String orderId, BigDecimal amount, Long time){
        itCustomerWalletLogService.subtractWriteWalletLog(customerWallet, type, orderId, amount, time);
    }
    private void addWriteWalletLog(TCustomerWallet customerWallet, String type,
                                String orderId, BigDecimal amount, Long time){
        itCustomerWalletLogService.addWriteWalletLog(customerWallet, type, orderId, amount, time);
    }


    /**
     * 校验用户余额
     * 并返回客户余额资产情况
     *
     * @author winter
     * @param customerId 客户id
     * @param productId 币种
     * @return UserWallet
     * */
    private TCustomerWallet isCustomerAssetsExist(String customerId, String productId){
        EntityWrapper<TCustomerWallet> condition = this.condition(customerId, productId);

        TCustomerWallet tCustomerWallet = this.selectOne(condition);
        if(tCustomerWallet == null){
            tCustomerWallet = initCustomerWallet(customerId, productId);
        }
        return tCustomerWallet;
    }

    /**
     *  资产原子粒度方法 - 增加资产
     * */
    private TCustomerWalletServiceImpl addAvailble(TCustomerWallet tCustomerWallet, String customerId, String productId, BigDecimal amount){
        EntityWrapper<TCustomerWallet> condition = this.condition(customerId, productId);

        tCustomerWallet.setAvailable(tCustomerWallet.getAvailable().add(amount));
        tCustomerWallet.setUpdateTime((new Date()).getTime());

        this.update(tCustomerWallet, condition);
        return this;
    }

    /**
     *  资产原子粒度方法 - 减少资产
     * */
    private TCustomerWalletServiceImpl subtractAvailble(TCustomerWallet tCustomerWallet, String customerId, String productId, BigDecimal amount){
        EntityWrapper<TCustomerWallet> condition = this.condition(customerId, productId);

        tCustomerWallet.setAvailable(tCustomerWallet.getAvailable().subtract(amount));
        tCustomerWallet.setUpdateTime((new Date()).getTime());

        this.update(tCustomerWallet, condition);
        return this;
    }
    /**
     *  资产原子粒度方法 - 减少冻结资产
     * */
    private TCustomerWalletServiceImpl subtractLocked(TCustomerWallet tCustomerWallet, String customerId, String productId, BigDecimal amount){
        EntityWrapper<TCustomerWallet> condition = this.condition(customerId, productId);

        tCustomerWallet.setLocked(tCustomerWallet.getLocked().subtract(amount));
        tCustomerWallet.setUpdateTime((new Date()).getTime());

        this.update(tCustomerWallet, condition);
        return this;
    }
    /**
     *  资产原子粒度方法 - 增加冻结资产
     * */
    private TCustomerWalletServiceImpl addLocked(TCustomerWallet tCustomerWallet, String customerId, String productId, BigDecimal amount){
        EntityWrapper<TCustomerWallet> condition = this.condition(customerId, productId);

        tCustomerWallet.setLocked(tCustomerWallet.getLocked().add(amount));
        tCustomerWallet.setUpdateTime((new Date()).getTime());

        this.update(tCustomerWallet, condition);
        return this;
    }

    /**
     * 生成条件
     * */
    private EntityWrapper<TCustomerWallet> condition(String customerId, String productId){
        EntityWrapper<TCustomerWallet> condition = new EntityWrapper<>();
        condition.eq("customer_id", customerId);
        condition.eq("product_id", productId);
        return condition;
    }


    /**
     * 初始化用户钱包
     * */
    private TCustomerWallet initCustomerWallet(String customerId, String coinCode){
        TCustomerWallet customerWallet = new TCustomerWallet();
        customerWallet.setCreateTime( (new Date()).getTime());
        customerWallet.setCustomerId(customerId);
        customerWallet.setProductId(coinCode);
        customerWallet.setLocked(new BigDecimal(0));
        customerWallet.setAvailable(new BigDecimal(0));
        customerWallet.setUpdateTime((new Date()).getTime());
        this.insert(customerWallet);
        return customerWallet;
    }


}

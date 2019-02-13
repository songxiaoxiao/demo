package moxi.core.demo.service.wallet.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import moxi.core.demo.model.task.TaskDO;
import moxi.core.demo.model.wallet.CustomerWalletLogTemp;
import moxi.core.demo.model.wallet.TCustomerWallet;
import moxi.core.demo.model.wallet.TCustomerWalletLog;
import moxi.core.demo.dao.wallet.TCustomerWalletLogMapper;
import moxi.core.demo.remoteservice.CustomerWalletLogOuterService;
import moxi.core.demo.service.wallet.ICustomerWalletLogTempService;
import moxi.core.demo.service.wallet.ITCustomerWalletLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 资产流水日志 服务实现类
 * </p>
 *
 * @author winter
 * @since 2019-01-25
 */
@Service
public class TCustomerWalletLogServiceImpl extends ServiceImpl<TCustomerWalletLogMapper, TCustomerWalletLog> implements ITCustomerWalletLogService {




    public void subtractWriteWalletLog(TCustomerWallet customerWallet, String type, String orderId, BigDecimal amount, Long time){
        TCustomerWalletLog tCustomerWalletLog = new TCustomerWalletLog();

        tCustomerWalletLog.setCustomerId(customerWallet.getCustomerId());
        tCustomerWalletLog.setType(type);
        tCustomerWalletLog.setProductId(customerWallet.getProductId());
        tCustomerWalletLog.setCreateTime(time);
        tCustomerWalletLog.setOrderId(orderId);
        //可用资产变动
        tCustomerWalletLog.setAmount(amount);
        tCustomerWalletLog.setBeforeAmount(customerWallet.getAvailable().add(amount));
        tCustomerWalletLog.setAfterAmount(customerWallet.getAvailable());
        //冻结资产变动

        this.insert(tCustomerWalletLog);
    }
    public void addWriteWalletLog(TCustomerWallet customerWallet, String type, String orderId, BigDecimal amount, Long time){
        TCustomerWalletLog tCustomerWalletLog = new TCustomerWalletLog();

        tCustomerWalletLog.setCustomerId(customerWallet.getCustomerId());
        tCustomerWalletLog.setType(type);
        tCustomerWalletLog.setProductId(customerWallet.getProductId());
        tCustomerWalletLog.setCreateTime(time);
        tCustomerWalletLog.setOrderId(orderId);
        //可用资产变动
        tCustomerWalletLog.setAmount(amount);
        tCustomerWalletLog.setBeforeAmount(customerWallet.getAvailable().subtract(amount));
        tCustomerWalletLog.setAfterAmount(customerWallet.getAvailable());
        //冻结资产变动

//        tCustomerWalletLog.insert();
        this.insert(tCustomerWalletLog);
    }


    public List<TCustomerWalletLog> list(){
        EntityWrapper<TCustomerWalletLog> condition = new EntityWrapper<>();
        condition.eq("type", "MAKE_UP");
        return this.selectList(condition);
    }

    public List<TCustomerWalletLog> withdrawList(){
        EntityWrapper<TCustomerWalletLog> condition = new EntityWrapper<>();
        condition.eq("type", "WITHDRAW");
        return this.selectList(condition);
    }
    public Boolean deleteLog(TCustomerWalletLog customerWalletLog){
        EntityWrapper<TCustomerWalletLog> condition = new EntityWrapper<>();
        condition.eq("type", "MAKE_UP");
        condition.eq("id", customerWalletLog.getId());
        return this.delete(condition);
    }

    public Boolean updateLog(TCustomerWalletLog customerWalletLog){
        EntityWrapper<TCustomerWalletLog> condition = new EntityWrapper<>();
        condition.ne("type", "MAKE_UP");
        condition.gt("create_time", customerWalletLog.getCreateTime());
        condition.eq("customer_id", customerWalletLog.getCustomerId());
        condition.eq("product_id", customerWalletLog.getProductId());

        List<TCustomerWalletLog> tCustomerWalletLogList = this.selectList(condition);
        if (tCustomerWalletLogList.isEmpty()) return null;
        for (TCustomerWalletLog tcustomerWalletLog : tCustomerWalletLogList) {

            tcustomerWalletLog.setAfterAmount(tcustomerWalletLog.getAfterAmount().subtract(customerWalletLog.getAmount()));
            tcustomerWalletLog.setBeforeAmount(tcustomerWalletLog.getBeforeAmount().subtract(customerWalletLog.getAmount()));
        }

        return this.updateBatchById(tCustomerWalletLogList);
    }
}

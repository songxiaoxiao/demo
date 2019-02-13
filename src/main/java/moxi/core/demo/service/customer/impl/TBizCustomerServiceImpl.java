package moxi.core.demo.service.customer.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import moxi.core.demo.dao.customer.TBizCustomerMapper;
import moxi.core.demo.dao.fc.TFcClaimMapper;
import moxi.core.demo.dao.fc.TFcExpenditureMapper;
import moxi.core.demo.dao.task.TTaskDzInfoMapper;
import moxi.core.demo.model.customer.TBizCustomer;
import moxi.core.demo.model.fc.TFcClaim;
import moxi.core.demo.model.task.TTaskBase;
import moxi.core.demo.model.task.TaskDO;
import moxi.core.demo.model.wallet.CustomerWalletLogTemp;
import moxi.core.demo.service.customer.ITBizCustomerService;
import moxi.core.demo.service.task.impl.TTaskBaseServiceImpl;
import moxi.core.demo.service.wallet.ICustomerWalletLogTempService;
import moxi.core.demo.vo.WalletTempVO;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 业务-客户信息表 服务实现类
 * </p>
 *
 * @author winter
 * @since 2019-01-25
 */
@Service("TBizCustomerServiceImpl")
@Slf4j
public class TBizCustomerServiceImpl extends ServiceImpl<TBizCustomerMapper, TBizCustomer> implements ITBizCustomerService {

    @Resource(name = "customerWalletLog")
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Resource
    private TTaskDzInfoMapper tTaskDzInfoMapper;

    @Resource
    private ICustomerWalletLogTempService customerWalletLogTempService;

    @Resource
    private TTaskBaseServiceImpl taskBaseService;

    @Resource
    private TFcClaimMapper fcClaimMapper;

    @Resource
    private TFcExpenditureMapper fcExpenditureMapper;

    public List<TBizCustomer> list(){
        EntityWrapper<TBizCustomer> condition = new EntityWrapper<>();
        condition.eq("DATA_STATE", 1);
        return this.selectList(condition);
    }

    public Boolean setThreadQueue(){
        List<TBizCustomer> bizCustomerList = list();
        for (TBizCustomer bizCustomer : bizCustomerList) {
            threadPoolTaskExecutor.execute(()->{

                List<CustomerWalletLogTemp> customerWalletLogTempList = new ArrayList<>();



                log.info("bizCustomer.toString() 加入线程池：" + bizCustomer.toString());
                //查询任务
                TaskDO taskDO = new TaskDO();
                taskDO.setCustomerId(bizCustomer.getId());

                List<WalletTempVO> tasklist = tTaskDzInfoMapper.list(taskDO);
                for (WalletTempVO taskinfo: tasklist) {
                    customerWalletLogTempList.add(setCustomerWalletLogTemp(taskinfo, "TASK"));

                }
                    //非呆帐任务
                List<WalletTempVO> notCtasklist = tTaskDzInfoMapper.notCList(taskDO);
                for (WalletTempVO notCtaskinfo: notCtasklist) {
                    customerWalletLogTempList.add(setCustomerWalletLogTemp(notCtaskinfo, "TASK"));
                }


                // 查询违约金 PENALTY
                List<TTaskBase> taskBaseList = taskBaseService.penaltyList(taskDO);
                for (TTaskBase taskBase : taskBaseList) {
                    WalletTempVO taskInfoVO = new WalletTempVO();
                    taskInfoVO.setAmount(taskBase.getPenalSum());
                    long timestamp = taskBase.getDataUpdateAt().getTime();
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String date = format.format(timestamp);

                    taskInfoVO.setDatetime(date);

                    taskInfoVO.setOrderId(taskBase.getId());
                    taskInfoVO.setRelCustomerId(taskBase.getRelCustomerId());
                    taskInfoVO.setRelProductId(taskBase.getRelProductId());


                    customerWalletLogTempList.add(setCustomerWalletLogTemp(taskInfoVO, "PENALTY"));
                }



                // 查询充值 -- 现金收款
                List<WalletTempVO> cashRerxeiptList = fcClaimMapper.cashReceipt(taskDO);
                for (WalletTempVO walletTempVO: cashRerxeiptList) {
                    customerWalletLogTempList.add(setCustomerWalletLogTemp(walletTempVO, "CASH_RECEIPT"));
                }


                // 查询充值 -- 非现金收款

                List<WalletTempVO> nonCashRerxeiptList = fcClaimMapper.nonCashReceipt(taskDO);
                for (WalletTempVO walletTempVO: nonCashRerxeiptList) {
                    customerWalletLogTempList.add(setCustomerWalletLogTemp(walletTempVO, "NON_CASH_RECEIPT"));
                }

                // 退领
                List<WalletTempVO> retreat = fcClaimMapper.retreat(taskDO);
                for (WalletTempVO walletTempVO: retreat) {
                    customerWalletLogTempList.add(setCustomerWalletLogTemp(walletTempVO, "RETREAT"));
                }


                 //退款
                List<WalletTempVO> refund = fcExpenditureMapper.refund(taskDO);
                for (WalletTempVO walletTempVO: refund) {
                    customerWalletLogTempList.add(setCustomerWalletLogTemp(walletTempVO, "REFUND"));
                }
                // 将所有历史数据插入temp表

                if (!customerWalletLogTempList.isEmpty())
                    customerWalletLogTempService.insertList(customerWalletLogTempList);

                // 后接  GO->: TCustomerWalletLogService.insetLogThreadQueue 将临时表 整理进入 资产流水日志表
                log.info("bizCustomer.toString() 执行完毕：" + bizCustomer.toString());
            });
//            break;
        }

        return true;

    }

    //设置任务
    private CustomerWalletLogTemp setCustomerWalletLogTemp(WalletTempVO walletTempVO, String type){
        CustomerWalletLogTemp customerWalletLogTemp = new CustomerWalletLogTemp();
        customerWalletLogTemp.setAmount(walletTempVO.getAmount());
        customerWalletLogTemp.setCustomerId(walletTempVO.getRelCustomerId());
        customerWalletLogTemp.setOrderId(walletTempVO.getOrderId());
        customerWalletLogTemp.setProductId(walletTempVO.getRelProductId());

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long timestamp = 0L;
        try{
            String date = walletTempVO.getDatetime();
            date = StringUtils.replace(date, ".0", "");

             timestamp = format.parse(date).getTime();
        }catch (ParseException exception){
            log.info("walletTempVO:" + walletTempVO.toString());
             timestamp = 0L;
        }

        customerWalletLogTemp.setCreateTime(timestamp);
        customerWalletLogTemp.setType(type);
        return customerWalletLogTemp;

    }
}

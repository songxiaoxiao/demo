package moxi.core.demo.service.wallet.impl;

import moxi.core.demo.model.task.TaskDO;
import moxi.core.demo.model.wallet.CustomerWalletLogTemp;
import moxi.core.demo.model.wallet.TCustomerWallet;
import moxi.core.demo.model.wallet.TCustomerWalletLog;
import moxi.core.demo.dao.wallet.TCustomerWalletLogMapper;
import moxi.core.demo.service.wallet.ICustomerWalletLogTempService;
import moxi.core.demo.service.wallet.ITCustomerWalletLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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

                insertCustomerWalletLog(customerWalletLogTempList);

            });
        }



        return true;
    }

    private Boolean insertCustomerWalletLog(List<CustomerWalletLogTemp> customerWalletLogTempList){

        List<TCustomerWalletLog> tCustomerWalletLogList = new ArrayList<>();

        for (CustomerWalletLogTemp customerWalletLogTemp : customerWalletLogTempList) {
            TCustomerWallet tCustomerWallet = new TCustomerWallet();

        }
        return true;
    }
}

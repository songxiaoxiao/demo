package moxi.core.demo.service.wallet.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import moxi.core.demo.dao.wallet.CustomerWalletLogTempMapper;
import moxi.core.demo.model.task.TaskDO;
import moxi.core.demo.model.wallet.CustomerWalletLogTemp;
import moxi.core.demo.service.wallet.ICustomerWalletLogTempService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author winter
 * @since 2019-01-26
 */
@Service
public class CustomerWalletLogTempServiceImpl extends ServiceImpl<CustomerWalletLogTempMapper, CustomerWalletLogTemp> implements ICustomerWalletLogTempService {
    public Boolean insertList(List<CustomerWalletLogTemp> customerWalletLogTempList){

        return this.insertBatch(customerWalletLogTempList);
    }

    public List<CustomerWalletLogTemp> list(TaskDO taskDO){

        EntityWrapper<CustomerWalletLogTemp> condition = new EntityWrapper<>();
        condition.eq("customer_id", taskDO.getCustomerId());
        condition.orderBy("create_time", true);
        return this.selectList(condition);
    }

    public List<String> customerIdList(){
        EntityWrapper<CustomerWalletLogTemp> condition = new EntityWrapper<>();
        condition.groupBy("customer_id");
        List<CustomerWalletLogTemp> list = this.selectList(condition);
        return list.stream().map(x -> x.getCustomerId()).distinct().collect(Collectors.toList());

    }
}

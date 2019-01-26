package moxi.core.demo.service.wallet;

import com.baomidou.mybatisplus.service.IService;
import moxi.core.demo.model.task.TaskDO;
import moxi.core.demo.model.wallet.CustomerWalletLogTemp;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author winter
 * @since 2019-01-26
 */
public interface ICustomerWalletLogTempService extends IService<CustomerWalletLogTemp> {

    Boolean insertList(List<CustomerWalletLogTemp> customerWalletLogTempList);
    /**
     * 根据客户id 查询相关记录按照时间正序
     * */
    List<CustomerWalletLogTemp> list(TaskDO taskDO);
    /**
     * 查询所有有记录的客户id不重复
     * */
    List<String> customerIdList();

}

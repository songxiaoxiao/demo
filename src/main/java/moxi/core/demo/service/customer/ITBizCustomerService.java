package moxi.core.demo.service.customer;

import com.baomidou.mybatisplus.service.IService;
import moxi.core.demo.model.customer.TBizCustomer;

import java.util.List;

/**
 * <p>
 * 业务-客户信息表 服务类
 * </p>
 *
 * @author winter
 * @since 2019-01-25
 */
public interface ITBizCustomerService extends IService<TBizCustomer> {


    List<TBizCustomer> list();
    Boolean setThreadQueue();

}

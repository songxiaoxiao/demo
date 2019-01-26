package moxi.core.demo.service.fc;

import com.baomidou.mybatisplus.service.IService;
import moxi.core.demo.model.fc.TFcClaim;
import moxi.core.demo.model.task.TaskDO;

import java.util.List;

/**
 * <p>
 * 财务-认领信息表 服务类
 * </p>
 *
 * @author winter
 * @since 2019-01-26
 */
public interface ITFcClaimService extends IService<TFcClaim> {
    //现金收款
//    List<TFcClaim> cashReceipt(TaskDO taskDO);
}

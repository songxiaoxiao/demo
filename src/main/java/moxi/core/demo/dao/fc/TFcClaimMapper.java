package moxi.core.demo.dao.fc;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import moxi.core.demo.model.fc.TFcClaim;
import moxi.core.demo.model.task.TaskDO;
import moxi.core.demo.vo.WalletTempVO;

import java.util.List;

/**
 * <p>
 * 财务-认领信息表 Mapper 接口
 * </p>
 *
 * @author winter
 * @since 2019-01-26
 */
public interface TFcClaimMapper extends BaseMapper<TFcClaim> {
    List<WalletTempVO> cashReceipt(TaskDO taskDO);
    List<WalletTempVO> nonCashReceipt(TaskDO taskDO);
    List<WalletTempVO> retreat(TaskDO taskDO);

}

package moxi.core.demo.dao.fc;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import moxi.core.demo.model.fc.TFcExpenditure;
import moxi.core.demo.model.task.TaskDO;
import moxi.core.demo.vo.WalletTempVO;

import java.util.List;

/**
 * <p>
 * 财务-支出信息表 Mapper 接口
 * </p>
 *
 * @author winter
 * @since 2019-01-26
 */
public interface TFcExpenditureMapper extends BaseMapper<TFcExpenditure> {
    List<WalletTempVO> refund(TaskDO taskDO);
}

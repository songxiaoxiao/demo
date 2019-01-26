package moxi.core.demo.dao.task;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import moxi.core.demo.model.task.TTaskDzInfo;
import moxi.core.demo.model.task.TaskDO;
import moxi.core.demo.vo.WalletTempVO;

import java.util.List;

/**
 * <p>
 * 任务-代账产品信息表 Mapper 接口
 * </p>
 *
 * @author winter
 * @since 2019-01-26
 */
public interface TTaskDzInfoMapper extends BaseMapper<TTaskDzInfo> {
        List<WalletTempVO> list(TaskDO taskDO);
        List<WalletTempVO> notCList(TaskDO taskDO);
}

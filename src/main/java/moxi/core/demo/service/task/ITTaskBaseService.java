package moxi.core.demo.service.task;

import com.baomidou.mybatisplus.service.IService;
import moxi.core.demo.model.task.TTaskBase;
import moxi.core.demo.model.task.TaskDO;

import java.util.List;

/**
 * <p>
 * 任务-基础信息表 服务类
 * </p>
 *
 * @author winter
 * @since 2019-01-26
 */
public interface ITTaskBaseService extends IService<TTaskBase> {
        //违约金
    List<TTaskBase>  penaltyList(TaskDO taskDO);
}

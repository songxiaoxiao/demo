package moxi.core.demo.service.task.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import moxi.core.demo.dao.task.TTaskBaseMapper;
import moxi.core.demo.model.task.TTaskBase;
import moxi.core.demo.model.task.TaskDO;
import moxi.core.demo.service.task.ITTaskBaseService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 任务-基础信息表 服务实现类
 * </p>
 *
 * @author winter
 * @since 2019-01-26
 */
@Service
public class TTaskBaseServiceImpl extends ServiceImpl<TTaskBaseMapper, TTaskBase> implements ITTaskBaseService {
    public List<TTaskBase> penaltyList(TaskDO taskDO){
        EntityWrapper<TTaskBase> condition = new EntityWrapper<>();
        condition.eq("TASK_STATE", 5);
        condition.eq("REL_CUSTOMER_ID", taskDO.getCustomerId());

        return this.selectList(condition);
    }
}

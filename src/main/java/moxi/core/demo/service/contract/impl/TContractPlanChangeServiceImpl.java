package moxi.core.demo.service.contract.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import moxi.core.demo.dao.contract.TContractPlanChangeMapper;
import moxi.core.demo.model.contract.ContractPlanChangeDO;
import moxi.core.demo.model.contract.TContractPlanChange;
import moxi.core.demo.service.contract.ITContractPlanChangeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 合同执行计划变动 服务实现类
 * </p>
 *
 * @author winter
 * @since 2019-02-16
 */
@Service
public class TContractPlanChangeServiceImpl extends ServiceImpl<TContractPlanChangeMapper, TContractPlanChange> implements ITContractPlanChangeService {
    public void contractPlanChange(ContractPlanChangeDO contractPlanChangeDO){

    }
}

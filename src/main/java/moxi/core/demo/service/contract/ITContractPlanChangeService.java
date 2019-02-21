package moxi.core.demo.service.contract;


import com.baomidou.mybatisplus.service.IService;
import moxi.core.demo.model.contract.ContractPlanChangeDO;
import moxi.core.demo.model.contract.TContractPlanChange;

/**
 * <p>
 * 合同执行计划变动 服务类
 * </p>
 *
 * @author winter
 * @since 2019-02-16
 */
public interface ITContractPlanChangeService extends IService<TContractPlanChange> {

    /**
     * 变更记录
     * */
    void contractPlanChange(ContractPlanChangeDO contractPlanChangeDO);
}

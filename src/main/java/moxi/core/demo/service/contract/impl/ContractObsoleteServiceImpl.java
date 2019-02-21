package moxi.core.demo.service.contract.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import moxi.core.demo.dao.contract.TContractPlanChangeMapper;
import moxi.core.demo.exceptions.AppRuntimeException;
import moxi.core.demo.model.contract.ContractPlanChangeDO;
import moxi.core.demo.model.contract.TContractPlanChange;
import moxi.core.demo.service.contract.ITContractPlanChangeService;
import moxi.core.demo.service.wallet.ICustomerWalletLogService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 合同执行计划变动 服务实现类   ---- 终止任务
 * </p>
 *
 * @author winter
 * @since 2019-02-16
 */
@Service
public class ContractObsoleteServiceImpl extends ServiceImpl<TContractPlanChangeMapper, TContractPlanChange> implements ITContractPlanChangeService {

    @Resource
    private ICustomerWalletLogService customerWalletLogService;

    @Resource(name = "contractTerminateTaskServiceImpl")
    private ITContractPlanChangeService contractTerminateTaskServiceImpl;

    public void contractPlanChange(@Validated ContractPlanChangeDO contractPlanChangeDO){

        EntityWrapper<TContractPlanChange> condition = new EntityWrapper<>();
        condition.eq("contract_id", contractPlanChangeDO.getContractId());
        condition.eq("customer_id", contractPlanChangeDO.getCustomerId());
        condition.groupBy("contract_product_id");
        List<TContractPlanChange> tContractPlanChanges = this.selectList(condition);
        if (tContractPlanChanges == null)throw new AppRuntimeException(400, "没有该合同的记录");

        for (TContractPlanChange tContractPlanChange : tContractPlanChanges) {
            contractPlanChangeDO.setTaskId(tContractPlanChange.getTaskId());
            contractPlanChangeDO.setContractProductId(tContractPlanChange.getContractProductId());
            contractPlanChangeDO.setProductId(tContractPlanChange.getProductId());
            contractTerminateTaskServiceImpl.contractPlanChange(contractPlanChangeDO );
        }


    }

}

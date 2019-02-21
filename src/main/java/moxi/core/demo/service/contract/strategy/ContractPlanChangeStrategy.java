package moxi.core.demo.service.contract.strategy;

import com.xjd.common.model.contract.ContractPlanChangeDO;
import com.xjd.common.service.contract.ITContractPlanChangeService;

public class ContractPlanChangeStrategy {

    private ITContractPlanChangeService contractPlanChangeService;

    public void contractPlanChangeStrategy(ITContractPlanChangeService contractPlanChangeService){
        this.contractPlanChangeService = contractPlanChangeService;
    }

    public void contractPlanChange(ContractPlanChangeDO contractPlanChangeDO){
        contractPlanChangeService.contractPlanChange(contractPlanChangeDO);
    }
}

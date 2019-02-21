package moxi.core.demo.service.contract.strategy;


import moxi.core.demo.model.contract.ContractPlanChangeDO;
import moxi.core.demo.service.contract.ITContractPlanChangeService;

public class ContractPlanChangeStrategy {

    private ITContractPlanChangeService contractPlanChangeService;

    public void contractPlanChangeStrategy(ITContractPlanChangeService contractPlanChangeService){
        this.contractPlanChangeService = contractPlanChangeService;
    }

    public void contractPlanChange(ContractPlanChangeDO contractPlanChangeDO){
        contractPlanChangeService.contractPlanChange(contractPlanChangeDO);
    }
}

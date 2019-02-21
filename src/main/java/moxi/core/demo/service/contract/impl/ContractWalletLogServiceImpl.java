package moxi.core.demo.service.contract.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import moxi.core.demo.dao.contract.TContractPlanChangeMapper;
import moxi.core.demo.model.contract.ContractPlanChangeDO;
import moxi.core.demo.model.contract.ContractPlanChangeVO;
import moxi.core.demo.model.contract.TContractPlanChange;
import moxi.core.demo.model.fc.TFcReceivable;
import moxi.core.demo.model.wallet.WalletLogVO;
import moxi.core.demo.service.contract.IContractWalletLogService;
import moxi.core.demo.service.contract.ITContractPlanChangeService;
import moxi.core.demo.service.fc.ITFcReceivableV2Service;
import moxi.core.demo.service.wallet.ICustomerWalletLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * <p>
 * 合同执行计划变动 服务实现类
 * </p>
 *
 * @author winter
 * @since 2019-02-16
 */
@Service
public class ContractWalletLogServiceImpl extends ServiceImpl<TContractPlanChangeMapper, TContractPlanChange> implements IContractWalletLogService {

    @Resource
    private ICustomerWalletLogService customerWalletLogService;

    @Resource
    private ITFcReceivableV2Service fcReceivableV2Service;
    /**
     * 签订合同
     * */
    @Resource(name = "contractSigningServiceImpl")
    private ITContractPlanChangeService contractSigningServiceImpl;
    public void contractSigning(ContractPlanChangeDO contractPlanChangeDO){
        contractSigningServiceImpl.contractPlanChange(contractPlanChangeDO);
    }

    /**
     * 修改任务价格
     * */
    @Resource(name = "contractModifyTaskPriceServiceImpl")
    private ITContractPlanChangeService contractModifyTaskPriceServiceImpl;
    public void modifyTaskPrice(ContractPlanChangeDO contractPlanChangeDO){
        contractModifyTaskPriceServiceImpl.contractPlanChange(contractPlanChangeDO);
    }
    /**
     * 终止合同
     * */
    @Resource(name = "contractTerminateTaskServiceImpl")
    private ITContractPlanChangeService contractTerminateTaskServiceImpl;
    public void terminateTask(ContractPlanChangeDO contractPlanChangeDO){
        contractTerminateTaskServiceImpl.contractPlanChange(contractPlanChangeDO);
    }

    /**
     * 完成任务
     * */
    @Resource(name = "contractCompleteTaskServiceImpl")
    private ITContractPlanChangeService contractCompleteTaskServiceImpl;
    public void completeTask(ContractPlanChangeDO contractPlanChangeDO){
        contractCompleteTaskServiceImpl.contractPlanChange(contractPlanChangeDO);
    }
    /**
     * 完成赠送任务
     * */
    @Resource(name = "contractCompleteGiftTaskServiceImpl")
    private ITContractPlanChangeService contractCompleteGiftTaskServiceImpl;
    public void completeGiftTask(ContractPlanChangeDO contractPlanChangeDO){
        contractCompleteGiftTaskServiceImpl.contractPlanChange(contractPlanChangeDO);
    }
    /**
     * 取消赠送任务
     * */
    @Resource(name = "contractCancelGiftTaskServiceImpl")
    private ITContractPlanChangeService contractCancelGiftTaskServiceImpl;
    public void cancelGiftTask(ContractPlanChangeDO contractPlanChangeDO){
        contractCancelGiftTaskServiceImpl.contractPlanChange(contractPlanChangeDO);
    }

    /**
     * 取消任务
     * */
    @Resource(name = "contractCancelTaskServiceImpl")
    private ITContractPlanChangeService contractCancelTaskServiceImpl;
    public void cancelTask(ContractPlanChangeDO contractPlanChangeDO){
        contractCancelTaskServiceImpl.contractPlanChange(contractPlanChangeDO);
    }
    /**
     * 作废合同
     * */
    @Resource(name = "contractObsoleteServiceImpl")
    private ITContractPlanChangeService contractObsoleteServiceImpl;
    public void obsoleteContract(ContractPlanChangeDO contractPlanChangeDO){
        contractObsoleteServiceImpl.contractPlanChange(contractPlanChangeDO);
    }

    /**
     *  查询合同详情
     * */
    public ContractPlanChangeVO contractBasisDetails(ContractPlanChangeDO contractPlanChangeDO){
        ContractPlanChangeVO contractPlanChangeVO = new ContractPlanChangeVO();
        EntityWrapper<TContractPlanChange> condition = new EntityWrapper<>();
        condition.eq("customer_id", contractPlanChangeDO.getCustomerId());
        condition.eq("product_id", contractPlanChangeDO.getProductId());
        condition.eq("contract_product_id", contractPlanChangeDO.getContractProductId());
        condition.orderBy("create_time", false);
        TContractPlanChange contractPlanChange = this.selectOne(condition);
        if (contractPlanChange == null) return contractPlanChangeVO;

        contractPlanChangeVO.setCustomerId(contractPlanChange.getCustomerId());
        contractPlanChangeVO.setContractId(contractPlanChange.getContractId());
        contractPlanChangeVO.setContractProductId(contractPlanChange.getContractProductId());
        contractPlanChangeVO.setPlannedCollection(contractPlanChange.getPlannedCollection());//支出预算

        WalletLogVO walletLogVO = new WalletLogVO();
        walletLogVO.setContractProductId(contractPlanChangeDO.getContractProductId());

        contractPlanChangeVO.setActualCollection(customerWalletLogService.incomeTotalAmount(walletLogVO)); //实收

        BigDecimal refundAmount = customerWalletLogService.refundTotalAmount(walletLogVO);

        contractPlanChangeVO.setRefund(refundAmount);
        contractPlanChangeVO.setConsumption(customerWalletLogService.taskTotalAmount(walletLogVO));// 消费

        EntityWrapper<TFcReceivable> receivaCondition = new EntityWrapper<>();
        receivaCondition.eq("REL_CONTRACT_ID", contractPlanChange.getContractId());
        receivaCondition.eq("REL_CUSTOMER_ID", contractPlanChange.getCustomerId());
        receivaCondition.eq("REL_PRODUCT_ID", contractPlanChange.getProductId());

        TFcReceivable tFcReceivable = fcReceivableV2Service.selectOne(receivaCondition);

        contractPlanChangeVO.setExpenditure(tFcReceivable.getExpenditureMoney().subtract(refundAmount));// 支出
        contractPlanChangeVO.setPenalty(customerWalletLogService.penaltyTotalAmount(walletLogVO));// 维护额近

        return contractPlanChangeVO;
    }

}

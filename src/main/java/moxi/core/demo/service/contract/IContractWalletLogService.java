package moxi.core.demo.service.contract;


import com.baomidou.mybatisplus.service.IService;
import moxi.core.demo.model.contract.ContractPlanChangeDO;
import moxi.core.demo.model.contract.ContractPlanChangeVO;
import moxi.core.demo.model.contract.TContractPlanChange;

/**
 * <p>
 * 合同执行计划变动 服务类
 * </p>
 *
 * @author winter
 * @since 2019-02-16
 */
public interface IContractWalletLogService extends IService<TContractPlanChange> {

    /**
     * 签订合同
     * @param contractPlanChangeDO 合同变更对象参数
     * @contractPlanChangeDO customerId 客户id 必须
     * @contractPlanChangeDO productId 产品id 必须
     * @contractPlanChangeDO contractProductId 子合同id 必须
     * @contractPlanChangeDO contractId 合同id 必须
     *
     * @contractPlanChangeDO price 单价（带记账任务为每月单价，其他类型为总价） 必须
     * @contractPlanChangeDO remainingPeriod 服务周期(除了带记账其余请传1) 必须
     * @contractPlanChangeDO remainingGiftPeriod 赠送服务周期（除了带记账其他请传0或不传） 非必须
     * @contractPlanChangeDO expenditureBudget 支出预算 必须
     *
     * */
    void contractSigning(ContractPlanChangeDO contractPlanChangeDO);

    /**
     * 修改任务价格
     * @param contractPlanChangeDO 合同变更对象参数
     * @contractPlanChangeDO customerId 客户id 必须
     * @contractPlanChangeDO productId 产品id 必须
     * @contractPlanChangeDO contractProductId 子合同id 必须
     * @contractPlanChangeDO contractId 合同id 必须
     *
     * @contractPlanChangeDO price 新单价
     *
     *
     * */
    void modifyTaskPrice(ContractPlanChangeDO contractPlanChangeDO);
    /**
     * 终止任务
     * @param contractPlanChangeDO 合同变更对象参数
     * @contractPlanChangeDO customerId 客户id 必须
     * @contractPlanChangeDO productId 产品id 必须
     * @contractPlanChangeDO contractProductId 子合同id 必须
     * @contractPlanChangeDO contractId 合同id 必须
     *
     * @contractPlanChangeDO taskId 任务id 必须
     * */
    void terminateTask(ContractPlanChangeDO contractPlanChangeDO);

    /**
     * 完成任务
     * @param contractPlanChangeDO 合同变更对象参数
     * @contractPlanChangeDO customerId 客户id 必须
     * @contractPlanChangeDO productId 产品id 必须
     * @contractPlanChangeDO contractProductId 子合同id 必须
     * @contractPlanChangeDO contractId 合同id 必须
     *
     * @contractPlanChangeDO taskId 任务id 必须
     *
     *
     * */
    void completeTask(ContractPlanChangeDO contractPlanChangeDO);
    /**
     * 完成赠送任务
     * @param contractPlanChangeDO 合同变更对象参数
     * @contractPlanChangeDO customerId 客户id 必须
     * @contractPlanChangeDO productId 产品id 必须
     * @contractPlanChangeDO contractProductId 子合同id 必须
     * @contractPlanChangeDO contractId 合同id 必须
     *
     *@contractPlanChangeDO taskId 任务id 必须
     *
     * */
    void completeGiftTask(ContractPlanChangeDO contractPlanChangeDO);
    /**
     * 撤销赠送任务
     * @param contractPlanChangeDO 合同变更对象参数
     * @contractPlanChangeDO customerId 客户id 必须
     * @contractPlanChangeDO productId 产品id 必须
     * @contractPlanChangeDO contractProductId 子合同id 必须
     * @contractPlanChangeDO contractId 合同id 必须
     *
     *@contractPlanChangeDO taskId 任务id 必须
     *
     * */
    void cancelGiftTask(ContractPlanChangeDO contractPlanChangeDO);

    /**
     * 撤销任务
     * @param contractPlanChangeDO 合同变更对象参数
     * @contractPlanChangeDO customerId 客户id 必须
     * @contractPlanChangeDO productId 产品id 必须
     * @contractPlanChangeDO contractProductId 子合同id 必须
     * @contractPlanChangeDO contractId 合同id 必须
     *
     * @contractPlanChangeDO taskId 任务id 必须
     *
     * */
    void cancelTask(ContractPlanChangeDO contractPlanChangeDO);

    /**
     * 作废合同
     * @param contractPlanChangeDO 合同变更对象参数
     * @contractPlanChangeDO customerId 客户id 必须
     * @contractPlanChangeDO contractId 合同id 必须
     *
     * */
    void obsoleteContract(ContractPlanChangeDO contractPlanChangeDO);


    /**
     * 查询合同收支情况
     * @param contractPlanChangeDO 合同变更对象参数
     * @contractPlanChangeDO customerId 客户id 必须
     * @contractPlanChangeDO productId 产品id 必须
     * @contractPlanChangeDO contractProductId 子合同id 必须
     *
     * */

    ContractPlanChangeVO contractBasisDetails(ContractPlanChangeDO contractPlanChangeDO);
}

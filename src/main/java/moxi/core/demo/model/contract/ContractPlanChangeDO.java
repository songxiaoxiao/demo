package moxi.core.demo.model.contract;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * <p>
 * 合同执行计划变动
 * </p>
 *
 * @author winter
 * @since 2019-02-16
 */
@Data
public class ContractPlanChangeDO{


    /**
     * 客户ID
     */
    @NotNull(message = "客户id不能为空")
    private String customerId;
    /**
     * 产品id
     */
    @NotNull(message = "产品id不能为空")
    private String productId;
    /**
     * 子合同id
     */
    @NotNull(message = "子合同id不能为空")
    private String contractProductId;
    /**
     * 任务id
     */
    private String taskId;
    /**
     * 合同id
     */
    @NotNull(message = "合同id不能为空")
    private String contractId;
    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 剩余服务周期
     */
    private Integer remainingPeriod;

    /**
     * 剩余赠送周期
     */
    private Integer remainingGiftPeriod;

    /**
     * 支出预算
     */
    private BigDecimal expenditureBudget;

    /**
     * 计划收款
     */
    private BigDecimal plannedCollection;



//    /**
//     * 操作类型
//     */
//    private String type;
//


}

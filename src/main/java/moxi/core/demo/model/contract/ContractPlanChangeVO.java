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
public class ContractPlanChangeVO {


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
    /**
     * 实收
     * */
    private BigDecimal actualCollection = new BigDecimal("0");

    /**
     * 消费
     * */
    private BigDecimal consumption = new BigDecimal("0");

    /**
     * 退款
     * */
    private BigDecimal refund = new BigDecimal("0");

    /**
     * 支出
     * */
    private BigDecimal expenditure = new BigDecimal("0");

    /**
     * 违约金
     * */
    private BigDecimal penalty = new BigDecimal("0");


}

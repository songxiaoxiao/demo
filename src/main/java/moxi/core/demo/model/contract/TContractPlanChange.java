package moxi.core.demo.model.contract;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 合同执行计划变动
 * </p>
 *
 * @author winter
 * @since 2019-02-16
 */
@Data
@TableName("t_contract_plan_change")
public class TContractPlanChange extends Model<TContractPlanChange> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 客户ID
     */
    @TableField("customer_id")
    private String customerId;
    /**
     * 产品id
     */
    @TableField("product_id")
    private String productId;
    /**
     * 子合同id
     */
    @TableField("contract_product_id")
    private String contractProductId;
    /**
     * 合同id
     */
    @TableField("contract_id")
    private String contractId;
    /**
     * 任务id
     */
    @TableField("task_id")
    private String taskId;

    /**
     * 单价
     */
    private BigDecimal price;
    /**
     * 单价变动值
     */
    @TableField("price_change")
    private BigDecimal priceChange;
    /**
     * 剩余服务周期
     */
    @TableField("remaining_period")
    private Integer remainingPeriod;
    /**
     * 剩余服务周期变动值
     */
    @TableField("remaining_period_change")
    private Integer remainingPeriodChange;
    /**
     * 剩余赠送周期
     */
    @TableField("remaining_gift_period")
    private Integer remainingGiftPeriod;
    /**
     * 剩余赠送周期变动值
     */
    @TableField("remaining_gift_period_change")
    private Integer remainingGiftPeriodChange;
    /**
     * 支出预算
     */
    @TableField("expenditure_budget")
    private BigDecimal expenditureBudget;
    /**
     * 支出预算变动值
     */
    @TableField("expenditure_budget_change")
    private BigDecimal expenditureBudgetChange;
    /**
     * 计划收款
     */
    @TableField("planned_collection")
    private BigDecimal plannedCollection;
    /**
     * 计划收款变动值
     */
    @TableField("planned_collection_change")
    private BigDecimal plannedCollectionChange;
    /**
     * 操作类型
     */
    private String type;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Long createTime;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Long updateTime;
    @TableField("gmt_create")
    private Date gmtCreate;
    @TableField("gmt_modified")
    private Date gmtModified;



    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

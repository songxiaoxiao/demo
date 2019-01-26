package moxi.core.demo.model.task;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 任务-代账产品信息表
 * </p>
 *
 * @author winter
 * @since 2019-01-26
 */
@TableName("t_task_dz_info")
public class TTaskDzInfo extends Model<TTaskDzInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 信息编号
     */
    @TableId("ID")
    private String id;
    /**
     * 代账月份-开始
     */
    @TableField("TAX_MONTH_START")
    private String taxMonthStart;
    /**
     * 代账月份-结束
     */
    @TableField("TAX_MONTH_END")
    private String taxMonthEnd;
    /**
     * 增值税（元）
     */
    @TableField("TAX_MONEY_ZZS")
    private BigDecimal taxMoneyZzs;
    /**
     * 企业所得税（元）
     */
    @TableField("TAX_MONEY_QYSDS")
    private BigDecimal taxMoneyQysds;
    /**
     * 个人所得税（元）
     */
    @TableField("TAX_MONEY_GRSDS")
    private BigDecimal taxMoneyGrsds;
    /**
     * 其它税费（元）
     */
    @TableField("TAX_MONEY_QTSF")
    private BigDecimal taxMoneyQtsf;
    /**
     * 【关联信息】商机编号
     */
    @TableField("REL_CHANCE_ID")
    private String relChanceId;
    /**
     * 【关联信息】合同编号
     */
    @TableField("REL_CONTRACT_ID")
    private String relContractId;
    /**
     * 【关联信息】客户编号
     */
    @TableField("REL_CUSTOMER_ID")
    private String relCustomerId;
    /**
     * 【关联信息】产品编号
     */
    @TableField("REL_PRODUCT_ID")
    private String relProductId;
    /**
     * 【关联信息】任务编号1-1
     */
    @TableField("REL_TASK_ID")
    private String relTaskId;
    /**
     * 【关联信息】企业编号
     */
    @TableField("REL_COMPANY_ID")
    private String relCompanyId;
    /**
     * 【数据信息】数据状态：0-丢弃（不可见）、1-启用、2-禁用（可见）
     */
    @TableField("DATA_STATE")
    private BigDecimal dataState;
    /**
     * 【数据信息】创建时间
     */
    @TableField("DATA_CREATE_AT")
    private Date dataCreateAt;
    /**
     * 【数据信息】创建人编号/系统"SYS"
     */
    @TableField("DATA_CREATE_USER_ID")
    private String dataCreateUserId;
    /**
     * 【数据信息】最后修改时间
     */
    @TableField("DATA_UPDATE_AT")
    private Date dataUpdateAt;
    /**
     * 【数据信息】最后修改人编号/系统"SYS"
     */
    @TableField("DATA_UPDATE_USER_ID")
    private String dataUpdateUserId;
    /**
     * 存放代理记账任务当前月费用
     */
    @TableField("EXT_RESERVE")
    private String extReserve;
    /**
     * 冗余字段-创建人昵称
     */
    @TableField("RY_CREATE_USER_NICK")
    private String ryCreateUserNick;
    /**
     * 冗余字段-创建人所属部门名称
     */
    @TableField("RY_CREATE_DEPT_NAME")
    private String ryCreateDeptName;
    /**
     * 冗余字段-创建人所属部门编号
     */
    @TableField("RY_CREATE_DEPT_ID")
    private String ryCreateDeptId;
    /**
     * 友好编号（用于显示）
     */
    @TableField("VIEW_ID")
    private String viewId;
    /**
     * 存放代理记账任务当前月费用 (客户)
     */
    @TableField("COST_CUSTOMER")
    private BigDecimal costCustomer;
    /**
     * 存放代理记账任务当前月费用 (财务未减预算)
     */
    @TableField("COST_FINANCE")
    private BigDecimal costFinance;
    /**
     * 存放代理记账任务当前月费用 (财务减预算)
     */
    @TableField("COST_OUTBUDGET")
    private BigDecimal costOutbudget;
    /**
     * 基数类别-1：直接提成，2：基数提成
     */
    @TableField("BASE_TYPE")
    private Integer baseType;
    /**
     * 提成基数
     */
    @TableField("ROYALTY_BASE")
    private BigDecimal royaltyBase;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaxMonthStart() {
        return taxMonthStart;
    }

    public void setTaxMonthStart(String taxMonthStart) {
        this.taxMonthStart = taxMonthStart;
    }

    public String getTaxMonthEnd() {
        return taxMonthEnd;
    }

    public void setTaxMonthEnd(String taxMonthEnd) {
        this.taxMonthEnd = taxMonthEnd;
    }

    public BigDecimal getTaxMoneyZzs() {
        return taxMoneyZzs;
    }

    public void setTaxMoneyZzs(BigDecimal taxMoneyZzs) {
        this.taxMoneyZzs = taxMoneyZzs;
    }

    public BigDecimal getTaxMoneyQysds() {
        return taxMoneyQysds;
    }

    public void setTaxMoneyQysds(BigDecimal taxMoneyQysds) {
        this.taxMoneyQysds = taxMoneyQysds;
    }

    public BigDecimal getTaxMoneyGrsds() {
        return taxMoneyGrsds;
    }

    public void setTaxMoneyGrsds(BigDecimal taxMoneyGrsds) {
        this.taxMoneyGrsds = taxMoneyGrsds;
    }

    public BigDecimal getTaxMoneyQtsf() {
        return taxMoneyQtsf;
    }

    public void setTaxMoneyQtsf(BigDecimal taxMoneyQtsf) {
        this.taxMoneyQtsf = taxMoneyQtsf;
    }

    public String getRelChanceId() {
        return relChanceId;
    }

    public void setRelChanceId(String relChanceId) {
        this.relChanceId = relChanceId;
    }

    public String getRelContractId() {
        return relContractId;
    }

    public void setRelContractId(String relContractId) {
        this.relContractId = relContractId;
    }

    public String getRelCustomerId() {
        return relCustomerId;
    }

    public void setRelCustomerId(String relCustomerId) {
        this.relCustomerId = relCustomerId;
    }

    public String getRelProductId() {
        return relProductId;
    }

    public void setRelProductId(String relProductId) {
        this.relProductId = relProductId;
    }

    public String getRelTaskId() {
        return relTaskId;
    }

    public void setRelTaskId(String relTaskId) {
        this.relTaskId = relTaskId;
    }

    public String getRelCompanyId() {
        return relCompanyId;
    }

    public void setRelCompanyId(String relCompanyId) {
        this.relCompanyId = relCompanyId;
    }

    public BigDecimal getDataState() {
        return dataState;
    }

    public void setDataState(BigDecimal dataState) {
        this.dataState = dataState;
    }

    public Date getDataCreateAt() {
        return dataCreateAt;
    }

    public void setDataCreateAt(Date dataCreateAt) {
        this.dataCreateAt = dataCreateAt;
    }

    public String getDataCreateUserId() {
        return dataCreateUserId;
    }

    public void setDataCreateUserId(String dataCreateUserId) {
        this.dataCreateUserId = dataCreateUserId;
    }

    public Date getDataUpdateAt() {
        return dataUpdateAt;
    }

    public void setDataUpdateAt(Date dataUpdateAt) {
        this.dataUpdateAt = dataUpdateAt;
    }

    public String getDataUpdateUserId() {
        return dataUpdateUserId;
    }

    public void setDataUpdateUserId(String dataUpdateUserId) {
        this.dataUpdateUserId = dataUpdateUserId;
    }

    public String getExtReserve() {
        return extReserve;
    }

    public void setExtReserve(String extReserve) {
        this.extReserve = extReserve;
    }

    public String getRyCreateUserNick() {
        return ryCreateUserNick;
    }

    public void setRyCreateUserNick(String ryCreateUserNick) {
        this.ryCreateUserNick = ryCreateUserNick;
    }

    public String getRyCreateDeptName() {
        return ryCreateDeptName;
    }

    public void setRyCreateDeptName(String ryCreateDeptName) {
        this.ryCreateDeptName = ryCreateDeptName;
    }

    public String getRyCreateDeptId() {
        return ryCreateDeptId;
    }

    public void setRyCreateDeptId(String ryCreateDeptId) {
        this.ryCreateDeptId = ryCreateDeptId;
    }

    public String getViewId() {
        return viewId;
    }

    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    public BigDecimal getCostCustomer() {
        return costCustomer;
    }

    public void setCostCustomer(BigDecimal costCustomer) {
        this.costCustomer = costCustomer;
    }

    public BigDecimal getCostFinance() {
        return costFinance;
    }

    public void setCostFinance(BigDecimal costFinance) {
        this.costFinance = costFinance;
    }

    public BigDecimal getCostOutbudget() {
        return costOutbudget;
    }

    public void setCostOutbudget(BigDecimal costOutbudget) {
        this.costOutbudget = costOutbudget;
    }

    public Integer getBaseType() {
        return baseType;
    }

    public void setBaseType(Integer baseType) {
        this.baseType = baseType;
    }

    public BigDecimal getRoyaltyBase() {
        return royaltyBase;
    }

    public void setRoyaltyBase(BigDecimal royaltyBase) {
        this.royaltyBase = royaltyBase;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TTaskDzInfo{" +
        "id=" + id +
        ", taxMonthStart=" + taxMonthStart +
        ", taxMonthEnd=" + taxMonthEnd +
        ", taxMoneyZzs=" + taxMoneyZzs +
        ", taxMoneyQysds=" + taxMoneyQysds +
        ", taxMoneyGrsds=" + taxMoneyGrsds +
        ", taxMoneyQtsf=" + taxMoneyQtsf +
        ", relChanceId=" + relChanceId +
        ", relContractId=" + relContractId +
        ", relCustomerId=" + relCustomerId +
        ", relProductId=" + relProductId +
        ", relTaskId=" + relTaskId +
        ", relCompanyId=" + relCompanyId +
        ", dataState=" + dataState +
        ", dataCreateAt=" + dataCreateAt +
        ", dataCreateUserId=" + dataCreateUserId +
        ", dataUpdateAt=" + dataUpdateAt +
        ", dataUpdateUserId=" + dataUpdateUserId +
        ", extReserve=" + extReserve +
        ", ryCreateUserNick=" + ryCreateUserNick +
        ", ryCreateDeptName=" + ryCreateDeptName +
        ", ryCreateDeptId=" + ryCreateDeptId +
        ", viewId=" + viewId +
        ", costCustomer=" + costCustomer +
        ", costFinance=" + costFinance +
        ", costOutbudget=" + costOutbudget +
        ", baseType=" + baseType +
        ", royaltyBase=" + royaltyBase +
        "}";
    }
}

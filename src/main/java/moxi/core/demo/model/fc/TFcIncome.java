package moxi.core.demo.model.fc;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 财务-收入信息表
 * </p>
 *
 * @author winter
 * @since 2019-01-26
 */
@TableName("t_fc_income")
public class TFcIncome extends Model<TFcIncome> {

    private static final long serialVersionUID = 1L;

    /**
     * 收入编号：UUID
     */
    @TableId("ID")
    private String id;
    /**
     * 收入金额
     */
    @TableField("INCOME_MONEY")
    private BigDecimal incomeMoney;
    /**
     * 收款方式：1-现金、2-银行转账、3-支付宝、4-微信
     */
    @TableField("INCOME_TYPE")
    private BigDecimal incomeType;
    /**
     * 收据编号/交易编号
     */
    @TableField("INCOME_CODE")
    private String incomeCode;
    /**
     * 客户账户
     */
    @TableField("INCOME_ACCOUNT_NAME")
    private String incomeAccountName;
    /**
     * 客户账号
     */
    @TableField("INCOME_ACCOUNT_CODE")
    private String incomeAccountCode;
    /**
     * 到账时间
     */
    @TableField("INCOME_AT")
    private Date incomeAt;
    /**
     * 认领备注
     */
    @TableField("INCOME_REMARKS")
    private String incomeRemarks;
    /**
     * 认领状态：1-可认领、2-已认领、3-已退领
     */
    @TableField("CLAIM_STATE")
    private BigDecimal claimState;
    /**
     * 已认领金额：汇总于认领信息（含未确认），默认0
     */
    @TableField("CANNOT_CLAIM_MONEY")
    private BigDecimal cannotClaimMoney;
    /**
     * 可认领金额：收入-已认领
     */
    @TableField("CAN_CLAIM_MONEY")
    private BigDecimal canClaimMoney;
    /**
     * 【关联信息】现金收款人编号/非现金SYS
     */
    @TableField("REL_INCOME_USER_ID")
    private String relIncomeUserId;
    /**
     * 【关联信息】实体编号
     */
    @TableField("REL_ENTITY_ID")
    private String relEntityId;
    /**
     * 【关联信息】客户编号
     */
    @TableField("REL_CUSTOMER_ID")
    private String relCustomerId;
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
     * 【扩展信息】收款账户编号
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


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getIncomeMoney() {
        return incomeMoney;
    }

    public void setIncomeMoney(BigDecimal incomeMoney) {
        this.incomeMoney = incomeMoney;
    }

    public BigDecimal getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(BigDecimal incomeType) {
        this.incomeType = incomeType;
    }

    public String getIncomeCode() {
        return incomeCode;
    }

    public void setIncomeCode(String incomeCode) {
        this.incomeCode = incomeCode;
    }

    public String getIncomeAccountName() {
        return incomeAccountName;
    }

    public void setIncomeAccountName(String incomeAccountName) {
        this.incomeAccountName = incomeAccountName;
    }

    public String getIncomeAccountCode() {
        return incomeAccountCode;
    }

    public void setIncomeAccountCode(String incomeAccountCode) {
        this.incomeAccountCode = incomeAccountCode;
    }

    public Date getIncomeAt() {
        return incomeAt;
    }

    public void setIncomeAt(Date incomeAt) {
        this.incomeAt = incomeAt;
    }

    public String getIncomeRemarks() {
        return incomeRemarks;
    }

    public void setIncomeRemarks(String incomeRemarks) {
        this.incomeRemarks = incomeRemarks;
    }

    public BigDecimal getClaimState() {
        return claimState;
    }

    public void setClaimState(BigDecimal claimState) {
        this.claimState = claimState;
    }

    public BigDecimal getCannotClaimMoney() {
        return cannotClaimMoney;
    }

    public void setCannotClaimMoney(BigDecimal cannotClaimMoney) {
        this.cannotClaimMoney = cannotClaimMoney;
    }

    public BigDecimal getCanClaimMoney() {
        return canClaimMoney;
    }

    public void setCanClaimMoney(BigDecimal canClaimMoney) {
        this.canClaimMoney = canClaimMoney;
    }

    public String getRelIncomeUserId() {
        return relIncomeUserId;
    }

    public void setRelIncomeUserId(String relIncomeUserId) {
        this.relIncomeUserId = relIncomeUserId;
    }

    public String getRelEntityId() {
        return relEntityId;
    }

    public void setRelEntityId(String relEntityId) {
        this.relEntityId = relEntityId;
    }

    public String getRelCustomerId() {
        return relCustomerId;
    }

    public void setRelCustomerId(String relCustomerId) {
        this.relCustomerId = relCustomerId;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TFcIncome{" +
        "id=" + id +
        ", incomeMoney=" + incomeMoney +
        ", incomeType=" + incomeType +
        ", incomeCode=" + incomeCode +
        ", incomeAccountName=" + incomeAccountName +
        ", incomeAccountCode=" + incomeAccountCode +
        ", incomeAt=" + incomeAt +
        ", incomeRemarks=" + incomeRemarks +
        ", claimState=" + claimState +
        ", cannotClaimMoney=" + cannotClaimMoney +
        ", canClaimMoney=" + canClaimMoney +
        ", relIncomeUserId=" + relIncomeUserId +
        ", relEntityId=" + relEntityId +
        ", relCustomerId=" + relCustomerId +
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
        "}";
    }
}

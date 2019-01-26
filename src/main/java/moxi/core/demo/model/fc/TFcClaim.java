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
 * 财务-认领信息表
 * </p>
 *
 * @author winter
 * @since 2019-01-26
 */
@TableName("t_fc_claim")
public class TFcClaim extends Model<TFcClaim> {

    private static final long serialVersionUID = 1L;

    /**
     * 认领编号：UUID
     */
    @TableId("ID")
    private String id;
    /**
     * 认领状态：1-未确认、2-已确认、3-已退领
     */
    @TableField("CLAIM_STATE")
    private BigDecimal claimState;
    /**
     * 认领金额：< 实收金额
     */
    @TableField("CLAIM_MONEY")
    private BigDecimal claimMoney;
    /**
     * 认领备注
     */
    @TableField("CLAIM_REMARKS")
    private String claimRemarks;
    /**
     * 认领时间
     */
    @TableField("CLAIM_AT")
    private Date claimAt;
    /**
     * 确认时间
     */
    @TableField("CONFIRM_AT")
    private Date confirmAt;
    /**
     * 【关联信息】认领人编号
     */
    @TableField("REL_CLAIM_USER_ID")
    private String relClaimUserId;
    /**
     * 【关联信息】确认人编号
     */
    @TableField("REL_CONFIRM_USER_ID")
    private String relConfirmUserId;
    /**
     * 【关联信息】收入编号
     */
    @TableField("REL_INCOME_ID")
    private String relIncomeId;
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
     * 【关联信息】应收编号
     */
    @TableField("REL_RECEIVABLE_ID")
    private String relReceivableId;
    /**
     * 来源claimid
     */
    @TableField("SOURCE_CLAIM_ID")
    private String sourceClaimId;
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
     * 【扩展信息】备注
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
     * 已确认金额
     */
    @TableField("CONFIRMED_AMOUNT")
    private BigDecimal confirmedAmount;
    /**
     * 已确认金额-财务未减预算
     */
    @TableField("FINANCE_AMOUNT")
    private BigDecimal financeAmount;
    /**
     * 已确认金额-财务减预算
     */
    @TableField("OUTBUDGET_AMOUNT")
    private BigDecimal outbudgetAmount;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getClaimState() {
        return claimState;
    }

    public void setClaimState(BigDecimal claimState) {
        this.claimState = claimState;
    }

    public BigDecimal getClaimMoney() {
        return claimMoney;
    }

    public void setClaimMoney(BigDecimal claimMoney) {
        this.claimMoney = claimMoney;
    }

    public String getClaimRemarks() {
        return claimRemarks;
    }

    public void setClaimRemarks(String claimRemarks) {
        this.claimRemarks = claimRemarks;
    }

    public Date getClaimAt() {
        return claimAt;
    }

    public void setClaimAt(Date claimAt) {
        this.claimAt = claimAt;
    }

    public Date getConfirmAt() {
        return confirmAt;
    }

    public void setConfirmAt(Date confirmAt) {
        this.confirmAt = confirmAt;
    }

    public String getRelClaimUserId() {
        return relClaimUserId;
    }

    public void setRelClaimUserId(String relClaimUserId) {
        this.relClaimUserId = relClaimUserId;
    }

    public String getRelConfirmUserId() {
        return relConfirmUserId;
    }

    public void setRelConfirmUserId(String relConfirmUserId) {
        this.relConfirmUserId = relConfirmUserId;
    }

    public String getRelIncomeId() {
        return relIncomeId;
    }

    public void setRelIncomeId(String relIncomeId) {
        this.relIncomeId = relIncomeId;
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

    public String getRelReceivableId() {
        return relReceivableId;
    }

    public void setRelReceivableId(String relReceivableId) {
        this.relReceivableId = relReceivableId;
    }

    public String getSourceClaimId() {
        return sourceClaimId;
    }

    public void setSourceClaimId(String sourceClaimId) {
        this.sourceClaimId = sourceClaimId;
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

    public BigDecimal getConfirmedAmount() {
        return confirmedAmount;
    }

    public void setConfirmedAmount(BigDecimal confirmedAmount) {
        this.confirmedAmount = confirmedAmount;
    }

    public BigDecimal getFinanceAmount() {
        return financeAmount;
    }

    public void setFinanceAmount(BigDecimal financeAmount) {
        this.financeAmount = financeAmount;
    }

    public BigDecimal getOutbudgetAmount() {
        return outbudgetAmount;
    }

    public void setOutbudgetAmount(BigDecimal outbudgetAmount) {
        this.outbudgetAmount = outbudgetAmount;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TFcClaim{" +
        "id=" + id +
        ", claimState=" + claimState +
        ", claimMoney=" + claimMoney +
        ", claimRemarks=" + claimRemarks +
        ", claimAt=" + claimAt +
        ", confirmAt=" + confirmAt +
        ", relClaimUserId=" + relClaimUserId +
        ", relConfirmUserId=" + relConfirmUserId +
        ", relIncomeId=" + relIncomeId +
        ", relContractId=" + relContractId +
        ", relCustomerId=" + relCustomerId +
        ", relProductId=" + relProductId +
        ", relReceivableId=" + relReceivableId +
        ", sourceClaimId=" + sourceClaimId +
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
        ", confirmedAmount=" + confirmedAmount +
        ", financeAmount=" + financeAmount +
        ", outbudgetAmount=" + outbudgetAmount +
        "}";
    }
}

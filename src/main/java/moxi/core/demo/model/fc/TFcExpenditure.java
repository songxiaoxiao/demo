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
 * 财务-支出信息表
 * </p>
 *
 * @author winter
 * @since 2019-01-26
 */
@TableName("t_fc_expenditure")
public class TFcExpenditure extends Model<TFcExpenditure> {

    private static final long serialVersionUID = 1L;

    /**
     * 支出编号：UUID
     */
    @TableId("ID")
    private String id;
    /**
     * 支出状态：1-待审核、2-主管通过、3-主管不通过、4-财务通过、5-财务不通过、6-已支出
     */
    @TableField("EXPENDITURE_STATE")
    private BigDecimal expenditureState;
    /**
     * 支出事由：1-渠道返佣、2-第三方支付-代收代付、3-退款
     */
    @TableField("EXPENDITURE_CAUSE")
    private BigDecimal expenditureCause;
    /**
     * 支出科目1：渠道返佣，渠道编号
     */
    @TableField("EXPENDITURE_SUBJECT1")
    private String expenditureSubject1;
    /**
     * 支出科目2：第三方支付，0-无1-地址费2-公关费3-特殊查名4-政府规费5-加急费
     */
    @TableField("EXPENDITURE_SUBJECT2")
    private String expenditureSubject2;
    /**
     * 支出科目3：退款，0-无1-仅退款2-退款并退单
     */
    @TableField("EXPENDITURE_SUBJECT3")
    private String expenditureSubject3;
    /**
     * 支出金额
     */
    @TableField("EXPENDITURE_MONEY")
    private BigDecimal expenditureMoney;
    /**
     * 到账时间
     */
    @TableField("EXPENDITURE_AT")
    private Date expenditureAt;
    /**
     * 支出备注
     */
    @TableField("EXPENDITURE_REMARKS")
    private String expenditureRemarks;
    /**
     * 收款人开户行
     */
    @TableField("ACCOUNT_BANK")
    private String accountBank;
    /**
     * 收款人户名
     */
    @TableField("ACCOUNT_NAME")
    private String accountName;
    /**
     * 收款人账号
     */
    @TableField("ACCOUNT_CODE")
    private String accountCode;
    /**
     * 【关联信息】申请人编号
     */
    @TableField("REL_APPLY_USER_ID")
    private String relApplyUserId;
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
     * 【关联信息】实体编号
     */
    @TableField("REL_ENTITY_ID")
    private String relEntityId;
    /**
     * 【关联信息】付款账户编号
     */
    @TableField("REL_ACCOUNT_ID")
    private String relAccountId;
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
     * 【数据信息】创建时间/申请时间
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
     * 【扩展信息】存放子级服务商的支出编号【总部核算时】/无
     */
    @TableField("EXT_RESERVE")
    private String extReserve;
    /**
     * 无
     */
    @TableField("USER_NICK")
    private String userNick;
    /**
     * 无
     */
    @TableField("PRODUCT_NAME")
    private String productName;
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

    public BigDecimal getExpenditureState() {
        return expenditureState;
    }

    public void setExpenditureState(BigDecimal expenditureState) {
        this.expenditureState = expenditureState;
    }

    public BigDecimal getExpenditureCause() {
        return expenditureCause;
    }

    public void setExpenditureCause(BigDecimal expenditureCause) {
        this.expenditureCause = expenditureCause;
    }

    public String getExpenditureSubject1() {
        return expenditureSubject1;
    }

    public void setExpenditureSubject1(String expenditureSubject1) {
        this.expenditureSubject1 = expenditureSubject1;
    }

    public String getExpenditureSubject2() {
        return expenditureSubject2;
    }

    public void setExpenditureSubject2(String expenditureSubject2) {
        this.expenditureSubject2 = expenditureSubject2;
    }

    public String getExpenditureSubject3() {
        return expenditureSubject3;
    }

    public void setExpenditureSubject3(String expenditureSubject3) {
        this.expenditureSubject3 = expenditureSubject3;
    }

    public BigDecimal getExpenditureMoney() {
        return expenditureMoney;
    }

    public void setExpenditureMoney(BigDecimal expenditureMoney) {
        this.expenditureMoney = expenditureMoney;
    }

    public Date getExpenditureAt() {
        return expenditureAt;
    }

    public void setExpenditureAt(Date expenditureAt) {
        this.expenditureAt = expenditureAt;
    }

    public String getExpenditureRemarks() {
        return expenditureRemarks;
    }

    public void setExpenditureRemarks(String expenditureRemarks) {
        this.expenditureRemarks = expenditureRemarks;
    }

    public String getAccountBank() {
        return accountBank;
    }

    public void setAccountBank(String accountBank) {
        this.accountBank = accountBank;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getRelApplyUserId() {
        return relApplyUserId;
    }

    public void setRelApplyUserId(String relApplyUserId) {
        this.relApplyUserId = relApplyUserId;
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

    public String getRelEntityId() {
        return relEntityId;
    }

    public void setRelEntityId(String relEntityId) {
        this.relEntityId = relEntityId;
    }

    public String getRelAccountId() {
        return relAccountId;
    }

    public void setRelAccountId(String relAccountId) {
        this.relAccountId = relAccountId;
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

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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
        return "TFcExpenditure{" +
        "id=" + id +
        ", expenditureState=" + expenditureState +
        ", expenditureCause=" + expenditureCause +
        ", expenditureSubject1=" + expenditureSubject1 +
        ", expenditureSubject2=" + expenditureSubject2 +
        ", expenditureSubject3=" + expenditureSubject3 +
        ", expenditureMoney=" + expenditureMoney +
        ", expenditureAt=" + expenditureAt +
        ", expenditureRemarks=" + expenditureRemarks +
        ", accountBank=" + accountBank +
        ", accountName=" + accountName +
        ", accountCode=" + accountCode +
        ", relApplyUserId=" + relApplyUserId +
        ", relContractId=" + relContractId +
        ", relCustomerId=" + relCustomerId +
        ", relProductId=" + relProductId +
        ", relReceivableId=" + relReceivableId +
        ", relEntityId=" + relEntityId +
        ", relAccountId=" + relAccountId +
        ", relCompanyId=" + relCompanyId +
        ", dataState=" + dataState +
        ", dataCreateAt=" + dataCreateAt +
        ", dataCreateUserId=" + dataCreateUserId +
        ", dataUpdateAt=" + dataUpdateAt +
        ", dataUpdateUserId=" + dataUpdateUserId +
        ", extReserve=" + extReserve +
        ", userNick=" + userNick +
        ", productName=" + productName +
        ", ryCreateUserNick=" + ryCreateUserNick +
        ", ryCreateDeptName=" + ryCreateDeptName +
        ", ryCreateDeptId=" + ryCreateDeptId +
        ", viewId=" + viewId +
        "}";
    }
}

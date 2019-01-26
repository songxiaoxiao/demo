package moxi.core.demo.model.customer;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 业务-客户信息表
 * </p>
 *
 * @author winter
 * @since 2019-01-25
 */
@TableName("t_biz_customer")
public class TBizCustomer extends Model<TBizCustomer> {

    private static final long serialVersionUID = 1L;

    /**
     * 客户编号：UUID
     */
    @TableId("ID")
    private String id;
    /**
     * 客户名称
     */
    @TableField("FULL_NAME")
    private String fullName;
    /**
     * 客户简称/"无"
     */
    @TableField("SHORT_NAME")
    private String shortName;
    /**
     * 客户曾用名称/"无"
     */
    @TableField("OLD_NAME")
    private String oldName;
    /**
     * 客户简介/"无"
     */
    @TableField("CUSTOMER_INTRO")
    private String customerIntro;
    /**
     * 客户标签：1普通客户，2VIP客户，3高风险客户
     */
    @TableField("CUSTOMER_TAG")
    private BigDecimal customerTag;
    /**
     * 纳税人性质：0-无，1一般纳税人，2小规模纳税人
     */
    @TableField("TAXPAYER_TYPE")
    private BigDecimal taxpayerType;
    /**
     * 主营行业，逗号分隔
     */
    @TableField("MAIN_INDUSTRY")
    private String mainIndustry;
    /**
     * 主营行业编号，逗号分隔
     */
    @TableField("MAIN_INDUSTRY_ID")
    private String mainIndustryId;
    /**
     * 企业电话/"无"
     */
    @TableField("TEL_PHONE")
    private String telPhone;
    /**
     * 企业EMAIL/"无"
     */
    @TableField("EMAIL_ADDRESS")
    private String emailAddress;
    /**
     * 所在省市区/"无"：来自字典ADDRESS_AREA
     */
    @TableField("ADDRESS_AREA")
    private String addressArea;
    /**
     * 所在地址/"无"
     */
    @TableField("ADDRESS_DETAIL")
    private String addressDetail;
    /**
     * 信用代码/"无"
     */
    @TableField("CREDIT_CODE")
    private String creditCode;
    @TableField("COMPANY_TYPE")
    private BigDecimal companyType;
    /**
     * 注册资本：单位-万人民币
     */
    @TableField("REG_MONEY")
    private BigDecimal regMoney;
    /**
     * 核准日期/"无"
     */
    @TableField("ALLOW_DATE")
    private String allowDate;
    /**
     * 成立日期/"无"
     */
    @TableField("START_DATE")
    private String startDate;
    /**
     * 营业期限/"无"/长期
     */
    @TableField("END_DATE")
    private String endDate;
    /**
     * 注册地址区域，逗号分隔
     */
    @TableField("REG_ADDRESS_AREA")
    private String regAddressArea;
    /**
     * 注册地址区域编号，逗号分隔
     */
    @TableField("REG_ADDRESS_AREA_ID")
    private String regAddressAreaId;
    /**
     * 园区
     */
    @TableField("REG_ADDRESS_PART_ID")
    private Integer regAddressPartId;
    /**
     * 注册地址详细/"无"
     */
    @TableField("REG_ADDRESS_DETAIL")
    private String regAddressDetail;
    /**
     * 经营范围/"无"
     */
    @TableField("OPERATION_SCOPE")
    private String operationScope;
    /**
     * 【关联信息】转介绍客户联系人编号/"无"：填入ID，不存在则无
     */
    @TableField("REL_REFEREE_CONTACT_ID")
    private String relRefereeContactId;
    /**
     * 【关联信息】转介绍客户编号/"无"：填入ID，不存在则无
     */
    @TableField("REL_REFEREE_CUSTOMER_ID")
    private String relRefereeCustomerId;
    /**
     * 【关联信息】内部介绍员工编号/"无"：填入ID，不存在则无
     */
    @TableField("REL_INNER_USER_ID")
    private String relInnerUserId;
    /**
     * 【关联信息】线下渠道-渠道商编号
     */
    @TableField("FROM_CHANNEL_ID")
    private String fromChannelId;
    /**
     * 显示排序：值越大排越前
     */
    @TableField("VIEW_ORDER")
    private BigDecimal viewOrder;
    /**
     * 【关联信息】客户来源编号（对应商机来源ID）
     */
    @TableField("REL_FROM_ID")
    private String relFromId;
    /**
     * 【关联信息】负责人编号
     */
    @TableField("REL_USER_ID")
    private String relUserId;
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
     * 【扩展信息】备注/"无"
     */
    @TableField("EXT_RESERVE")
    private String extReserve;
    /**
     * 无
     */
    @TableField("RY_PRI_USER_ID")
    private String ryPriUserId;
    /**
     * 无
     */
    @TableField("RY_PRI_USER_NICK")
    private String ryPriUserNick;
    /**
     * 无
     */
    @TableField("RY_PRI_DEPT_NAME")
    private String ryPriDeptName;
    /**
     * 无
     */
    @TableField("RY_PRI_DEPT_ID")
    private String ryPriDeptId;
    /**
     * 无
     */
    @TableField("DATA_TEAM_ID")
    private String dataTeamId;
    /**
     * 无
     */
    @TableField("DATA_DIRECT_ID")
    private String dataDirectId;
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
     * 报税属性-1：季报，2：月报
     */
    @TableField("TAX_PROPERTY")
    private Integer taxProperty;
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
    /**
     * 提成原因
     */
    @TableField("ROYALTY_CAUSE")
    private String royaltyCause;
    /**
     * 提成基数历史记录
     */
    @TableField("ROYALTY_HISTORY")
    private String royaltyHistory;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getCustomerIntro() {
        return customerIntro;
    }

    public void setCustomerIntro(String customerIntro) {
        this.customerIntro = customerIntro;
    }

    public BigDecimal getCustomerTag() {
        return customerTag;
    }

    public void setCustomerTag(BigDecimal customerTag) {
        this.customerTag = customerTag;
    }

    public BigDecimal getTaxpayerType() {
        return taxpayerType;
    }

    public void setTaxpayerType(BigDecimal taxpayerType) {
        this.taxpayerType = taxpayerType;
    }

    public String getMainIndustry() {
        return mainIndustry;
    }

    public void setMainIndustry(String mainIndustry) {
        this.mainIndustry = mainIndustry;
    }

    public String getMainIndustryId() {
        return mainIndustryId;
    }

    public void setMainIndustryId(String mainIndustryId) {
        this.mainIndustryId = mainIndustryId;
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddressArea() {
        return addressArea;
    }

    public void setAddressArea(String addressArea) {
        this.addressArea = addressArea;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public BigDecimal getCompanyType() {
        return companyType;
    }

    public void setCompanyType(BigDecimal companyType) {
        this.companyType = companyType;
    }

    public BigDecimal getRegMoney() {
        return regMoney;
    }

    public void setRegMoney(BigDecimal regMoney) {
        this.regMoney = regMoney;
    }

    public String getAllowDate() {
        return allowDate;
    }

    public void setAllowDate(String allowDate) {
        this.allowDate = allowDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getRegAddressArea() {
        return regAddressArea;
    }

    public void setRegAddressArea(String regAddressArea) {
        this.regAddressArea = regAddressArea;
    }

    public String getRegAddressAreaId() {
        return regAddressAreaId;
    }

    public void setRegAddressAreaId(String regAddressAreaId) {
        this.regAddressAreaId = regAddressAreaId;
    }

    public Integer getRegAddressPartId() {
        return regAddressPartId;
    }

    public void setRegAddressPartId(Integer regAddressPartId) {
        this.regAddressPartId = regAddressPartId;
    }

    public String getRegAddressDetail() {
        return regAddressDetail;
    }

    public void setRegAddressDetail(String regAddressDetail) {
        this.regAddressDetail = regAddressDetail;
    }

    public String getOperationScope() {
        return operationScope;
    }

    public void setOperationScope(String operationScope) {
        this.operationScope = operationScope;
    }

    public String getRelRefereeContactId() {
        return relRefereeContactId;
    }

    public void setRelRefereeContactId(String relRefereeContactId) {
        this.relRefereeContactId = relRefereeContactId;
    }

    public String getRelRefereeCustomerId() {
        return relRefereeCustomerId;
    }

    public void setRelRefereeCustomerId(String relRefereeCustomerId) {
        this.relRefereeCustomerId = relRefereeCustomerId;
    }

    public String getRelInnerUserId() {
        return relInnerUserId;
    }

    public void setRelInnerUserId(String relInnerUserId) {
        this.relInnerUserId = relInnerUserId;
    }

    public String getFromChannelId() {
        return fromChannelId;
    }

    public void setFromChannelId(String fromChannelId) {
        this.fromChannelId = fromChannelId;
    }

    public BigDecimal getViewOrder() {
        return viewOrder;
    }

    public void setViewOrder(BigDecimal viewOrder) {
        this.viewOrder = viewOrder;
    }

    public String getRelFromId() {
        return relFromId;
    }

    public void setRelFromId(String relFromId) {
        this.relFromId = relFromId;
    }

    public String getRelUserId() {
        return relUserId;
    }

    public void setRelUserId(String relUserId) {
        this.relUserId = relUserId;
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

    public String getRyPriUserId() {
        return ryPriUserId;
    }

    public void setRyPriUserId(String ryPriUserId) {
        this.ryPriUserId = ryPriUserId;
    }

    public String getRyPriUserNick() {
        return ryPriUserNick;
    }

    public void setRyPriUserNick(String ryPriUserNick) {
        this.ryPriUserNick = ryPriUserNick;
    }

    public String getRyPriDeptName() {
        return ryPriDeptName;
    }

    public void setRyPriDeptName(String ryPriDeptName) {
        this.ryPriDeptName = ryPriDeptName;
    }

    public String getRyPriDeptId() {
        return ryPriDeptId;
    }

    public void setRyPriDeptId(String ryPriDeptId) {
        this.ryPriDeptId = ryPriDeptId;
    }

    public String getDataTeamId() {
        return dataTeamId;
    }

    public void setDataTeamId(String dataTeamId) {
        this.dataTeamId = dataTeamId;
    }

    public String getDataDirectId() {
        return dataDirectId;
    }

    public void setDataDirectId(String dataDirectId) {
        this.dataDirectId = dataDirectId;
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

    public Integer getTaxProperty() {
        return taxProperty;
    }

    public void setTaxProperty(Integer taxProperty) {
        this.taxProperty = taxProperty;
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

    public String getRoyaltyCause() {
        return royaltyCause;
    }

    public void setRoyaltyCause(String royaltyCause) {
        this.royaltyCause = royaltyCause;
    }

    public String getRoyaltyHistory() {
        return royaltyHistory;
    }

    public void setRoyaltyHistory(String royaltyHistory) {
        this.royaltyHistory = royaltyHistory;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TBizCustomer{" +
        "id=" + id +
        ", fullName=" + fullName +
        ", shortName=" + shortName +
        ", oldName=" + oldName +
        ", customerIntro=" + customerIntro +
        ", customerTag=" + customerTag +
        ", taxpayerType=" + taxpayerType +
        ", mainIndustry=" + mainIndustry +
        ", mainIndustryId=" + mainIndustryId +
        ", telPhone=" + telPhone +
        ", emailAddress=" + emailAddress +
        ", addressArea=" + addressArea +
        ", addressDetail=" + addressDetail +
        ", creditCode=" + creditCode +
        ", companyType=" + companyType +
        ", regMoney=" + regMoney +
        ", allowDate=" + allowDate +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        ", regAddressArea=" + regAddressArea +
        ", regAddressAreaId=" + regAddressAreaId +
        ", regAddressPartId=" + regAddressPartId +
        ", regAddressDetail=" + regAddressDetail +
        ", operationScope=" + operationScope +
        ", relRefereeContactId=" + relRefereeContactId +
        ", relRefereeCustomerId=" + relRefereeCustomerId +
        ", relInnerUserId=" + relInnerUserId +
        ", fromChannelId=" + fromChannelId +
        ", viewOrder=" + viewOrder +
        ", relFromId=" + relFromId +
        ", relUserId=" + relUserId +
        ", relCompanyId=" + relCompanyId +
        ", dataState=" + dataState +
        ", dataCreateAt=" + dataCreateAt +
        ", dataCreateUserId=" + dataCreateUserId +
        ", dataUpdateAt=" + dataUpdateAt +
        ", dataUpdateUserId=" + dataUpdateUserId +
        ", extReserve=" + extReserve +
        ", ryPriUserId=" + ryPriUserId +
        ", ryPriUserNick=" + ryPriUserNick +
        ", ryPriDeptName=" + ryPriDeptName +
        ", ryPriDeptId=" + ryPriDeptId +
        ", dataTeamId=" + dataTeamId +
        ", dataDirectId=" + dataDirectId +
        ", ryCreateUserNick=" + ryCreateUserNick +
        ", ryCreateDeptName=" + ryCreateDeptName +
        ", ryCreateDeptId=" + ryCreateDeptId +
        ", viewId=" + viewId +
        ", taxProperty=" + taxProperty +
        ", baseType=" + baseType +
        ", royaltyBase=" + royaltyBase +
        ", royaltyCause=" + royaltyCause +
        ", royaltyHistory=" + royaltyHistory +
        "}";
    }
}

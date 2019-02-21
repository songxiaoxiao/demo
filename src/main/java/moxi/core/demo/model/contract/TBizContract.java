package moxi.core.demo.model.contract;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 业务-合同信息表
 * </p>
 *
 * @author sean
 * @since 2019-02-21
 */
@TableName("t_biz_contract")
public class TBizContract extends Model<TBizContract> {

    private static final long serialVersionUID = 1L;

    /**
     * 合同系统编号：UUID（流水号）
     */
    @TableId("ID")
    private String id;
    /**
     * 合同归档编号/"无"
     */
    @TableField("CONTRACT_CODE")
    private String contractCode;
    /**
     * 甲方（买方）
     */
    @TableField("BUYER_NAME")
    private String buyerName;
    /**
     * 签约日期
     */
    @TableField("CONTRACT_DATE")
    private Date contractDate;
    /**
     * 合同备注/"无"
     */
    @TableField("CONTRACT_DESC")
    private String contractDesc;
    /**
     * 合同类型：1-新增 2-续签
     */
    @TableField("CONTRACT_TYPE")
    private BigDecimal contractType;
    /**
     * 合同状态：1-待签订2-已签订3-已失效
     */
    @TableField("CONTRACT_STATE")
    private BigDecimal contractState;
    /**
     * 服务状态：1-未开始 2,-执行中 3,-有异常 4,-异常终止 5-正常完成
     */
    @TableField("SERVICE_STATE")
    private BigDecimal serviceState;
    /**
     * 总金额
     */
    @TableField("TOTAL_AMOUNT")
    private BigDecimal totalAmount;
    /**
     * 失效原因：0-无 1-客户原因 2产品原因 3 价格原因 4-时间原因 5 其它原因
     */
    @TableField("INVALID_REASON")
    private BigDecimal invalidReason;
    /**
     * 失效原因说明/"无"
     */
    @TableField("INVALID_DESC")
    private String invalidDesc;
    /**
     * 【关联信息】原合同ID/"无"
     */
    @TableField("REL_CONTRACT_ID")
    private String relContractId;
    /**
     * 【关联信息】乙方（卖方）：服务公司ID
     */
    @TableField("REL_ENTITY_ID")
    private String relEntityId;
    /**
     * 【关联信息】商机ID
     */
    @TableField("REL_CHANCE_ID")
    private String relChanceId;
    /**
     * 【关联信息】线下渠道-渠道商编号
     */
    @TableField("FROM_CHANNEL_ID")
    private String fromChannelId;
    /**
     * 【关联信息】内部介绍员工编号/"无"：填入ID，不存在则无
     */
    @TableField("REL_INNER_USER_ID")
    private String relInnerUserId;
    /**
     * 【关联信息】转介绍客户编号/"无"：填入ID，不存在则无
     */
    @TableField("REL_REFEREE_CUSTOMER_ID")
    private String relRefereeCustomerId;
    /**
     * 【关联信息】转介绍客户联系人编号/"无"：填入ID，不存在则无
     */
    @TableField("REL_REFEREE_CONTACT_ID")
    private String relRefereeContactId;
    /**
     * 【关联信息】商机来源ID
     */
    @TableField("REL_FROM_ID")
    private String relFromId;
    /**
     * 【关联信息】客户ID
     */
    @TableField("REL_CUSTOMER_ID")
    private String relCustomerId;
    /**
     * 【关联信息】联系人ID
     */
    @TableField("REL_CONTACTS_ID")
    private String relContactsId;
    /**
     * 【关联信息】销售代表ID
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


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public String getContractDesc() {
        return contractDesc;
    }

    public void setContractDesc(String contractDesc) {
        this.contractDesc = contractDesc;
    }

    public BigDecimal getContractType() {
        return contractType;
    }

    public void setContractType(BigDecimal contractType) {
        this.contractType = contractType;
    }

    public BigDecimal getContractState() {
        return contractState;
    }

    public void setContractState(BigDecimal contractState) {
        this.contractState = contractState;
    }

    public BigDecimal getServiceState() {
        return serviceState;
    }

    public void setServiceState(BigDecimal serviceState) {
        this.serviceState = serviceState;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getInvalidReason() {
        return invalidReason;
    }

    public void setInvalidReason(BigDecimal invalidReason) {
        this.invalidReason = invalidReason;
    }

    public String getInvalidDesc() {
        return invalidDesc;
    }

    public void setInvalidDesc(String invalidDesc) {
        this.invalidDesc = invalidDesc;
    }

    public String getRelContractId() {
        return relContractId;
    }

    public void setRelContractId(String relContractId) {
        this.relContractId = relContractId;
    }

    public String getRelEntityId() {
        return relEntityId;
    }

    public void setRelEntityId(String relEntityId) {
        this.relEntityId = relEntityId;
    }

    public String getRelChanceId() {
        return relChanceId;
    }

    public void setRelChanceId(String relChanceId) {
        this.relChanceId = relChanceId;
    }

    public String getFromChannelId() {
        return fromChannelId;
    }

    public void setFromChannelId(String fromChannelId) {
        this.fromChannelId = fromChannelId;
    }

    public String getRelInnerUserId() {
        return relInnerUserId;
    }

    public void setRelInnerUserId(String relInnerUserId) {
        this.relInnerUserId = relInnerUserId;
    }

    public String getRelRefereeCustomerId() {
        return relRefereeCustomerId;
    }

    public void setRelRefereeCustomerId(String relRefereeCustomerId) {
        this.relRefereeCustomerId = relRefereeCustomerId;
    }

    public String getRelRefereeContactId() {
        return relRefereeContactId;
    }

    public void setRelRefereeContactId(String relRefereeContactId) {
        this.relRefereeContactId = relRefereeContactId;
    }

    public String getRelFromId() {
        return relFromId;
    }

    public void setRelFromId(String relFromId) {
        this.relFromId = relFromId;
    }

    public String getRelCustomerId() {
        return relCustomerId;
    }

    public void setRelCustomerId(String relCustomerId) {
        this.relCustomerId = relCustomerId;
    }

    public String getRelContactsId() {
        return relContactsId;
    }

    public void setRelContactsId(String relContactsId) {
        this.relContactsId = relContactsId;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TBizContract{" +
        "id=" + id +
        ", contractCode=" + contractCode +
        ", buyerName=" + buyerName +
        ", contractDate=" + contractDate +
        ", contractDesc=" + contractDesc +
        ", contractType=" + contractType +
        ", contractState=" + contractState +
        ", serviceState=" + serviceState +
        ", totalAmount=" + totalAmount +
        ", invalidReason=" + invalidReason +
        ", invalidDesc=" + invalidDesc +
        ", relContractId=" + relContractId +
        ", relEntityId=" + relEntityId +
        ", relChanceId=" + relChanceId +
        ", fromChannelId=" + fromChannelId +
        ", relInnerUserId=" + relInnerUserId +
        ", relRefereeCustomerId=" + relRefereeCustomerId +
        ", relRefereeContactId=" + relRefereeContactId +
        ", relFromId=" + relFromId +
        ", relCustomerId=" + relCustomerId +
        ", relContactsId=" + relContactsId +
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
        "}";
    }
}

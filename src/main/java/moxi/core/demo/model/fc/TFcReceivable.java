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
 * 财务-应收信息表
 * </p>
 *
 * @author sean
 * @since 2019-02-18
 */
@TableName("t_fc_receivable")
public class TFcReceivable extends Model<TFcReceivable> {

    private static final long serialVersionUID = 1L;

    /**
     * 应收编号：UUID
     */
    @TableId("ID")
    private String id;
    /**
     * 应收状态：1-欠款、2-已结清
     */
    @TableField("RECEIVABLE_STATE")
    private BigDecimal receivableState;
    /**
     * 应收金额：产品应收金额，系统带出为产品成交价
     */
    @TableField("RECEIVABLE_MONEY")
    private BigDecimal receivableMoney;
    /**
     * 实收金额：汇总于认领信息（含未确认），默认0
     */
    @TableField("NETRECEIPTS_MONEY")
    private BigDecimal netreceiptsMoney;
    /**
     * 欠款金额：应收-实收
     */
    @TableField("ARREARS_MONEY")
    private BigDecimal arrearsMoney;
    /**
     * 支出金额：汇总于支出信息，默认0
     */
    @TableField("EXPENDITURE_MONEY")
    private BigDecimal expenditureMoney;
    /**
     * 应收备注
     */
    @TableField("RECEIVABLE_REMARKS")
    private String receivableRemarks;
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


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getReceivableState() {
        return receivableState;
    }

    public void setReceivableState(BigDecimal receivableState) {
        this.receivableState = receivableState;
    }

    public BigDecimal getReceivableMoney() {
        return receivableMoney;
    }

    public void setReceivableMoney(BigDecimal receivableMoney) {
        this.receivableMoney = receivableMoney;
    }

    public BigDecimal getNetreceiptsMoney() {
        return netreceiptsMoney;
    }

    public void setNetreceiptsMoney(BigDecimal netreceiptsMoney) {
        this.netreceiptsMoney = netreceiptsMoney;
    }

    public BigDecimal getArrearsMoney() {
        return arrearsMoney;
    }

    public void setArrearsMoney(BigDecimal arrearsMoney) {
        this.arrearsMoney = arrearsMoney;
    }

    public BigDecimal getExpenditureMoney() {
        return expenditureMoney;
    }

    public void setExpenditureMoney(BigDecimal expenditureMoney) {
        this.expenditureMoney = expenditureMoney;
    }

    public String getReceivableRemarks() {
        return receivableRemarks;
    }

    public void setReceivableRemarks(String receivableRemarks) {
        this.receivableRemarks = receivableRemarks;
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
        return "TFcReceivable{" +
        "id=" + id +
        ", receivableState=" + receivableState +
        ", receivableMoney=" + receivableMoney +
        ", netreceiptsMoney=" + netreceiptsMoney +
        ", arrearsMoney=" + arrearsMoney +
        ", expenditureMoney=" + expenditureMoney +
        ", receivableRemarks=" + receivableRemarks +
        ", relContractId=" + relContractId +
        ", relCustomerId=" + relCustomerId +
        ", relProductId=" + relProductId +
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

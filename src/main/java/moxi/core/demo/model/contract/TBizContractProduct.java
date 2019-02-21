package moxi.core.demo.model.contract;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 业务-合同产品推荐信息表
 * </p>
 *
 * @author winter
 * @since 2019-02-21
 */
@TableName("t_biz_contract_product")
public class TBizContractProduct extends Model<TBizContractProduct> {

    private static final long serialVersionUID = 1L;

    /**
     * 关系编号：UUID
     */
    @TableId("REL_ID")
    private String relId;
    /**
     * 【关联信息】产品编号
     */
    @TableField("REL_PRODUCT_ID")
    private String relProductId;
    /**
     * 【关联信息】合同编号
     */
    @TableField("REL_CONTRACT_ID")
    private String relContractId;
    /**
     * 【关联信息】企业编号
     */
    @TableField("REL_COMPANY_ID")
    private String relCompanyId;
    /**
     * 【关联信息】产品名称
     */
    @TableField("REL_PRODUCT_NAME")
    private String relProductName;
    /**
     * 【关联信息】产品单价
     */
    @TableField("REL_PRODUCT_PRICE")
    private BigDecimal relProductPrice;
    /**
     * 【关联信息】产品单位
     */
    @TableField("REL_PRODUCT_SPEC")
    private BigDecimal relProductSpec;
    /**
     * 【关联信息】产品数量
     */
    @TableField("PRODUCT_NUMBER")
    private BigDecimal productNumber;
    /**
     * 【关联信息】产品总价
     */
    @TableField("TOTAL_AMOUNT")
    private BigDecimal totalAmount;
    /**
     * 【关联信息】实收金额
     */
    @TableField("RECEIVE_AMOUNT")
    private BigDecimal receiveAmount;
    /**
     * 【关联信息】预计支出
     */
    @TableField("EXPENDITURE_BUDGET")
    private BigDecimal expenditureBudget;
    /**
     * 【关联信息】实际支出
     */
    @TableField("ACTUAL_EXPENDITURE")
    private BigDecimal actualExpenditure;
    /**
     * 【关联信息】排序
     */
    @TableField("REL_PRODUCT_SORT")
    private BigDecimal relProductSort;
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
     * 【扩展信息】产品指导价格
     */
    @TableField("EXT_RESERVE")
    private String extReserve;
    /**
     * 无
     */
    @TableField("ID")
    private String id;
    /**
     * 产品分类Id
     */
    @TableField("REL_PRODUCT_TYPE_ID")
    private String relProductTypeId;
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
     * 产品赠送数量
     */
    @TableField("PRODUCT_GIVING_NUMBER")
    private Integer productGivingNumber;
    /**
     * 产品单价
     */
    @TableField("PRODUCT_PRICE")
    private BigDecimal productPrice;
    /**
     * 服务状态：1-未开始、2-执行中、3-已完成、4-暂挂中、5-已终止
     */
    @TableField("TASK_STATE")
    private Integer taskState;
    /**
     * 付款状态：1-未付款、2-部分付款、3-已结清、4-多收
     */
    @TableField("PAY_STATE")
    private Integer payState;
    /**
     * 退款状态：1-全部退款、2-部分退款、3-无退款
     */
    @TableField("REFUND_STATE")
    private Integer refundState;


    public String getRelId() {
        return relId;
    }

    public void setRelId(String relId) {
        this.relId = relId;
    }

    public String getRelProductId() {
        return relProductId;
    }

    public void setRelProductId(String relProductId) {
        this.relProductId = relProductId;
    }

    public String getRelContractId() {
        return relContractId;
    }

    public void setRelContractId(String relContractId) {
        this.relContractId = relContractId;
    }

    public String getRelCompanyId() {
        return relCompanyId;
    }

    public void setRelCompanyId(String relCompanyId) {
        this.relCompanyId = relCompanyId;
    }

    public String getRelProductName() {
        return relProductName;
    }

    public void setRelProductName(String relProductName) {
        this.relProductName = relProductName;
    }

    public BigDecimal getRelProductPrice() {
        return relProductPrice;
    }

    public void setRelProductPrice(BigDecimal relProductPrice) {
        this.relProductPrice = relProductPrice;
    }

    public BigDecimal getRelProductSpec() {
        return relProductSpec;
    }

    public void setRelProductSpec(BigDecimal relProductSpec) {
        this.relProductSpec = relProductSpec;
    }

    public BigDecimal getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(BigDecimal productNumber) {
        this.productNumber = productNumber;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getReceiveAmount() {
        return receiveAmount;
    }

    public void setReceiveAmount(BigDecimal receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    public BigDecimal getExpenditureBudget() {
        return expenditureBudget;
    }

    public void setExpenditureBudget(BigDecimal expenditureBudget) {
        this.expenditureBudget = expenditureBudget;
    }

    public BigDecimal getActualExpenditure() {
        return actualExpenditure;
    }

    public void setActualExpenditure(BigDecimal actualExpenditure) {
        this.actualExpenditure = actualExpenditure;
    }

    public BigDecimal getRelProductSort() {
        return relProductSort;
    }

    public void setRelProductSort(BigDecimal relProductSort) {
        this.relProductSort = relProductSort;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRelProductTypeId() {
        return relProductTypeId;
    }

    public void setRelProductTypeId(String relProductTypeId) {
        this.relProductTypeId = relProductTypeId;
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

    public Integer getProductGivingNumber() {
        return productGivingNumber;
    }

    public void setProductGivingNumber(Integer productGivingNumber) {
        this.productGivingNumber = productGivingNumber;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getTaskState() {
        return taskState;
    }

    public void setTaskState(Integer taskState) {
        this.taskState = taskState;
    }

    public Integer getPayState() {
        return payState;
    }

    public void setPayState(Integer payState) {
        this.payState = payState;
    }

    public Integer getRefundState() {
        return refundState;
    }

    public void setRefundState(Integer refundState) {
        this.refundState = refundState;
    }

    @Override
    protected Serializable pkVal() {
        return this.relId;
    }

    @Override
    public String toString() {
        return "TBizContractProduct{" +
        "relId=" + relId +
        ", relProductId=" + relProductId +
        ", relContractId=" + relContractId +
        ", relCompanyId=" + relCompanyId +
        ", relProductName=" + relProductName +
        ", relProductPrice=" + relProductPrice +
        ", relProductSpec=" + relProductSpec +
        ", productNumber=" + productNumber +
        ", totalAmount=" + totalAmount +
        ", receiveAmount=" + receiveAmount +
        ", expenditureBudget=" + expenditureBudget +
        ", actualExpenditure=" + actualExpenditure +
        ", relProductSort=" + relProductSort +
        ", dataState=" + dataState +
        ", dataCreateAt=" + dataCreateAt +
        ", dataCreateUserId=" + dataCreateUserId +
        ", dataUpdateAt=" + dataUpdateAt +
        ", dataUpdateUserId=" + dataUpdateUserId +
        ", extReserve=" + extReserve +
        ", id=" + id +
        ", relProductTypeId=" + relProductTypeId +
        ", ryCreateUserNick=" + ryCreateUserNick +
        ", ryCreateDeptName=" + ryCreateDeptName +
        ", ryCreateDeptId=" + ryCreateDeptId +
        ", viewId=" + viewId +
        ", productGivingNumber=" + productGivingNumber +
        ", productPrice=" + productPrice +
        ", taskState=" + taskState +
        ", payState=" + payState +
        ", refundState=" + refundState +
        "}";
    }
}

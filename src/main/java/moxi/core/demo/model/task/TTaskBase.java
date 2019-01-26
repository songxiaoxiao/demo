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
 * 任务-基础信息表
 * </p>
 *
 * @author winter
 * @since 2019-01-26
 */
@TableName("t_task_base")
public class TTaskBase extends Model<TTaskBase> {

    private static final long serialVersionUID = 1L;

    /**
     * 环节编号：UUID
     */
    @TableId("ID")
    private String id;
    /**
     * 任务名称（产品名称）
     */
    @TableField("TASK_NAME")
    private String taskName;
    /**
     * 任务内容
     */
    @TableField("TASK_CONTENT")
    private String taskContent;
    /**
     * 记账报税所属期，拆分自任务名称，冗余字段
     */
    @TableField("TASK_TAX_MONTH")
    private String taskTaxMonth;
    /**
     * 任务样式：A-注册  B-变更  C-代账  D-标准
     */
    @TableField("TASK_STYLE")
    private String taskStyle;
    /**
     * 系列任务：0-非系列任务、1-未生成系列任务、2-已生成系列任务【代理记账类任务】
     */
    @TableField("TASK_EXT")
    private BigDecimal taskExt;
    /**
     * 任务状态：1-未开始、2-执行中、3-已完成、4-暂挂中、5-已终止【来自字典】
     */
    @TableField("TASK_STATE")
    private BigDecimal taskState;
    /**
     * 交接码：UUID，用于区分交接事件
     */
    @TableField("HANDOVER_CODE")
    private String handoverCode;
    /**
     * 【关联信息】任务当前负责人编号（默认签单人）
     */
    @TableField("REL_HEAD_USER_ID")
    private String relHeadUserId;
    /**
     * 【关联信息】任务待确认负责人编号（默认签单人）
     */
    @TableField("REL_HEAD_USER_ID_NO")
    private String relHeadUserIdNo;
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
     * 【关联信息】应收编号
     */
    @TableField("REL_RECEIVABLE_ID")
    private String relReceivableId;
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
     * t_task_flow表的产品环节编号
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
     * 违约金
     */
    @TableField("PENAL_SUM")
    private BigDecimal penalSum;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent;
    }

    public String getTaskTaxMonth() {
        return taskTaxMonth;
    }

    public void setTaskTaxMonth(String taskTaxMonth) {
        this.taskTaxMonth = taskTaxMonth;
    }

    public String getTaskStyle() {
        return taskStyle;
    }

    public void setTaskStyle(String taskStyle) {
        this.taskStyle = taskStyle;
    }

    public BigDecimal getTaskExt() {
        return taskExt;
    }

    public void setTaskExt(BigDecimal taskExt) {
        this.taskExt = taskExt;
    }

    public BigDecimal getTaskState() {
        return taskState;
    }

    public void setTaskState(BigDecimal taskState) {
        this.taskState = taskState;
    }

    public String getHandoverCode() {
        return handoverCode;
    }

    public void setHandoverCode(String handoverCode) {
        this.handoverCode = handoverCode;
    }

    public String getRelHeadUserId() {
        return relHeadUserId;
    }

    public void setRelHeadUserId(String relHeadUserId) {
        this.relHeadUserId = relHeadUserId;
    }

    public String getRelHeadUserIdNo() {
        return relHeadUserIdNo;
    }

    public void setRelHeadUserIdNo(String relHeadUserIdNo) {
        this.relHeadUserIdNo = relHeadUserIdNo;
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

    public String getRelReceivableId() {
        return relReceivableId;
    }

    public void setRelReceivableId(String relReceivableId) {
        this.relReceivableId = relReceivableId;
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

    public BigDecimal getPenalSum() {
        return penalSum;
    }

    public void setPenalSum(BigDecimal penalSum) {
        this.penalSum = penalSum;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TTaskBase{" +
        "id=" + id +
        ", taskName=" + taskName +
        ", taskContent=" + taskContent +
        ", taskTaxMonth=" + taskTaxMonth +
        ", taskStyle=" + taskStyle +
        ", taskExt=" + taskExt +
        ", taskState=" + taskState +
        ", handoverCode=" + handoverCode +
        ", relHeadUserId=" + relHeadUserId +
        ", relHeadUserIdNo=" + relHeadUserIdNo +
        ", relChanceId=" + relChanceId +
        ", relContractId=" + relContractId +
        ", relCustomerId=" + relCustomerId +
        ", relProductId=" + relProductId +
        ", relReceivableId=" + relReceivableId +
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
        ", penalSum=" + penalSum +
        "}";
    }
}

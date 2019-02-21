package moxi.core.demo.model.fc;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class ListTFcReceivableBody implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 登录者的UID
     */
    private String uId;
    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 合同流水
     */
    private String contractId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 支付状态
     */
    private Integer receivableState;

    /**
     * 租户id
     */
    private String relCompanyId;

    /**
     * 创建人id
     */
    private String dataCreateUserId;

    /**
     * 可控制的部门
     */
    private List<String> deptIds;

    private Set<String> customerIds;

    /**
     * 当前页数
     */
    private Integer pageNum = 1;
    /**
     * 每页条数
     */
    private Integer pageSize = 10;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getReceivableState() {
        return receivableState;
    }

    public void setReceivableState(Integer receivableState) {
        this.receivableState = receivableState;
    }

    public String getRelCompanyId() {
        return relCompanyId;
    }

    public void setRelCompanyId(String relCompanyId) {
        this.relCompanyId = relCompanyId;
    }

    public String getDataCreateUserId() {
        return dataCreateUserId;
    }

    public void setDataCreateUserId(String dataCreateUserId) {
        this.dataCreateUserId = dataCreateUserId;
    }

    public List<String> getDeptIds() {
        return deptIds;
    }

    public void setDeptIds(List<String> deptIds) {
        this.deptIds = deptIds;
    }

    public Set<String> getCustomerIds() {
        return customerIds;
    }

    public void setCustomerIds(Set<String> customerIds) {
        this.customerIds = customerIds;
    }
}

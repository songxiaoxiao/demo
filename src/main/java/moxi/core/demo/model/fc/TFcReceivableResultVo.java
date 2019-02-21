package moxi.core.demo.model.fc;

import java.io.Serializable;

public class TFcReceivableResultVo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 应收ID
     */
    private String id;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 客户id
     */
    private String customerId;

    /**
     * 合同流水号
     */
    private String contractId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 付款状态
     */
    private Integer payState;
    private String payStateName;

    /**
     * 合同金额
     */
    private String contractTotalPrice;

    /**
     * 实收
     */
    private String netreceiptsMoney;

    /**
     * 消费
     */
    private String consumeMoney;

    /**
     * 退款
     */
    private String refundMoney;

    /**
     * 违约金
     */
    private String penalSumMoney;

    /**
     * 支出
     */
    private String expenditureMoney;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Integer getPayState() {
        return payState;
    }

    public void setPayState(Integer payState) {
        this.payState = payState;
    }

    public String getPayStateName() {
        if (this.payState != null) {
            if (this.payState == 1) {
                this.payStateName = "未付款";
            } else if (this.payState == 2) {
                this.payStateName = "部分付款";
            } else if (this.payState == 3) {
                this.payStateName = "已结清";
            } else if (this.payState == 4) {
                this.payStateName = "多收";
            } else {
                this.payStateName = "";
            }
        }
        return payStateName;
    }

    public void setPayStateName(String payStateName) {
        this.payStateName = payStateName;
    }

    public String getContractTotalPrice() {
        if (this.contractTotalPrice == null) {
            this.contractTotalPrice = "0.00";
        }
        return contractTotalPrice;
    }

    public void setContractTotalPrice(String contractTotalPrice) {
        this.contractTotalPrice = contractTotalPrice;
    }

    public String getNetreceiptsMoney() {
        if (this.netreceiptsMoney == null) {
            this.netreceiptsMoney = "0.00";
        }
        return netreceiptsMoney;
    }

    public void setNetreceiptsMoney(String netreceiptsMoney) {
        this.netreceiptsMoney = netreceiptsMoney;
    }

    public String getConsumeMoney() {
        if (this.consumeMoney == null) {
            this.consumeMoney = "0.00";
        }
        return consumeMoney;
    }

    public void setConsumeMoney(String consumeMoney) {
        this.consumeMoney = consumeMoney;
    }

    public String getRefundMoney() {
        if (this.refundMoney == null) {
            this.refundMoney = "0.00";
        }
        return refundMoney;
    }

    public void setRefundMoney(String refundMoney) {
        this.refundMoney = refundMoney;
    }

    public String getPenalSumMoney() {
        if (this.penalSumMoney == null) {
            this.penalSumMoney = "0.00";
        }
        return penalSumMoney;
    }

    public void setPenalSumMoney(String penalSumMoney) {
        this.penalSumMoney = penalSumMoney;
    }

    public String getExpenditureMoney() {
        if (this.expenditureMoney == null) {
            this.expenditureMoney = "0.00";
        }
        return expenditureMoney;
    }

    public void setExpenditureMoney(String expenditureMoney) {
        this.expenditureMoney = expenditureMoney;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}

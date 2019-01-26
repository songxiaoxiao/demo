package moxi.core.demo.remoteservice;

import java.math.BigDecimal;


public interface CustomerWalletLogOuterService {

    /**
     * 减扣用户可用资产
     * @param customerId 客户Id
     * @param productId 产品Id
     * @param amount 减扣金额
     * @param type 减扣类型
     * @param orderId 订单号
     * @return Boolean
     * */
    Boolean subtractCustomerAvailble(String customerId, String productId, BigDecimal amount, String type, String orderId);
    /**
     * 增加用户可用资产
     * @param customerId 客户Id
     * @param productId 产品Id
     * @param amount 减扣金额
     * @param type 减扣类型
     * @param orderId 订单号
     * */
    Boolean addCustomerAvailble(String customerId, String productId, BigDecimal amount, String type, String orderId);

}

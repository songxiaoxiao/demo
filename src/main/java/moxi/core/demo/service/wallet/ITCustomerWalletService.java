package moxi.core.demo.service.wallet;

import moxi.core.demo.model.wallet.CustomerWalletLogTemp;
import moxi.core.demo.model.wallet.TCustomerWallet;
import com.baomidou.mybatisplus.service.IService;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 客户资产 服务类
 * </p>
 *
 * @author winter
 * @since 2019-01-25
 */
public interface ITCustomerWalletService extends IService<TCustomerWallet> {

    Boolean insetLogThreadQueue();


    /**
     * 减扣用户可用资产
     * @param customerId 客户Id
     * @param productId 产品Id
     * @param amount 减扣金额
     * @param type 减扣类型
     * @param orderId 订单号
     * @return Boolean
     * */
    Boolean subtractCustomerAvailble(String customerId, String productId, BigDecimal amount, String type, String orderId, Long time);
    /**
     * 增加用户可用资产
     * @param customerId 客户Id
     * @param productId 产品Id
     * @param amount 减扣金额
     * @param type 减扣类型
     * @param orderId 订单号
     * */
    Boolean addCustomerAvailble(String customerId, String productId, BigDecimal amount, String type, String orderId, Long time);


}

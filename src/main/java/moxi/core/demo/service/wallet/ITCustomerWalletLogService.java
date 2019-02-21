package moxi.core.demo.service.wallet;

import moxi.core.demo.model.wallet.TCustomerWallet;
import moxi.core.demo.model.wallet.TCustomerWalletLog;
import com.baomidou.mybatisplus.service.IService;
import moxi.core.demo.model.wallet.WalletLogVO;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 资产流水日志 服务类
 * </p>
 *
 * @author winter
 * @since 2019-01-25
 */
public interface ITCustomerWalletLogService extends IService<TCustomerWalletLog> {

    void subtractWriteWalletLog(TCustomerWallet customerWallet, String type, String orderId, BigDecimal amount, Long time);
    void addWriteWalletLog(TCustomerWallet customerWallet, String type, String orderId, BigDecimal amount, Long time);

    List<TCustomerWalletLog> list();
    List<TCustomerWalletLog> withdrawList();
    Boolean deleteLog(TCustomerWalletLog customerWalletLog);
    Boolean updateLog(TCustomerWalletLog customerWalletLog);

}

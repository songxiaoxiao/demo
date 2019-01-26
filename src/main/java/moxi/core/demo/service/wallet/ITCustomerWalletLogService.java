package moxi.core.demo.service.wallet;

import moxi.core.demo.model.wallet.TCustomerWalletLog;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 资产流水日志 服务类
 * </p>
 *
 * @author winter
 * @since 2019-01-25
 */
public interface ITCustomerWalletLogService extends IService<TCustomerWalletLog> {
    Boolean insetLogThreadQueue();
}

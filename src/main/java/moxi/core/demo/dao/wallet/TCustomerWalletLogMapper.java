package moxi.core.demo.dao.wallet;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import moxi.core.demo.model.wallet.TCustomerWalletLog;
import moxi.core.demo.model.wallet.WalletLogVO;

import java.math.BigDecimal;

/**
 * <p>
 * 资产流水日志 Mapper 接口
 * </p>
 *
 * @author winter
 * @since 2019-01-18
 */
public interface TCustomerWalletLogMapper extends BaseMapper<TCustomerWalletLog> {
    BigDecimal sumAmount(WalletLogVO walletVO);
}

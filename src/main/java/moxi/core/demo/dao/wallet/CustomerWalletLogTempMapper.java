package moxi.core.demo.dao.wallet;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import moxi.core.demo.model.wallet.CustomerWalletLogTemp;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author winter
 * @since 2019-01-26
 */
public interface CustomerWalletLogTempMapper extends BaseMapper<CustomerWalletLogTemp> {
    List<String> customerIdList();
}

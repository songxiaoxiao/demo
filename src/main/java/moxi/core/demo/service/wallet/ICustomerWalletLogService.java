package moxi.core.demo.service.wallet;


import com.baomidou.mybatisplus.service.IService;
import moxi.core.demo.model.wallet.TCustomerWalletLog;
import moxi.core.demo.model.wallet.WalletLogVO;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 资产流水日志 服务类
 * </p>
 *
 * @author winter
 * @since 2019-01-18
 */
public interface ICustomerWalletLogService extends IService<TCustomerWalletLog> {
    /**
     * 资金流水
     *
     * */
    List<TCustomerWalletLog> customerWalletLog(WalletLogVO walletVO);


    /**
     * 任务完成总金额(完成-撤销)
     * @param 子合同id
     *
     * */
    BigDecimal taskTotalAmount(WalletLogVO walletVO);

    /**
     * 违约金
     *
     * @param  子合同id，任务id
     * */
    BigDecimal penaltyTotalAmount(WalletLogVO walletVO);

    /**
     * 实收(现金 + 非现金认领)
     * @param 子合同id
     * */
    BigDecimal incomeTotalAmount(WalletLogVO walletVO);

    /**
     * 退款
     * @param 子合同id
     * */
    BigDecimal refundTotalAmount(WalletLogVO walletVO);


}

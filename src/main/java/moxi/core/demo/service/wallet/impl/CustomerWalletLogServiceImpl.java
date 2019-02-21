package moxi.core.demo.service.wallet.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import moxi.core.demo.constans.CommonConstants;
import moxi.core.demo.dao.wallet.TCustomerWalletLogMapper;
import moxi.core.demo.model.wallet.TCustomerWalletLog;
import moxi.core.demo.model.wallet.WalletLogVO;
import moxi.core.demo.service.wallet.ICustomerWalletLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 资产流水日志 服务实现类
 * </p>
 *
 * @author winter
 * @since 2019-01-18
 */
@Service
public class CustomerWalletLogServiceImpl extends ServiceImpl<TCustomerWalletLogMapper, TCustomerWalletLog> implements ICustomerWalletLogService {
    @Resource
    private TCustomerWalletLogMapper customerWalletLogMapper;
    @Override
    public List<TCustomerWalletLog> customerWalletLog(WalletLogVO walletVO){
        EntityWrapper<TCustomerWalletLog> condition = new EntityWrapper<>();
        condition.eq("customer_id", walletVO.getCustomerId());
        condition.eq("product_id", walletVO.getProductId());
        return this.selectList(condition);

    }

    @Override
    public BigDecimal taskTotalAmount(WalletLogVO walletVO) {
        walletVO.setType(CommonConstants.TASK);
        BigDecimal taskAmount = customerWalletLogMapper.sumAmount(walletVO);
        taskAmount = (taskAmount == null) ? new BigDecimal("0") : taskAmount;

        walletVO.setType(CommonConstants.CANCEL_TASK);
        BigDecimal cancelTaskAmount = customerWalletLogMapper.sumAmount(walletVO);
        cancelTaskAmount = (cancelTaskAmount == null) ? new BigDecimal("0") : cancelTaskAmount;
        return taskAmount.subtract(cancelTaskAmount);
    }


    @Override
    public BigDecimal penaltyTotalAmount(WalletLogVO walletVO) {
        walletVO.setType(CommonConstants.PENALTY);
        BigDecimal amount = customerWalletLogMapper.sumAmount(walletVO);
        return (amount == null) ? new BigDecimal("0") : amount;
    }

    @Override
    public BigDecimal incomeTotalAmount(WalletLogVO walletVO) {
        walletVO.setType(CommonConstants.CASH_RECEIPT);
        BigDecimal cashAmount = customerWalletLogMapper.sumAmount(walletVO);
        cashAmount = (cashAmount != null) ? cashAmount : new BigDecimal("0") ;

        walletVO.setType(CommonConstants.NON_CASH_RECEIPT);
        BigDecimal nonCashAmount = customerWalletLogMapper.sumAmount(walletVO);
        if (nonCashAmount == null)nonCashAmount = new BigDecimal("0");

        walletVO.setType(CommonConstants.RETREAT);
        BigDecimal retreatAmount = customerWalletLogMapper.sumAmount(walletVO);
        if (retreatAmount == null)retreatAmount = new BigDecimal("0");

        return cashAmount.add(nonCashAmount).subtract(retreatAmount);
    }

    public BigDecimal refundTotalAmount(WalletLogVO walletVO){
        walletVO.setType(CommonConstants.WITHDRAW);
        BigDecimal amount = customerWalletLogMapper.sumAmount(walletVO);
        return (amount == null) ? new BigDecimal("0") : amount;

    }


}

package moxi.core.demo.service.contract.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import moxi.core.demo.constans.CommonConstants;
import moxi.core.demo.dao.contract.TContractPlanChangeMapper;
import moxi.core.demo.model.contract.ContractPlanChangeDO;
import moxi.core.demo.model.contract.TContractPlanChange;
import moxi.core.demo.service.contract.ITContractPlanChangeService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 合同执行计划变动 服务实现类   ---- 合同签订
 * </p>
 *
 * @author winter
 * @since 2019-02-16
 */
@Service
public class ContractSigningServiceImpl extends ServiceImpl<TContractPlanChangeMapper, TContractPlanChange> implements ITContractPlanChangeService {

    public void contractPlanChange(@Validated ContractPlanChangeDO contractPlanChangeDO){

        TContractPlanChange contractPlanChange = new TContractPlanChange();
        //客户id
        contractPlanChange.setCustomerId(contractPlanChangeDO.getCustomerId());
        //子合同id
        contractPlanChange.setContractProductId(contractPlanChangeDO.getContractProductId());
        //产品id
        contractPlanChange.setProductId(contractPlanChangeDO.getProductId());
        //合同id
        contractPlanChange.setContractId(contractPlanChangeDO.getContractId());

        //单价
        contractPlanChange.setPrice(contractPlanChangeDO.getPrice());
        //剩余赠送周期
        contractPlanChange.setRemainingGiftPeriod(contractPlanChangeDO.getRemainingGiftPeriod());
        //剩余服务周期
        contractPlanChange.setRemainingPeriod(contractPlanChangeDO.getRemainingPeriod());
        //支出预算
        contractPlanChange.setExpenditureBudget(contractPlanChangeDO.getExpenditureBudget());
        //计划收款
        contractPlanChange.setPlannedCollection(contractPlanChangeDO.getPrice().multiply(new BigDecimal(contractPlanChangeDO.getRemainingPeriod())));
        //操作类型
        contractPlanChange.setType(CommonConstants.CONTRACT_PLAN_CONTRACT_SIGNING);
        contractPlanChange.setCreateTime((new Date()).getTime());
        this.insert(contractPlanChange);

    }
}

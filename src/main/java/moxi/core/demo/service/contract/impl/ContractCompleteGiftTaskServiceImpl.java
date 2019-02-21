package moxi.core.demo.service.contract.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import moxi.core.demo.constans.CommonConstants;
import moxi.core.demo.dao.contract.TContractPlanChangeMapper;
import moxi.core.demo.exceptions.AppRuntimeException;
import moxi.core.demo.model.contract.ContractPlanChangeDO;
import moxi.core.demo.model.contract.TContractPlanChange;
import moxi.core.demo.service.contract.ITContractPlanChangeService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

/**
 * <p>
 * 合同执行计划变动 服务实现类   ---- 完成赠送任务
 * </p>
 *
 * @author winter
 * @since 2019-02-16
 */
@Service
public class ContractCompleteGiftTaskServiceImpl extends ServiceImpl<TContractPlanChangeMapper, TContractPlanChange> implements ITContractPlanChangeService {

    public void contractPlanChange(@Validated ContractPlanChangeDO contractPlanChangeDO){


        EntityWrapper<TContractPlanChange> condition = new EntityWrapper<>();
        condition.eq("customer_id", contractPlanChangeDO.getCustomerId());
        condition.eq("product_id", contractPlanChangeDO.getProductId());
        condition.eq("contract_id", contractPlanChangeDO.getContractId());
        condition.eq("contract_product_id", contractPlanChangeDO.getContractProductId());
        condition.orderBy("create_time", false);
        TContractPlanChange contractPlanChange1 = this.selectOne(condition);

        if (contractPlanChange1 == null || contractPlanChange1.getRemainingGiftPeriod() <= 0) throw new AppRuntimeException(400, "没有剩余任务");

        TContractPlanChange contractPlanChange = new TContractPlanChange();
        //客户id
        contractPlanChange.setCustomerId(contractPlanChange1.getCustomerId());
        //子合同id
        contractPlanChange.setContractProductId(contractPlanChange1.getContractProductId());
        //产品id
        contractPlanChange.setProductId(contractPlanChange1.getProductId());
        //合同id
        contractPlanChange.setContractId(contractPlanChange1.getContractId());
        //任务id
        contractPlanChange.setTaskId(contractPlanChangeDO.getTaskId());


        //单价
        contractPlanChange.setPrice(contractPlanChange1.getPrice());

        //剩余赠送周期
        contractPlanChange.setRemainingGiftPeriod(contractPlanChange1.getRemainingGiftPeriod() - 1);
        contractPlanChange.setRemainingGiftPeriodChange(-1);

        //剩余服务周期
        contractPlanChange.setRemainingPeriod(contractPlanChange1.getRemainingPeriod());

        //支出预算
        contractPlanChange.setExpenditureBudget(contractPlanChange1.getExpenditureBudget());
        //计划收款
        contractPlanChange.setPlannedCollection(contractPlanChange1.getPrice());
        //操作类型
        contractPlanChange.setType(CommonConstants.CONTRACT_PLAN_COMPLETE_GIFT_TASK);
        contractPlanChange.setCreateTime((new Date()).getTime());
        this.insert(contractPlanChange);
    }
}

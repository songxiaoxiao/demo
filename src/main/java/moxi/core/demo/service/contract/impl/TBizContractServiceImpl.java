package moxi.core.demo.service.contract.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import moxi.core.demo.dao.contract.TBizContractMapper;
import moxi.core.demo.model.contract.TBizContract;
import moxi.core.demo.service.contract.ITBizContractService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 业务-合同信息表 服务实现类
 * </p>
 *
 * @author sean
 * @since 2019-02-21
 */
@Service
public class TBizContractServiceImpl extends ServiceImpl<TBizContractMapper, TBizContract> implements ITBizContractService {

}

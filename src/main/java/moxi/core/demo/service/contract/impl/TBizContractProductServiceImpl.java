package moxi.core.demo.service.contract.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import moxi.core.demo.dao.contract.TBizContractProductMapper;
import moxi.core.demo.model.contract.TBizContractProduct;
import moxi.core.demo.service.contract.ITBizContractProductService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 业务-合同产品推荐信息表 服务实现类
 * </p>
 *
 * @author winter
 * @since 2019-02-21
 */
@Service
public class TBizContractProductServiceImpl extends ServiceImpl<TBizContractProductMapper, TBizContractProduct> implements ITBizContractProductService {

}

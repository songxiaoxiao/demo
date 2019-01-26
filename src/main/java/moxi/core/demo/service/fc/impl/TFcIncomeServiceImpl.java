package moxi.core.demo.service.fc.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import moxi.core.demo.dao.fc.TFcIncomeMapper;
import moxi.core.demo.model.fc.TFcIncome;
import moxi.core.demo.service.fc.ITFcIncomeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 财务-收入信息表 服务实现类
 * </p>
 *
 * @author winter
 * @since 2019-01-26
 */
@Service
public class TFcIncomeServiceImpl extends ServiceImpl<TFcIncomeMapper, TFcIncome> implements ITFcIncomeService {

}

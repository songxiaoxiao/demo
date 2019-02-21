package moxi.core.demo.service.fc.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import moxi.core.demo.dao.fc.TFcReceivableV2Mapper;
import moxi.core.demo.dao.task.TTaskBaseMapper;
import moxi.core.demo.model.fc.ListTFcReceivableBody;
import moxi.core.demo.model.fc.ListTFcReceivableResultVo;
import moxi.core.demo.model.fc.TFcReceivable;
import moxi.core.demo.service.contract.IContractWalletLogService;
import moxi.core.demo.service.fc.ITFcReceivableV2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 财务-应收信息表 服务实现类
 * </p>
 *
 * @author sean
 * @since 2019-02-18
 */
@Service
public class TFcReceivableV2ServiceImpl extends ServiceImpl<TFcReceivableV2Mapper, TFcReceivable> implements ITFcReceivableV2Service {



    @Override
    public ListTFcReceivableResultVo listReceivable(ListTFcReceivableBody body) {


        return null;
    }
}

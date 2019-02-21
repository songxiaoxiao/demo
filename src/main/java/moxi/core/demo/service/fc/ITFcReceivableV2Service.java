package moxi.core.demo.service.fc;


import com.baomidou.mybatisplus.service.IService;
import moxi.core.demo.model.fc.ListTFcReceivableBody;
import moxi.core.demo.model.fc.ListTFcReceivableResultVo;
import moxi.core.demo.model.fc.TFcReceivable;

/**
 * <p>
 * 财务-应收信息表 服务类
 * </p>
 *
 * @author sean
 * @since 2019-02-18
 */
public interface ITFcReceivableV2Service extends IService<TFcReceivable> {

    ListTFcReceivableResultVo listReceivable(ListTFcReceivableBody body);
}

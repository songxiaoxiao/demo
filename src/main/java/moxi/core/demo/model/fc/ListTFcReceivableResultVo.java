package moxi.core.demo.model.fc;

import java.io.Serializable;
import java.util.List;

public class ListTFcReceivableResultVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<TFcReceivableResultVo> data;
    private Integer total;

    public List<TFcReceivableResultVo> getData() {
        return data;
    }

    public void setData(List<TFcReceivableResultVo> data) {
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}

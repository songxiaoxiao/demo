package moxi.core.demo.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class WalletTempVO implements Serializable {
    private static final long serialVersionUID = -6426360202679529731L;

    private String id;
    private String orderId;
    private BigDecimal amount;
    private String relProductId;
    private String relCustomerId;
    private String datetime;
    private String relContractId;

}

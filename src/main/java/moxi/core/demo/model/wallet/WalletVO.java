package moxi.core.demo.model.wallet;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class WalletVO implements Serializable {
    private static final long serialVersionUID = -794788849299662311L;

    public interface Wallet {}
    public interface WalletLog {}

    @NotNull(message = "customer必传", groups = {Wallet.class})
    private String customerId;

    @NotNull(message="id必传", groups = {WalletLog.class})
    private Long id;

    private String productId;
    private String productName;
    private BigDecimal availble;
    private BigDecimal locked;

}

package moxi.core.demo.model.wallet;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Data
public class WalletLogVO {
    private static final long serialVersionUID = -4954709107873574543L;
    public interface Wallet {}
    public interface WalletLog {}

    /**
     * 要显示的页码
     */
    private int pageNum=1;
    /**
     * 一页显示条数
     */
    private int pageSize=10;



    @NotBlank(message = "CUSTOMER_ID_MUST", groups = {WalletLog.class})
    private String customerId;

//    @NotNull(message="id必传", groups = {WalletLog.class})
    private Long id;
    @NotBlank(message="产品ID必传", groups = {WalletLog.class})
    private String productId;
    private String contractProductId;
    private String productName;
    private BigDecimal amount;
    private String typeName;
    private String type;
    private String orderId;
    private BigDecimal beforeAmount;
    private BigDecimal afterAmount;
    private Long createTime;


}

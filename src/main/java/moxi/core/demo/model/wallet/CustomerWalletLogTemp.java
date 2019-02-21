package moxi.core.demo.model.wallet;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author winter
 * @since 2019-01-26
 */
@TableName("customer_wallet_log_temp")
@Data
public class CustomerWalletLogTemp extends Model<CustomerWalletLogTemp> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @TableField("order_id")
    private String orderId;
    private BigDecimal amount;
    private String type;
    @TableField("customer_id")
    private String customerId;
    @TableField("product_id")
    private String productId;
    @TableField("create_time")
    private Long createTime;
    @TableField("contract_id")
    private String contractId;
    @TableField("contract_product_id")
    private String contractProductId;




    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

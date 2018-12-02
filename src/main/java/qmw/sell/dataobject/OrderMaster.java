package qmw.sell.dataobject;


import lombok.Data;
import qmw.sell.enums.OrderStatusEnum;
import qmw.sell.enums.PayStatusEnum;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class OrderMaster {

    /**订单ID*/
    @Id
    private String orderId;

    /** 买家名字*/
    private String orderName;

    /** 买家手机号码*/
    private String buyerPhone;

    /** 买家地址*/
    private String buyerAddress;

    /** 买家微信Openid*/
    private String buyerOpenid;

    /** 订单金额*/
    private BigDecimal orderAmount;

    /** 订单状态，默认为新下单*/
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /** 支付状态，默认是0未支付*/
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /** 创建时间*/
    private Date createTime;

    /** 更新时间*/
    private Date updateTime;


}

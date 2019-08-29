package com.runhang.sell.entity.fresh.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author huhongyuan
 * Date: 2018-11-19
 * Time: 9:50
 * Description:
 */

@ApiModel(value = "下单结果")
@Data
public class CreateOrderResult {
    @ApiModelProperty(name = "orderId",value = "订单ID")
    private Integer orderId;
    @ApiModelProperty(name = "orderCode",value = "订单编号")
    private String orderCode;
    @ApiModelProperty(name = "pay",value = "支付信息")
    private WechatJsPayResult pay;

    public CreateOrderResult() {
    }

    public CreateOrderResult(Integer orderId, String orderCode, WechatJsPayResult pay) {
        this.orderId = orderId;
        this.orderCode = orderCode;
        this.pay = pay;
    }
}
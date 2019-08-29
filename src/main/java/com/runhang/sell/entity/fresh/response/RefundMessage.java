package com.runhang.sell.entity.fresh.response;

import com.alibaba.fastjson.JSONObject;
import com.runhang.sell.model.Order;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName RefundMessage
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/19 17:16
 * @Version 1.0
 * @Description 退款基本信息。
 **/
@Data
public class RefundMessage implements Serializable {

    /**支付宝支付*/
    public static final int PAY_TYPE_ZFB = 1;
    /**微信支付*/
    public static final int PAY_TYPE_WX = 2;
    /**银联支付*/
    public static final int PAY_TYPE_YL = 3;
    /**现金支付*/
    public static final int PAY_TYPE_CASH = 4;

    /**订单编号*/
    private String orderCode;
    /**支付编号*/
    private String payOrderCode;
    /**退款金额*/
    private String refundMoney;
    /**订单总金额*/
    private String totalFee;
    /**退款原因*/
    private String refundReason;
    /**退款类型:支付类型*/
    private Integer refundType;

    public RefundMessage() {
    }

    public RefundMessage(Order order, String refundReason) {
        this.orderCode = order.getOrderCode();
        this.payOrderCode = order.getPayOrderCode();
        this.refundMoney = String.valueOf(order.getPayAmount());
        this.totalFee = String.valueOf(order.getOrderTotal());
        this.refundReason = refundReason;
        if(order.getPayType()!=null){
            this.refundType = Integer.valueOf(order.getPayType());
        }
    }
    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }

    public Boolean checkIsEmpty(){
        if(orderCode == null || "".equals(orderCode) ||
                payOrderCode == null || "".equals(payOrderCode) ||
                refundMoney == null || "".equals(refundMoney) ||
                totalFee == null || "".equals(totalFee) ||
                refundReason == null || "".equals(refundMoney) ||
                refundType == null || "".equals(refundType)){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}

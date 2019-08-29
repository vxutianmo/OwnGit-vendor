package com.runhang.sell.entity.fresh.response;

import com.alibaba.fastjson.JSONObject;
import com.runhang.sell.entity.old.request.SaleGoodsMessage;
import com.runhang.sell.model.Order;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName OrderMessage
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/17 11:45
 * @Version 1.0
 * @Description 销售订单数据
 **/
@Data
public class OrderMessage implements Serializable {

    private String billId;

    /**订单总价*/
    private Long orderTotalPrice;
    /**售货机编号*/
    private String vendorCode;
    /**订单号*/
    private String tradeNumber;
    /**开始时间*/
    private String startTime;
    /**订单状态*/
    private String status;
    /**订单详情信息*/
    List<OrderDetailMessage> detailMessageList;
    /**客户端ip*/
    private String IP;
    /** 用户唯一标识 */
    private String open_id;

    private String deviceNumber;

    public OrderMessage(String billId,Long orderTotalPrice,
                        String vendorCode,String tradeNumber,
                        String startTime,String status,
                        List<OrderDetailMessage> orderDetailMessageList){
        this.billId = billId;
        this.orderTotalPrice = orderTotalPrice;
        this.vendorCode = vendorCode;
        this.tradeNumber = tradeNumber;
        this.startTime = startTime;
        this.status = status;
        this.detailMessageList = orderDetailMessageList;
    }

    public static OrderMessage from (Order order, String vendorCode, List<SaleGoodsMessage> saleGoodsMessageList, String IP){
        OrderMessage orderMessage = new OrderMessage();
        orderMessage.setBillId(order.getOrderCode());
        orderMessage.setOrderTotalPrice(order.getOrderTotal());
        orderMessage.setVendorCode(vendorCode);
        orderMessage.setTradeNumber(order.getOrderCode());
        orderMessage.setStartTime(String.valueOf(order.getOrderStartTime()));
        orderMessage.setStatus(order.getOrderStatus());
        List<OrderDetailMessage> orderDetailMessageList = new ArrayList<>();
        for (SaleGoodsMessage saleGoodsMessage: saleGoodsMessageList) {
            OrderDetailMessage orderDetailMessage = new OrderDetailMessage(saleGoodsMessage);
            orderDetailMessageList.add(orderDetailMessage);
        }
        orderMessage.setDetailMessageList(orderDetailMessageList);
        orderMessage.setIP(IP);
        return orderMessage;
    }

    public OrderMessage(OrderMessage orderMessage){
        this.billId = orderMessage.getBillId();
        this.orderTotalPrice = orderMessage.getOrderTotalPrice();
        this.vendorCode = orderMessage.getVendorCode();
        this.tradeNumber = orderMessage.getTradeNumber();
        this.startTime = orderMessage.getStartTime();
        this.status = orderMessage.getStatus();
        this.IP = orderMessage.getIP();
        detailMessageList = new ArrayList<>();
        for(OrderDetailMessage orderDetailMessage : orderMessage.detailMessageList){
            this.detailMessageList.add(new OrderDetailMessage(orderDetailMessage));
        }
    }

    public OrderMessage(){

    }
    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}

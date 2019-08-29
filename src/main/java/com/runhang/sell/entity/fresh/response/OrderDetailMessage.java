package com.runhang.sell.entity.fresh.response;

import com.alibaba.fastjson.JSONObject;
import com.runhang.sell.entity.old.request.SaleGoodsMessage;
import lombok.Data;

import java.io.Serializable;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2018/8/20 16:12
 * @Version 1.0
 * @Description
 **/
@Data
public class OrderDetailMessage  implements Serializable {
    /**商品ID*/
    private Integer goodsId;
    /**商品名称*/
    private String goodsName;
    /**商品数量*/
    private Integer count;
    /**商品单价*/
    private Long singlePrice;
    /**商品总价*/
    private Long totalPrice;
    /**商品所在货道ID*/
    private String vendorTrack;

    public OrderDetailMessage(){

    }

    public OrderDetailMessage(Integer goodsId,String goodsName,
                               Integer count,Long singlePrice,
                               Long totalPrice,String vendorTrack){
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.count = count;
        this.singlePrice = singlePrice;
        this.totalPrice = totalPrice;
        this.vendorTrack = vendorTrack;
    }

    public OrderDetailMessage(OrderDetailMessage orderDetailMessage){
        this.goodsId = orderDetailMessage.getGoodsId();
        this.goodsName = orderDetailMessage.getGoodsName();
        this.count = orderDetailMessage.getCount();
        this.singlePrice = orderDetailMessage.getSinglePrice();
        this.totalPrice = orderDetailMessage.getTotalPrice();
        this.vendorTrack = orderDetailMessage.getVendorTrack();
    }

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }

    /**复制构造器*/
    public OrderDetailMessage(SaleGoodsMessage saleGoodsMessage){
        this.goodsId = Integer.valueOf(saleGoodsMessage.getProid());
        this.goodsName = saleGoodsMessage.getName();
        this.count = Integer.valueOf(saleGoodsMessage.getCount());
        this.singlePrice = Long.parseLong(saleGoodsMessage.getSinPrice());
        this.totalPrice = Long.parseLong(saleGoodsMessage.getToPrice());
        this.vendorTrack = saleGoodsMessage.getChid();
    }
}

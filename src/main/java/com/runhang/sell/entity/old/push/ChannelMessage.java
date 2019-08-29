package com.runhang.sell.entity.old.push;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.runhang.sell.entity.fresh.request.VendorTrack;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName ChannelMessage
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/10 14:43
 * @Version 1.0
 * @Description 货道信息。
 **/
@Data
public class ChannelMessage implements Serializable {

    /**货道ID*/
    @JSONField(name="ChId")
    public String chId;
    /**货道容量*/
    @JSONField(name = "ChCapacity")
    public String chCapacity;
    /**货道当前数量*/
    @JSONField(name = "ChCurrent")
    public String chCurrent;
    /**货道商品价格*/
    private String price;
    /**货道阈值*/
    private String threshold;
    /**货道商品*/
    private String proid;
    /** 口红机游戏价格*/
    private String playPrice;
    /** 口红机专属字段-是否售卖 */
    private Integer whetherToSell;

    public ChannelMessage(){

    }

    /**复制构造器*/
    public ChannelMessage(VendorTrack vendorTrack){
        this.chId = vendorTrack.getTrackNumber();
        this.chCapacity = vendorTrack.getTotalCount();
        this.chCurrent = vendorTrack.getCurrentCount();
        this.price = vendorTrack.getSalePrice();
        this.threshold = vendorTrack.getThreshold();
        this.proid = vendorTrack.getGoodsId();
        this.playPrice = vendorTrack.getPlayPrice();
        this.whetherToSell = vendorTrack.getWhetherToSell();
    }
    @JsonProperty("ChId")
    public String getChId() {
        return chId;
    }
    @JsonProperty("ChCapacity")
    public String getChCapacity() {
        return chCapacity;
    }
    @JsonProperty("ChCurrent")
    public String getChCurrent() {
        return chCurrent;
    }

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }

}

package com.runhang.sell.entity.fresh.request;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName VendorTrack
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/6 13:20
 * @Version 1.0
 * @Description 货道基本信息（货道变更消息推送）
 **/
@Data
public class VendorTrack implements Serializable {

    public VendorTrack(){

    }

    public VendorTrack(String trackId,String trackNumber,
                       String totalCount,String currentCount,
                       String salePrice,String threshold,
                       String goodsId,String vendorCode, String playPrice,Integer whetherToSell){
        this.trackId = trackId;
        this.trackNumber = trackNumber;
        this.totalCount = totalCount;
        this.currentCount =currentCount;
        this.salePrice = salePrice;
        this.threshold = threshold;
        this.goodsId = goodsId;
        this.vendorCode = vendorCode;
        this.playPrice = playPrice;
        this.whetherToSell = whetherToSell;
    }

    /**
     * 货道ID
     */
    private String trackId;

    /**
     * 货道编号
     */
    private String trackNumber;

    /**
     * 货道总共存放货物数量
     */
    private String totalCount;

    /**
     * 货道当前存放货物数量
     */
    private String currentCount;

    /**
     * 货道对商品售价
     */
    private String salePrice;

    /**
     * 货道货物阈值（达到某个数量进行报警操作）
     */
    private String threshold;

    /**
     * 所属放置商品ID
     */
    private String goodsId;

    //用于储存售货机编号，跟广告、App更新等统一，便于在接口统一获取pushId
    private String vendorCode;
    
    //口红机玩一次的价格
    private String playPrice;
    /** 是否售卖 */
    private Integer whetherToSell;

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}

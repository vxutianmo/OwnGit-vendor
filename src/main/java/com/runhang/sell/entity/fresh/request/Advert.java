package com.runhang.sell.entity.fresh.request;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * @ClassName Advert
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/6 13:21
 * @Version 1.0
 * @Description 广告基本信息（广告变更消息推送用）
 **/
@Data
public class Advert {

    public Advert(){

    }

    public Advert(String adId,String vendorId,
                  String advertUrl,String adStartTime,
                  String adEndTime){
        this.adId = adId;
        this.vendorId = vendorId;
        this.advertUrl = advertUrl;
        this.adStartTime = adStartTime;
        this.adEndTime = adEndTime;
    }


    /**
     * 广告ID
     */
    private String adId;

    /**
     * 售货机ID//TODO:这个地方应该是售货机编号
     * 暂时当做售货机广告关联id测试一下
     */
    private String vendorId;

    /**
     * 广告状态（使用/停止）
     */
    private String advertUrl;

    /**
     * 广告开始时间
     */
    private String adStartTime;

    /**
     * 广告结束时间
     */
    private String adEndTime;

    /**
     * 售货机ID//TODO:这个地方应该是售货机编号
     */
    private String vendorCode;
    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}

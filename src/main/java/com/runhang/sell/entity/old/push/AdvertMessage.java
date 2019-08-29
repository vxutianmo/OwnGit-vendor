package com.runhang.sell.entity.old.push;

import com.alibaba.fastjson.JSONObject;
import com.runhang.sell.entity.fresh.request.Advert;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName AdvertMessage
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/10 14:39
 * @Version 1.0
 * @Description 广告信息。
 **/
@Data
public class AdvertMessage implements Serializable {

    /**广告ID*/
    private String adId;
    /**售货机与广告关联ID*/
    private String avId;
    /**广告是否停用*/
    private String adCon;
    /**广告开始时间*/
    private String adstarttime;
    /**广告结束时间*/
    private String adendtime;

    public AdvertMessage(){

    }


    /**复制构造器*/
    public AdvertMessage(Advert advert){
        this.adId = advert.getAdId();
        this.avId = advert.getVendorId();
        this.adCon = advert.getAdvertUrl();
        this.adstarttime = advert.getAdStartTime();
        this.adendtime = advert.getAdEndTime();
    }

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}

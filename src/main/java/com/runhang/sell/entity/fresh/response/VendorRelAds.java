package com.runhang.sell.entity.fresh.response;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;

/**
 * @ClassName VendorRelADS
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/7/25 0025 17:20
 * @Version 1.0
 * @Description 售货机和广告关联。noticeType=3
 **/
public class VendorRelAds {

     /**
      *售货机ID
      **/
    private String vendorId;

    /**
     *广告ID
     **/
    private String adId;

    /**
     *广告条件
     **/
    private String adCondition;

    /**
     *广告开始时间
     **/
    private String adStartTime;

    /**
     *广告结束时间
     **/
    private String adEndTime;

    @Override
    public String toString(){
       return JSONObject.toJSONString(this);
    }

}

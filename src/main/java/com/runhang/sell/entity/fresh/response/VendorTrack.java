package com.runhang.sell.entity.fresh.response;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import lombok.Data;

/**
 * @ClassName VendorTrack
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/7/25 0025 16:19
 * @Version 1.0
 * @Description 货道基本信息推送。noticeType=5
 **/
@Data
public class VendorTrack {
    /**
     *关联售货机ID
     **/
    private String vendorId;

    /**
     *货道编号
     **/
    private String trackNum;

    /**
     *存货总数量
     **/
    private String totalCount ;

    /**
     *当前数量
     **/
    private String currentCount;

    /**
     *预警数量
     **/
    private String threshold;

    /**
     *当前售价
     **/
    private String sellingPrice;

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}

package com.runhang.sell.entity.old.push;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * @ClassName VendorTrack
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/7/25 16:19
 * @Version 1.0
 * @Description 货道基本信息推送。
 **/
@Data
public class VendorTrack {
    /**
     *关联售货机ID
     **/
    private String proid;

    /**
     *货道编号
     **/
    private String ChId;

    /**
     *存货总数量
     **/
    private String ChCapacity ;

    /**
     *当前数量
     **/
    private String ChCurrent;

    /**
     *预警数量
     **/
    private String threshold;

    /**
     *当前售价
     **/
    private String price;

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}

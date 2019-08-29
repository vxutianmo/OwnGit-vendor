package com.runhang.sell.entity.old.response;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * @ClassName ChannelBaseMessage
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/7/25 11:52
 * @Version 1.0
 * @Description 货道基础信息
 **/
@Data
public class ChannelBaseMessage {

    /**
     *货道编号
     **/
    private String channelId;

    /**
     *商品编号
     **/
    private String goodsId;

    /**
     *货道最大存储量
     **/
    private String channelCapacity;

    /**
     *货道阈值
     **/
    private String threshold;

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}

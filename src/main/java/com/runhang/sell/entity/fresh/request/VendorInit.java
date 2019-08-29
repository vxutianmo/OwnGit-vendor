package com.runhang.sell.entity.fresh.request;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import lombok.Data;

import java.util.List;

/**
 * @ClassName VendorInit
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/7/25 9:49
 * @Version 1.0
 * @Description
 * 获取一下售货机发送过来的初始化信息（货道初始化接口）
 **/
@Data
public class VendorInit {

    /**
      *售货机ID
      **/
    private String vendorId;

    /**
     *货道数目
     **/
    private String channelNum;

    /**
     *货道编号列表
     **/
    private List<String> channelList;

    /**
     *极光推送ID号（暂时保留）
     **/
    private String pushId;

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}

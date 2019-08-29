package com.runhang.sell.entity.old.push;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName PushResponseWrapper
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/7/25 0025 15:45
 * @Version 1.0
 * @Description 推送数据统一包装类。
 **/
@Data
public class PushResponseWrapper {

    /**消息类型*/
    private int noticeType;
    /**功能类型*/
    private int type;
    /**传递信息*/
    private Object response;
    /**推送消息massageId*/
    //private Integer id = (int)(1+Math.random()*(10-1+1));
    private String id = UUID.randomUUID().toString();

    /**
     *自定义返回结果
     *建议使用统一的返回结果，特殊情况可以使用此方法
     **/
    public static PushResponseWrapper markCustom(int noticeType, int type, Object response){
        PushResponseWrapper responseWrapper = new PushResponseWrapper();
        responseWrapper.setNoticeType(noticeType);
        responseWrapper.setType(type);
        responseWrapper.setResponse(response);
        return responseWrapper;
    }

    private static void test(){
        List<VendorTrack> vendorTracks = new ArrayList<>();
        markCustom(com.runhang.sell.entity.fresh.push.PushType.NOTICE_TYPE_VENDOR_TRACK,PushType.TYPE_VENDOR_TRACK_ADD,vendorTracks);
    }
    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}

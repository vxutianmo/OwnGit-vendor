package com.runhang.sell.entity.fresh.push;

import com.runhang.sell.entity.fresh.response.VendorTrack;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PushResponseWrapper
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/7/25 0025 15:45
 * @Version 1.0
 * @Description 推送数据统一包装类。
 **/
@Data
public class PushResponseWrapper {

    private int noticeType;
    private int type;
    private Object response;

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
        markCustom(PushType.NOTICE_TYPE_VENDOR_TRACK,PushType.TYPE_VENDOR_TRACK_ADD,vendorTracks);
    }
}

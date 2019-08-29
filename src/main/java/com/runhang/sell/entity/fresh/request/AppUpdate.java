package com.runhang.sell.entity.fresh.request;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.List;

/**
 * @ClassName AppUpdateMessage
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/11 0011 14:49
 * @Version 1.0
 * @Description App自动更新APP功能。
 **/
@Data
public class AppUpdate {

    public AppUpdate(){

    }

    public AppUpdate(List<String> vendorIdList,
                     AppAddress addressMessage){
        this.vendorIdList = vendorIdList;
        this.addressMessage = addressMessage;
    }


    /**要更新APP的售货机ID列表*/
    private List<String> vendorIdList;

    /**APP地址信息*/
    private AppAddress addressMessage;

    /**消息推送类型*/
    private String noticeType;

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}

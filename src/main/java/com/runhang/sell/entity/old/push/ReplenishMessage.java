package com.runhang.sell.entity.old.push;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.runhang.sell.entity.fresh.request.VendorTrack;

import java.io.Serializable;

/**
 * @Program: spring-iot
 * @ClassName: ReplenishMessage
 * @Author: zhangyan
 * @Create: 2018/09/10 16:17
 * @Description: 补货的消息类型
 **/
public class ReplenishMessage implements Serializable {

    @JSONField(name="ChId")
    public String chid;
    @JSONField(name="current")
    public Integer current;

    public ReplenishMessage(){}
    public ReplenishMessage(VendorTrack vendorTrack){
        this.chid = vendorTrack.getTrackNumber();
        if(vendorTrack.getCurrentCount() != null){
            this.current = Integer.parseInt(vendorTrack.getCurrentCount());
        }
    }

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}

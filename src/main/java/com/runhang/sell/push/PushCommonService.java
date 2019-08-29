package com.runhang.sell.push;

import com.alibaba.fastjson.JSONObject;
import com.runhang.framework.result.Result;
import com.runhang.framework.utils.PushHelper;
import com.runhang.sell.entity.fresh.request.*;
import com.runhang.sell.entity.fresh.request.*;
import com.runhang.sell.entity.fresh.request.Advert;
import com.runhang.sell.entity.fresh.request.Announcement;
import com.runhang.sell.entity.fresh.request.Goods;
import com.runhang.sell.entity.fresh.request.VendorTrack;
import com.runhang.sell.entity.fresh.response.DeviceNumber;
import com.runhang.sell.entity.old.push.*;
import com.runhang.sell.mapper.*;
import com.runhang.sell.model.*;
import com.runhang.sell.entity.old.push.*;
import com.runhang.sell.mapper.*;
import com.runhang.sell.model.*;
import com.runhang.sell.service.JiGuangService;
import com.runhang.sell.service.impl.JiGuangServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName PushCommonService
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/10 0010 16:51
 * @Version 1.0
 * @Description 推送公共方法。
 **/
@Slf4j
@Component
public class PushCommonService {

    @Autowired
    private JPushService autowiredJPushService;
    @Autowired
    private MqttPushService autowiredMqttPushService;

    private static JPushService jPushService;
    private static MqttPushService mqttPushService;

    /**
     * @return void
     * @Description 静态注入
     * @Param []
     * @Author zhangyan
     * @Date 10:42 2018/8/22
     * @Description: 方法是静态方法所以需要添加静态的对象
     */
    @PostConstruct
    private void beforeInit() {
        jPushService = this.autowiredJPushService;
        mqttPushService = this.autowiredMqttPushService;
    }

    /**
     * @Author: zhangyan
     * @Date: 2018/12/19 14:51
     * @Param: [vendor]
     * @Return: void
     * @Description: 向设备推送设备编号
     */
    public static void pushDeviceNumber(com.runhang.base.model.vendormgt.Vendor vendor){
        String deviceNumber = vendor.getDeviceNumber();
        String vdCode = vendor.getVdCode();
        //把设备编号封装成对象
        DeviceNumber deviceNumber1 = new DeviceNumber();
        deviceNumber1.setDeviceNumber(deviceNumber);
        PushResponseWrapper pushResponseWrapper = PushResponseWrapper.markCustom(PushType.NOTICE_TYPE_DEVICE_NUMBER,0,deviceNumber1);
        String pushMessage = pushResponseWrapper.toString();
        jPushService.jiguangPush(pushMessage,vdCode,JPushService.TYPE.DEFAULT);
        mqttPushService.mqttPush(pushMessage,MqttPushService.TYPE.PTP,MqttPushService.To.CLOUD,vdCode,"向设备推送设备编号");
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/16_14:16
     * @Param: [vdCode, map]
     * @Return: void
     * @Description: 向设备推送预售商品
     */
    public static void pushPresaleGoods(String vdCode,List<Map<String,Object>> list,Integer i){
        PushResponseWrapper pushResponseWrapper = PushResponseWrapper.markCustom(PushType.NOTICE_TYPE_PRESALE_GOODS,i,list);
        String pushMessage = pushResponseWrapper.toString();
        System.out.println(pushMessage);
//        jPushService.jiguangPush(pushMessage,vdCode,JPushService.TYPE.DEFAULT);
//        mqttPushService.mqttPush(pushMessage,MqttPushService.TYPE.PTP,MqttPushService.To.CLOUD,vdCode,"向设备推送预售商品信息");
    };
}

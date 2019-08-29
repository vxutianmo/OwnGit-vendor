package com.runhang.sell.core.jpush;

import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Options;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;

import com.alibaba.fastjson.JSONObject;


import com.runhang.sell.push.JPushService;
import com.runhang.sell.service.impl.PushResultService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @ClassName JDPush
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/3 18:52
 * @Version 1.0
 * @Description 极光推送工具类。
 **/
@Component
public class JDPush {

    private static final Logger logger = LoggerFactory.getLogger(JDPush.class);

    @Value("${jpush.cloud.appkey}")
    private String cloudKey;

    @Value("${jpush.cloud.masterSecret}")
    private String cloudMasterSecret;

    @Value("${jpush.update.appkey}")
    private String updateKey;

    @Value("${jpush.update.masterSecret}")
    private String updateMasterSecret;


    @Autowired
    private PushResultService resultService;

    /**
     * @return void
     * @Author wangzhaosen@runhangtech.com
     * @Date 2018/8/3 18:55
     * @Param
     * @Description android 推送工具类。
     **/


    private JPushClient getClient(JPushService.TYPE type) {
        JPushClient client;
        switch (type) {
            case DEFAULT:
                client = new JPushClient(cloudMasterSecret, cloudKey);
                break;
            case DOWNLOAD:
                client = new JPushClient(updateMasterSecret, updateKey);
                break;
            default:
                client = new JPushClient(cloudMasterSecret, cloudKey);
                break;
        }
        return client;
    }

    public void jPushAndroid(Map<String, Object> parm) {
        PushPayload pushPayload = makePayload(parm);
        JPushService.TYPE type = (JPushService.TYPE) parm.get("type");
        PushResult result = null;
        JPushClient client = getClient(type);
        try {
            result = client.sendPush(pushPayload);
            int responseCode = result.getResponseCode();
            logger.error("极光推送 ---> 结果:" + responseCode);
            resultService.savePushRecord(parm, result);
        } catch (Exception e) {
            String message = e.getMessage();
            logger.error(String.format("极光推送 ---> 异常:%s", message));
            resultService.savePushRecord(parm, JSONObject.parseObject(message, JPushError.class));
        } finally {
            client.close();
            logger.error(String.format("极光推送 ---> 时间:%s", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));
            logger.error(String.format("极光推送 ---> 内容:%s", parm.get("msg")));
            logger.error("极光推送 ---> 目标:" + parm.get("registrationId"));
        }
    }


    private PushPayload makePayload(Map<String, Object> param) {
        PushPayload.Builder builder = PushPayload.newBuilder()
                //指定android平台的用户
                .setPlatform(Platform.android())
                .setOptions(Options.newBuilder().setApnsProduction(false).setTimeToLive(3600).build())
                .setMessage(Message.content((String) param.get("msg")));
        //.setNotification(Notification.android("收到推送", "极光推送", null));

        Object registrationId = param.get("registrationId");
        if (null == registrationId) {
            //安全起见，不再推送所有设备
            //builder.setAudience(Audience.all());
        } else if (registrationId instanceof Collection) {
            builder.setAudience(Audience.registrationId((List<String>) registrationId));
        } else {
            //安全起见，不再推送所有设备
            //builder.setAudience(Audience.all());
        }
        return builder.build();

    }

}

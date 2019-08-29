package com.runhang.sell.core.jpush;

import cn.jiguang.common.ClientConfig;
import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Options;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.AndroidNotification;
import cn.jpush.api.push.model.notification.IosNotification;
import cn.jpush.api.push.model.notification.Notification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName JiguangPushTwo
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/3 0003 19:09
 * @Version 1.0
 * @Description 极光推送方式二
 **/
@Component
public class JiguangPushTwo {

    private static final Logger log = LoggerFactory.getLogger(JiguangPushTwo.class);
    private static String masterSecret;
    private static String appKey;
    private static String alert;
    private static String alias;

    public static String getMasterSecret() {
        return masterSecret;
    }

    public static void setMasterSecret(String masterSecret) {
        JiguangPushTwo.masterSecret = masterSecret;
    }

    public static String getAppKey() {
        return appKey;
    }

    public static void setAppKey(String appKey) {
        JiguangPushTwo.appKey = appKey;
    }

    public static String getAlert() {
        return alert;
    }

    public static void setAlert(String alert) {
        JiguangPushTwo.alert = alert;
    }

    public static String getAlias() {
        return alias;
    }

    public static void setAlias(String alias) {
        JiguangPushTwo.alias = alias;
    }

    /**
     * 极光推送
     */
    public void jiguangPush(){
        log.info("对别名" + alias + "的用户推送信息");
        PushResult result = push(String.valueOf(alias),alert);
        if(result != null && result.isResultOK()){
            log.info("针对别名" + alias + "的信息推送成功！");
        }else{
            log.info("针对别名" + alias + "的信息推送失败！");
        }
    }

    /**
     * 生成极光推送对象PushPayload（采用java SDK）
     * @param alias
     * @param alert
     * @return PushPayload
     */
    public static PushPayload buildPushObject_android_ios_alias_alert(String alias, String alert){
        return PushPayload.newBuilder()
                .setPlatform(Platform.android_ios())
                .setAudience(Audience.alias(alias))
                .setNotification(Notification.newBuilder()
                        .addPlatformNotification(AndroidNotification.newBuilder()
                                .addExtra("type", "infomation")
                                .setAlert(alert)
                                .build())
                        .addPlatformNotification(IosNotification.newBuilder()
                                .addExtra("type", "infomation")
                                .setAlert(alert)
                                .build())
                        .build())
                .setOptions(Options.newBuilder()
                        .setApnsProduction(false)//true-推送生产环境 false-推送开发环境（测试使用参数）
                        .setTimeToLive(90)//消息在JPush服务器的失效时间（测试使用参数）
                        .build())
                .build();
    }
    /**
     * 极光推送方法(采用java SDK)
     * @param alias
     * @param alert
     * @return PushResult
     */
    public static PushResult push(String alias,String alert){
        ClientConfig clientConfig = ClientConfig.getInstance();
        JPushClient jpushClient = new JPushClient(masterSecret, appKey, null, clientConfig);
        PushPayload payload = buildPushObject_android_ios_alias_alert(alias,alert);
        try {
            return jpushClient.sendPush(payload);
        } catch (APIConnectionException e) {
            log.error("Connection error. Should retry later. ", e);
            return null;
        } catch (APIRequestException e) {
            log.error("Error response from JPush server. Should review and fix it. ", e);
            log.info("HTTP Status: " + e.getStatus());
            log.info("Error Code: " + e.getErrorCode());
            log.info("Error Message: " + e.getErrorMessage());
            log.info("Msg ID: " + e.getMsgId());
            return null;
        }
    }
}

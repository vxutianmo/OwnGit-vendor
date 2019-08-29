package com.runhang.sell.core.jpush;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import sun.misc.BASE64Encoder;

/**
 * @ClassName JiguangPush
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/3 19:00
 * @Version 1.0
 * @Description 极光推送工具类。
 **/
@Component
public class JiguangPushOne {
    private static final Logger log = LoggerFactory.getLogger(JiguangPushOne.class);
    private static String masterSecret;
    private static String appKey;
    private String pushUrl = "https://api.jpush.cn/v3/push";
    private boolean apns_production = true;
    private int time_to_live = 86400;
    /*具体的推送消息*/
    private String alert;
    /*声明别名*/
    private String alias;
    /**
     * 极光推送
     */
    public void jiguangPush(){
        System.out.println("appkey--"+appKey);
        System.out.println("mast--"+masterSecret);
        System.out.println("消息--"+alert);
        try{
            String result = push(pushUrl,alias,alert,appKey,masterSecret,apns_production,time_to_live);
            JSONObject resData = JSONObject.parseObject(result);
            if(resData.containsKey("error")){
                log.info("针对别名为" + alias + "的信息推送失败！");
                JSONObject error = JSONObject.parseObject(resData.get("error")+"");
                log.info("错误信息为：" + error.get("message").toString());
            }
            log.info("针对别名为" + alias + "的信息推送成功！");
        }catch(Exception e){
            log.error("针对别名为" + alias + "的信息推送失败！",e);
        }
    }

    /**
     * 组装极光推送专用json串
     * @param alias
     * @param alert
     * @return json
     */
    public static JSONObject generateJson(String alias,String alert,boolean apns_production,int time_to_live){
        JSONObject json = new JSONObject();
        JSONArray platform = new JSONArray();//平台
        platform.add("android");
        platform.add("ios");

        JSONObject audience = new JSONObject();//推送目标
        JSONArray alias1 = new JSONArray();
        alias1.add(alias);
        audience.put("alias", alias1);

        JSONObject notification = new JSONObject();//通知内容
        JSONObject android = new JSONObject();//android通知内容
        android.put("alert", alert);
        android.put("builder_id", 1);
        JSONObject android_extras = new JSONObject();//android额外参数
        android_extras.put("type", "infomation");
        android.put("extras", android_extras);

        JSONObject ios = new JSONObject();//ios通知内容
        ios.put("alert", alert);
        ios.put("sound", "default");
        ios.put("badge", "+1");
        JSONObject ios_extras = new JSONObject();//ios额外参数
        ios_extras.put("type", "infomation");
        ios.put("extras", ios_extras);
        notification.put("android", android);
        notification.put("ios", ios);

        JSONObject options = new JSONObject();//设置参数
        options.put("time_to_live", Integer.valueOf(time_to_live));
        options.put("apns_production", apns_production);

        json.put("platform", platform);
        json.put("audience", audience);
        json.put("notification", notification);
        json.put("options", options);
        return json;

    }

    /**
     * 推送方法-调用极光API
     * @param reqUrl
     * @param alias
     * @param alert
     * @return result
     */
    public static String push(String reqUrl,String alias,String alert,String appKey,String masterSecret,boolean apns_production,int time_to_live){
        String base64_auth_string = encryptBASE64(appKey + ":" + masterSecret);
        String authorization = "Basic " + base64_auth_string;
        return sendPostRequest(reqUrl,generateJson(alias,alert,apns_production,time_to_live).toString(),"UTF-8",authorization);
    }

    /**
     * 发送Post请求（json格式）
     * @param reqURL
     * @param data
     * @param encodeCharset
     * @param authorization
     * @return result
     */
    @SuppressWarnings({ "resource" })
    public static String sendPostRequest(String reqURL, String data, String encodeCharset,String authorization){
        HttpPost httpPost = new HttpPost(reqURL);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = null;
        String result = "";
        try {
            StringEntity entity = new StringEntity(data, encodeCharset);
            entity.setContentType("application/json");
            httpPost.setEntity(entity);
            httpPost.setHeader("Authorization",authorization.trim());
            response = client.execute(httpPost);
            result = EntityUtils.toString(response.getEntity(), encodeCharset);
        } catch (Exception e) {
            log.error("请求通信[" + reqURL + "]时偶遇异常,堆栈轨迹如下", e);
        }finally{
            client.getConnectionManager().shutdown();
        }
        return result;
    }
    /**
     　　　　* BASE64加密工具
     　　　　*/
    public static String encryptBASE64(String str) {
        byte[] key = str.getBytes();
        BASE64Encoder base64Encoder = new BASE64Encoder();
        String strs = base64Encoder.encodeBuffer(key);
        return strs;
    }

    public static Logger getLog() {
        return log;
    }

    public static String getMasterSecret() {
        return masterSecret;
    }

    public static void setMasterSecret(String masterSecret) {
        JiguangPushOne.masterSecret = masterSecret;
    }

    public static String getAppKey() {
        return appKey;
    }

    public static void setAppKey(String appKey) {
        JiguangPushOne.appKey = appKey;
    }

    public String getPushUrl() {
        return pushUrl;
    }

    public void setPushUrl(String pushUrl) {
        this.pushUrl = pushUrl;
    }

    public boolean isApns_production() {
        return apns_production;
    }

    public void setApns_production(boolean apns_production) {
        this.apns_production = apns_production;
    }

    public int getTime_to_live() {
        return time_to_live;
    }

    public void setTime_to_live(int time_to_live) {
        this.time_to_live = time_to_live;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}

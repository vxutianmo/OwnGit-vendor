package com.runhang.sell.model.mixc;

import lombok.Data;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2019/3/21 19:39
 * @Version 1.0
 * @Description 万象城公共请求参数
 **/
@Data
public class PublicRequest {

    /**核销APP*/
    public static final String COUPON_APP = "1";

    /**核销端登录接口*/
    public static final String LOGIN_URL = "0";
    /**核销查询接口*/
    public static final String GET_COUPON_URL = "1";
    /**核销接口*/
    public static final String USE_COUPON_URL = "2";

    /**接口名*/
    private String action;
    /**应用ID*/
    private String appId;
    /**
     * 平台
     * h5 H5应用
     * */
    private String platform;
    /**设备号 非必填*/
    private String imei;
    /**应用迭代版本号（如：1.0.0）*/
    private String appVersion;
    /**操作系统版本号（如：12.0.1)*/
    private String osVersion;
    /**接口版本（详看接口参数接口版本定义）*/
    private String apiVersion;
    /**
     * 项目编码
     * 2402A101 青岛万象城
     * */
    private String mallNo;
    /**用户令牌（登录后获得，匿名访问接口非必传）*/
    private String token;
    /**时间戳*/
    private String timestamp;
    /**数据签名*/
    private String sign;
    /**业务参数数据*/
    private String params;

    public PublicRequest() {
    }

    public PublicRequest(MallConfig config) {
        action = config.getAction();
        appId = config.getAppId();
        imei = config.getImei();
        apiVersion = config.getApiVersion();
        appVersion = config.getAppVersion();
        osVersion = config.getOsVersion();
        platform = config.getPlatform();
        mallNo = config.getMallNo();
        timestamp = System.currentTimeMillis()+"";
    }

    /**
     *@Author: fyb
     *@Date 2019/3/30_17:11
     *@Param [APP_SECRET]
     *@Return java.lang.String
     *@Description: 验签数据
     */
    public String signData(String APP_SECRET) {
        return
                "action=" + action +
                        "&apiVersion=" + apiVersion +
                        "&appId=" + appId +
                        "&appVersion=" + appVersion +
                        //"&imei=" + imei +
                        "&mallNo=" + mallNo +
                        "&osVersion=" + osVersion +
                        "&params=" + params +
                        "&platform=" + platform +
                        "&timestamp=" + timestamp +
                        "&" + APP_SECRET
                ;
    }
    /**
     *@Author: fyb
     *@Date 2019/3/30_17:11
     *@Param [APP_SECRET]
     *@Return java.lang.String
     *@Description: 验签数据携带token
     */
    public String signTokenData(String APP_SECRET) {
        return
                "action=" + action +
                        "&apiVersion=" + apiVersion +
                        "&appId=" + appId +
                        "&appVersion=" + appVersion +
                        //"&imei=" + imei +
                        "&mallNo=" + mallNo +
                        "&osVersion=" + osVersion +
                        "&params=" + params +
                        "&platform=" + platform +
                        "&timestamp=" + timestamp +
                        "&token=" + token +
                        "&" + APP_SECRET
                ;
    }

    public String reqDate() {
        return "action=" + action +
                "&apiVersion=" + apiVersion +
                "&appId=" + appId +
                "&appVersion=" + appVersion +
                //"&imei=" + imei +
                "&mallNo=" + mallNo +
                "&osVersion=" + osVersion +
                "&params=" + params +
                "&platform=" + platform +
                "&sign=" + sign +
                "&timestamp=" + timestamp
                ;
    }

    public String reqTokenDate() {
        return "action=" + action +
                "&apiVersion=" + apiVersion +
                "&appId=" + appId +
                "&appVersion=" + appVersion +
                //"&imei=" + imei +
                "&mallNo=" + mallNo +
                "&osVersion=" + osVersion +
                "&params=" + params +
                "&platform=" + platform +
                "&sign=" + sign +
                "&timestamp=" + timestamp +
                "&token=" + token
                ;
    }

//    public String reqDate() {
//        return "{" +
//                "\"action\":\""+ action +"\"," +
//                "\"apiVersion\":\""+ apiVersion +"\"," +
//                "\"appId\":\""+ appId +"\"," +
//                "\"platform\":\""+ platform +"\"," +
//                //"\"imei\":\""+ imei +"\"," +
//                "\"appVersion\":\""+ appVersion +"\"," +
//                "\"osVersion\":\""+ osVersion +"\"," +
//                "\"timestamp\":\""+ timestamp +"\"," +
//                "\"mallNo\":\""+ mallNo +"\"," +
//                "\"sign\":\""+ sign +"\"," +
//                "\"params\":\""+ params +"\"" +
//                "}";
//    }
//
//    public String reqTokenDate() {
//        return "{" +
//                "\"action\":\""+ action +"\"," +
//                "\"apiVersion\":\""+ apiVersion +"\"," +
//                "\"appId\":\""+ appId +"\"," +
//                "\"platform\":\""+ platform +"\"," +
//                //"\"imei\":  \""+ imei +"\"," +
//                "\"appVersion\":\""+ appVersion +"\"," +
//                "\"osVersion\":\""+ osVersion +"\"," +
//                "\"timestamp\":\""+ timestamp +"\"," +
//                "\"mallNo\":\""+ mallNo +"\"," +
//                "\"sign\":\""+ sign +"\"," +
//                "\"token\":\""+ token +"\"," +
//                "\"params\":\""+ params +"\"" +
//                "}";
//    }
}

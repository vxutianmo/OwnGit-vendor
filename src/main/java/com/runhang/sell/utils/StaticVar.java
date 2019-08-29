package com.runhang.sell.utils;

public class StaticVar {

    public static final String BBT_URL = "https://bbtjoy-openapiserver-rh.bbtjoy.com/api/sdrh-api/machine/setting/";

    //线下环境
    public static final String START_URL = "http://192.168.1.44:8089/lipstick/start";
    //线上环境
    //public static final String START_URL = "http://ajnctest.runhangtech.com/lipstick/start";

    // 线下环境
    public static final String REDUCE_URL = "http://192.168.1.44:8089/lipstick/reduce_points";
    // 线上环境
    //public static final String REDUCE_URL = "http://ajnctest.runhangtech.com/lipstick/reduce_points";

    // 取消订单
    // 线下测试环境
    public static final String CANCEL_URL = "http://192.168.1.44:8089/lipstick/cancelOrder";
    // 线上环境
    //public static final String CANCEL_URL = "http://ajnctest.runhangtech.com/lipstick/cancelOrder";

    // 加解密密钥
    public static final String KEY = "1234567812345678";
    public static final String IV = "1234567812345678";

    //线上支付服务器
//    public static final String PAY_SERVER="http://47.92.160.166:9999";
    //线下支付服务器
    public static final String PAY_SERVER="http://192.168.0.82:8095";
}

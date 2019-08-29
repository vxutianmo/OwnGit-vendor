package com.runhang.sell.http;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.runhang.framework.result.Result;
import com.runhang.sell.entity.old.response.ResponseWrapper;
import com.runhang.sell.http.service.AccountService;
import com.runhang.sell.http.service.PayService;
import com.runhang.sell.utils.AESUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * @ClassName HttpNoticeService
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/6 15:14
 * @Version 1.0
 * @Description 网络通信服务：将接口系统同分账系统和支付系统进行结合应用。
 **/
@Slf4j
@Service
public class HttpNoticeService {
    /**连接超时时间*/
    public static final Integer CONN_TIME_OUT = 10000;
    /**读取超时时间*/
    public static final Integer READ_TIME_OUT = 10000;
    /**数据格式JSON*/
    public static final String MIME_TYPE_JSON = "application/json";
    /**数据格式-发送前编码*/
    public static final String MIME_TYPE_FILE = "application/x-www-form-urlencoded";
    /**编码UTF-8*/
    public static final String CHAR_SET_UTF_8 = "UTF-8";
    /**返回值失败*/
    public static final String RESULT_FAIL = "fail";
    /**返回值成功*/
    public static final String RESULT_SUCCESS = "success";
    /**加解密时使用的密钥*/
    private static final String AES_KEY = "1234567812345678";

    /**加解密时使用的偏移量*/
    private static final String AES_OFFSET = "1234567812345678";

    @Value("${dingdingSMS.url:http://47.92.160.166:9999/admin/core/ding/sendMsg}")
    String SEND_DING_DING_MSG_URL;

    @Autowired
    PayService payService;

    @Autowired
    AccountService accountService;

    /**
     *@Author: fyb
     *@Date 2018/8/20_16:26
     *@Param [decode]
     *@Return java.lang.String
     *@Description: 请求支付二维码
     */
    public String requestQRCode(String decode){
        log.info("请求支付二维码==>加密后的订单信息--"+decode);
        if(decode==null){
            log.error("HttpNoticeService requestQRCode @param decode is null");
            return AESUtils.encrypt(ResponseWrapper.markParamError("decode==null").toString(), AES_KEY, AES_OFFSET);
        }
        //String Url = UrlUtils.getInstance().getPayBaseUrl()+UrlUtils.PAY_API_URL+UrlUtils.GET_PAY_QR_CODE;
        //log.info("请求支付的地址==> "+Url);
        try {
            //String result = HttpClientUtils.post(Url,decode,MIME_TYPE_JSON,CHAR_SET_UTF_8,CONN_TIME_OUT,READ_TIME_OUT);
            String result = payService.getPayQRCode(decode);
            log.info("HttpNoticeService requestQRCode HttpClientUtils.post result: "+result);
            return result;
        } catch (Exception e) {
            log.error("requestQRCode HttpClientUtils.post error:{}",e);
            return AESUtils.encrypt(ResponseWrapper.markParamError(RESULT_FAIL).toString(), AES_KEY, AES_OFFSET);
        }
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/4/1_16:00
     * @Param: [decode]
     * @Return: java.lang.String
     * @Description: 橙汁机请求二维码 多码合一后可以使用多码合一的接口
     */
    public String requestQRCodeOrange(String decode){
        log.info("请求支付二维码==>加密后的订单信息--"+decode);
        if(decode==null){
            log.error("HttpNoticeService requestQRCode @param decode is null");
            return AESUtils.encrypt(ResponseWrapper.markParamError("decode==null").toString(), AES_KEY, AES_OFFSET);
        }
        //String Url = UrlUtils.getInstance().getPayBaseUrl()+UrlUtils.PAY_API_URL+UrlUtils.GET_PAY_QR_CODE;
        //log.info("请求支付的地址==> "+Url);
        try {
            //String result = HttpClientUtils.post(Url,decode,MIME_TYPE_JSON,CHAR_SET_UTF_8,CONN_TIME_OUT,READ_TIME_OUT);
            String result = payService.getPayQRCodeOrange(decode);
            log.info("HttpNoticeService requestQRCode HttpClientUtils.post result: "+result);
            return result;
        } catch (Exception e) {
            log.error("requestQRCode HttpClientUtils.post error:{}",e);
            return AESUtils.encrypt(ResponseWrapper.markParamError(RESULT_FAIL).toString(), AES_KEY, AES_OFFSET);
        }
    }

    /**
     *@Author: fyb
     *@Date 2018/8/20_16:26
     *@Param [decode]
     *@Return java.lang.String
     *@Description: 退款
     */
    public String requestRefund(String decode){
        log.info("退款==>requestRefund "+decode);
        if(decode==null){
            log.error("HttpNoticeService requestRefund @param decode is null");
            return AESUtils.encrypt(ResponseWrapper.markParamError("decode==null").toString(), AES_KEY, AES_OFFSET);
        }
        //String Url = UrlUtils.getInstance().getPayBaseUrl()+UrlUtils.PAY_API_URL+UrlUtils.REFUND;
        //log.info("请求地址==> "+Url);
        try {
            //String result = HttpClientUtils.post(Url,decode,MIME_TYPE_JSON,CHAR_SET_UTF_8,CONN_TIME_OUT,READ_TIME_OUT);
            String result = payService.zxNetRefunds(decode);
            log.info("HttpNoticeService requestRefund HttpClientUtils.post result: "+result);
            return result;
        } catch (Exception e) {
            log.error("requestQRCode HttpClientUtils.post error:{}",e);
            return AESUtils.encrypt(ResponseWrapper.markParamError(RESULT_FAIL).toString(), AES_KEY, AES_OFFSET);
        }
    }

    /**
     *@Author: fyb
     *@Date 2018/8/20_16:26
     *@Param [decode]
     *@Return java.lang.String
     *@Description: 分账
     */
    public String requestAccount(String orderCode){
        log.info("分账==>requestAccount "+orderCode);
        if(orderCode==null){
            log.error("HttpNoticeService requestAccount @param orderCode is null");
            return "orderCode==null";
        }
        //String Url = UrlUtils.getInstance().getAccountBaseUrl()+UrlUtils.ACCOUNT_API_URL+UrlUtils.SALE_ACCOUNT;
        //log.info("请求地址==> "+Url);
        try {
            //String result = HttpClientUtils.post(Url,"orderCode="+orderCode,MIME_TYPE_FILE,CHAR_SET_UTF_8,CONN_TIME_OUT,READ_TIME_OUT);
            String result = accountService.saleAccount(orderCode);
            log.info("HttpNoticeService requestAccount HttpClientUtils.post result: "+result);
            return result;
        } catch (Exception e) {
            log.error("requestQRCode HttpClientUtils.post error:{}",e);
            return RESULT_FAIL;
        }
    }
    /**
     *@Author: fyb
     *@Date 2018/9/21_16:04
     *@Param [orderCode]
     *@Return java.lang.String
     *@Description: 发送报警短信
     */
    public String sendMessage(Map<String,String> map){
        log.info("发送报警短信==>sendMessage "+map);
        if(map==null){
            log.error("HttpNoticeService sendMessage @param map is null");
            return RESULT_FAIL;
        }
        String Url = UrlUtils.SEND_MESSAGE_URL;
        log.info("请求地址==> "+Url);
        try {
            String result = HttpClientUtils.postForm(Url,map,null,CONN_TIME_OUT,READ_TIME_OUT);
            Map<String,Object> ret = (Map<String, Object>) JSONArray.parse(result);
            if("发送信息成功".equals(ret.get("msg"))) {
                return RESULT_SUCCESS;
            }
            log.error((String)ret.get("msg"));
            return RESULT_FAIL;
        } catch (Exception e) {
            log.error("requestQRCode HttpClientUtils.post error:{}",e);
            return RESULT_FAIL;
        }
    }


    public String requestWechatJsPay(String decode){
        log.info("请求微信JS支付==>加密后的订单信息--"+decode);
        if(decode==null){
            log.error("HttpNoticeService requestWechatJsPay @param decode is null");
            return AESUtils.encrypt(ResponseWrapper.markParamError("decode==null").toString(), AES_KEY, AES_OFFSET);
        }
        try {
            //String result = HttpClientUtils.post(Url,decode,MIME_TYPE_JSON,CHAR_SET_UTF_8,CONN_TIME_OUT,READ_TIME_OUT);
            String result = payService.zxWechatJsPay(decode);
            log.info("HttpNoticeService requestWechatJsPay HttpClientUtils.post result: "+result);
            return result;
        } catch (Exception e) {
            log.error("requestWechatJsPay HttpClientUtils.post error:{}",e);
            return AESUtils.encrypt(ResponseWrapper.markParamError(RESULT_FAIL).toString(), AES_KEY, AES_OFFSET);
        }
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/6/3_15:26
     * @Param: [decode]
     * @Return: java.lang.String
     * @Description: 预售 请求支付
     */
    public String requestWechatSellPay(String decode){
        if(decode==null){
            log.error("HttpNoticeService requestWechatSellPay @param decode is null");
            return AESUtils.encrypt(ResponseWrapper.markParamError("decode==null").toString(), AES_KEY, AES_OFFSET);
        }
        try {
            //String result = HttpClientUtils.post(Url,decode,MIME_TYPE_JSON,CHAR_SET_UTF_8,CONN_TIME_OUT,READ_TIME_OUT);
            String result = payService.zxWechatSellPay(decode);
            log.info("HttpNoticeService requestWechatSellPay HttpClientUtils.post result: "+result);
            return result;
        } catch (Exception e) {
            log.error("requestWechatSellPay HttpClientUtils.post error:{}",e);
            return AESUtils.encrypt(ResponseWrapper.markParamError(RESULT_FAIL).toString(), AES_KEY, AES_OFFSET);
        }
    }

    /**
     *@Author: fyb
     *@Date 2019/1/24_18:17
     *@Param [map]
     *@Return java.lang.String
     *@Description: 向会员发送退还积分信息
     */
    public String sendRefundMessage(Map<String,String> map){
        log.info("发送退还积分短信==>sendMessage "+map);
        if(map==null){
            log.error("HttpNoticeService sendRefundMessage @param map is null");
            return RESULT_FAIL;
        }
        String Url = UrlUtils.SEND_RETURN_INTEGRAL_MSG_URL;
        log.info("请求地址==> "+Url);
        try {
            String result = HttpClientUtils.postForm(Url,map,null,CONN_TIME_OUT,READ_TIME_OUT);
            Map<String,Object> ret = (Map<String, Object>) JSONArray.parse(result);
            Integer status = (Integer) ret.get("status");
            if(1==status) {
                return RESULT_SUCCESS;
            }
            log.error((String)ret.get("msg"));
            return RESULT_FAIL;
        } catch (Exception e) {
            log.error("requestQRCode HttpClientUtils.post error:{}",e);
            return RESULT_FAIL;
        }
    }

    /**
     *@Author: fyb
     *@Date 2019/1/24_18:17
     *@Param [map]
     *@Return java.lang.String
     *@Description: 钉钉推送消息
     */
    public String sendDingDingMsg(Map<String,String> map){
        log.info("发送钉钉推送消息==>sendDingDingMsg "+map);
        if(map==null){
            log.error("HttpNoticeService sendDingDingMsg @param map is null");
            return RESULT_FAIL;
        }
        String Url = SEND_DING_DING_MSG_URL;
        log.info("请求地址==> "+Url);
        try {
            String result = HttpClientUtils.postForm(Url,map,null,CONN_TIME_OUT,READ_TIME_OUT);
            JSONObject ret = JSONObject.parseObject(result);
            if("success".equals(ret.get("result"))) {
                log.error("钉钉推送成功，return :"+ret.get("response"));
                return RESULT_SUCCESS;
            }
            log.error("钉钉推送失败,return "+ret.get("response"));
            return RESULT_FAIL;
        } catch (Exception e) {
            log.error("sendDingDingMsg exception:{}",e);
            return RESULT_FAIL;
        }
    }

    /**
     *@Author: fyb
     *@Date 2018/8/20_16:26
     *@Param [decode]
     *@Return java.lang.String
     *@Description: 请求龙支付二维码
     */
    public String requestDragonQRCode(String data){
        log.info("请求支付二维码==>加密后的订单信息--"+data);
        if(data==null){
            log.error("HttpNoticeService requestDragonQRCode @param decode is null");
            return AESUtils.encrypt(ResponseWrapper.markParamError("decode==null").toString(), AES_KEY, AES_OFFSET);
        }
        String decode = AESUtils.encrypt(data,AES_KEY, AES_OFFSET);
        try {
            String retMessage = payService.getDragonPayQRCode(decode);
            String result = AESUtils.desEncrypt(retMessage,AES_KEY, AES_OFFSET).trim();
            log.info("HttpNoticeService requestDragonQRCode HttpClientUtils.post result: "+result);
            return result;
        } catch (Exception e) {
            log.error("requestDragonQRCode HttpClientUtils.post error:{}",e);
            return RESULT_FAIL;
        }
    }

    /**
     *@Author: fyb
     *@Date 2018/8/20_16:26
     *@Param [decode]
     *@Return java.lang.String
     *@Description: 龙支付退款
     */
    public String requestDragonRefund(String decode){
        log.info("龙支付退款==>requestDragonRefund "+decode);
        if(decode==null){
            log.error("HttpNoticeService requestDragonRefund @param decode is null");
            return AESUtils.encrypt(ResponseWrapper.markParamError("decode==null").toString(), AES_KEY, AES_OFFSET);
        }
        //String Url = UrlUtils.getInstance().getPayBaseUrl()+UrlUtils.PAY_API_URL+UrlUtils.REFUND;
        //log.info("请求地址==> "+Url);
        try {
            //String result = HttpClientUtils.post(Url,decode,MIME_TYPE_JSON,CHAR_SET_UTF_8,CONN_TIME_OUT,READ_TIME_OUT);
            String result = payService.dragonRefunds(decode);
            log.info("HttpNoticeService requestDragonRefund HttpClientUtils.post result: "+result);
            return result;
        } catch (Exception e) {
            log.error("requestQRCode HttpClientUtils.post error:{}",e);
            return AESUtils.encrypt(ResponseWrapper.markParamError(RESULT_FAIL).toString(), AES_KEY, AES_OFFSET);
        }
    }

    /**
     *@Author: fyb
     *@Date 2019/3/22_10:21
     *@Param [url, decode]
     *@Return com.runhang.framework.result.Result<java.lang.String>
     *@Description: 万象城post请求
     */
    public Result<String> requestMixc(String url, String decode){
        log.info("请求万象城url:"+url+" -- date:{}",decode);
        if(StringUtils.isEmpty(url)||StringUtils.isEmpty(decode)){
            log.error("万象城 requestMixc @param is null");
            return Result.returnError("requestMixc @param is null");
        }
        try {
            String result = HttpClientUtils.post(url,decode,MIME_TYPE_FILE,CHAR_SET_UTF_8,CONN_TIME_OUT,READ_TIME_OUT);
            log.info("万象城-返回数据:"+result);
            return Result.returnSuccess(result);
        } catch (Exception e) {
            log.error("万象城post请求异常:{}",e);
            return Result.returnError("万象城post请求异常:"+e);
        }
    }

//    public static void main(String[] args){
//        String url = "http://192.168.0.50:8098/saler/mixc/createCoupon";
//        String decode =
//                "venid=863424030163529&token=09E18EB2DA270A46D1404C384D00D27E&couponNo=HJGFYHJGHJVHJ&BillId=1"
//                ;
//        try {
//            String result = HttpClientUtils.post(url,decode,MIME_TYPE_FILE,CHAR_SET_UTF_8,CONN_TIME_OUT,READ_TIME_OUT);
//            log.info("AAAAA ==> "+result);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//    }
}

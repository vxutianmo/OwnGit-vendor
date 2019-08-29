package com.runhang.sell.http;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @ClassName URLUtils
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/6 14:15
 * @Version 1.0
 * @Description 地址信息。
 **/
@Data
@Component
public class UrlUtils {

    public static final String ADVERT_ADD = "advert_add";
    public static final String ADVERT_DELETE = "advert_delete";
    public static final String ADVERT_UPDATE = "advert_update";
    public static final String ADVERT_MULTI_DELETE = "advert_multi_delete";

    public static final String GOODS_ADD = "goods_add";
    public static final String GOODS_DELETE = "goods_delete";
    public static final String GOODS_UPDATE = "goods_update";
    public static final String GOODS_MULTI_DELETE = "goods_multi_delete";

    public static final String VENDOR_TRACK_ADD = "vendor_track_add";
    public static final String VENDOR_TRACK_DELETE = "vendor_track_delete";
    public static final String VENDOR_TRACK_UPDATE = "vendor_track_update";
    public static final String VENDOR_TRACK_MULTI_DELETE = "vendor_track_multi_delete";

    public static final String REFUND = "refund";
    public static final String SALE = "sale";
    public static final String SALE_ACCOUNT = "sale_account";
    public static final String GET_PAY_QR_CODE = "getPayQRCode";

    public static final String PAY_API_URL = "rhpay/";
    public static final String ACCOUNT_API_URL = "account/";

    public static final String SEND_MESSAGE_URL = "http://47.92.163.196:8080/inzone/utils/sendNotify";
    public static final String SEND_AUTH_CODE_URL = "http://47.92.163.196:8080/inzone/utils/sendAuthCode";
    public static final String SEND_RETURN_INTEGRAL_MSG_URL = "http://47.92.163.196:8080/inzone/utils/sendReturnIntegralMsg";

    public static final String SEND_DING_DING_MSG = "http://47.92.160.166:9999/admin/core/ding/sendMsg";
//    public static final String SEND_DING_DING_MSG = "http://rhiot3.s3.natapp.cc/admin/core/ding/sendMsg";
//    public static final String SEND_DING_DING_MSG = "http://192.168.0.50:8088/admin/core/ding/sendMsg";
    /*@Value("${interface.accountBaseUrl}")
    private String accountBaseUrl;*/

    /*@Value("${interface.payBaseUrl}")
    private String payBaseUrl;*/

    private static UrlUtils urlUtils = null;
    private UrlUtils(){

    }
    @Bean
    public static UrlUtils getInstance(){
        if(urlUtils == null){
            urlUtils = new UrlUtils();
        }
        return urlUtils;
    }


    /**a
     * 使用样例
     */
    public static void main(String[] args){
       // String goodsAdd = UrlUtils.getInstance().getAccountBaseUrl()+GOODS_ADD;
    }


}

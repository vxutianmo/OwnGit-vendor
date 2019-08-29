package com.runhang.sell.http.inter;

import com.runhang.sell.http.config.FeignConfig;
import com.runhang.sell.http.hystrix.PayHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName PayInterface
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/9/17 0017 15:02
 * @Version 1.0
 * @Description 支付接口。
 **/
@FeignClient(value = "pay-service",configuration= FeignConfig.class,fallback=PayHystrix.class)
public interface PayInterface {

    /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/17 0017 15:22
     *@Param content:订单数据。
     *@return java.lang.String
     *@Description 获取支付宝和微信支付二维码信息。
     **/
    @RequestMapping(value = "/rhpay/get_pay_qr_code", method = RequestMethod.POST)
    public String getPayQRCode(@RequestBody String content);
    @RequestMapping(value = "/rhpay/get_pay_qr_code_orange", method = RequestMethod.POST)
    public String getPayQRCodeOrange(@RequestBody String content);

    /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/17 0017 15:26
     *@Param [outTradeNo, tradeNo, refundMoney, refund_reason, refundType, totalFee, outRefundNo]
     *@return java.lang.String
     *@Description 中信银行本地退款。
     **/
    @RequestMapping(value = "/rhpay/zxRefunds", method = RequestMethod.POST)
    public String zxLocalRefunds(@RequestParam(name = "outTradeNo", required = true) String outTradeNo,
                                 @RequestParam(name = "tradeNo", required = true) String tradeNo,
                                 @RequestParam(name = "refundMoney", required = true) String refundMoney,
                                 @RequestParam(name = "refund_reason", required = true) String refund_reason,
                                 @RequestParam(name = "refundType", required = true) Integer refundType,
                                 @RequestParam(name = "totalFee", required = true) String totalFee,
                                 @RequestParam(name = "outRefundNo", required = true) String outRefundNo);

    /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/17 0017 15:27
     *@Param request, content
     *@return java.lang.String
     *@Description 中信银行网络退款。
     **/
    @RequestMapping(value = "/rhpay/zx_refund", method = RequestMethod.POST)
    public String zxNetRefunds(@RequestBody String content);


    @RequestMapping(value = "/rhpay/zx_wechat_jspay",method = RequestMethod.POST)
    public String zxWechatJsPay(@RequestBody String content);

    @RequestMapping(value = "/rhpay/zx_wechat_sell_pay",method = RequestMethod.POST)
    public String zxWechatSellPay(@RequestBody String content);

    /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/17 0017 15:22
     *@Param content:订单数据。
     *@return java.lang.String
     *@Description 获取龙支付二维码信息。
     **/
    @RequestMapping(value = "/rhpay/dragon_pay/get_pay_qr_code", method = RequestMethod.POST)
    public String getDragonPayQRCode(@RequestBody String content);

    /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/17 0017 15:27
     *@Param request, content
     *@return java.lang.String
     *@Description 建行外联平台退款。
     **/
    @RequestMapping(value = "/rhpay/dragon_pay/lzfrefund", method = RequestMethod.POST)
    public String dragonRefunds(@RequestBody String content);
}

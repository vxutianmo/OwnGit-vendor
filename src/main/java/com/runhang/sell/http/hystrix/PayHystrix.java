package com.runhang.sell.http.hystrix;

import com.runhang.sell.http.inter.PayInterface;
import org.springframework.stereotype.Component;

/**
 * @ClassName DealHystrix
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/9/17 0017 15:01
 * @Version 1.0
 * @Description 支付熔断处理。
 **/
@Component
public class PayHystrix implements PayInterface {


    @Override
    public String getPayQRCode(String content) {
        return null;
    }

    @Override
    public String getPayQRCodeOrange(String content) {
        return null;
    }

    @Override
    public String zxLocalRefunds(String outTradeNo, String tradeNo, String refundMoney, String refund_reason, Integer refundType, String totalFee, String outRefundNo) {
        return null;
    }

    @Override
    public String zxNetRefunds(String content) {
        return null;
    }

    @Override
    public String zxWechatJsPay(String content) {
        return null;
    }
    @Override
    public String zxWechatSellPay(String content) {
        return null;
    }
    @Override
    public String getDragonPayQRCode(String content){
        return null;
    }
    @Override
    public String dragonRefunds(String content) {
        return null;
    }
}

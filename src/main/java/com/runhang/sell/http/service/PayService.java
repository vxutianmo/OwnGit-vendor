package com.runhang.sell.http.service;

import com.runhang.sell.http.inter.PayInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @ClassName PayService
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/9/17 0017 15:03
 * @Version 1.0
 * @Description 支付接口服务类。
 **/
@Service
public class PayService {

    @Autowired
    PayInterface payInterface;

    /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/17 15:54
     *@Param content ：订单信息
     *@return java.lang.String
     *@Description 中信银行方式-根据支付订单获取支付二维码信息。
     **/
    public String getPayQRCode(String content){
        return payInterface.getPayQRCode(content);
    }

    /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/17 15:55
     *@Param [outTradeNo, tradeNo, refundMoney, refundReason, refundType, totalFee, outRefundNo]
     *@return java.lang.String
     *@Description 中信银行方式-根据订单信息进行本地退款。
     **/
    public String zxLocalRefunds(String outTradeNo, String tradeNo, String refundMoney, String refundReason,
                                 Integer refundType, String totalFee, String outRefundNo){
        return payInterface.zxLocalRefunds(outTradeNo,tradeNo,refundMoney,refundReason,refundType,totalFee,outRefundNo);
    }

    /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/17 0017 15:56
     *@Param content:订单信息。
     *@return java.lang.String
     *@Description 中信银行方式-根据订单信息进行网上退款。
     **/
    public String zxNetRefunds(String content){
        return payInterface.zxNetRefunds(content);
    }


    public String zxWechatJsPay(String content){
        return payInterface.zxWechatJsPay(content);
    }
    public String zxWechatSellPay(String content){
        return payInterface.zxWechatSellPay(content);
    }
    public String getPayQRCodeOrange(String content){
        return payInterface.getPayQRCodeOrange(content);
    }

    /**
     *@Author: fyb
     *@Date 2019/3/12_11:55
     *@Param [content]
     *@Return java.lang.String
     *@Description: 请求龙支付二维码
     */
    public String getDragonPayQRCode(String content){
        return payInterface.getDragonPayQRCode(content);
    }

    /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/17 0017 15:56
     *@Param content:订单信息。
     *@return java.lang.String
     *@Description 中信银行方式-根据订单信息进行网上退款。
     **/
    public String dragonRefunds(String content){
        return payInterface.dragonRefunds(content);
    }
}

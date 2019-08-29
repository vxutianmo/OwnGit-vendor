package com.runhang.sell.entity.fresh.response;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author huhongyuan
 * Date: 2018-11-16
 * Time: 15:57
 * Description: 中信微信支付请求结果封装
 */

@ApiModel(value = "小程序支付信息")
@Data
public class WechatJsPayResult {
    private String tokenId;
    private PayInfo payInfo;

    public WechatJsPayResult(String tokenId, PayInfo payInfo) {
        this.tokenId = tokenId;
        this.payInfo = payInfo;
    }
}
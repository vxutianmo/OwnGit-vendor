package com.runhang.sell.entity.fresh.response;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author huhongyuan
 * Date: 2018-11-17
 * Time: 11:47
 * Description: 微信公众号，js支付需要用户的open_id
 */

@Data
public class JsOrderMessage extends OrderMessage{
    private String openId;
}
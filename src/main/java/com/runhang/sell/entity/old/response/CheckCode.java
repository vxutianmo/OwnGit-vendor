package com.runhang.sell.entity.old.response;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @ClassName CheckCode
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/10 0010 19:17
 * @Version 1.0
 * @Description 校验支付状况。
 **/
@Data
public class CheckCode {
    /**订单编号*/
    @JSONField(name = "tradeNum")
    private String tradeNum;
    /**支付状况码 0:超时1:支付成功;2:支付进行中;*/
    private String code;

    public CheckCode() {
    }

    public CheckCode(String tradeNum, String code) {
        this.tradeNum = tradeNum;
        this.code = code;
    }

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}
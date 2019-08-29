package com.runhang.sell.entity.fresh.request;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 *@Author: fyb
 *@Date 2019/1/16_14:33
 *@Param
 *@Return
 *@Description: 请求退还积分
 */
@Data
public class RefundIntegral {
    //订单编号
    private String orderCode;
    //会员手机号
    private String phone;
    //退款原因
    private String reason;

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}

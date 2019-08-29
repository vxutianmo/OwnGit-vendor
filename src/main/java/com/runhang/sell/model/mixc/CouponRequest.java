package com.runhang.sell.model.mixc;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2019/3/22 10:34
 * @Version 1.0
 * @Description 核销请求参数
 **/
@Data
public class CouponRequest {
    /**核销码*/
    private String couponNo;

    public CouponRequest(String couponNo) {
        this.couponNo = couponNo;
    }

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}

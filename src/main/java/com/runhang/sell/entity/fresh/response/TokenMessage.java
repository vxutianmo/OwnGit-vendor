package com.runhang.sell.entity.fresh.response;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * @ClassName TokenMessage
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/7/25 10:14
 * @Version 1.0
 * @Description
 * 获取售货机的token信息
 **/
@Data
public class TokenMessage {
     /**
      *获取token信息
      **/
    private String token;

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}

package com.runhang.sell.model.mixc;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.List;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2019/3/22 10:33
 * @Version 1.0
 * @Description 登录返回参数
 **/
@Data
public class LoginReturn {
    /**用户令牌环*/
    private String token;
    /**姓名*/
    private String name;
    /**商场编码*/
    private String mallCode;
    /**商场名称*/
    private String mallName;
    /**用户对应商家列表*/
    private List<Merchant> merchants;

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}

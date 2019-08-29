package com.runhang.sell.model.mixc;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2019/3/22 10:30
 * @Version 1.0
 * @Description 登录请求参数
 **/
@Data
public class LoginRequest {
    /**用户名*/
    @JSONField(ordinal = 1)
    private String userName;
    /**密码*/
    @JSONField(ordinal = 2)
    private String password;

    public LoginRequest() {
    }

    public LoginRequest(MallConfig config) {
        this.userName=config.getUserName();
        this.password=config.getPassword();
    }

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}

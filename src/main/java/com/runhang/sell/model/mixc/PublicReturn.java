package com.runhang.sell.model.mixc;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2019/3/21 19:39
 * @Version 1.0
 * @Description 万象城公共返回参数
 **/
@Data
public class PublicReturn {
    /**返回码*/
    private Integer code;
    /**返回信息*/
    private String message;
    /**服务器当前时间*/
    private Long timestamp;
    /**数据*/
    private Object data;

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }

}

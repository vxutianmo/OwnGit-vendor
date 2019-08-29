package com.runhang.sell.entity.old.request;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName VendorType
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/10 0010 10:03
 * @Version 1.0
 * @Description 获取售货机类型信息。
 * facname：售货机生产厂家
 * model:该厂家生产的所有售货机类型
 * modelname:售货机类型名称
 **/
@Data
public class VendorTypeMessage implements Serializable{
    private String facname;
    private List<VendorName> model;

    public VendorTypeMessage(){

    }
    @Data
    public class VendorName{
        private String modelname;

        @Override
        public String toString(){
            return JSONObject.toJSONString(this);
        }
    }

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}

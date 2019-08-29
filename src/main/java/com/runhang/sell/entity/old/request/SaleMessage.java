package com.runhang.sell.entity.old.request;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName SaleMessage
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/11 0011 10:28
 * @Version 1.0
 * @Description TODO
 **/
@Data
public class SaleMessage implements Serializable {

    /**售货商品信息*/
    private SaleGoods sainfor;

    /**总支付金额*/
    private String saTotalPrice;

    /**售货机编号*/
    private String venid;


    public SaleMessage(){

    }

    public SaleMessage(SaleGoods sainfor,String saTotalPrice,String venid){
        this.sainfor = sainfor;
        this.saTotalPrice = saTotalPrice;
        this.venid = venid;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}

package com.runhang.sell.entity.old.request;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName SaleGoods
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/11 10:25
 * @Version 1.0
 * @Description 售货商品信息。
 **/
@Data
public class SaleGoods implements Serializable {

    private List<SaleGoodsMessage> salists;

    private String nums;

    public SaleGoods(){

    }

    public SaleGoods(List<SaleGoodsMessage> saleGoodsMessages,String nums){
        this.salists = saleGoodsMessages;
        this.nums = nums;
    }

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}

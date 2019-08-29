package com.runhang.sell.entity.fresh.response;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * @ClassName GoodsMessage
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/7/25 10:52
 * @Version 1.0
 * @Description 商品信息
 **/
@Data
public class GoodsMessage {
    /**
     *商品编号
     **/
    private String goodsCode;

    /**
     *商品名称
     **/
    private String goodsName;

    /**
     *商品分类
     **/
    private String goodsSpecies;

    /**
     *商品价格
     **/
    private float goodsPrice;

    /**
     *商品重量
     **/
    private float goodsWeight;

    /**
     *商品包装
     **/
    private String goodsPackaging;

    /**
     *商品生产商
     **/
    private String goodsManufacturer;

    /**
     *商品图片地址
     **/
    private String imageUrl;

    public GoodsMessage(){

    }

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}

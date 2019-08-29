package com.runhang.sell.entity.fresh.request;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Goods
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/6 13:19
 * @Version 1.0
 * @Description 商品基本信息（商品变更消息推送）noticeType=6
 **/
@Data
public class Goods implements Serializable {

    public Goods(){

    }

    public Goods(String goodsId,String goodsName,
                 String goodsSpecies,String picUrl,
                 String manufacturer,String goodsWeight,
                 String pack){
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsSpecies = goodsSpecies;
        this.picUrl = picUrl;
        this.manufacturer = manufacturer;
        this.goodsWeight = goodsWeight;
        this.pack = pack;
    }

    /**
     *商品ID
     **/
    private String goodsId;

    /**
     *商品名称
     **/
    private String goodsName;

    /**
     *商品分类
     **/
    private String goodsSpecies;

    /**
     *商品图片地址
     **/
    private String picUrl;

    /**
     *商品生产商
     **/
    private String manufacturer;

    /**
     *商品重量
     **/
    private String goodsWeight;

    /**
     *商品包装
     **/
    private String pack;

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }

}

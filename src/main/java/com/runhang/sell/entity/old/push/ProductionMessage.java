package com.runhang.sell.entity.old.push;

import com.alibaba.fastjson.JSONObject;
import com.runhang.sell.entity.fresh.request.Goods;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName ProductionMessage
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/10 0010 14:31
 * @Version 1.0
 * @Description 商品信息。
 **/
@Data
public class ProductionMessage implements Serializable {

    /**商品ID===*/
    private Integer proid;
    /**商品名称*/
    private String name;
    /**商品分类*/
    private String species;
    /**商品图片地址*/
    private String imageurl;
    /**所属厂商*/
    private String manufacturer;
    /**商品重量*/
    private Double weight;
    /**商品打包方式*/
    private String packaging;
    /** 商品规格，对应口红机的色号*/
    private String spec;
    /** 商品品牌 */
    private String brand;

    public ProductionMessage(){

    }

    /**复制构造器*/
    public ProductionMessage(Goods goods){
        this.proid = Integer.valueOf(goods.getGoodsId());
        this.name = goods.getGoodsName();
        this.species = goods.getGoodsSpecies();
        this.imageurl = goods.getPicUrl();
        this.manufacturer = goods.getManufacturer();
        this.weight = Double.valueOf("null".equals(goods.getGoodsWeight()) ? "0" : goods.getGoodsWeight());
        this.packaging = goods.getPack();
        this.spec = "null".equals(goods.getGoodsWeight()) ? "0" : goods.getGoodsWeight();
    }


    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}
package com.runhang.sell.entity.fresh.response;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import lombok.Data;

/**
 * @ClassName GoodsInfo
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/7/25 0025 17:38
 * @Version 1.0
 * @Description 商品信息。noticeType=6
 **/
@Data
public class GoodsInfo {

    /**
     * 商品ID
     */
    private String goodsId;

    /**
     * 商品名字
     */
     private String goodsName;

    /**
     * 商品分类
     */
    private String species;

    /**
     * 商品图片地址
     */
     private String imageUrl;

    /**
     * 商品生产
     */
    private String manufacture;

    /**
     * 商品重量
     */
     private String weight;

    /**
     * 商品包装方式
     */
    private String packaging;

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }

}

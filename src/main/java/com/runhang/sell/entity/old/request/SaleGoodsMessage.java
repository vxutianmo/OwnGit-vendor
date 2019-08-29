package com.runhang.sell.entity.old.request;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName SaleGoodsMessage
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/10 19:02
 * @Version 1.0
 * @Description 销售商品信息。
 **/

@ApiModel(value = "购买商品信息")
@Data
public class SaleGoodsMessage implements Serializable {

    /**商品ID*/
    @ApiModelProperty(name = "proid",value = "商品ID")
    private String proid;
    /**商品名称*/
    @ApiModelProperty(name = "name",value = "商品名称")
    private String name;
    /**商品数目*/
    @ApiModelProperty(name = "count",value = "商品数目")
    private String count;
    /**商品单价*/
    @ApiModelProperty(name = "sinPrice",value = "商品单价")
    private String sinPrice;
    /**商品总价*/
    @ApiModelProperty(name = "toPrice",value = "商品总价")
    private String toPrice;
    /**货道编号*/
    @ApiModelProperty(name = "chid",value = "货道编号")
    private String chid;

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}

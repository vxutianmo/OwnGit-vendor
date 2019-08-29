package com.runhang.sell.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author huhongyuan
 * Date: 2018-11-20
 * Time: 14:54
 * Description:
 */

@Data
@ApiModel(value = "货道以及售卖商品")
public class ValidDeployGoods {
    @ApiModelProperty(name = "deployId",value = "售货机部署ID")
    private Integer deployId;
    @ApiModelProperty(name = "trackId",value = "货道ID")
    private Integer trackId;
    @ApiModelProperty(name = "trackCode",value = "货道Code")
    private String trackCode;
    @ApiModelProperty(name = "goodsId",value = "商品ID")
    private Integer goodsId;
    @ApiModelProperty(name = "goodsName",value = "商品名称")
    private String goodsName;
    @ApiModelProperty(name = "goodsImage",value = "商品图片地址")
    private String goodsImage;
    @ApiModelProperty(name = "description",value = "商品描述")
    private String description;
    @ApiModelProperty(name = "price",value = "商品价钱")
    private float price;
    @ApiModelProperty(name = "totalCount",value = "商品总数")
    private Integer totalCount;
    @ApiModelProperty(name = "currentCount",value = "剩余数量")
    private Integer currentCount;
    @ApiModelProperty(name = "warningCount",value = "警告数量")
    private Integer warningCount;

}
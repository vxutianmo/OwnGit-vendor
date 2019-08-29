package com.runhang.sell.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author huhongyuan
 * Date: 2018-11-20
 * Time: 11:13
 * Description: 点餐机售货商品信息
 */

@Data
@ApiModel(value = "店铺基本信息以及售卖商品")
public class OrderDishesGoods {
    /**
     * 售货机部署ID
     */
    @ApiModelProperty(name = "deployId",value = "售货机部署ID")
    private Integer deployId;
    /**
     * 售货机状态
     */
    @ApiModelProperty(name = "status",value = "售货机状态")
    private Integer status;
    /**
     * 商户ID
     */
    @ApiModelProperty(name = "businessId",value = "商户ID")
    private Integer businessId;
    /**
     * 售货机编号
     */
    @ApiModelProperty(name = "vendorCode",value = "售货机编号")
    private String vendorCode;
    /**
     * 售货机名称
     */
    @ApiModelProperty(name = "vendorName",value = "售货机名称")
    private String vendorName;
    /**
     * 地址
     */
    @ApiModelProperty(name = "address",value = "地址")
    private String address;

    /**
     * 联系方式
     */
    @ApiModelProperty(name = "phone",value = "联系方式")
    private String phone;

    /**
     * 商户名称
     */
    @ApiModelProperty(name = "businessName",value = "商户名称")
    private String businessName;

    /**
     * 头像
     */
    @ApiModelProperty(name = "advert",value = "头像")
    private String advert;

    @ApiModelProperty(name = "tracks",value = "货道列表")
    private List<ValidDeployGoods> tracks;
}
package com.runhang.sell.entity.fresh.request;

import com.runhang.sell.entity.old.request.SaleGoodsMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author huhongyuan
 * Date: 2018-11-17
 * Time: 9:21
 * Description:
 */

@ApiModel(value = "小程序下单数据格式")
@Data
public class OrderDishesCreate {
    /**
     * 用户open_id
     */
    @ApiModelProperty(name = "openId",value = "用户open_id")
    @NotEmpty(message = "openid不能为空")
    private String openId;


    /**
     * 售货机编号
     */
    @ApiModelProperty(name = "vendorCode",value = "售货机编号")
    @NotEmpty(message = "售货机编号不能为空")
    private String vendorCode;

    /**
     * 桌号
     */
    @ApiModelProperty(name = "deskCode",value = "桌号")
    @NotEmpty(message = "桌号不能为空")
    private String deskCode;

    /**
     * 购买商品列表
     */
    @ApiModelProperty(name = "salists",value = "购买商品列表")
    @NotEmpty(message = "购买商品不能为空")
    private List<SaleGoodsMessage> salists;


}
package com.runhang.sell.service.presale;

import com.runhang.framework.result.Result;
import com.runhang.sell.entity.old.response.ResponseWrapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Create with IDEA
 *
 * @Author: zhangyan
 * @Date: 2019/5/10
 * @Time: 9:01
 * @Description: 预售Service
 */
public interface PresaleService {
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/10_9:09
     * @Param: [longitude, latitude]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 获取一定范围内的设备信息
     */
    public ResponseWrapper getVendorInfo(String longitude,String latitude);
    public ResponseWrapper getVendorInfoInzone(String longitude,String latitude);
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/10_15:53
     * @Param: [vdCode, openId]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 预售获取设备商品信息
     */
    public ResponseWrapper getVendorGoods(String vdCode,String openId);
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/13_13:31
     * @Param: [openId, vdCode, goodsId, goodsQuantity]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 预售-保存/修改购物车信息
     */
    public ResponseWrapper customShoppingCart(String openId,String vdCode,String goodsId,String goodsQuantity);
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/13_14:00
     * @Param: [openId]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 预售-获取购物车信息
     */
    public ResponseWrapper getShoppingCart(String openId);
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/13_15:38
     * @Param: [openId, totalOrderPrice, goodsInfo]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 预售-生成订单信息
     */
    public ResponseWrapper generateOrders(String openId, String totalOrderPrice, List<Map<String,Object>> vdInfo);
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/14_15:32
     * @Param: [orderNumber]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 取消订单
     */
    public ResponseWrapper cancelOrder(String orderNumber);
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/14_17:32
     * @Param: [openId, orderType]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 获取订单基本信息
     */
    public ResponseWrapper getOrder(String openId,String orderType);
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/15_9:16
     * @Param: [orderNumber]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 获取订单详细信息
     */
    public ResponseWrapper getOrderDetails(String orderNumber);
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/17_11:16
     * @Param: [vdCode, token, pickUpCode]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 校验取货码准确性
     */
    public ResponseWrapper checkCode(String vdCode,String token,String pickUpCode);
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/23_13:30
     * @Param: [vdCode, token, orderNumber, pickUpCode, trackCode, shipments, sastatus]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 预售-上传支付结果
     */
    public ResponseWrapper uploadShipmentResult(String vdCode,String token,String orderNumber,String pickUpCode,String trackCode,String shipments,String sastatus);
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/21_13:33
     * @Param: []
     * @Return: com.runhang.framework.result.Result<java.lang.String>
     * @Description: 定时任务 每天0点5分 检查取货码的有效期
     */
    public Result<String> checkThePickUpCodeRegularly();
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/21_15:52
     * @Param: [request, response]
     * @Return: com.runhang.framework.result.Result<java.lang.String>
     * @Description: 支付回调
     */
    public Result<String> payCallback(HttpServletRequest request, HttpServletResponse response);
    /**
     * @Auther: zhangyan
     * @Date: 2019/6/3_14:59
     * @Param: [orderNumber, openId]
     * @Return: com.runhang.framework.result.Result<java.lang.String>
     * @Description: 请求支付
     */
    public String payment(String orderNumber,String openId,HttpServletRequest request);

    public Result<String> reimburse();
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/24_15:34
     * @Param: [OrderCode, payOrder, refundMoney, totalFee, refundReason, refundType]
     * @Return: com.runhang.framework.result.Result<java.lang.String>
     * @Description: 预售退款
     */
    public Result<String> reimburse(String OrderCode,String payOrder,String refundMoney,String totalFee,String refundReason,Integer refundType);
}

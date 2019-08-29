package com.runhang.sell.api.presale;



import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.runhang.framework.result.Result;
import com.runhang.sell.entity.old.response.ResponseWrapper;
import com.runhang.sell.service.presale.PresaleService;
import com.runhang.sell.utils.XmlUtils;
import io.netty.handler.codec.http.HttpUtil;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Create with IDEA
 *
 * @Author: zhangyan
 * @Date: 2019/5/9
 * @Time: 17:43
 * @Description: 预售Api
 */
@Slf4j
@ApiIgnore
@Controller
@RequestMapping("sell/presale")
public class PresaleApi {

    @Autowired
    private PresaleService presaleService;

    /**
     * @Auther: zhangyan
     * @Date: 2019/5/13_13:56
     * @Param: [longitude, latitude]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 预售-获取设备信息-润航的机器
     */
    @ApiOperation(value = "预售-获取设备信息", notes = "预售-获取设备信息")
    @RequestMapping(value = "/get_vendor_info")
    @ResponseBody
    public ResponseWrapper getVendorInfo(@RequestParam(name = "longitude",required = true) String longitude,
                                         @RequestParam(name = "latitude",required = true) String latitude){
        log.info("预售-获取润航设备信息-请求参数-longitude-->"+longitude+",latitude-->"+latitude);
        /** 参数非空判断 */
        if(StringUtils.isEmpty(longitude) || StringUtils.isEmpty(latitude)){
            ResponseWrapper responseWrapper = new ResponseWrapper();
            responseWrapper.setResult("fail");
            responseWrapper.setResponse("参数不全");
            log.info("预售-获取润航设备信息-返回数据-->"+responseWrapper);
            return responseWrapper;
        }
        ResponseWrapper responseWrapper = presaleService.getVendorInfo(longitude,latitude);
        log.info("预售-获取润航设备信息-返回数据-->"+responseWrapper);
        return responseWrapper;
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/6/3_17:12
     * @Param: [longitude, latitude]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 预售-获取设备信息-银座机器
     */
    @ApiOperation(value = "预售-获取设备信息", notes = "预售-获取设备信息")
    @RequestMapping(value = "/get_vendor_info_inzone")
    @ResponseBody
    public ResponseWrapper getVendorInfoInzone(@RequestParam(name = "longitude",required = true) String longitude,
                                         @RequestParam(name = "latitude",required = true) String latitude){
        log.info("预售-获取银座设备信息-请求参数-longitude-->"+longitude+",latitude-->"+latitude);
        /** 参数非空判断 */
        if(StringUtils.isEmpty(longitude) || StringUtils.isEmpty(latitude)){
            ResponseWrapper responseWrapper = new ResponseWrapper();
            responseWrapper.setResult("fail");
            responseWrapper.setResponse("参数不全");
            log.info("预售-获取银座设备信息-返回数据-->"+responseWrapper);
            return responseWrapper;
        }
        ResponseWrapper responseWrapper = presaleService.getVendorInfo(longitude,latitude);
        log.info("预售-获取银座设备信息-返回数据-->"+responseWrapper);
        return responseWrapper;
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/13_13:56
     * @Param: [vdCode, openId]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 预售-获取设备商品信息
     */
    @ApiOperation(value = "预售-获取设备商品信息", notes = "预售-获取设备商品信息")
    @RequestMapping(value = "/get_vendor_goods")
    @ResponseBody
    public ResponseWrapper getVendorGoods(@RequestParam(name = "vdCode",required = true) String vdCode,
                                         @RequestParam(name = "openId",required = true) String openId){
        log.info("预售-获取设备商品信息-请求参数-vdCode-->"+vdCode+",openId-->"+openId);
        /** 参数非空判断 */
        if(StringUtils.isEmpty(vdCode) || StringUtils.isEmpty(openId)){
            ResponseWrapper responseWrapper = new ResponseWrapper();
            responseWrapper.setResult("fail");
            responseWrapper.setResponse("参数不全");
            log.info("预售-获取设备商品信息-返回数据-->"+responseWrapper);
            return responseWrapper;
        }
        ResponseWrapper responseWrapper = presaleService.getVendorGoods(vdCode,openId);
        log.info("预售-获取设备商品信息-返回数据-->"+responseWrapper);
        return responseWrapper;
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/13_13:56
     * @Param: [openId, vdCode, goodsId, goodsQuantity]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 预售-保存/修改购物车信息
     */
    @ApiOperation(value = "预售-保存/修改购物车信息", notes = "预售-保存/修改购物车信息")
    @RequestMapping(value = "/custom_shopping_cart")
    @ResponseBody
    public ResponseWrapper customShoppingCart(@RequestParam(name = "openId",required = true) String openId,
                                          @RequestParam(name = "vdCode",required = true) String vdCode,
                                           @RequestParam(name = "goodsId",required = true) String goodsId,
                                           @RequestParam(name = "goodsQuantity",required = true) String goodsQuantity){
        log.info("预售-保存/修改购物车信息-请求参数-openId-->"+openId+",vdCode-->"+vdCode+",goodsId-->"+goodsId+",goodsQuantity-->"+goodsQuantity);
        /** 参数非空判断 */
        if(StringUtils.isEmpty(openId) || StringUtils.isEmpty(vdCode) || StringUtils.isEmpty(goodsId) || StringUtils.isEmpty(goodsQuantity)){
            ResponseWrapper responseWrapper = new ResponseWrapper();
            responseWrapper.setResult("fail");
            responseWrapper.setResponse("参数不全");
            log.info("预售-保存/修改购物车信息-返回数据-->"+responseWrapper);
            return responseWrapper;
        }
        ResponseWrapper responseWrapper = presaleService.customShoppingCart(openId,vdCode,goodsId,goodsQuantity);
        log.info("预售-保存/修改购物车信息-返回数据-->"+responseWrapper);
        return responseWrapper;
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/13_13:59
     * @Param: [openId]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 预售-获取购物车信息
     */
    @ApiOperation(value = "预售-获取购物车信息", notes = "预售-获取购物车信息")
    @RequestMapping(value = "/get_shopping_cart")
    @ResponseBody
    public ResponseWrapper getShoppingCart(@RequestParam(name = "openId",required = true) String openId){
        log.info("预售-获取购物车信息-请求参数-openId-->"+openId);
        /** 参数非空判断 */
        if(StringUtils.isEmpty(openId)){
            ResponseWrapper responseWrapper = new ResponseWrapper();
            responseWrapper.setResult("fail");
            responseWrapper.setResponse("参数不全");
            log.info("预售-获取购物车信息-返回数据-->"+responseWrapper);
            return responseWrapper;
        }
        ResponseWrapper responseWrapper = presaleService.getShoppingCart(openId);
        log.info("预售-获取购物车信息-返回数据-->"+responseWrapper);
        return responseWrapper;
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/14_15:25
     * @Param: [openId, totalOrderPrice, vdInfo]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 预售-生成订单信息
     */
    @ApiOperation(value = "预售-生成订单信息", notes = "预售-生成订单信息")
    @RequestMapping(value = "/generate_orders")
    @ResponseBody
    public ResponseWrapper generateOrders(@RequestParam(name = "openId",required = true) String openId,
                                          @RequestParam(name = "totalOrderPrice",required = true) String totalOrderPrice,
                                            @RequestParam(name = "vdInfo",required = true) String vdInfo){
        log.info("预售-生成订单信息-请求参数-openId-->"+openId+",totalOrderPrice-->"+totalOrderPrice+",vdInfo-->"+vdInfo);
        /** 参数非空判断 */
        if(StringUtils.isEmpty(openId) || StringUtils.isEmpty(totalOrderPrice) || StringUtils.isEmpty(vdInfo)){
            ResponseWrapper responseWrapper = new ResponseWrapper();
            responseWrapper.setResult("fail");
            responseWrapper.setResponse("参数不全");
            log.info("预售-生成订单信息-返回数据-->"+responseWrapper);
            return responseWrapper;
        }
        //参数解析-商品信息
        List<Map<String,Object>> list = JSON.parseObject(vdInfo, new TypeReference<List<Map<String,Object>>>() {});
        ResponseWrapper responseWrapper = presaleService.generateOrders(openId,totalOrderPrice,list);
        log.info("预售-生成订单信息-返回数据-->"+responseWrapper);
        return responseWrapper;
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/14_16:55
     * @Param: [orderNumber]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 取消订单
     */
    @ApiOperation(value = "预售-取消订单", notes = "预售-取消订单")
    @RequestMapping(value = "/cancel_order")
    @ResponseBody
    public ResponseWrapper cancelOrder(@RequestParam(name = "orderNumber",required = true) String orderNumber){
        log.info("预售-取消订单-请求参数-orderNumber-->" + orderNumber);
        /** 参数非空判断 */
        if(StringUtils.isEmpty(orderNumber)){
            ResponseWrapper responseWrapper = new ResponseWrapper();
            responseWrapper.setResult("fail");
            responseWrapper.setResponse("参数不全");
            log.info("预售-取消订单-返回数据-->"+responseWrapper);
            return responseWrapper;
        }
        ResponseWrapper responseWrapper = presaleService.cancelOrder(orderNumber);
        log.info("预售-取消订单-返回数据-->"+responseWrapper);
        return responseWrapper;
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/14_19:01
     * @Param: [openId, orderType]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 获取订单基本信息
     */
    @ApiOperation(value = "预售-获取订单基本信息", notes = "预售-获取订单基本信息")
    @RequestMapping(value = "/get_order")
    @ResponseBody
    public ResponseWrapper getOrder(@RequestParam(name = "openId",required = true) String openId,
                                    @RequestParam(name = "orderType",required = true) String orderType){
        log.info("预售-获取订单基本信息-请求参数-openId-->" + openId+",orderType-->"+orderType);
        /** 参数非空判断 */
        if(StringUtils.isEmpty(openId) || StringUtils.isEmpty(orderType)){
            ResponseWrapper responseWrapper = new ResponseWrapper();
            responseWrapper.setResult("fail");
            responseWrapper.setResponse("参数不全");
            log.info("预售-获取订单基本信息-返回数据-->"+responseWrapper);
            return responseWrapper;
        }
        ResponseWrapper responseWrapper = presaleService.getOrder(openId,orderType);
        log.info("预售-获取订单基本信息-返回数据-->"+responseWrapper);
        return responseWrapper;
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/17_11:00
     * @Param: [orderNumber]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 获取订单详细信息
     */
    @ApiOperation(value = "预售-获取订单详细信息", notes = "预售-获取订单详细信息")
    @RequestMapping(value = "/get_order_details")
    @ResponseBody
    public ResponseWrapper getOrderDetails(@RequestParam(name = "orderNumber",required = true) String orderNumber){
        log.info("预售-获取订单详细信息-请求参数-orderNumber-->" + orderNumber);
        /** 参数非空判断 */
        if(StringUtils.isEmpty(orderNumber)){
            ResponseWrapper responseWrapper = new ResponseWrapper();
            responseWrapper.setResult("fail");
            responseWrapper.setResponse("参数不全");
            log.info("预售-获取订单详细信息-返回数据-->"+responseWrapper);
            return responseWrapper;
        }
        ResponseWrapper responseWrapper = presaleService.getOrderDetails(orderNumber);
        log.info("预售-获取订单详细信息-返回数据-->"+responseWrapper);
        return responseWrapper;
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/20_11:34
     * @Param: [vdCode, token, pickUpCode]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 预售-校验取货码准确性
     */
    @ApiOperation(value = "预售-校验取货码准确性", notes = "预售-校验取货码准确性")
    @RequestMapping(value = "/check_code")
    @ResponseBody
    public ResponseWrapper checkCode(@RequestParam(name = "vdCode",required = true) String vdCode,
                                            @RequestParam(name = "token",required = true) String token,
                                            @RequestParam(name = "pickUpCode",required = true) String pickUpCode){
        log.info("预售-校验取货码准确性-请求参数-vdCode-->" + vdCode+",token-->"+token+",pickUpCode-->"+pickUpCode);
        /** 参数非空判断 */
        if(StringUtils.isEmpty(vdCode) || StringUtils.isEmpty(token) || StringUtils.isEmpty(pickUpCode)){
            ResponseWrapper responseWrapper = new ResponseWrapper();
            responseWrapper.setResult("fail");
            responseWrapper.setResponse("参数不全");
            log.info("预售-校验取货码准确性-返回数据-->"+responseWrapper);
            return responseWrapper;
        }
        ResponseWrapper responseWrapper = presaleService.checkCode(vdCode,token,pickUpCode);
        log.info("预售-校验取货码准确性-返回数据-->"+responseWrapper);
        return responseWrapper;
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/20_11:37
     * @Param: [vdCode, token, orderNumber, sastatus]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 预售-上传出货结果
     */
    @ApiOperation(value = "预售-上传出货结果", notes = "预售-上传出货结果")
    @RequestMapping(value = "/upload_shipment_result")
    @ResponseBody
    public ResponseWrapper uploadShipmentResult(@RequestParam(name = "vdCode",required = true) String vdCode,
                                      @RequestParam(name = "token",required = true) String token,
                                      @RequestParam(name = "orderNumber",required = true) String orderNumber,
                                      @RequestParam(name = "pickUpCode",required = true) String pickUpCode,
                                      @RequestParam(name = "trackCode",required = true) String trackCode,
                                      @RequestParam(name = "shipments",required = true) String shipments,
                                      @RequestParam(name = "sastatus",required = true) String sastatus){
        log.info("预售-上传支付结果-请求参数-vdCode-->" + vdCode+",token-->"+token+",orderNumber-->"+orderNumber+",pickUpCode-->"+pickUpCode+",trackCode-->"+trackCode+",shipments-->"+shipments+",sastatus-->"+sastatus);
        /** 参数非空判断 */
        if(StringUtils.isEmpty(vdCode) || StringUtils.isEmpty(token) || StringUtils.isEmpty(orderNumber) || StringUtils.isEmpty(sastatus)){
            ResponseWrapper responseWrapper = new ResponseWrapper();
            responseWrapper.setResult("fail");
            responseWrapper.setResponse("参数不全");
            log.info("预售-上传支付结果-返回数据-->"+responseWrapper);
            return responseWrapper;
        }
        ResponseWrapper responseWrapper = null;
        log.info("预售-上传支付结果-返回数据-->"+responseWrapper);
        return responseWrapper;
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/24_13:18
     * @Param: [request, response]
     * @Return: java.lang.String
     * @Description: 支付结果回调
     */
    @ApiOperation(value = "预售-支付结果回调", notes = "预售-支付结果回调")
    @RequestMapping(value = "/pay_callback",method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String payCallback(HttpServletRequest request, HttpServletResponse response){
        System.out.println("request-->"+request.toString());
        System.out.println("response-->"+response.toString());
        Result<String> result = presaleService.payCallback(request,response);
        if(!result.success()){
            return "fail";
        }
        return "success";
    }

    @ApiOperation(value = "预售-请求支付", notes = "预售-请求支付")
    @RequestMapping(value = "/payment")
    @ResponseBody
    public String payment(@RequestParam(name = "orderNumber",required = true) String orderNumber,
                          @RequestParam(name = "openId",required = true) String openId,
                          HttpServletRequest request){
        String ret = presaleService.payment(orderNumber,openId,request);
        return ret;
    }

    @RequestMapping(value = "/test",method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String test(HttpServletRequest request, HttpServletResponse response){
        presaleService.reimburse();
        return "";
    }

}

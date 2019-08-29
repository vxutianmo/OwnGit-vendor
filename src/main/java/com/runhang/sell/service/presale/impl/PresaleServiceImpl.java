package com.runhang.sell.service.presale.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.runhang.framework.result.Result;
import com.runhang.sell.entity.fresh.response.OrderMessage;
import com.runhang.sell.entity.fresh.response.RefundMessage;
import com.runhang.sell.entity.old.response.ResponseWrapper;
import com.runhang.sell.http.HttpNoticeService;
import com.runhang.sell.http.service.PayService;
import com.runhang.sell.mapper.*;
import com.runhang.sell.model.*;
import com.runhang.sell.push.PushCommonService;
import com.runhang.sell.service.OrderService;
import com.runhang.sell.service.presale.PresaleService;
import com.runhang.sell.utils.AESUtils;
import com.runhang.sell.utils.XmlUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.bcel.verifier.statics.LONG_Upper;
import org.elasticsearch.common.recycler.Recycler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Create with IDEA
 *
 * @Author: zhangyan
 * @Date: 2019/5/10
 * @Time: 9:02
 * @Description: 预售Service
 */
@Slf4j
@Service
public class PresaleServiceImpl implements PresaleService {

    /**加解密时使用的密钥*/
    private static final String AES_KEY = "1234567812345678";
    /**加解密时使用的偏移量*/
    private static final String AES_OFFSET = "1234567812345678";

    @Autowired
    private VendorDeployMapper vendorDeployMapper;
    @Autowired
    private VendorDeployPropertiesMapper vendorDeployPropertiesMapper;
    @Autowired
    private VendorTrackDeployMapper vendorTrackDeployMapper;
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private ShoppingCartMapper shoppingCartMapper;
    @Autowired
    private PresaleMapper presaleMapper;
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private HttpNoticeService noticeService;
    @Autowired
    private VendorTrackMapper vendorTrackMapper;
    @Autowired
    private PayService payService;

    /**
     * @Auther: zhangyan
     * @Date: 2019/5/10_9:10
     * @Param: [longitude, dimension]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 获取一定范围内的设备信息
     */
    @Override
    public ResponseWrapper getVendorInfo(String longitude, String latitude) {
        ResponseWrapper responseWrapper = new ResponseWrapper();
        /** 获取所有的设备 */
        VendorDeployExample vendorDeployExample = new VendorDeployExample();
        vendorDeployExample.createCriteria().andDeletedEqualTo(0).andStatusNotEqualTo(3).andBusinessIdEqualTo(21);
        List<VendorDeploy> vendorDeployList = vendorDeployMapper.selectByExample(vendorDeployExample);
        List<Map<String,Object>> retMapList = new ArrayList<>();
        /** 筛选符合条件的设备 */
        for (VendorDeploy vendorDeploy : vendorDeployList) {
            String vdLongitude = vendorDeployMapper.getLongitudeById(vendorDeploy.getId());
            String vdLatitude = vendorDeployMapper.getLatitudeById(vendorDeploy.getId());
            if(StringUtils.isEmpty(vdLongitude) || StringUtils.isEmpty(vdLatitude)){
                log.error("设备["+vendorDeploy.getVendorName()+"]部署id为["+vendorDeploy.getId()+"],配置信息不全,longitude->"+vdLongitude+",latitude-->"+vdLatitude);
                continue;
            }
            Double j1 = Double.valueOf(longitude);
            Double w1 = Double.valueOf(latitude);
            Double j2 = Double.valueOf(vdLongitude);
            Double w2 = Double.valueOf(vdLatitude);
            Long distance = calculatedDistance(j1,w1,j2,w2);
            if(distance <= 10000L){
                Map<String,Object> map = new HashMap<>();
                Map<String,String> map1 = vendorDeployMapper.getVdInfoByVdId(vendorDeploy.getId());
                if(map1 == null){
                    log.error("根据设备部署id["+vendorDeploy.getId()+"]获取设备信息失败");
                    continue;
                }
                map.put("vdName",map1.get("vdName"));
                map.put("vdCode",map1.get("vdCode"));
                map.put("vdPoint",map1.get("vdPoint"));
                map.put("distance",distance);
                map.put("vdLongitude",vdLongitude);
                map.put("vdLatitude",vdLatitude);
                retMapList.add(map);
            }
        }
        responseWrapper.setResult("success");
        responseWrapper.setResponse(retMapList);
        return responseWrapper;
    }
    @Override
    public ResponseWrapper getVendorInfoInzone(String longitude, String latitude) {
        ResponseWrapper responseWrapper = new ResponseWrapper();
        /** 获取所有的设备 */
        VendorDeployExample vendorDeployExample = new VendorDeployExample();
        vendorDeployExample.createCriteria().andDeletedEqualTo(0).andStatusNotEqualTo(3).andBusinessIdEqualTo(22);
        List<VendorDeploy> vendorDeployList = vendorDeployMapper.selectByExample(vendorDeployExample);
        List<Map<String,Object>> retMapList = new ArrayList<>();
        /** 筛选符合条件的设备 */
        for (VendorDeploy vendorDeploy : vendorDeployList) {
            String vdLongitude = vendorDeployMapper.getLongitudeById(vendorDeploy.getId());
            String vdLatitude = vendorDeployMapper.getLatitudeById(vendorDeploy.getId());
            if(StringUtils.isEmpty(vdLongitude) || StringUtils.isEmpty(vdLatitude)){
                log.error("设备["+vendorDeploy.getVendorName()+"]部署id为["+vendorDeploy.getId()+"],配置信息不全,longitude->"+vdLongitude+",latitude-->"+vdLatitude);
                continue;
            }
            Double j1 = Double.valueOf(longitude);
            Double w1 = Double.valueOf(latitude);
            Double j2 = Double.valueOf(vdLongitude);
            Double w2 = Double.valueOf(vdLatitude);
            Long distance = calculatedDistance(j1,w1,j2,w2);
            if(distance <= 10000L){
                Map<String,Object> map = new HashMap<>();
                Map<String,String> map1 = vendorDeployMapper.getVdInfoByVdId(vendorDeploy.getId());
                if(map1 == null){
                    log.error("根据设备部署id["+vendorDeploy.getId()+"]获取设备信息失败");
                    continue;
                }
                map.put("vdName",map1.get("vdName"));
                map.put("vdCode",map1.get("vdCode"));
                map.put("vdPoint",map1.get("vdPoint"));
                map.put("distance",distance);
                map.put("vdLongitude",vdLongitude);
                map.put("vdLatitude",vdLatitude);
                retMapList.add(map);
            }
        }
        responseWrapper.setResult("success");
        responseWrapper.setResponse(retMapList);
        return responseWrapper;
    }

    /**
     * @Auther: zhangyan
     * @Date: 2019/5/10_15:53
     * @Param: [vdCode, openId]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 预售获取设备商品信息
     */
    @Override
    public ResponseWrapper getVendorGoods(String vdCode, String openId) {
        ResponseWrapper responseWrapper = new ResponseWrapper();
        List<Map<String,Object>> goodsMapList = new ArrayList<>();
        Integer vdId = vendorDeployMapper.getIdByVdCode(vdCode);
        /** 获取该设备所有的商品类别集合 */
        List<String> goodsClassList = vendorTrackDeployMapper.getGoodsClassByVdId(vdId);
        for (String goodsClass : goodsClassList) {
            Map<String,Object> goodsMap = new HashMap<>();
            goodsMap.put("goodsCategory",goodsClass);
            List<Map<String,Object>> goodsMapList1 = new ArrayList<>();
            /** 获取该设备所有商品id集合 */
            List<Integer> goodsIds = vendorTrackDeployMapper.getGoodsIdsByVdId(vdId,goodsClass);
            /** 查询商品详细信息 */
            for (Integer goodsId : goodsIds) {
                Map<String,Object> goodsMap1 = new HashMap<>();
                //商品基本信息
                Map<String,Object> goodsInfoMap = goodsMapper.getGoodsInfoById(goodsId);
                if(goodsInfoMap == null){
                    log.error("预售获取设备商品信息-获取商品基本信息失败");
                    responseWrapper.setResult("fail");
                    responseWrapper.setResponse("预售获取设备商品信息-获取商品基本信息失败");
                    return responseWrapper;
                }
                //货道商品信息
                Map<String,Object> trackGoodsMap = vendorTrackDeployMapper.getTrackGoodsInfo(vdId,goodsId);
                if(trackGoodsMap == null){
                    log.error("预售获取设备商品信息-获取货道商品信息失败");
                    responseWrapper.setResult("fail");
                    responseWrapper.setResponse("预售获取设备商品信息-获取货道商品信息失败");
                    return responseWrapper;
                }
                //商品活动信息，前期暂时不开发
                //判断是否该商品被加入购物车，加入获取数量
                Integer goodsNumber = shoppingCartMapper.getGoodsNumber(openId,vdId,goodsId);
                goodsMap1.put("goodsId",goodsInfoMap.get("goodsId"));
                goodsMap1.put("goodsName",goodsInfoMap.get("goodsName"));
                goodsMap1.put("goodsPrice",trackGoodsMap.get("goodsPrice"));
                goodsMap1.put("goodsQuantity",trackGoodsMap.get("goodsQuantity"));
                goodsMap1.put("goodsImage",goodsInfoMap.get("goodsImage"));
                if(goodsNumber != null && goodsNumber != 0){
                    goodsMap1.put("shoppingCat",goodsNumber);
                }else{
                    goodsMap1.put("shoppingCat",0);
                }
                goodsMapList1.add(goodsMap1);
            }
            goodsMap.put("goodsInfo",goodsMapList1);
            goodsMapList.add(goodsMap);
        }
        responseWrapper.setResult("success");
        responseWrapper.setResponse(goodsMapList);
        return responseWrapper;
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/13_13:32
     * @Param: [openId, vdCode, goodsId, goodsQuantity]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 预售-保存/修改购物车信息
     */
    @Override
    public ResponseWrapper customShoppingCart(String openId, String vdCode, String goodsId, String goodsQuantity) {
        ResponseWrapper responseWrapper = new ResponseWrapper();
        Integer igoodsId = Integer.valueOf(goodsId);
        Integer igoodsQuantity = Integer.valueOf(goodsQuantity);
        Integer vdId = vendorDeployMapper.getIdByVdCode(vdCode);
        /** 先判断之前购物车是否含有该商品，有的话  直接修改数量 */
        ShoppingCartExample shoppingCartExample = new ShoppingCartExample();
        shoppingCartExample.createCriteria().andDeletedEqualTo(0).andVdIdEqualTo(vdId).andOpenIdEqualTo(openId).andGoodsIdEqualTo(igoodsId);
        List<ShoppingCart> shoppingCartList = shoppingCartMapper.selectByExample(shoppingCartExample);
        if(shoppingCartList != null && shoppingCartList.size() != 0){
            /** 存在 直接修改数量 */
            ShoppingCart shoppingCart = shoppingCartList.get(0);
            shoppingCart.setGoodsNumber(igoodsQuantity);
            Integer i = shoppingCartMapper.updateByPrimaryKey(shoppingCart);
            if(i == -1){
                log.error("预售-保存/修改购物车信息-修改购物车商品数量失败-数据库异常");
                responseWrapper.setResult("fail");
                responseWrapper.setResponse("预售-保存/修改购物车信息-修改购物车商品数量失败-数据库异常");
                return responseWrapper;
            }
        }else{
            /** 没有 新增商品 */
            ShoppingCart shoppingCart = new ShoppingCart();
            shoppingCart.setOpenId(openId);
            shoppingCart.setVdId(vdId);
            shoppingCart.setVdCode(vdCode);
            shoppingCart.setGoodsId(igoodsId);
            shoppingCart.setGoodsNumber(igoodsQuantity);
            Integer i = shoppingCartMapper.insertSelective(shoppingCart);
            if(i == -1){
                log.error("预售-保存/修改购物车信息-新增商品信息失败-数据库异常");
                responseWrapper.setResult("fail");
                responseWrapper.setResponse("预售-保存/修改购物车信息-新增商品信息失败-数据库异常");
                return responseWrapper;
            }
        }
        responseWrapper.setResult("success");
        responseWrapper.setResponse("保存/修改购物车成功");
        return responseWrapper;
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/13_14:00
     * @Param: [openId]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 预售-获取购物车信息
     */
    @Override
    public ResponseWrapper getShoppingCart(String openId) {
        ResponseWrapper responseWrapper = new ResponseWrapper();
        /** 获取该用户的购物车信息 */
        ShoppingCartExample shoppingCartExample = new ShoppingCartExample();
        shoppingCartExample.createCriteria().andDeletedEqualTo(0).andOpenIdEqualTo(openId);
        List<ShoppingCart> shoppingCartList = shoppingCartMapper.selectByExample(shoppingCartExample);
        List<Map<String,Object>> retMapList = new ArrayList<>();
        /** 遍历查询商品其他信息 */
        for (ShoppingCart shoppingCart : shoppingCartList) {
            Map<String,Object> map = new HashMap<>();
            //商品基本信息
            Map<String,Object> goodsInfoMap = goodsMapper.getGoodsInfoById(shoppingCart.getGoodsId());
            if(goodsInfoMap == null){
                log.error("预售-获取购物车信息-获取商品基本信息失败");
                responseWrapper.setResult("fail");
                responseWrapper.setResponse("预售-获取购物车信息-获取商品基本信息失败");
                return responseWrapper;
            }
            //货道商品信息
            Map<String,Object> trackGoodsMap = vendorTrackDeployMapper.getTrackGoodsInfo(shoppingCart.getVdId(),shoppingCart.getGoodsId());
            if(goodsInfoMap == null){
                log.error("预售-获取购物车信息-获取货道商品信息失败");
                responseWrapper.setResult("fail");
                responseWrapper.setResponse("预售-获取购物车信息-获取货道商品信息失败");
                return responseWrapper;
            }
            //获取设备名称
            Integer vdId = vendorDeployMapper.getIdByVdCode(shoppingCart.getVdCode());
            String vdName = vendorDeployMapper.getVdNameById(vdId);
            map.put("goodsId",shoppingCart.getGoodsId());
            map.put("vdCode",shoppingCart.getVdCode());
            map.put("vdName",vdName);
            map.put("goodsName",goodsInfoMap.get("goodsName"));
            map.put("goodsCategory",goodsInfoMap.get("goodsCategory"));
            map.put("goodsPrice",trackGoodsMap.get("goodsPrice"));
            map.put("goodsQuantity",shoppingCart.getGoodsNumber());
            map.put("goodsImage",goodsInfoMap.get("goodsImage"));
            map.put("checked",Boolean.TRUE);
            retMapList.add(map);
        }
        responseWrapper.setResult("success");
        responseWrapper.setResponse(retMapList);
        return responseWrapper;
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/13_15:38
     * @Param: [vdCode, openId, goodsInfo]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 预售-生成订单信息
     */
    @Override
    @Transactional
    public ResponseWrapper generateOrders(String openId, String totalOrderPrice, List<Map<String, Object>> vdInfo) {
        ResponseWrapper responseWrapper = new ResponseWrapper();
        Result<String> result = generateOrdersParameter(openId,totalOrderPrice,vdInfo);
        if(!result.success()){
            log.error("预售-生成订单-参数校验-"+result.msg());
            responseWrapper.setResult("fail");
            responseWrapper.setResponse("预售-生成订单-参数校验-"+result.msg());
            return responseWrapper;
        }
        //预售订单编号-同一次请求认定为同一个预售订单
        SimpleDateFormat sfDate = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String strDate = sfDate.format(new Date());
        Integer x = 100 + (int)(Math.random()*899);
        Map<String,Object> vdInfoMap = vdInfo.get(0);
        String vdCoded = (String)vdInfoMap.get("vdCode");
        String kaitou = orderService.getBillIdStart(vdCoded);
        String presaleOrderNumber = kaitou + strDate + "YS" + x ;
        /** 临时保存向设备推送预售商品信息，全部操作完后进行推送 */
        List<List<Map<String,Object>>> pushInfo = new ArrayList<>();
        for (Map<String, Object> vdMap : vdInfo) {
            //每个设备的推送map信息
            List<Map<String,Object>> mapList = new ArrayList<>();
            //设备工控编号
            String vdCode = (String)vdMap.get("vdCode");
            //设备部署id
            Integer vdId = vendorDeployMapper.getIdByVdCode(vdCode);
            //设备名称
            String vdName = vendorDeployMapper.getVdNameById(vdId);
            //设备订单总金额
//            String vdTotalPriceStr = (String)vdMap.get("vdTotalPrice");
//            Long vdTotalPrice = Long.valueOf(vdTotalPriceStr);
            List<Map<String,Object>> goodsInfo = (List<Map<String,Object>>)vdMap.get("goodsInfo");
            for (Map<String, Object> goodsMap : goodsInfo) {
                Integer xx = 10 + (int)(Math.random()*89);
                String billId = Integer.toString(xx)+Integer.toString(x);
                //获取订单编号
                Result<String> orderCodeResult = orderService.generateOrders(vdCode,billId,"Y");
                if(!orderCodeResult.success()){
                    log.error("预售-生成订单-生成订单编号出现异常-"+orderCodeResult.msg());
                    responseWrapper.setResult("fail");
                    responseWrapper.setResponse("预售-生成订单-生成订单编号出现异常-"+orderCodeResult.msg());
                    return responseWrapper;
                }
                //商品id
                String goodsIdStr = (String)goodsMap.get("goodsId");
                Integer goodsId = Integer.valueOf(goodsIdStr);
                //商品价格
                String goodsPriceStr = (String)goodsMap.get("goodsPrice");
                Long goodsPrice = Long.valueOf(goodsPriceStr);
                //商品数量
                String goodsQuantityStr = (String)goodsMap.get("goodsQuantity");
                Integer goodsQuantity = Integer.valueOf(goodsQuantityStr);
                //商品总价  该值也是order表的订单总价
                Long goodsTotalPrice = goodsPrice*goodsQuantity;
                //货道部署id
                List<Integer> vtdIds= vendorTrackDeployMapper.getIdsByVdIdAndGoodsId(vdId,goodsId);
                if(vtdIds == null || vtdIds.size() == 0){
                    log.error("预售-生成订单-保存分账信息失败-获取设备["+vdId+"],商品["+goodsId+"]所属的货道部署id失败");
                    TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                    responseWrapper.setResult("fail");
                    responseWrapper.setResponse("预售-生成订单-保存分账信息失败-获取货道信息失败");
                    return responseWrapper;
                }
                Integer vtdId = vtdIds.get(0);
                //商户id
                Integer busId = vendorDeployMapper.getBusin(vdId);
                String orderCode = orderCodeResult.value();
                Date date = new Date();
                //订单详情
                String orderDetail = getOrderDetail1(vdId,goodsPriceStr,goodsId,goodsTotalPrice.toString(),goodsQuantityStr);
                /** 创建订单表 */
                Order order = new Order();
                order.setOrderCode(orderCode);
                order.setOrderTotal(goodsTotalPrice);
                order.setOrderStatus("0");
                order.setPayStatus("0");
                order.setPayType("2");
                order.setVdId(vdId);
                order.setOrderType("2");
                order.setIsEvaluation(0);
                order.setCreateTime(date);
                order.setOrderDetail(orderDetail);
                order.setVendorName(vdName);
                Integer i = orderMapper.insertSelective(order);
                if(i == -1){
                    log.error("预售-生成订单-保存订单信息失败-数据库异常");
                    TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                    responseWrapper.setResult("fail");
                    responseWrapper.setResponse("预售-生成订单-保存订单信息失败-数据库异常");
                    return responseWrapper;
                }
                Integer orderId = order.getId();

                //向设备推送的map信息
                Map<String,Object> map = new HashMap<>();
                /** 创建分账表 */
                Account account = new Account();
                account.setGoodsId(goodsId);
                account.setTrackId(vtdId);
                account.setBusinessId(busId);
                account.setOrderId(orderId);
                account.setGoodsNumber(goodsQuantity);
                account.setSinglePrice(goodsPrice);
                account.setTotalPrice(goodsTotalPrice);
                account.setCreateTime(date);
                Integer ii = accountMapper.insertSelective(account);
                if(ii  == -1){
                    log.error("预售-生成订单-保存分账信息失败-数据库异常");
                    TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                    responseWrapper.setResult("fail");
                    responseWrapper.setResponse("预售-生成订单-保存分账信息失败-数据库异常");
                    return responseWrapper;
                }
                Integer accountId = account.getId();
                /** 保存预售订单信息 */
                //预售订单总价
                Long totalOrderPriceL = Long.valueOf(totalOrderPrice);
                //取货码
                String pickUpCode = CreatePickUp();
                if(pickUpCode == null){
                    log.error("预售-生成订单-保存预售订单失败-后台生成取货码失败");
                    TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                    responseWrapper.setResult("fail");
                    responseWrapper.setResponse("预售-生成订单-保存预售订单失败-后台生成取货码失败");
                    return responseWrapper;
                }
                Presale presale = new Presale();
                presale.setPresaleOrderNumber(presaleOrderNumber);
                presale.setOpenId(openId);
                presale.setOrderId(orderId);
                presale.setAccountId(accountId);
                presale.setVdId(vdId);
                presale.setGoodsId(goodsId);
                presale.setGoodsNumber(goodsQuantity);
                presale.setTotalPrice(totalOrderPriceL);
                presale.setDiscountMoney(0L);
                presale.setPickUpCode(pickUpCode);
                presale.setPayStatus(0);
                presale.setPickUpStatus(0);
                Integer iii = presaleMapper.insertSelective(presale);
                if(iii == -1){
                    log.error("预售-生成订单-保存预售订单失败-数据库异常");
                    TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                    responseWrapper.setResult("fail");
                    responseWrapper.setResponse("预售-生成订单-保存预售订单失败-数据库异常");
                    return responseWrapper;
                }
                /** 清空购物车 把数量置为0 */
                ShoppingCartExample shoppingCartExample = new ShoppingCartExample();
                shoppingCartExample.createCriteria().andDeletedEqualTo(0).andVdIdEqualTo(vdId).andOpenIdEqualTo(openId).andGoodsIdEqualTo(goodsId);
                List<ShoppingCart> shoppingCartList = shoppingCartMapper.selectByExample(shoppingCartExample);
                if(shoppingCartList != null && shoppingCartList.size() != 0){
                    for (ShoppingCart shoppingCart : shoppingCartList) {
                        shoppingCart.setGoodsNumber(0);
                        Integer iiii = shoppingCartMapper.updateByPrimaryKey(shoppingCart);
                        if(iiii == -1){
                            log.error("预售-生成订单-清空购物车失败-数据库异常");
                            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                            responseWrapper.setResult("fail");
                            responseWrapper.setResponse("预售-生成订单-清空购物车失败-数据库异常");
                            return responseWrapper;
                        }
                    }
                }
                //推送预售商品信息
                map.put("goodsId",goodsId);
                map.put("goodsQuantity",goodsQuantity);
                map.put("PickUpCode",pickUpCode);
                map.put("vdCode",vdCode);
                mapList.add(map);
            }
            pushInfo.add(mapList);
        }
        /** 所有操作完成后向设备推送信息 */
        for (List<Map<String, Object>> list : pushInfo) {
            Result<String> result1 =  pushPresaleGoods(list,1);
            if(!result1.success()){
                log.error("向设备推送预售商品信息失败");
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                responseWrapper.setResult("fail");
                responseWrapper.setResponse("预售-生成订单-向设备推送预售商品信息失败");
                return responseWrapper;
            }
        }
        responseWrapper.setResult("success");
        responseWrapper.setResponse(presaleOrderNumber);
        return responseWrapper;
    }
    //获取订单详情
    private String getOrderDetail1(Integer vdId,String goodsPrice,Integer goodsId,String OrderToPrice,String goodsQuantity){
        try {
            GoodsExample goodsExample = new GoodsExample();
            goodsExample.createCriteria().andDeletedEqualTo(0).andIdEqualTo(goodsId);
            List<Goods> goodsList = goodsMapper.selectByExample(goodsExample);
            Goods goods = goodsList.get(0);
            VendorTrackDeployExample vendorTrackDeployExample = new VendorTrackDeployExample();
            vendorTrackDeployExample.createCriteria().andDeletedEqualTo(0).andDeployIdEqualTo(vdId);
            List<VendorTrackDeploy> vendorTrackDeployList = vendorTrackDeployMapper.selectByExample(vendorTrackDeployExample);
            String trackCode = null;
            for (VendorTrackDeploy vendorTrackDeploy : vendorTrackDeployList) {
                Integer trackId = vendorTrackDeploy.getTrackId();
                VendorTrackExample vendorTrackExample = new VendorTrackExample();
                vendorTrackExample.createCriteria().andDeletedEqualTo(0).andIdEqualTo(trackId);
                List<VendorTrack> vendorTrackList = vendorTrackMapper.selectByExample(vendorTrackExample);
                if(vendorTrackList != null && vendorTrackList.size() != 0){
                    VendorTrack vendorTrack = vendorTrackList.get(0);
                    trackCode = vendorTrack.getTrackCode();
                    break;
                }
            }
            String saleList = "{\"salists\":{\"proid\":"+goodsId+",\"chid\":\""+trackCode+"\",\"toPrice\":"+OrderToPrice+",\"count\":"+goodsQuantity+",\"name\":\""+goods.getName()+"\",\"sinPrice\":"+goodsPrice+",\"payType\":1}}";
            return saleList;
        }catch (Exception e){
            return null;
        }
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/14_15:33
     * @Param: [orderNumber]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 取消订单
     */
    @Override
    @Transactional
    public ResponseWrapper cancelOrder(String orderNumber) {
        ResponseWrapper responseWrapper = new ResponseWrapper();
        PresaleExample presaleExample = new PresaleExample();
        presaleExample.createCriteria().andDeletedEqualTo(0).andPresaleOrderNumberEqualTo(orderNumber);
        List<Presale> presaleList = presaleMapper.selectByExample(presaleExample);
        /** 循环修改预售订单状态 */
        for (Presale presale : presaleList) {
            presale.setPayStatus(3);
            Integer i = presaleMapper.updateByPrimaryKeySelective(presale);
            if(i == -1){
                log.error("预售-取消订单-修改预售订单失败-数据库异常");
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                responseWrapper.setResult("fail");
                responseWrapper.setResponse("预售-取消订单-修改预售订单失败-数据库异常");
                return responseWrapper;
            }
        }
        List<Integer> orderIds = presaleMapper.getOrderIdsByCode(orderNumber);
        /** 循环修改订单表信息 */
        for (Integer orderId : orderIds) {
            OrderExample orderExample = new OrderExample();
            orderExample.createCriteria().andDeletedEqualTo(0).andIdEqualTo(orderId);
            List<Order> orderLsit = orderMapper.selectByExample(orderExample);
            if(orderLsit == null || orderLsit.size() == 0){
                log.error("预售-取消订单-修改订单表失败-根据预售订单["+orderNumber+"]查询不到订单信息");
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                responseWrapper.setResult("fail");
                responseWrapper.setResponse("预售-取消订单-修改订单表失败-根据预售订单["+orderNumber+"]查询不到订单信息");
                return responseWrapper;
            }
            Order order = orderLsit.get(0);
        }
        /** 向设备推送解除预售商品信息 */
        List<List<Map<String,Object>>> pushInfo = new ArrayList<>();
        List<Integer> vdIds = presaleMapper.getVdIdsByCode(orderNumber);
        for (Integer vdId : vdIds) {
            List<Map<String,Object>> goodsList = new ArrayList<>();
            String vdCode = vendorDeployMapper.getVdCodeByVdId(vdId);
            List<Map<String,Object>> goodsInfoList = presaleMapper.getGoodsInfo(orderNumber,vdId);
            for (Map<String, Object> map : goodsInfoList) {
                map.put("vdCode",vdCode);
                goodsList.add(map);
            }
            Result<String> result =  pushPresaleGoods(goodsList,3);
            if(!result.success()){
                log.error("向设备推送预售商品信息失败");
                responseWrapper.setResult("fail");
                responseWrapper.setResponse("预售-取消订单-取消订单成功,但向设备推送预售商品信息失败");
                return responseWrapper;
            }
        }

        responseWrapper.setResult("success");
        responseWrapper.setResponse("取消订单成功");
        return responseWrapper;
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/14_17:33
     * @Param: [openId, orderType]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 获取订单基本信息
     */
    @Override
    public ResponseWrapper getOrder(String openId, String orderType) {
        ResponseWrapper responseWrapper = new ResponseWrapper();
        List<Map<String,Object>> retMapList = presaleMapper.getPresale(openId,null);
        responseWrapper.setResult("success");
        responseWrapper.setResponse(retMapList);
        return responseWrapper;
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/15_9:16
     * @Param: [orderNumber]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 获取订单详细信息
     */
    @Override
    public ResponseWrapper getOrderDetails(String orderNumber) {
        ResponseWrapper responseWrapper = new ResponseWrapper();
        /** 根据预售订单编号获取预售订单信息 */
        Map<String,Object> presaleMap = presaleMapper.getPresaleByCode(orderNumber);
        /** 判断订单是否支付 */
        Boolean isPay = checkPayStatus(orderNumber);
        /** 获取设备信息 */
        List<Map<String,Object>> vdInfoMapList = presaleMapper.getVdInfoByCode(orderNumber);
        List<Map<String,Object>> retVdInfoMapList = new ArrayList<>();
        for (Map<String, Object> vdInfoMap : vdInfoMapList) {
            Map<String,Object> retVdInfoMap = new HashMap<>();
            Integer vdId = (Integer)vdInfoMap.get("vdId");
            List<Map<String,Object>> goodsInfoMapList = presaleMapper.getGoodsInfoByCodeAndVdId(orderNumber,vdId);
            /** 处理取货码 */
            if(!isPay){
                for (Map<String, Object> map : goodsInfoMapList) {
                    map.remove("PickUpCode");
                }
            }

            retVdInfoMap.put("vdCode",vdInfoMap.get("vdCode"));
            retVdInfoMap.put("vdName",vdInfoMap.get("vdName"));
            retVdInfoMap.put("vdPoint",vdInfoMap.get("vdPoint"));
            retVdInfoMap.put("goodsInfo",goodsInfoMapList);
            retVdInfoMapList.add(retVdInfoMap);
        }
        presaleMap.put("vdInfo",retVdInfoMapList);
        responseWrapper.setResult("success");
        responseWrapper.setResponse(presaleMap);
        return responseWrapper;
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/17_11:23
     * @Param: [vdCode, token, pickUpCode]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 校验取货码准确性
     */
    @Override
    public ResponseWrapper checkCode(String vdCode, String token, String pickUpCode) {
        ResponseWrapper responseWrapper = new ResponseWrapper();
        Integer vdId = vendorDeployMapper.getIdByVdCode(vdCode);
        PresaleExample presaleExample = new PresaleExample();
        presaleExample.createCriteria().andDeletedEqualTo(0).andVdIdEqualTo(vdId).andPickUpCodeEqualTo(pickUpCode).andPayStatusEqualTo(1).andPickUpStatusEqualTo(0);
        List<Presale> presaleList = presaleMapper.selectByExample(presaleExample);
        if(presaleList != null && presaleList.size() == 1){
            Presale presale = presaleList.get(0);
            String presaleOrderNumber = presale.getPresaleOrderNumber();
            log.info("预售-校验取货码准确性-取货码["+pickUpCode+"]正确,返回预售订单编号["+presaleOrderNumber+"]");
            responseWrapper.setResult("success");
            responseWrapper.setResponse(presaleOrderNumber);
            return responseWrapper;
        }else if(presaleList != null && presaleList.size() == 0){
            log.info("预售-校验取货码准确性-取货码["+pickUpCode+"]不正确或者未支付");
            responseWrapper.setResult("success");
            responseWrapper.setResponse("预售-校验取货码准确性-取货码["+pickUpCode+"]不正确");
            return responseWrapper;
        }else{
            log.info("预售-校验取货码准确性-取货码["+pickUpCode+"]不正确,后台数据库数据异常");
            responseWrapper.setResult("success");
            responseWrapper.setResponse("预售-校验取货码准确性-取货码["+pickUpCode+"]不正确，后台数据库数据异常");
            return responseWrapper;
        }
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/20_11:38
     * @Param: [vdCode, token, orderNumber, pickUpCode, trackCode, shipments, sastatus]
     * @Return: com.runhang.sell.entity.old.response.ResponseWrapper
     * @Description: 预售-上传支付结果
     */
    @Override
    @Transactional
    public ResponseWrapper uploadShipmentResult(String vdCode, String token, String orderNumber, String pickUpCode,String trackCode,String shipments, String sastatus) {
        ResponseWrapper responseWrapper = new ResponseWrapper();
        Integer vdId = vendorDeployMapper.getIdByVdCode(vdCode);
        PresaleExample presaleExample = new PresaleExample();
        presaleExample.createCriteria().andDeletedEqualTo(0).andPresaleOrderNumberEqualTo(orderNumber).andPickUpCodeEqualTo(pickUpCode).andVdIdEqualTo(vdId);
        List<Presale> presaleList = presaleMapper.selectByExample(presaleExample);
        if(presaleList == null || presaleList.size() == 0){
            log.error("根据预售订单["+orderNumber+"]，取货码["+pickUpCode+"]未查询到预售订单信息");
            responseWrapper.setResult("fail");
            responseWrapper.setResponse("根据预售订单["+orderNumber+"]，取货码["+pickUpCode+"]未查询到预售订单信息");
            return responseWrapper;
        }
        //预售订单
        Presale presale = presaleList.get(0);
        //获取预售订单对应的订单id
        Integer orderId = presale.getOrderId();
        //判断是否是重复调用完成订单
        if(presale.getPickUpStatus() == 1 || presale.getPickUpStatus() == 2){
            log.error("预售订单["+orderNumber+"]重复调用完成订单");
            responseWrapper.setResult("fail");
            responseWrapper.setResponse("预售订单["+orderNumber+"]重复调用完成订单");
            return responseWrapper;
        }
        if("success".equals(sastatus)){
            //修改预售订单信息
            Integer shipmentsInt = Integer.valueOf(shipments);
            Integer pickedUpNumber = presale.getPickedUpNumber()+shipmentsInt;
            presale.setPickUpStatus(1);
            presale.setPickedUpNumber(shipmentsInt);
            Integer i = presaleMapper.updateByPrimaryKeySelective(presale);
            if(i == -1){
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                log.error("预售-完成订单-修改预售订单状态失败(出货成功)-数据库异常");
                responseWrapper.setResult("fail");
                responseWrapper.setResult("预售-完成订单-修改预售订单状态失败-数据库异常");
                return responseWrapper;
            }
            //修改订单表
            OrderExample orderExample = new OrderExample();
            orderExample.createCriteria().andDeletedEqualTo(0).andIdEqualTo(orderId);
            List<Order> orderList = orderMapper.selectByExample(orderExample);
            if(orderList == null || orderList.size() == 0){
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                log.error("预售-完成订单-根据预售订单["+orderNumber+"]查询到的订单id["+orderId+"]没有查询到订单信息(出货成功)");
                responseWrapper.setResult("fail");
                responseWrapper.setResult("预售-完成订单-根据预售订单["+orderNumber+"]没有查询到订单信息");
                return responseWrapper;
            }
            Order order = orderList.get(0);
            //获取订单详情
            String orderDetail = getOrderDetail2(vdId,order.getId(),presale.getGoodsId(),order.getOrderTotal().toString(),trackCode,shipments);
            //修改订单表数据
            order.setOrderStatus("2");
            order.setOrderDetail(orderDetail);
            Integer ii = orderMapper.updateByPrimaryKeySelective(order);
            if(ii == -1){
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                log.error("预售-完成订单-修改订单表信息失败(出货成功)-数据库异常");
                responseWrapper.setResult("fail");
                responseWrapper.setResult("预售-完成订单-修改订单表信息失败-数据库异常");
                return responseWrapper;
            }
            //订单编号
            String orderCode = order.getOrderCode();
            //分账操作
            String r= noticeService.requestAccount(orderCode);
            if("fail".equals(r)){
                log.error("预售-完成订单-订单编号为["+orderCode+"]分账失败(出货成功),但数据库状态修改成功");
                responseWrapper.setResult("fail");
                responseWrapper.setResult("预售-完成订单-分账失败");
                return responseWrapper;
            }
            Object succesResponse = JSON.parse(r);
            Map map = (Map)succesResponse;
            if("1".equals(map.get("code") + "")){
                log.info("订单编号为[" + orderCode + "]分账成功:" + map.get("msg"));
            }
            if("0".equals(map.get("code")+"")){
                log.error("订单编号为[" + orderCode + "]分账失败(出货成功)：" + map.get("msg")+",但数据库状态修改成功");
            }
            responseWrapper.setResult("success");
            return responseWrapper;
        }else if("fail".equals(sastatus)){
            //修改预售订单信息
            presale.setPickUpStatus(2);
            presale.setPayStatus(2);
            Integer i = presaleMapper.updateByPrimaryKeySelective(presale);
            if(i == -1){
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                log.error("预售-完成订单-修改预售订单状态失败(出货失败)-数据库异常");
                responseWrapper.setResult("fail");
                responseWrapper.setResult("预售-完成订单-修改预售订单状态失败-数据库异常");
                return responseWrapper;
            }
            //修改订单表信息
            OrderExample orderExample = new OrderExample();
            orderExample.createCriteria().andDeletedEqualTo(0).andIdEqualTo(orderId);
            List<Order> orderList = orderMapper.selectByExample(orderExample);
            if(orderList == null || orderList.size() == 0){
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                log.error("预售-完成订单-根据预售订单["+orderNumber+"]查询到的订单id["+orderId+"]没有查询到订单信息(出货失败)");
                responseWrapper.setResult("fail");
                responseWrapper.setResult("预售-完成订单-根据预售订单["+orderNumber+"]没有查询到订单信息");
                return responseWrapper;
            }
            Order order = orderList.get(0);
            //修改订单表数据
            order.setOrderStatus("9");
            Integer ii = orderMapper.updateByPrimaryKeySelective(order);
            if(ii == -1){
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                log.error("预售-完成订单-修改订单表信息失败(出货失败)-数据库异常");
                responseWrapper.setResult("fail");
                responseWrapper.setResult("预售-完成订单-修改订单表信息失败-数据库异常");
                return responseWrapper;
            }
            responseWrapper.setResult("success");
            return responseWrapper;
        }
        responseWrapper.setResult("success");
        return responseWrapper;
    }
    //获取订单详情
    private String getOrderDetail2(Integer vdId,Integer orderId,Integer goodsId,String OrderToPrice,String trackCode,String goodsQuantity){
        try {
            GoodsExample goodsExample = new GoodsExample();
            goodsExample.createCriteria().andDeletedEqualTo(0).andIdEqualTo(goodsId);
            List<Goods> goodsList = goodsMapper.selectByExample(goodsExample);
            Goods goods = goodsList.get(0);
            AccountExample accountExample = new AccountExample();
            accountExample.createCriteria().andDeletedEqualTo(0).andOrderIdEqualTo(orderId).andGoodsIdEqualTo(goodsId);
            List<Account> accountList = accountMapper.selectByExample(accountExample);
            Account account = accountList.get(0);
            String saleList = "{\"salists\":{\"proid\":"+goodsId+",\"chid\":\""+trackCode+"\",\"toPrice\":"+OrderToPrice+",\"count\":"+goodsQuantity+",\"name\":\""+goods.getName()+"\",\"sinPrice\":"+account.getSinglePrice()+",\"payType\":1}}";
            return saleList;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * @Auther: zhangyan
     * @Date: 2019/5/21_13:34
     * @Param: []
     * @Return: com.runhang.framework.result.Result<java.lang.String>
     * @Description: 定时任务 每天0点5分 检查取货码的有效期
     */
    @Override
    @Transactional
    public Result<String> checkThePickUpCodeRegularly() {
        Date date = new Date();
        //未支付的预售订单编号
        List<String> unPaidCodes = presaleMapper.getCodeByUnpaid();
        for (String unPaidCode : unPaidCodes) {
            PresaleExample presaleExample = new PresaleExample();
            presaleExample.createCriteria().andDeletedEqualTo(0).andPresaleOrderNumberEqualTo(unPaidCode);
            List<Presale> presaleList = presaleMapper.selectByExample(presaleExample);
            Boolean b = Boolean.TRUE;
            for (Presale presale : presaleList) {
                Date date1 = presale.getCreateTime();
                if(presale.getPayStatus() != 0 || presale.getPickUpStatus() != 0 || !checkingTime(date,date1)){
                    b = Boolean.FALSE;
                    continue;
                }
            }
            if(b){
                for (Presale presale : presaleList) {
                    //超出有效期的预售订单进行处理
                    //自动取消订单
                    presale.setPayStatus(4);
                    Integer i = presaleMapper.updateByPrimaryKeySelective(presale);
                    if(i == -1){
                        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                        return Result.returnError("检查取货码有效期-修改预售订单状态失败(取消未支付订单)-数据库异常");
                    }

                    OrderExample orderExample = new OrderExample();
                    orderExample.createCriteria().andDeletedEqualTo(0).andIdEqualTo(presale.getOrderId());
                    List<Order> orderList = orderMapper.selectByExample(orderExample);
                    if(orderList != null && orderList.size() != 0){
                        Order order = orderList.get(0);
                        order.setOrderStatus("5"); //超时
                        Integer ii = orderMapper.updateByPrimaryKeySelective(order);
                        if(ii == -1){
                            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                            return Result.returnError("检查取货码有效期-修改订单表状态失败(取消未支付订单)-数据库异常");
                        }
                    }
                }
            }

        }
        //已支付的预售订单编号
        List<String> paidCodes = presaleMapper.getCodeByPaid();
        //已支付 没有取货 全额退款
        for (String paidCode : paidCodes) {
            PresaleExample presaleExample = new PresaleExample();
            presaleExample.createCriteria().andDeletedEqualTo(0).andPresaleOrderNumberEqualTo(paidCode);
            List<Presale> presaleList = presaleMapper.selectByExample(presaleExample);
            Boolean b = Boolean.TRUE;
            for (Presale presale : presaleList) {
                Date date1 = presale.getCreateTime();
                if(presale.getPayStatus() != 1 || presale.getPickUpStatus() != 0 || !checkingTime(date,date1)){
                    b = Boolean.FALSE;
                    continue;
                }
            }
            if(b){
                for (Presale presale : presaleList) {
                    presale.setPayStatus(3);
                    Integer i = presaleMapper.updateByPrimaryKeySelective(presale);
                    if(i == -1){
                        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                        log.error("检查取货码有效期-修改预售订单状态失败(已支付未取货订单退款)-数据库异常");
                    }
                    OrderExample orderExample = new OrderExample();
                    orderExample.createCriteria().andDeletedEqualTo(0).andIdEqualTo(presale.getOrderId());
                    List<Order> orderList = orderMapper.selectByExample(orderExample);
                    if(orderList != null && orderList.size() != 0){
                        Order order = orderList.get(0);
                        order.setOrderStatus("4");
                        Integer ii = orderMapper.updateByPrimaryKeySelective(order);
                        if(ii == -1){
                            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                            return Result.returnError("检查取货码有效期-修改订单表状态失败(已支付未取货订单退款)-数据库异常");
                        }
                    }
                }
                /** 全额退款 */
                Presale presale = presaleList.get(0);
                if(!StringUtils.isEmpty(presale.getPayOrderCode())){
                    String orderCode = presale.getPresaleOrderNumber();
                    String payOrder = presale.getPayOrderCode();
                    String refundMoney = presale.getTotalPrice().toString();
                    String totalFee = presale.getTotalPrice().toString();
                    String refundReason = "超时未取货，自动全额退款";
                    Integer refundType = RefundMessage.PAY_TYPE_WX;
                    Result<String> reuslt = reimburse(orderCode,payOrder,refundMoney,totalFee,refundReason,refundType);
                    if(reuslt.success()){
                        log.error("预售订单["+orderCode+"]超时未取货，自动全额退款成功");
                    }else{
                        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                        log.error("预售订单["+orderCode+"]超时未取货，自动全额退款失败");
                        return Result.returnError("检查取货码有效期-退款失败(已支付未取货订单退款)-防止数据异常，本次修改全部回退");
                    }
                }else{
                    TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                    log.error("预售订单["+presale.getPresaleOrderNumber()+"]超时未取货，自动全额退款失败-缺少支付单号");
                    return Result.returnError("检查取货码有效期-退款失败(已支付未取货订单退款)-防止数据异常，本次修改全部回退");
                }
            }
        }
        //已支付 部分取货  未取货部分退款
        for (String paidCode : paidCodes) {
            PresaleExample presaleExample = new PresaleExample();
            presaleExample.createCriteria().andDeletedEqualTo(0).andPresaleOrderNumberEqualTo(paidCode);
            List<Presale> presaleList = presaleMapper.selectByExample(presaleExample);
            List<Integer> refundOrderIds = new ArrayList<>();
            //退款的金额
            Long refundAmount = 0L;
            for (Presale presale : presaleList) {
                Date date1 = presale.getCreateTime();
                if(presale.getPayStatus() == 1 && presale.getPickUpStatus() == 0 && checkingTime(date,date1)){
                    refundOrderIds.add(presale.getOrderId());
                }
            }
            /** 遍历orderId，执行退款和改状态 */
            for (Integer orderId : refundOrderIds) {
                /** 修改预售订单信息 */
                PresaleExample presaleExample1 = new PresaleExample();
                presaleExample1.createCriteria().andDeletedEqualTo(0).andPresaleOrderNumberEqualTo(paidCode).andOrderIdEqualTo(orderId);
                List<Presale> presaleList1 = presaleMapper.selectByExample(presaleExample1);
                if(presaleList1 != null && presaleList1.size() != 0){
                    Presale presale = presaleList1.get(0);
                    presale.setPayStatus(2);
                    Integer i = presaleMapper.updateByPrimaryKeySelective(presale);
                    if(i == -1){
                        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                        return Result.returnError("检查取货码有效期-修改预售订单状态失败(已支付部分取货订单退款)-数据库异常");
                    }
                }
                /** 修改订单信息 */
                OrderExample orderExample = new OrderExample();
                orderExample.createCriteria().andDeletedEqualTo(0).andIdEqualTo(orderId);
                List<Order> orderList = orderMapper.selectByExample(orderExample);
                if(orderList != null && orderList.size() != 0){
                    Order order = orderList.get(0);
                    order.setOrderStatus("11");
                    Integer i = orderMapper.updateByPrimaryKeySelective(order);
                    if(i == -1){
                        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                        return Result.returnError("检查取货码有效期-修改订单表状态失败(已支付部分取货订单退款)-数据库异常");
                    }
                    //计算退换金额  累加后进行退款
                    refundAmount = refundAmount + order.getOrderTotal();
                    log.info("预售订单["+paidCode+"]，订单表id["+orderId+"],需要退款的金额为["+order.getOrderTotal()+"],累加退款金额["+refundAmount+"]");
                }
            }
            /** 退款操作 */
            if(refundOrderIds.size() != 0 && refundAmount != 0L){
                Presale presale = presaleList.get(0);
                if(!StringUtils.isEmpty(presale.getPayOrderCode())){
                    String orderCode = presale.getPresaleOrderNumber();
                    String payOrder = presale.getPayOrderCode();
                    String refundMoney = refundAmount.toString();
                    String totalFee = presale.getTotalPrice().toString();
                    String refundReason = "已支付超时未取货，自动部分退款";
                    Integer refundType = RefundMessage.PAY_TYPE_WX;
                    Result<String> reuslt = reimburse(orderCode,payOrder,refundMoney,totalFee,refundReason,refundType);
                    if(reuslt.success()){
                        log.error("预售订单["+orderCode+"]已支付超时未取货，自动部分退款成功");
                    }else{
                        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                        log.error("预售订单["+orderCode+"]已支付超时未取货，自动部分退款失败");
                        return Result.returnError("检查取货码有效期-退款失败(已支付部分取货订单退款)-防止数据异常，本次修改全部回退");
                    }
                }else{
                    TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                    log.error("预售订单["+presale.getPresaleOrderNumber()+"]已支付超时未取货,自动部分退款失败-缺少支付单号");
                    return Result.returnError("检查取货码有效期-退款失败(已支付部分取货订单退款)-防止数据异常，本次修改全部回退");
                }
            }
        }

        return Result.returnSuccess();
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/21_15:53
     * @Param: [request, response]
     * @Return: com.runhang.framework.result.Result<java.lang.String>
     * @Description: 支付回调
     */
    @Override
    @Transactional
    public Result<String> payCallback(HttpServletRequest request, HttpServletResponse response) {
        String resultStr = XmlUtils.parseRequst(request);
        log.info("预售-支付回调-原始数据-->"+resultStr);
        if(StringUtils.isEmpty(resultStr)){
            return Result.returnError("支付回调数据为空");
        }
        Map<String, String> resultMap = new HashMap<>();
        try {
            resultMap = XmlUtils.toMap(resultStr.getBytes("utf-8"), "utf-8");
        } catch (Exception e) {
            log.error("预售-支付回调-解析回调数据失败-->"+e.toString());
            return Result.returnError("预售-支付回调-解析回调数据失败");
        }
        log.info("预售-支付回调-解析后的数据-->"+JSON.toJSONString(resultMap));

        String outTrade = resultMap.get("out_trade_no").toString();
        String total_fee = resultMap.get("total_fee").toString();
        String transactionId = resultMap.get("transaction_id").toString();
        String payResult = resultMap.get("pay_result").toString();
        System.out.println("outTrade-->"+outTrade+",total_fee-->"+total_fee+",transactionId-->"+transactionId+",pay_result-->"+payResult);
        //判断支付是否成功
        if(!"0".equals(payResult)){
            log.error("订单["+outTrade+"]支付失败");
            return Result.returnSuccess();
        }
        String orderNumber = outTrade;
        //支付金额
        Long payMoney = Long.valueOf(total_fee);
        PresaleExample presaleExample = new PresaleExample();
        presaleExample.createCriteria().andDeletedEqualTo(0).andPresaleOrderNumberEqualTo(orderNumber);
        List<Presale> presaleList = presaleMapper.selectByExample(presaleExample);
        if(presaleList == null || presaleList.size() == 0){
            log.error("根据预售订单["+outTrade+"]没有查询到预售订单信息");
            return Result.returnSuccess();
        }
        //获取预售订单对应的订单id集合
        List<Integer> orderIds = presaleMapper.getOrderIdsByCode(orderNumber);
        /** 判断是否重复调用 */
        for (Presale presale : presaleList) {
            if(presale.getPickUpStatus() == 0){
                if(presale.getPayStatus() == 1 || presale.getPayStatus() == 2 || presale.getPayStatus() == 3){
                    log.error("预售-支付回调-订单["+outTrade+"]重复调用完成订单");
                    return Result.returnSuccess();
                }else if(presale.getPayStatus() == 4){
                    //退款操作
                    Long totalFeeL = payMoney*100;
                    Result<String> result = reimburse(presale.getPresaleOrderNumber(),transactionId,totalFeeL.toString(),totalFeeL.toString(),"用户取消订单",RefundMessage.PAY_TYPE_WX);
                    if(!result.success()){
                        log.error("预售-支付回调-用户取消订单，进行退款失败");
                        return Result.returnSuccess();
                    }else{
                        log.error("预售-支付回调-用户取消订单，进行退款成功");
                        return Result.returnSuccess();
                    }
                }
            }
        }
        /** 以下操作是支付成功 */
        for (Presale presale : presaleList) {
            presale.setPayStatus(1);
            presale.setPayOrderCode(transactionId);
            presale.setPayMoney(payMoney*100);
            Integer i = presaleMapper.updateByPrimaryKeySelective(presale);
            if(i == -1){
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                log.error("预售-支付回调-预售订单["+orderNumber+"]用户支付成功-修改预售订单支付状态失败-数据库异常");
            }
        }
        log.info("预售-订单["+outTrade+"]支付回调-修改预售订单成功");
        if(orderIds == null || orderIds.size() == 0){
            log.error("根据预售订单["+outTrade+"]没有查询到订单信息");
            return Result.returnSuccess();
        }
        for (Integer orderId : orderIds) {
            OrderExample orderExample = new OrderExample();
            orderExample.createCriteria().andDeletedEqualTo(0).andIdEqualTo(orderId);
            List<Order> orderList = orderMapper.selectByExample(orderExample);
            if(orderList == null || orderList.size() == 0){
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                log.error("预售-支付回调-用户支付成功-根据预售订单["+orderNumber+"]获取到的订单id["+orderId+"]没有获取到订单信息");
                continue;
            }
            Order order = orderList.get(0);
            order.setPayStatus("1");
            Integer i = orderMapper.updateByPrimaryKeySelective(order);
            if(i == -1){
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                log.error("预售-支付回调-预售订单["+orderNumber+"]用户支付成功-修改订单表支付状态失败-数据库异常");
                continue;
            }
        }
        log.info("预售-订单["+outTrade+"]支付回调-修改订单成功");
        log.info("预售-订单["+outTrade+"]支付回调执行完毕");
        return Result.returnSuccess();
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/6/3_14:59
     * @Param: [orderNumber, openId]
     * @Return: com.runhang.framework.result.Result<java.lang.String>
     * @Description: 请求支付
     */
    @Override
    public String payment(String orderNumber, String openId,HttpServletRequest request) {
        ResponseWrapper responseWrapper = new ResponseWrapper();
        OrderMessage orderMessage = new OrderMessage();
        PresaleExample presaleExample = new PresaleExample();
        presaleExample.createCriteria().andDeletedEqualTo(0).andPresaleOrderNumberEqualTo(orderNumber);
        List<Presale> presaleList = presaleMapper.selectByExample(presaleExample);
        if(presaleList == null || presaleList.size() == 0 ){
            log.error("根据预售订单["+orderNumber+"]没有查询到预售订单信息");
            return "fail";
        }
        Presale presale = presaleList.get(0);
        orderMessage.setOrderTotalPrice(presale.getTotalPrice());
        orderMessage.setTradeNumber(orderNumber);
        orderMessage.setStartTime(String.valueOf(presale.getCreateTime()));
        orderMessage.setIP(getIpFromRequest(request));
        orderMessage.setOpen_id(openId);
        String decode = AESUtils.encrypt(orderMessage.toString(),AES_KEY, AES_OFFSET);
        String requestWechatSellPay = noticeService.requestWechatSellPay(decode);
        String retMessage = AESUtils.desEncrypt(requestWechatSellPay,AES_KEY, AES_OFFSET).trim();
        return retMessage;
    }

    //判断两个时间差
    private Boolean checkingTime(Date start, Date end){
        long cha = end.getTime() - start.getTime();
        Long aa = Math.abs(cha);
        double result = aa * 1.0 / (1000 * 60 * 60);
        if(result<=24){
            return Boolean.FALSE; //小于24小时
        }else{
            return Boolean.TRUE;
        }
    }

    /**
     * @Auther: zhangyan
     * @Date: 2019/5/16_10:41
     * @Param: [map]
     * @Return: com.runhang.framework.result.Result<java.lang.String>
     * @Description: 向设备推送预售商品信息
     *  i = 1 新增
     *  i = 3 解除限制
     */
    public Result<String> pushPresaleGoods(List<Map<String, Object>> list,Integer i) {
        Map<String,Object> map = list.get(0);
        String vdCode = (String)map.get("vdCode");
        if(i == 1){
            log.info("向设备["+vdCode+"]推送新增预售商品信息-->"+list);
        }else if(i == 3){
            log.info("向设备["+vdCode+"]推送解除预售商品信息-->"+list);
        }else{
            log.info("参数i值为["+i+"],向设备["+vdCode+"]推送预售商品信息-->"+list);
        }
        PushCommonService.pushPresaleGoods(vdCode,list,i);
        log.info("向设备["+vdCode+"]推送预售商品信息结束");
        return Result.returnSuccess();
    }
    public Result<String> reimburse(){
        RefundMessage refundMessage = new RefundMessage();
        refundMessage.setOrderCode("M20190524140018878T2");
        refundMessage.setPayOrderCode("102565232994201905249371242834");
        refundMessage.setRefundMoney("1000");
        refundMessage.setTotalFee("10000");
        refundMessage.setRefundReason("测试部分退款");
        refundMessage.setRefundType(RefundMessage.PAY_TYPE_WX);
        String decode = AESUtils.encrypt(refundMessage.toString(),AES_KEY, AES_OFFSET);
        //请求退款
        String s = payService.zxNetRefunds(decode);
        //解密
        String ss = AESUtils.desEncrypt(s, AES_KEY, AES_OFFSET);
        if("fail".equals(ss)){
            System.out.println("失败");
        }else{
            JSONObject  myJson = JSONObject.parseObject(ss);
            Map<String, String> params = JSONObject.parseObject(myJson.toJSONString(), new TypeReference<Map<String, String>>(){});
            System.out.println(params);
        }
        return Result.returnSuccess();
    }
    /**
     * @Auther: zhangyan
     * @Date: 2019/5/24_14:28
     * @Param: [OrderCode, payOrder, refundMoney, totalFee, refundReason, refundType]
     * @Return: com.runhang.framework.result.Result<java.lang.String>
     * @Description: 预售退款
     */
    public Result<String> reimburse(String orderCode,String payOrder,String refundMoney,String totalFee,String refundReason,Integer refundType){
        RefundMessage refundMessage = new RefundMessage();
        refundMessage.setOrderCode(orderCode);
        refundMessage.setPayOrderCode(payOrder);
        refundMessage.setRefundMoney(refundMoney);
        refundMessage.setTotalFee(totalFee);
        refundMessage.setRefundReason(refundReason);
        refundMessage.setRefundType(refundType);
        String decode = AESUtils.encrypt(refundMessage.toString(),AES_KEY, AES_OFFSET);
        //请求退款
        String s = payService.zxNetRefunds(decode);
        //解密
        String ss = AESUtils.desEncrypt(s, AES_KEY, AES_OFFSET);
        if("fail".equals(ss)){
            return Result.returnError("退款失败");
        }else{
            JSONObject  myJson = JSONObject.parseObject(ss);
            Map<String, String> params = JSONObject.parseObject(myJson.toJSONString(), new TypeReference<Map<String, String>>(){});
            if("SUCCESS".equals(params.get("return_code"))){
                return Result.returnSuccess();
            }else{
                return Result.returnError("退款失败");
            }
        }
    }

    //判断订单是否支付
    private Boolean checkPayStatus(String orderNumber){
        List<Integer> list = presaleMapper.checkPayStatus(orderNumber);
        if(list != null && list.size() != 0){
            return true;
        }else{
            return false;
        }
    }
    //生成取货码
    private String CreatePickUp(){
        for(int i = 0; i < 100; i++){
            Integer x = 100 + (int)(Math.random()*899);
            Integer xx = 10 + (int)(Math.random()*89);
            Integer xxx = 100 + (int)(Math.random()*899);
            String s = x.toString() + xx.toString() + xxx.toString();
            PresaleExample presaleExample = new PresaleExample();
            presaleExample.createCriteria().andDeletedEqualTo(0).andPickUpCodeEqualTo(s);
            List<Presale> presaleList = presaleMapper.selectByExample(presaleExample);
            if(presaleList != null && presaleList.size() == 0){
                return s;
            }
        }
        return null;
    }
    //生成预售订单接口参数校验
    private Result<String> generateOrdersParameter(String openId, String totalOrderPrice, List<Map<String, Object>> vdInfo){
        if(StringUtils.isEmpty(openId)){
            return Result.returnError("openId为空");
        }
        if(StringUtils.isEmpty(totalOrderPrice)){
            return Result.returnError("totalOrderPrice为空");
        }
        for (Map<String, Object> vdMap : vdInfo) {
            if(!vdMap.containsKey("vdCode") || StringUtils.isEmpty(vdMap.get("vdCode"))){
                return Result.returnError("vdInfo数据不完整");
            }
            if(!vdMap.containsKey("vdTotalPrice") || StringUtils.isEmpty(vdMap.get("vdTotalPrice"))){
                return Result.returnError("vdInfo数据不完整");
            }
            if(!vdMap.containsKey("goodsInfo") || StringUtils.isEmpty(vdMap.get("goodsInfo"))){
                return Result.returnError("vdInfo数据不完整");
            }
            List<Map<String,Object>> goodsInfo = (List<Map<String,Object>>)vdMap.get("goodsInfo");
            for (Map<String, Object> goodsMap : goodsInfo) {
                if(!goodsMap.containsKey("goodsId") || StringUtils.isEmpty(goodsMap.get("goodsId"))){
                    return Result.returnError("vdInfo中的goodsInfo数据不完整");
                }
                if(!goodsMap.containsKey("goodsPrice") || StringUtils.isEmpty(goodsMap.get("goodsPrice"))){
                    return Result.returnError("vdInfo中的goodsInfo数据不完整");
                }
                if(!goodsMap.containsKey("goodsQuantity") || StringUtils.isEmpty(goodsMap.get("goodsQuantity"))){
                    return Result.returnError("vdInfo中的goodsInfo数据不完整");
                }
            }
        }
        return Result.returnSuccess();
    }

    //计算两位置之间的距离
    private Long calculatedDistance(Double j1, Double w1, Double j2, Double w2){
        // 纬度
        double lat1 = Math.toRadians(j1);
        double lat2 = Math.toRadians(j2);
        // 经度
        double lng1 = Math.toRadians(w1);
        double lng2 = Math.toRadians(w2);
        // 纬度之差
        double a = lat1 - lat2;
        // 经度之差
        double b = lng1 - lng2;
        // 计算两点距离的公式
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(b / 2), 2)));
        // 弧长乘地球半径, 返回单位: 米
        s =  s * 6378.137;
        Long d = Math.round(s * 1000);
        return d;
    }
    //从Request中获取ip
    private String getIpFromRequest(HttpServletRequest request) {
        String ip = request.getHeader("X-Forwarded-For");
        if(!StringUtils.isEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)){
            //多次反向代理后会有多个ip值，第一个ip才是真实ip
            int index = ip.indexOf(",");
            if(index != -1){
                return ip.substring(0,index);
            }else{
                return ip;
            }
        }
        ip = request.getHeader("X-Real-IP");
        if(!StringUtils.isEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)){
            return ip;
        }
        return request.getRemoteAddr();
    }
}
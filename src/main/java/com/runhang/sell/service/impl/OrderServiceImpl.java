package com.runhang.sell.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.util.StringUtil;
import com.runhang.base.model.vendormgt.BaseVendorDeployLipstick;
import com.runhang.base.model.vendormgt.BaseVendorDeployLipstickExample;
import com.runhang.framework.result.Result;
import com.runhang.sell.common.ResponseMap;
import com.runhang.sell.entity.old.request.SaleMessage;
import com.runhang.sell.mapper.*;
import com.runhang.sell.model.*;
import com.runhang.sell.service.OrderService;
import com.runhang.sell.service.VendorDeployService;
import com.runhang.sell.utils.DoubleUtil;
import com.runhang.sell.vo.lipstick.GameOrderDetail;
import com.runhang.sell.vo.lipstick.LipGameOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2018/8/17 11:54
 * @Version 1.0
 * @Description
 **/
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;
    @Autowired
    private VendorDeployService vendorDeployService;
    @Resource
    private CompanyMapper companyMapper;

    @Resource
    private VendorMapper vendorMapper;

    @Resource
    RegionMapper regionMapper;

    @Resource
    private VendorDeployMapper vendorDeployMapper;


    private static final String FAIL = "fail";

    /**
     * @Author: zhangyan
     * @Date: 2019/1/7 15:03
     * @Param: [vdCode, billId]
     * @Return: com.runhang.framework.result.Result<java.lang.String>
     * @Description: 根据设备传过来的订单编号生成新的订单编号
     */
    @Override
    public Result<String> generateOrders(String vdCode, String billId, String type) {
        String start = getBillIdStart(vdCode);
        if (FAIL.equals(start)){
            return Result.returnError("获取订单开头字母出现错误");
        }
        SimpleDateFormat sfDate = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String strDate = sfDate.format(new Date());
        String billId1 = start+strDate+type+billId;
        return Result.returnSuccess(billId1);
    }

    /**
     *@Author: fyb
     *@Date 2018/8/17_11:59
     *@Param [saleMessage, billId]
     *@Return com.runhang.framework.result.Result<java.lang.String>
     *@Description:
     */
    @Override
    public Result<String> insertOrderRecord(SaleMessage saleMessage, String billId,String jsonStr){
        Order order = new Order();
        order.setOrderCode(billId);
        order.setOrderDetail(jsonStr);
        order.setOrderStartTime(new Date());
        order.setOrderTotal(Long.parseLong(saleMessage.getSaTotalPrice()));
        order.setOrderStatus("0");//0-用于已下单，未支付
        order.setPayStatus("3");//未支付
        Result ret1 =vendorDeployService.selectVendorDeployByVendorCodeWithStatus(saleMessage.getVenid(),"1,2");
        if(!ret1.success()){
            log.error("查询售货机部署信息失败");
            return Result.returnError("查询售货机部署信息失败");
        }
        VendorDeploy vendorDeploy =(VendorDeploy)ret1.value();
        if(StringUtils.isEmpty(vendorDeploy)){
            log.error("根据售货机编号没有查询到正在运行或离线的售货机");
            return Result.returnError("根据售货机编号没有查询到正在运行或离线的售货机");
        }
        order.setVdId(vendorDeploy.getId());
        order.setVendorName(vendorDeploy.getVendorName());
        Integer regionId = vendorDeploy.getRegionId();
        if(regionId != null){
            Region region = regionMapper.selectByPrimaryKey(regionId);
            order.setRegionName(region.getProvince()+region.getCity()+region.getArea()+region.getRegionName());
        }
        order.setIsEvaluation(0);//未评价
        order.setOrderType("0");
        Integer ret =orderMapper.insertSelective(order);
        if(ret==-1){
            log.error("insertSaleRecord error: return -1 ");
            return Result.returnError("insertSaleRecord error: return -1");
        }
        return Result.returnSuccess(String.valueOf(order.getId()));
    }
    /**
     *@Author: fyb
     *@Date 2018/8/17_14:57
     *@Param [tradeNum]
     *@Return com.runhang.framework.result.Result<com.runhang.inter.module.model.Order>
     *@Description:
     */
    @Override
    public Result<Order> selectOrderByCode(String tradeNum){
        OrderExample example = new OrderExample();
        OrderExample.Criteria criteria = example.createCriteria().andDeletedEqualTo(0);
        if (StringUtil.isNotEmpty(tradeNum)) {
            criteria.andOrderCodeEqualTo(tradeNum);
        }else {
            return Result.returnError("订单编号为空");
        }
        List<Order> orderList = orderMapper.selectByExample(example);
        if(orderList.isEmpty()){
            return Result.returnError("orderList is null");
        }
        Order order = orderList.get(0);
        if(StringUtils.isEmpty(order)){
            return Result.returnError("order is null");
        }
        return Result.returnSuccess(order);
    }

    /**
     *@Author: fyb
     *@Date 2018/8/17_17:33
     *@Param [order]
     *@Return com.runhang.framework.result.Result<java.lang.Boolean>
     *@Description:
     */
    @Override
    public Result<Boolean> updateByOrderCode(Order order,OrderExample orderExample){
        Integer i =orderMapper.updateByExampleSelective(order,orderExample);
        if(i==-1){
            log.error("OrderService insertSelective error : return -1");
            return Result.returnError("OrderService insertSelective error : return -1");
        }
        return Result.returnSuccess();
    }
    @Override
    public Result<Order> selectById(Integer id){
        if(id==null || "".equals(id)){
            log.error("OrderService selectById error : id = null");
            return Result.returnError("OrderService selectById error : id = null");
        }
        Order order= orderMapper.selectByPrimaryKey(id);
        if(order==null){
            log.error("OrderService selectById error : return = null");
            return Result.returnError("OrderService selectById error : return = null");
        }
        return Result.returnSuccess(order);
    }

    /**
     *@Author: fyb
     *@Date 2018/8/22_9:31
     *@Param [order]
     *@Return com.runhang.framework.result.Result<java.lang.Boolean>
     *@Description: 修改订单
     */
    @Override
    public Result<Boolean> updateStatus(Order order){
        Integer ret = orderMapper.updateByPrimaryKeySelective(order);
        if(ret==-1){
            log.error("updateOrder error: return = -1");
            return Result.returnError("updateOrder error: return = -1");
        }
        return Result.returnSuccess();
    }


    /**
     *山东润航：SHANDONRUNHANG      返回：M
     *银座：GINZA                  返回：R
     * 其他：OTHER                 返回：M
     **/
    @Override
    public String getBillIdStart(String vendorCode) {
        String start = "M";
        //根据售货机编号，获取售货机部署信息，再获取商户信息，判断商户是否为银座商户，如果是银座商户，则订单编号以R开头，其他以M开头
        //可能会出现售货机状态未及时更新状态，售货机能生成订单
        Result<VendorDeploy> vendorDeployResult =vendorDeployService.selectVendorDeployByVendorCodeWithStatus(vendorCode,"1,2");
        if(!vendorDeployResult.success()){
            log.error("getBillIdStart error : {}",vendorDeployResult.msg());
            return "fail";
        }
        VendorDeploy vendorDeploy = vendorDeployResult.value();
        if(vendorDeploy == null){
            log.error("福袋机接口-获取开头字母-根据售货机编号获取售货机部署信息失败");
            return "fail";
        }
        Integer businessId = vendorDeploy.getBusinessId();
        CompanyExample example = new CompanyExample();
        CompanyExample.Criteria criteria = example.createCriteria().andDeletedEqualTo(0);
        if(!StringUtils.isEmpty(businessId)){
            criteria.andBusIdEqualTo(businessId);
        }
        List<Company> companyList = companyMapper.selectByExample(example);
        if(companyList.isEmpty()){
            return start;
        }
        String companyType = companyList.get(0).getCompanyType();
        if("SHANDONRUNHANG".equals(companyType)){
            return "M";
        }else if("GINZA".equals(companyType)){
            return "R";
        }else if("KOUXUANPIN".equals(companyType)){
            return "K";
        } else {
            return start;
        }
    }

    @Override
    public List<Order> selectByExample(OrderExample example) {
        return orderMapper.selectByExample(example);
    }

    @Override
    public String getVendorCodeByOrderCode(String orderCode){
        return orderMapper.getVendorCodeByOrderCode(orderCode);
    }

    /**
     *@Author: fyb
     *@Date 2018/8/22_9:31
     *@Param [order]
     *@Return com.runhang.framework.result.Result<java.lang.Boolean>
     *@Description: 修改支付状态
     */
    @Override
    public Result<Boolean> updatePayStatus(String orderCode,String payStatus){
        Result<Order> orderRet = selectOrderByCode(orderCode);
        if(!orderRet.success()){
            return Result.returnError(orderRet.msg());
        }
        Order order = new Order();
        order.setId(orderRet.value().getId());
        order.setPayStatus(payStatus);
        Integer ret = orderMapper.updateByPrimaryKeySelective(order);
        if(ret==-1){
            log.error("updatePayStatus error: return = -1");
            return Result.returnError("updatePayStatus error: return = -1");
        }
        return Result.returnSuccess();
    }
}

package com.runhang.sell.service;

import com.runhang.framework.result.Result;
import com.runhang.sell.entity.old.request.SaleMessage;
import com.runhang.sell.model.Order;
import com.runhang.sell.model.OrderExample;

import java.util.List;
import java.util.Map;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2018/8/17 11:54
 * @Version 1.0
 * @Description
 **/
public interface OrderService {
    /**
     *@Author: fyb
     *@Date 2019/1/14_9:58
     *@Param [vdCode, billId, type]
     *@Return com.runhang.framework.result.Result<java.lang.String>
     *@Description: 处理订单编号
     */
    Result<String> generateOrders(String vdCode, String billId, String type);
    /**
     *@Author: fyb
     *@Date 2018/8/17_17:30
     *@Param [saleMessage, billId]
     *@Return com.runhang.framework.result.Result<java.lang.String>
     *@Description:  插入商品信息、订单编号到订单表
     */
    Result<String> insertOrderRecord(SaleMessage saleMessage, String billId, String jsonStr);
    /**
     *@Author: fyb
     *@Date 2018/8/17_17:31
     *@Param [tradeNum]
     *@Return com.runhang.framework.result.Result<com.runhang.inter.module.model.Order>
     *@Description: 根据订单编号查询订单信息
     */
    Result<Order> selectOrderByCode(String tradeNum);
    /**
     *@Author: fyb
     *@Date 2018/8/17_17:31
     *@Param [order]
     *@Return com.runhang.framework.result.Result<java.lang.Boolean>
     *@Description: 插入订单信息
     */
    Result<Boolean> updateByOrderCode(Order order, OrderExample orderExample);

    Result<Order> selectById(Integer id);

    /**
     *@Author: fyb
     *@Date 2018/8/22_9:31
     *@Param [order]
     *@Return com.runhang.framework.result.Result<java.lang.Boolean>
     *@Description: 修改订单
     */
    Result<Boolean> updateStatus(Order order);

    /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/22 0022 16:02
     *@Param [vendorCode]
     *@return java.lang.String
     *@Description 获取订单的开头字母。
     * 山东润航：SHANDONRUNHANG      返回：M
     * 银座：GIINZA                  返回：R
     * 其他：OTHER
     **/
    String getBillIdStart(String vendorCode);

    List<Order> selectByExample(OrderExample example);

    String getVendorCodeByOrderCode(String orderCode);

    /**
     *@Author: fyb
     *@Date 2019/1/9_14:03
     *@Param [orderCode]
     *@Return com.runhang.framework.result.Result<java.lang.Boolean>
     *@Description: 根据订单编号修改订单支付状态
     */
    Result<Boolean> updatePayStatus(String orderCode, String payStatus);
}

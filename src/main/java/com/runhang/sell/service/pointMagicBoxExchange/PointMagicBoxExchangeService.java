package com.runhang.sell.service.pointMagicBoxExchange;

import com.runhang.framework.result.Result;
import com.runhang.sell.model.Order;
import com.runhang.sell.model.shimao.adjustScore.AdjustScoreResponse;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2019/1/14 17:04
 * @Version 1.0
 * @Description
 **/
public interface PointMagicBoxExchangeService {
    /**
     * @Auther: zhangyan
     * @Date: 2019/1/15_9:02
     * @Param: [vdCode, token, billId, phone]
     * @Return: com.runhang.framework.result.Result<java.lang.String>
     * @Description: 积分兑换接口参数校验
     */
    Result<String> ckeckCreateOrderParams(String vdCode, String token, String billId, String phone);
    /**
     * @Auther: zhangyan
     * @Date: 2019/1/16_9:43
     * @Param: [vdCode, billId1, phone]
     * @Return: com.runhang.framework.result.Result<java.lang.String>
     * @Description: 积分兑换保存消费记录和扣除积分处理
     */
    Result<String> deductionOfPoints(String vdCode, String phone, Order order);
    /**
     *@Author: fyb
     *@Date 2019/1/15_9:20
     *@Param [tradeNum, sastatus, phone]
     *@Return com.runhang.framework.result.Result<java.lang.String>
     *@Description: 根据订单状态去做不同处理
     */
    Result<String> selectSaleMessage(String tradeNum, String sastatus, String phone);
    /**
     *@Author: fyb
     *@Date 2019/1/15_14:30
     *@Param [phone]
     *@Return com.runhang.framework.result.Result<java.lang.Long>
     *@Description: 获取会员当前积分
     */
    Result<Long> getMemberScore(String phone);
    /**
     *@Author: fyb
     *@Date 2019/1/16_14:12
     *@Param [orderId, phone, reason]
     *@Return com.runhang.framework.result.Result<java.lang.String>
     *@Description: 手动请求退积分操作
     */
    Result<Boolean> manualRefundPoints(Integer orderId, String phone, String reason);

    /**
     *@Author: fyb
     *@Date 2019/2/20_9:53
     *@Param [phone, score, reason]
     *@Return com.runhang.framework.result.Result<AdjustScoreResponse>
     *@Description: 世茂会员积分变动
     */
    Result<AdjustScoreResponse> requestIntegralChange(String phone, Long score, String reason);
}

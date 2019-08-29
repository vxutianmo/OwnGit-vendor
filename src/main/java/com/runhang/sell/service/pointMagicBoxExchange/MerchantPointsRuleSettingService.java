package com.runhang.sell.service.pointMagicBoxExchange;

import com.runhang.framework.result.Result;
import com.runhang.sell.model.pointMagicBoxExchange.MerchantPointsRuleSetting;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2019/1/15 10:26
 * @Version 1.0
 * @Description
 **/
public interface MerchantPointsRuleSettingService {
    /**
     *@Author: fyb
     *@Date 2019/1/15_10:33
     *@Param [phone, money]
     *@Return com.runhang.framework.result.Result<java.lang.Long>
     *@Description: 钱兑换积分
     */
    Result<Long> moneyForPoints(String vdCode, Long money);
    /**
     *@Author: fyb
     *@Date 2019/1/15_10:33
     *@Param [phone, money]
     *@Return com.runhang.framework.result.Result<java.lang.Long>
     *@Description: 积分兑换钱
     */
    Result<Long> pointsForMoney(Integer orderId, Long score);

    /**
     *@Author: fyb
     *@Date 2019/2/25_15:46
     *@Param [limitType, busId, phone, date]
     *@Return com.runhang.framework.result.Result<java.lang.Boolean>
     *@Description: 获取商户积分兑换规则
     */
    Result<MerchantPointsRuleSetting> getRule(Integer busId);
}

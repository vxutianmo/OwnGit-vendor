package com.runhang.sell.service.pointMagicBoxExchange;

import com.runhang.framework.result.Result;
import com.runhang.sell.model.pointMagicBoxExchange.MemberConsumpRecord;

import java.util.Date;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2019/1/14 17:24
 * @Version 1.0
 * @Description
 **/
public interface MemberConsumpRecordService {
    /**
     *@Author: fyb
     *@Date 2019/1/15_14:23
     *@Param [orderId]
     *@Return com.runhang.framework.result.Result<java.util.List<MemberConsumpRecord>>
     *@Description: 根据订单id查询会员消费积分
     */
    Result<MemberConsumpRecord> getPointsByOrderId(Integer orderId);
    /**
     *@Author: fyb
     *@Date 2019/1/14_19:34
     *@Param [memberConsumpRecord]
     *@Return com.runhang.framework.result.Result<java.lang.Boolean>
     *@Description: 插入·会员消费记录
     */
    Result<Integer> insertRecord(MemberConsumpRecord memberConsumpRecord);
    /**
     *@Author: fyb
     *@Date 2019/1/14_19:34
     *@Param [memberConsumpRecord]
     *@Return com.runhang.framework.result.Result<java.lang.Boolean>
     *@Description: 修改·会员消费记录
     */
    Result<Boolean> updataRecord(MemberConsumpRecord memberConsumpRecord);

    /**
     *@Author: fyb
     *@Date 2019/2/25_15:23
     *@Param [limitType, date, phone, busId]限制类型、日期、手机号、商户id
     *@Return com.runhang.framework.result.Result
     *@Description: 获取消费次数
     */
    Integer getForRecord(Integer limitType, Date date, String phone, Integer busId);
}

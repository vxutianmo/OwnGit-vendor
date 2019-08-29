package com.runhang.sell.service.pointMagicBoxExchange.impl;

import com.runhang.framework.result.Result;
import com.runhang.sell.mapper.pointMagicBoxExchange.MemberConsumpRecordMapper;
import com.runhang.sell.model.pointMagicBoxExchange.MemberConsumpRecord;
import com.runhang.sell.model.pointMagicBoxExchange.MemberConsumpRecordExample;
import com.runhang.sell.service.pointMagicBoxExchange.MemberConsumpRecordService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2019/1/14 19:28
 * @Version 1.0
 * @Description 会员消费记录Service
 **/
@Service
public class MemberConsumpRecordServiceImpl implements MemberConsumpRecordService {
    @Resource
    private MemberConsumpRecordMapper mapper;
    /**
     *@Author: fyb
     *@Date 2019/1/15_14:23
     *@Param [orderId]
     *@Return com.runhang.framework.result.Result<java.util.List<MemberConsumpRecord>>
     *@Description: 根据订单id查询会员消费积分
     */
    @Override
    public Result<MemberConsumpRecord> getPointsByOrderId(Integer orderId){
        MemberConsumpRecordExample example = new MemberConsumpRecordExample();
        example.createCriteria().andOrderIdEqualTo(orderId).andDeletedEqualTo(0);
        List<MemberConsumpRecord> recordList = mapper.selectByExample(example);
        if(StringUtils.isEmpty(recordList)||recordList.size()!=1){
            return Result.returnError("获取会员消费记录失败");
        }
        return Result.returnSuccess(recordList.get(0));
    }
    /**
     *@Author: fyb
     *@Date 2019/1/15_14:26
     *@Param [memberConsumpRecord]
     *@Return com.runhang.framework.result.Result<java.lang.Boolean>
     *@Description: 创建会员消费记录
     */
    @Override
    public Result<Integer> insertRecord(MemberConsumpRecord memberConsumpRecord){
        Integer i = mapper.insertSelective(memberConsumpRecord);
        if(i==-1){
            return Result.returnError("数据库异常");
        }
        return Result.returnSuccess(memberConsumpRecord.getId());
    }
    /**
     *@Author: fyb
     *@Date 2019/1/15_14:26
     *@Param [memberConsumpRecord]
     *@Return com.runhang.framework.result.Result<java.lang.Boolean>
     *@Description: 修改会员消费记录
     */
    @Override
    public Result<Boolean> updataRecord(MemberConsumpRecord memberConsumpRecord){
        Integer i = mapper.updateByPrimaryKeySelective(memberConsumpRecord);
        if(i==-1){
            return Result.returnError("插入会员消费记录失败！");
        }
        return Result.returnSuccess();
    }
    /**
     *@Author: fyb
     *@Date 2019/2/25_15:23
     *@Param [limitType, date, phone, busId]限制类型、日期、手机号、商户id
     *@Return com.runhang.framework.result.Result
     *@Description:
     */
    @Override
    public Integer getForRecord(Integer limitType, Date date, String phone,Integer busId){
        return mapper.getForRecord(limitType,date,phone,busId);
    }
}

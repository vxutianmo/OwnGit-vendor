package com.runhang.sell.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsQuantityAlarmRecordMapper {
    //根据售货机部署id，查询当前售货机商品数量
    int vendorGoodCountsByVdId(@Param("vendorDeployId") Integer vendorDeployId,@Param("trackCodeList") List<String> trackCodeList);
}
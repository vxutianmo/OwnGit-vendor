package com.runhang.sell.mapper;

import com.runhang.sell.model.PollingAdvertPlan;
import com.runhang.sell.model.PollingAdvertPlanExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PollingAdvertPlanMapper {
    int countByExample(PollingAdvertPlanExample example);

    int deleteByExample(PollingAdvertPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PollingAdvertPlan record);

    int insertSelective(PollingAdvertPlan record);

    List<PollingAdvertPlan> selectByExample(PollingAdvertPlanExample example);

    PollingAdvertPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PollingAdvertPlan record, @Param("example") PollingAdvertPlanExample example);

    int updateByExample(@Param("record") PollingAdvertPlan record, @Param("example") PollingAdvertPlanExample example);

    int updateByPrimaryKeySelective(PollingAdvertPlan record);

    int updateByPrimaryKey(PollingAdvertPlan record);
}
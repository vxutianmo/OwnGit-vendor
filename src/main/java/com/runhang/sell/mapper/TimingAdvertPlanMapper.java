package com.runhang.sell.mapper;

import com.runhang.sell.model.TimingAdvertPlan;
import com.runhang.sell.model.TimingAdvertPlanExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TimingAdvertPlanMapper {
    int countByExample(TimingAdvertPlanExample example);

    int deleteByExample(TimingAdvertPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TimingAdvertPlan record);

    int insertSelective(TimingAdvertPlan record);

    List<TimingAdvertPlan> selectByExample(TimingAdvertPlanExample example);

    TimingAdvertPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TimingAdvertPlan record, @Param("example") TimingAdvertPlanExample example);

    int updateByExample(@Param("record") TimingAdvertPlan record, @Param("example") TimingAdvertPlanExample example);

    int updateByPrimaryKeySelective(TimingAdvertPlan record);

    int updateByPrimaryKey(TimingAdvertPlan record);
}
package com.runhang.sell.mapper;

import com.runhang.sell.model.VendorAdvertPlan;
import com.runhang.sell.model.VendorAdvertPlanExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface VendorAdvertPlanMapper {
    int countByExample(VendorAdvertPlanExample example);

    int deleteByExample(VendorAdvertPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VendorAdvertPlan record);

    int insertSelective(VendorAdvertPlan record);

    List<VendorAdvertPlan> selectByExample(VendorAdvertPlanExample example);

    VendorAdvertPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VendorAdvertPlan record, @Param("example") VendorAdvertPlanExample example);

    int updateByExample(@Param("record") VendorAdvertPlan record, @Param("example") VendorAdvertPlanExample example);

    int updateByPrimaryKeySelective(VendorAdvertPlan record);

    int updateByPrimaryKey(VendorAdvertPlan record);

    List<VendorAdvertPlan> selectByMap(@Param("location") Integer location, @Param("idList") List<Integer> idList);
}
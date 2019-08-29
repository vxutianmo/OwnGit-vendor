package com.runhang.sell.mapper;

import com.runhang.sell.model.MembershipCard;
import com.runhang.sell.model.MembershipCardExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MembershipCardMapper {
    int countByExample(MembershipCardExample example);

    int deleteByExample(MembershipCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MembershipCard record);

    int insertSelective(MembershipCard record);

    List<MembershipCard> selectByExample(MembershipCardExample example);

    MembershipCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MembershipCard record, @Param("example") MembershipCardExample example);

    int updateByExample(@Param("record") MembershipCard record, @Param("example") MembershipCardExample example);

    int updateByPrimaryKeySelective(MembershipCard record);

    int updateByPrimaryKey(MembershipCard record);
}
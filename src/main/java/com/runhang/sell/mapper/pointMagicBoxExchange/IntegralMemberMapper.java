package com.runhang.sell.mapper.pointMagicBoxExchange;

import com.runhang.sell.model.pointMagicBoxExchange.IntegralMember;
import com.runhang.sell.model.pointMagicBoxExchange.IntegralMemberExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IntegralMemberMapper {
    int countByExample(IntegralMemberExample example);

    int deleteByExample(IntegralMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IntegralMember record);

    int insertSelective(IntegralMember record);

    List<IntegralMember> selectByExample(IntegralMemberExample example);

    IntegralMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IntegralMember record, @Param("example") IntegralMemberExample example);

    int updateByExample(@Param("record") IntegralMember record, @Param("example") IntegralMemberExample example);

    int updateByPrimaryKeySelective(IntegralMember record);

    int updateByPrimaryKey(IntegralMember record);
}
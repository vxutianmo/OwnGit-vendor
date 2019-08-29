package com.runhang.sell.mapper;

import com.runhang.sell.model.Membership;
import com.runhang.sell.model.MembershipExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MembershipMapper {
    int countByExample(MembershipExample example);

    int deleteByExample(MembershipExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Membership record);

    int insertSelective(Membership record);

    List<Membership> selectByExample(MembershipExample example);

    Membership selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Membership record, @Param("example") MembershipExample example);

    int updateByExample(@Param("record") Membership record, @Param("example") MembershipExample example);

    int updateByPrimaryKeySelective(Membership record);

    int updateByPrimaryKey(Membership record);
}
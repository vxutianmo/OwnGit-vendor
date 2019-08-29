package com.runhang.sell.mapper;

import com.runhang.sell.model.PersonInfo;

import org.apache.ibatis.annotations.Param;

public interface PersonInfoMapper {

    PersonInfo selectByPrimaryKey(Integer id);
    //获取补货员信息
    PersonInfo getReplenisherById(@Param("replenisherId") Integer replenisherId);
}
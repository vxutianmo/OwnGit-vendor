package com.runhang.sell.mapper;

import com.runhang.sell.model.InterfaceLog;
import com.runhang.sell.model.InterfaceLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface InterfaceLogMapper {
    int countByExample(InterfaceLogExample example);

    int deleteByExample(InterfaceLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InterfaceLog record);

    int insertSelective(InterfaceLog record);

    List<InterfaceLog> selectByExample(InterfaceLogExample example);

    InterfaceLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InterfaceLog record, @Param("example") InterfaceLogExample example);

    int updateByExample(@Param("record") InterfaceLog record, @Param("example") InterfaceLogExample example);

    int updateByPrimaryKeySelective(InterfaceLog record);

    int updateByPrimaryKey(InterfaceLog record);
}
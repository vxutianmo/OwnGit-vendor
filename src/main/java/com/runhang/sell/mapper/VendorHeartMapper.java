package com.runhang.sell.mapper;

import com.runhang.sell.model.VendorHeart;
import com.runhang.sell.model.VendorHeartExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface VendorHeartMapper {
    int countByExample(VendorHeartExample example);

    int deleteByExample(VendorHeartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VendorHeart record);

    int insertSelective(VendorHeart record);

    List<VendorHeart> selectByExample(VendorHeartExample example);

    VendorHeart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VendorHeart record, @Param("example") VendorHeartExample example);

    int updateByExample(@Param("record") VendorHeart record, @Param("example") VendorHeartExample example);

    int updateByPrimaryKeySelective(VendorHeart record);

    int updateByPrimaryKey(VendorHeart record);
}
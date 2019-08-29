package com.runhang.sell.mapper;

import com.runhang.sell.model.VendorDeployList;
import com.runhang.sell.model.VendorDeployListExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface VendorDeployListMapper {
    int countByExample(VendorDeployListExample example);

    int deleteByExample(VendorDeployListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VendorDeployList record);

    int insertSelective(VendorDeployList record);

    List<VendorDeployList> selectByExample(VendorDeployListExample example);

    VendorDeployList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VendorDeployList record, @Param("example") VendorDeployListExample example);

    int updateByExample(@Param("record") VendorDeployList record, @Param("example") VendorDeployListExample example);

    int updateByPrimaryKeySelective(VendorDeployList record);

    int updateByPrimaryKey(VendorDeployList record);
}
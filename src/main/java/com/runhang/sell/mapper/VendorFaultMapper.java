package com.runhang.sell.mapper;

import com.runhang.sell.model.VendorFault;
import com.runhang.sell.model.VendorFaultExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface VendorFaultMapper {
    int countByExample(VendorFaultExample example);

    int deleteByExample(VendorFaultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VendorFault record);

    int insertSelective(VendorFault record);

    List<VendorFault> selectByExample(VendorFaultExample example);

    VendorFault selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VendorFault record, @Param("example") VendorFaultExample example);

    int updateByExample(@Param("record") VendorFault record, @Param("example") VendorFaultExample example);

    int updateByPrimaryKeySelective(VendorFault record);

    int updateByPrimaryKey(VendorFault record);
}
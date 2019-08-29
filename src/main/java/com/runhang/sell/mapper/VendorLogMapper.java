package com.runhang.sell.mapper;

import com.runhang.sell.model.VendorLog;
import com.runhang.sell.model.VendorLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface VendorLogMapper {
    int countByExample(VendorLogExample example);

    int deleteByExample(VendorLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VendorLog record);

    int insertSelective(VendorLog record);

    List<VendorLog> selectByExample(VendorLogExample example);

    VendorLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VendorLog record, @Param("example") VendorLogExample example);

    int updateByExample(@Param("record") VendorLog record, @Param("example") VendorLogExample example);

    int updateByPrimaryKeySelective(VendorLog record);

    int updateByPrimaryKey(VendorLog record);
}
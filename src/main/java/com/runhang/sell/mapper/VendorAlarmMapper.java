package com.runhang.sell.mapper;

import com.runhang.sell.model.VendorAlarm;
import com.runhang.sell.model.VendorAlarmExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface VendorAlarmMapper {
    int countByExample(VendorAlarmExample example);

    int deleteByExample(VendorAlarmExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VendorAlarm record);

    int insertSelective(VendorAlarm record);

    List<VendorAlarm> selectByExample(VendorAlarmExample example);

    VendorAlarm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VendorAlarm record, @Param("example") VendorAlarmExample example);

    int updateByExample(@Param("record") VendorAlarm record, @Param("example") VendorAlarmExample example);

    int updateByPrimaryKeySelective(VendorAlarm record);

    int updateByPrimaryKey(VendorAlarm record);
}
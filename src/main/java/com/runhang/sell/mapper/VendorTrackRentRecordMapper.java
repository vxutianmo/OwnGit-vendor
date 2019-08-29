package com.runhang.sell.mapper;

import com.runhang.sell.model.VendorTrackRentRecord;
import com.runhang.sell.model.VendorTrackRentRecordExample;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface VendorTrackRentRecordMapper {
    int countByExample(VendorTrackRentRecordExample example);

    int deleteByExample(VendorTrackRentRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VendorTrackRentRecord record);

    int insertSelective(VendorTrackRentRecord record);

    List<VendorTrackRentRecord> selectByExample(VendorTrackRentRecordExample example);

    VendorTrackRentRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VendorTrackRentRecord record, @Param("example") VendorTrackRentRecordExample example);

    int updateByExample(@Param("record") VendorTrackRentRecord record, @Param("example") VendorTrackRentRecordExample example);

    int updateByPrimaryKeySelective(VendorTrackRentRecord record);

    int updateByPrimaryKey(VendorTrackRentRecord record);

    VendorTrackRentRecord selectBusinessId(@Param("vdId")Integer vdId, @Param("trackId")Integer trackId,@Param("lessorId")Integer lessorId, @Param("orderTime")Date orderTime);
}
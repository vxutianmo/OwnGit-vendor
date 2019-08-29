package com.runhang.sell.mapper.pointMagicBoxExchange;

import com.runhang.sell.model.pointMagicBoxExchange.RequestLogRecord;
import com.runhang.sell.model.pointMagicBoxExchange.RequestLogRecordExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RequestLogRecordMapper {
    int countByExample(RequestLogRecordExample example);

    int deleteByExample(RequestLogRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RequestLogRecord record);

    int insertSelective(RequestLogRecord record);

    List<RequestLogRecord> selectByExample(RequestLogRecordExample example);

    RequestLogRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RequestLogRecord record, @Param("example") RequestLogRecordExample example);

    int updateByExample(@Param("record") RequestLogRecord record, @Param("example") RequestLogRecordExample example);

    int updateByPrimaryKeySelective(RequestLogRecord record);

    int updateByPrimaryKey(RequestLogRecord record);
}
package com.runhang.sell.service.pointMagicBoxExchange.impl;

import com.runhang.sell.mapper.pointMagicBoxExchange.RequestLogRecordMapper;
import com.runhang.sell.model.pointMagicBoxExchange.RequestLogRecord;
import com.runhang.sell.service.pointMagicBoxExchange.RequestLogRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RequestLogRecordServiceImpl implements RequestLogRecordService {

    @Resource
    private RequestLogRecordMapper mapper;
    @Override
    public void addRequestLogRecord(RequestLogRecord requestLogRecord) {
        mapper.insertSelective(requestLogRecord);
    }
}

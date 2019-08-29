package com.runhang.sell.service.impl;

import com.runhang.sell.mapper.InterfaceLogMapper;
import com.runhang.sell.model.InterfaceLog;
import com.runhang.sell.service.InterfaceLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName InterfaceLogImpl
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/9/8 0008 11:17
 * @Version 1.0
 * @Description
 **/
@Slf4j
@Service
public class InterfaceLogServiceImpl implements InterfaceLogService {

    @Resource
    private InterfaceLogMapper interfaceLogMapper;
    @Override
    public void insertInterfaceLog(InterfaceLog interfaceLog) {
        interfaceLogMapper.insert(interfaceLog);
    }
}

package com.runhang.sell.service.impl;

import com.runhang.base.model.basic.PersonInfo;
import com.runhang.base.model.basic.PersonInfoExample;
import com.runhang.base.service.basic.BasePersonInfoService;
import com.runhang.framework.result.Result;
import com.runhang.sell.service.PersonInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2018/11/14 18:36
 * @Version 1.0
 * @Description
 **/
@Slf4j
@Service
public class PersonInfoServiceImpl extends BasePersonInfoService implements PersonInfoService {
    public Result<List<PersonInfo>> selectByBusinessId(Integer businessId){
        PersonInfoExample example = new PersonInfoExample();
        example.createCriteria().andDeletedEqualTo(0)
                .andBusIdEqualTo(businessId);
        return super.findByExample(example);
    }
}

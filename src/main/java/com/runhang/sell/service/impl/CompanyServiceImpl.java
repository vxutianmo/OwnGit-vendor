package com.runhang.sell.service.impl;

import com.runhang.base.model.basic.Company;
import com.runhang.base.model.basic.CompanyExample;
import com.runhang.base.service.basic.BaseCompanyService;
import com.runhang.framework.result.Result;
import com.runhang.sell.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2018/11/5 19:58
 * @Version 1.0
 * @Description
 **/
@Service
public class CompanyServiceImpl extends BaseCompanyService implements CompanyService {
    public Result<List<Company>> selectByBusId(Integer businessId) {
        CompanyExample example = new CompanyExample();
        example.createCriteria()
                .andDeletedEqualTo(0)
                .andBusIdEqualTo(businessId);
        return super.findByExample(example);
    }
}

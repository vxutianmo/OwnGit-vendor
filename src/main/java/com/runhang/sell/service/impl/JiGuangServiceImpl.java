package com.runhang.sell.service.impl;

import com.runhang.sell.mapper.VendorDeployMapper;
import com.runhang.sell.mapper.VendorMapper;
import com.runhang.sell.service.JiGuangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JiGuangServiceImpl implements JiGuangService {

    @Autowired
    private VendorMapper vendorMapper;
    @Autowired
    private VendorDeployMapper vendorDeployMapper;

    /**
     * @Param: [vdCode]
     * @return: java.lang.String
     * @Author: zhangyan
     * @Date: 2018/9/11 9:47
     * @Description: 根据售货机编号获取pushId
     */
    @Override
    public String getPushIdByVendCode(String vdCode) {
        Integer venId = vendorMapper.getIdByVdCode(vdCode);
        String pushId = vendorDeployMapper.getPushIdByVdId(venId);
        return pushId;
    }
    /**
     * @Param: [vdCode]
     * @return: java.lang.String
     * @Author: zhangyan
     * @Date: 2018/9/11 9:47
     * @Description: 根据售货机编号获取updatePushId
     */
    @Override
    public String getUpdatePushIdByVenCode(String vdCode) {
        Integer venId = vendorMapper.getIdByVdCode(vdCode);
        String updatePushId = vendorDeployMapper.getUpdatePushIdByVdId(venId);
        return updatePushId;
    }
}

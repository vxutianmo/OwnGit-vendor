package com.runhang.sell.service.impl;

import com.github.pagehelper.util.StringUtil;
import com.runhang.base.model.basic.Company;
import com.runhang.base.model.basic.PersonInfo;
import com.runhang.base.service.vendormgt.BaseVendorDeployService;
import com.runhang.framework.result.Result;
import com.runhang.sell.mapper.AdvertSizeMapper;
import com.runhang.sell.mapper.VendorDeployMapper;
import com.runhang.sell.mapper.VendorMapper;
import com.runhang.sell.model.*;
import com.runhang.sell.push.JPushService;
import com.runhang.sell.service.VendorDeployService;
import com.runhang.sell.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName VendorDeployServiceImpl
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/2 14:03
 * @Version 1.0
 * @Description 售货机部署相关服务。
 **/
@Service
@Slf4j
public class VendorDeployServiceImpl extends BaseVendorDeployService implements VendorDeployService {
    @Resource
    private AdvertSizeMapper advertSizeMapper;

    @Resource
    private VendorDeployMapper vendorDeployMapper;

    @Resource
    private VendorMapper vendorMapper;

    @Autowired
    private CompanyServiceImpl companyService;

    @Autowired
    private PersonInfoServiceImpl personInfoService;

    @Override
    public List<Goods> getAllGoods() { return null; }

    @Override
    public AdvertSize getAllAdvertSize() {
        return advertSizeMapper.selectByPrimaryKey(1);
    }


    /**
     *@Author: fyb
     *@Date 2018/8/17_11:14
     *@Param [vendorId]
     *@Return com.runhang.framework.result.Result<VendorDeploy>
     *@Description:
     */
//   @Override
//    public Result<VendorDeploy> selectVendorDeployByVendorCode(String vendorCode) {
//        VendorExample vendorExample = new VendorExample();
//        VendorExample.Criteria criteria = vendorExample.createCriteria().andDeletedEqualTo(0);
//        if (StringUtil.isNotEmpty(vendorCode)) {
//            criteria.andVdCodeEqualTo(vendorCode);
//        }
//        List<Vendor> vendorList = vendorMapper.selectByExample(vendorExample);
//        if(vendorList.isEmpty()){
//            return Result.returnError("VendorDeployServiceImpl selectVendorDeployByVendorId error : vendorList is null");
//        }
//        Integer vdId = vendorList.get(0).getId();
//        if(vdId==null){
//            return Result.returnError("VendorDeployServiceImpl selectVendorDeployByVendorId error : vdId is null");
//        }
//        Result ret= selectVendorDeployByVendorId(String.valueOf(vdId));
//        if(!ret.success()){
//            return Result.returnError("VendorDeployServiceImpl selectVendorDeployByVendorId error : "+ret.msg());
//        }
//        VendorDeploy vendorDeploy=(VendorDeploy)ret.value();
//        if(StringUtils.isEmpty(vendorDeploy)){
//            return Result.returnError("获取售货机部署对象为空,没有正在运行的售货机");
//        }
//        return Result.returnSuccess(vendorDeploy);
//    }

    /**
     *@Author: fyb
     *@Date 2018/10/15_9:30
     *@Param [vendorCode, status]
     *@Return com.runhang.framework.result.Result<VendorDeploy>
     *@Description: 根据售货机编号和售货机状态查询售货机部署信息，状态可以为多个
     */
    @Override
    public Result<VendorDeploy> selectVendorDeployByVendorCodeWithStatus(String vendorCode, String status) {
        VendorExample vendorExample = new VendorExample();
        VendorExample.Criteria criteria = vendorExample.createCriteria().andDeletedEqualTo(0);
        if (StringUtil.isNotEmpty(vendorCode)) {
            criteria.andVdCodeEqualTo(vendorCode);
        }
        List<Vendor> vendorList = vendorMapper.selectByExample(vendorExample);
        if(vendorList.isEmpty()){
            return Result.returnError("VendorDeployServiceImpl selectVendorDeployByVendorId error : vendorList is null");
        }
        Integer vdId = vendorList.get(0).getId();
        if(vdId==null){
            return Result.returnError("VendorDeployServiceImpl selectVendorDeployByVendorId error : vdId is null");
        }
        VendorDeployExample vendorDeployExample = new VendorDeployExample();
        //VendorDeployExample.Criteria criteria1 = vendorDeployExample.createCriteria().andDeletedEqualTo(0).andVdIdEqualTo(vdId);
        if (status!=null){
            if (status.length()>1) {
                String[] sta = status.split(",");
                if (sta.length != 0) {
                    for (String s : sta) {
                        VendorDeployExample.Criteria criteria1 = vendorDeployExample.createCriteria().andDeletedEqualTo(0).andVdIdEqualTo(vdId).andStatusEqualTo(Integer.valueOf(s));
                        vendorDeployExample.or(criteria1);
                        //criteria1.andStatusEqualTo(Integer.valueOf(s));
                    }
                }
            }else {
                vendorDeployExample.createCriteria().andDeletedEqualTo(0).andVdIdEqualTo(vdId).andStatusEqualTo(Integer.valueOf(status));
            }
        }

        List<VendorDeploy> vendorDeployList = vendorDeployMapper.selectByExample(vendorDeployExample);
        if(vendorDeployList.isEmpty()){
            return Result.returnError("VendorDeployServiceImpl selectVendorDeployByVendorId error : vendorDeployList is null");
        }
        VendorDeploy vendorDeploy = vendorDeployList.get(0);
        if(StringUtils.isEmpty(vendorDeploy)){
            return Result.returnError("获取售货机部署对象为空,没有正在运行的售货机");
        }
        vendorDeploy.setVendorType(vendorList.get(0).getVdType());
        vendorDeploy.setVendorCode(vendorList.get(0).getVdCode());
        return Result.returnSuccess(vendorDeploy);
    }

    /**
     *@Author: fyb
     *@Date 2018/8/17_11:14
     *@Param [vendorId]
     *@Return com.runhang.framework.result.Result<VendorDeploy>
     *@Description: 根据售货机部署id获取正常运行的售货机部署信息
     */
    @Override
    public Result<VendorDeploy> selectVendorDeployByVendorId(String vendorId) {
        VendorDeployExample vendorDeployExample = new VendorDeployExample();
        VendorDeployExample.Criteria criteria2 = vendorDeployExample.createCriteria().andDeletedEqualTo(0).andStatusEqualTo(1);
        if (StringUtil.isNotEmpty(vendorId)) {
            criteria2.andVdIdEqualTo(Integer.valueOf(vendorId));
        }
        List<VendorDeploy> vendorDeployList = vendorDeployMapper.selectByExample(vendorDeployExample);
        if(vendorDeployList.isEmpty()){
            return Result.returnError("VendorDeployServiceImpl selectVendorDeployByVendorId error : vendorList is null");
        }
        VendorDeploy vendorDeploy = vendorDeployList.get(0);
        if(vendorDeploy==null){
            log.error("VendorDeployServiceImpl insertVendorDeploy error : vendorDeploy==null");
            return Result.returnError("VendorDeployServiceImpl selectVendorDeployByVendorId error : vdId is null");
        }
        return Result.returnSuccess(vendorDeploy);
    }

    /**
     *@Author: fyb
     *@Date 2018/9/26_19:16
     *@Param [vendorCode]
     *@Return com.runhang.framework.result.Result<VendorDeploy>
     *@Description: 根据售货机编号查询售货机部署信息，不管售货机是否在运行,只要状态不是下线，
     * ，，，，，，，以后售货机表可能关联多个售货机部署表，但只有一个是非下线状态
     */
    @Override
    public Result<VendorDeploy> selectVendorDeployByVendorCodeNoStatus(String vendorCode) {
        VendorExample vendorExample = new VendorExample();
        VendorExample.Criteria criteria = vendorExample.createCriteria().andDeletedEqualTo(0);
        if (StringUtil.isNotEmpty(vendorCode)) {
            criteria.andVdCodeEqualTo(vendorCode);
        }
        List<Vendor> vendorList = vendorMapper.selectByExample(vendorExample);
        if(vendorList.isEmpty()){
            return Result.returnError("VendorDeployServiceImpl selectVendorDeployByVendorId error : vendorList is null");
        }
        Integer vdId = vendorList.get(0).getId();
        if(vdId==null){
            return Result.returnError("VendorDeployServiceImpl selectVendorDeployByVendorId error : vdId is null");
        }
        VendorDeployExample vendorDeployExample = new VendorDeployExample();
        vendorDeployExample.createCriteria().andDeletedEqualTo(0).andVdIdEqualTo(vdId).andStatusNotEqualTo(3);
        List<VendorDeploy> vendorDeployList = vendorDeployMapper.selectByExample(vendorDeployExample);
        if(vendorDeployList.isEmpty()){
            return Result.returnError("VendorDeployServiceImpl selectVendorDeployByVendorId error : vendorList is null");
        }
        VendorDeploy vendorDeploy = vendorDeployList.get(0);
        if(StringUtils.isEmpty(vendorDeploy)){
            return Result.returnError("获取售货机部署对象为空,没有正在运行的售货机");
        }
        return Result.returnSuccess(vendorDeploy);
    }

    /**
     *@Author: fyb
     *@Date 2018/8/16_15:38
     *@Param [vendorDeploy]
     *@Return com.runhang.framework.result.Result<java.lang.Boolean>
     *@Description:
     */
    @Override
    public Result<Boolean> insertVendorDeploy(VendorDeploy vendorDeploy){
        Integer i= vendorDeployMapper.insert(vendorDeploy);
        if(i==-1){
            log.error("VendorDeployServiceImpl insertVendorDeploy error : return = -1");
            return Result.returnError("VendorDeployServiceImpl insertVendorDeploy error : return = -1");
        }
        return Result.returnSuccess();
    }
    /**
     *@Author: fyb
     *@Date 2018/8/16_15:38
     *@Param [vendorDeploy]
     *@Return com.runhang.framework.result.Result<java.lang.Boolean>
     *@Description:
     */
    @Override
    public Result<VendorDeploy> selectById(Integer id){
        if(id==null){
            log.error("VendorDeployServiceImpl selectById error : id = null");
            return Result.returnError("VendorDeployServiceImpl selectById error : id = null");
        }
        //VendorDeploy vendorDeploy= vendorDeployMapper.selectByPrimaryKey(id);
        Result<com.runhang.base.model.vendormgt.VendorDeploy> vendorDeployResult = findById(id);
        if(!vendorDeployResult.success()){
            log.error("根据售货机部署id获取售货机部署信息失败，{}",vendorDeployResult.msg());
        }
        VendorDeploy vendorDeploy = new VendorDeploy(vendorDeployResult.value());
        if(StringUtils.isEmpty(vendorDeploy)){
            log.error("VendorDeployServiceImpl selectById error : return = null");
            return Result.returnError("VendorDeployServiceImpl selectById error : return = null");
        }
        return Result.returnSuccess(vendorDeploy);
    }
    /**
     *@Author: fyb
     *@Date 2018/8/16_15:38
     *@Param [vendorDeploy]
     *@Return com.runhang.framework.result.Result<java.lang.Boolean>
     *@Description:
     */
    @Override
    public Result<Boolean> updateVendorDeploy(VendorDeploy vendorDeploy){
        if(vendorDeploy==null){
            log.error("VendorDeployServiceImpl updateVendorDeploy error : vendorDeploy = null");
            return Result.returnError("VendorDeployServiceImpl updateVendorDeploy error : vendorDeploy = null");
        }
        Integer ret = vendorDeployMapper.updateByPrimaryKeySelective(vendorDeploy);
        if(ret==-1){
            log.error("VendorDeployServiceImpl updateByPrimaryKey error : return = -1");
            return Result.returnError("VendorDeployServiceImpl updateByPrimaryKey error : return = -1");
        }
        return Result.returnSuccess();
    }

    public List<String> selectVendorDeployPushId(JPushService.TYPE type){
        VendorDeployExample example = new VendorDeployExample();
        example.createCriteria()
                .andDeletedEqualTo(0)
                .andPushIdIsNotNull()
                .andUpdatePushIdIsNotNull()
                .andStatusNotEqualTo(3);
        List<VendorDeploy> vendorDeploys = vendorDeployMapper.selectByExample(example);
        if (type.equals(JPushService.TYPE.DEFAULT)){
            return vendorDeploys.stream()
                    .map(VendorDeploy::getPushId)
                    .filter(s -> !StringUtil.isEmpty(s))
                    .collect(Collectors.toList());
        }else {
            return vendorDeploys.stream()
                    .map(VendorDeploy::getUpdatePushId)
                    .filter(s -> !StringUtil.isEmpty(s))
                    .collect(Collectors.toList());
        }
    }

    public List<OrderDishesGoods> selectBasicInfoById(Integer deployId) {
        return vendorDeployMapper.selectBasicInfoById(deployId);
    }

    /**
     *@Author: fyb
     *@Date 2018/11/20_20:03
     *@Param [deployId]
     *@Return VendorDeploy
     *@Description: 根据售货机部署id查询售货机部署及售货机编号
     */
    @Override
    public VendorDeploy selectVendorMsg(Integer deployId){
        Result<com.runhang.base.model.vendormgt.VendorDeploy> vendorDeployResult = findById(deployId);
        if(!vendorDeployResult.success()){
            log.error(vendorDeployResult.msg());
            return new VendorDeploy();
        }
        VendorDeploy vendorDeploy = new VendorDeploy(vendorDeployResult.value());
        Vendor vendor = vendorMapper.selectByPrimaryKey(vendorDeploy.getVdId());
        vendorDeploy.setVendorCode(vendor.getVdCode());
        vendorDeploy.setVendorType(vendor.getVdType());
        return vendorDeploy;
    }

    /**
     * 根据businessId获取商户信息
     * 要么是公司商户，要么是个人商户
     * @param businessId 商户ID
     */
    public Map<String,String> getInfoByBusId(Integer businessId){
        Map<String,String> infos = new HashMap<>(2);
        Result<List<Company>> companyList = companyService.selectByBusId(businessId);
        if (!companyList.success()){
            return infos;
        }
        List<Company> companies = companyList.value();
        if (!companies.isEmpty()){
            Company company = companies.get(0);
            infos.put("phone", company.getPhone());
            infos.put("name", company.getName());
            return infos;
        }
        Result<List<PersonInfo>> listResult = personInfoService.selectByBusinessId(businessId);
        if (!listResult.success()){
            return infos;
        }
        List<PersonInfo> personInfos = listResult.value();
        if (personInfos.isEmpty()){
            return infos;
        }
        PersonInfo personInfo = personInfos.get(0);
        infos.put("phone", personInfo.getCellPhone() + "/" + personInfo.getPhone());
        infos.put("name", personInfo.getName());
        return infos;
    }

    @Override
    public Result<Integer> getBusinessId(String vdCode){
        Integer businessId = vendorDeployMapper.getBusIdByVdCode(vdCode);
        if(businessId == null){
            return Result.returnError("根据设备唯一编号["+vdCode+"]获取的商户id为空");
        }
        return Result.returnSuccess(businessId);
    }
}

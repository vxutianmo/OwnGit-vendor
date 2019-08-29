package com.runhang.sell.service.pointMagicBoxExchange.impl;

import com.runhang.framework.result.Result;
import com.runhang.sell.mapper.pointMagicBoxExchange.IntegralMemberMapper;
import com.runhang.sell.model.pointMagicBoxExchange.IntegralMember;
import com.runhang.sell.model.pointMagicBoxExchange.IntegralMemberExample;
import com.runhang.sell.model.shimao.common.BirthDay;
import com.runhang.sell.model.shimao.common.IdentifyCard;
import com.runhang.sell.model.shimao.common.RegisterAddress;
import com.runhang.sell.model.shimao.mbr.Address;
import com.runhang.sell.model.shimao.mbr.Member;
import com.runhang.sell.service.pointMagicBoxExchange.IntegralMemberService;
import com.runhang.sell.service.pointMagicBoxExchange.MemberConsumpRecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2019/1/14 19:15
 * @Version 1.0
 * @Description 会员信息Service
 **/
@Service
public class IntegralMemberServiceImpl implements IntegralMemberService {
    private Logger logger = LoggerFactory.getLogger(IntegralMemberServiceImpl.class);
    @Resource
    private IntegralMemberMapper integralMemberMapper;
    @Autowired
    private MemberConsumpRecordService memberConsumpRecordService;
    /**
     *@Author: fyb
     *@Date 2019/1/14_19:25
     *@Param [phone]
     *@Return com.runhang.framework.result.Result<com.runhang.sell.model.IntegralMember>
     *@Description: 根据手机号获取会员信息
     */
    @Override
    public Result<IntegralMember> getMemberMes(String phone, Integer busId){
        IntegralMemberExample example = new IntegralMemberExample();
        example.createCriteria().andPhoneEqualTo(phone).andDeletedEqualTo(0).andBusIdEqualTo(busId);
        List<IntegralMember> memberList = integralMemberMapper.selectByExample(example);
        if(memberList.size()!=1){
            return Result.returnError("获取会员信息有误！");
        }
        return Result.returnSuccess(memberList.get(0));
    }

    /**
     * Description: 添加会员信息
     *
     * author: wangyuxin
     * methodName: addMemberInfo
     * params: [result]
     * return: com.runhang.framework.result.Result
     * date: 2019/1/16 9:09
     **/
    @Override
    @Transactional
    public Result addMemberInfo(Member result, Integer busId) {
        try {
            IntegralMemberExample example = new IntegralMemberExample();
            example.createCriteria().andPhoneEqualTo(result.getCellphone()).andDeletedEqualTo(0).andBusIdEqualTo(busId);
            List<IntegralMember> memberList = integralMemberMapper.selectByExample(example);
            if(memberList.size() != 1){
                IntegralMember integralMember = new IntegralMember();
                integralMember.setBusId(busId);
                integralMember.setName(result.getName());
                integralMember.setPhone(result.getCellphone());
                integralMember.setGender(result.getGender());
                BirthDay birthday = result.getBirthday();
                if (birthday != null) {
                    integralMember.setBirthday(birthday.getYear() + "-" + birthday.getMonth() + "-" + birthday.getDay() + "");
                }
                integralMember.setEmail(result.getEmail());
                IdentifyCard idCard = result.getIdCard();
                if (idCard != null) {
                    integralMember.setIdentifyCardType(idCard.getType());
                    integralMember.setIdentifyCardNum(idCard.getId());
                }
                integralMember.setAddress(result.getAddress());
                RegisterAddress registerAddress = result.getRegisterAddress();
                if (registerAddress != null) {
                    integralMember.setRegisterAddress(registerAddress.getProvinceName() + "/" +
                            registerAddress.getCityName() + "/" + registerAddress.getDistrictName());
                }
                integralMember.setTelephone(result.getTelephone());
                integralMember.setQq(result.getQq());
                integralMember.setDegree(result.getDegree());
                List<Address> deliveryAddresList = result.getDeliveryAddress();
                if (deliveryAddresList != null) {
                    Address address = deliveryAddresList.get(0);
                    if (address != null) {
                        integralMember.setDeliveryAddress(address.getContact() + "-" +
                                address.getCellphone() + "-" +
                                address.getProvince() + "/" +
                                address.getCity() + "/" +
                                address.getDistrict() + "/" +
                                address.getAddress());
                    }
                }
                integralMember.setCarPlateNum(result.getCarplateNum());
                integralMember.setCarPlateNum2(result.getCarplateNum2());
                int i = integralMemberMapper.insertSelective(integralMember);
                if (i == -1) {
                    return Result.returnError("添加会员信息失败");
                }
            }
            return Result.returnSuccess();
        } catch (Exception e) {
            logger.error("添加会员信息失败，服务器异常: {}", e);
            return Result.returnError("添加会员信息失败，服务器异常：" + e);
        }
    }

    /**
     * Description: 更新会员信息——添加验证码
     *
     * author: wangyuxin
     * methodName: updateMemberToAddAuthCode
     * params: [phone, authCode]
     * return: com.runhang.framework.result.Result
     * date: 2019/1/18 15:34
     **/
    @Override
    public Result updateMemberToAddAuthCode(Integer busId,String phone, String authCode) {
        try {
            IntegralMemberExample example = new IntegralMemberExample();
            example.createCriteria().andPhoneEqualTo(phone).andDeletedEqualTo(0).andBusIdEqualTo(busId);
            List<IntegralMember> memberList = integralMemberMapper.selectByExample(example);
            if(!memberList.isEmpty()) {
                IntegralMember integralMember = memberList.get(0);
                integralMember.setAuthCode(authCode);
                integralMember.setUpdateTime(new Date());
                int i = integralMemberMapper.updateByPrimaryKeySelective(integralMember);
                if (i == -1) {
                    return Result.returnError("更新会员信息——添加验证码失败");
                }
                return Result.returnSuccess();
            }
            logger.error("根据手机号查询会员信息失败: {}", memberList.size());
            return Result.returnError("根据手机号查询会员信息失败");
        } catch (Exception e) {
            logger.error("更新会员信息——添加验证码失败，服务器异常: {}", e);
            return Result.returnError("更新会员信息——添加验证码失败，服务器异常：" + e);
        }
    }
}

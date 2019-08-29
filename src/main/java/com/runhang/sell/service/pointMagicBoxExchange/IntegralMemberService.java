package com.runhang.sell.service.pointMagicBoxExchange;

import com.runhang.framework.result.Result;
import com.runhang.sell.model.pointMagicBoxExchange.IntegralMember;
import com.runhang.sell.model.shimao.mbr.Member;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2019/1/14 19:14
 * @Version 1.0
 * @Description
 **/
public interface IntegralMemberService {
    /**
     *@Author: fyb
     *@Date 2019/1/14_19:25
     *@Param [phone]
     *@Return com.runhang.framework.result.Result<com.runhang.sell.model.IntegralMember>
     *@Description: 根据手机号获取会员信息·
     */
    Result<IntegralMember> getMemberMes(String phone, Integer busId);

    /**
     * Description: 添加会员信息
     *
     * author: wangyuxin
     * methodName: addMemberInfo
     * params: [result]
     * return: com.runhang.framework.result.Result
     * date: 2019/1/16 9:09
     **/
    Result addMemberInfo(Member result, Integer busId);

    /**
     * Description: 更新会员信息——添加验证码
     *
     * author: wangyuxin
     * methodName: updateMemberToAddAuthCode
     * params: [phone, authCode]
     * return: com.runhang.framework.result.Result
     * date: 2019/1/18 16:07
     **/
    Result updateMemberToAddAuthCode(Integer busId, String phone, String authCode);
}

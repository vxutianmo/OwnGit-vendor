package com.runhang.sell.mapper.pointMagicBoxExchange;

import com.runhang.sell.model.pointMagicBoxExchange.MemberConsumpRecord;
import com.runhang.sell.model.pointMagicBoxExchange.MemberConsumpRecordExample;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MemberConsumpRecordMapper {
    int countByExample(MemberConsumpRecordExample example);

    int deleteByExample(MemberConsumpRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberConsumpRecord record);

    int insertSelective(MemberConsumpRecord record);

    List<MemberConsumpRecord> selectByExample(MemberConsumpRecordExample example);

    MemberConsumpRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberConsumpRecord record, @Param("example") MemberConsumpRecordExample example);

    int updateByExample(@Param("record") MemberConsumpRecord record, @Param("example") MemberConsumpRecordExample example);

    int updateByPrimaryKeySelective(MemberConsumpRecord record);

    int updateByPrimaryKey(MemberConsumpRecord record);

    //获取商户会员当日兑换次数
    Integer getForRecord(@Param("limitType") Integer limitType,@Param("date") Date date,@Param("phone") String phone,@Param("busId") Integer busId);
}
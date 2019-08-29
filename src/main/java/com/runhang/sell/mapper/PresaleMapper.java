package com.runhang.sell.mapper;

import com.runhang.sell.model.Presale;
import com.runhang.sell.model.PresaleExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PresaleMapper {
    int countByExample(PresaleExample example);

    int deleteByExample(PresaleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Presale record);

    int insertSelective(Presale record);

    List<Presale> selectByExample(PresaleExample example);

    Presale selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Presale record, @Param("example") PresaleExample example);

    int updateByExample(@Param("record") Presale record, @Param("example") PresaleExample example);

    int updateByPrimaryKeySelective(Presale record);

    int updateByPrimaryKey(Presale record);

    List<Integer> getOrderIdsByCode(@Param("presaleOrderNumber") String presaleOrderNumber);
    List<Map<String,Object>> getPresale(@Param("openId") String openId, @Param("orderType") Integer orderType);
    Map<String,Object> getPresaleByCode(@Param("orderNumber") String orderNumber);
    List<Map<String,Object>> getVdInfoByCode(@Param("orderNumber") String orderNumber);
    List<Map<String,Object>> getGoodsInfoByCodeAndVdId(@Param("orderNumber") String orderNumber,@Param("vdId") Integer vdId);
    List<Integer> getVdIdsByCode(@Param("orderNumber") String orderNumber);
    List<Map<String,Object>> getGoodsInfo(@Param("orderNumber") String orderNumber,@Param("vdId") Integer vdId);
    List<Integer> checkPayStatus(@Param("orderNumber") String orderNumber);
    //已支付的预售订单编号集合
    List<String> getCodeByPaid();
    //未支付的预售订单编号集合
    List<String> getCodeByUnpaid();
}
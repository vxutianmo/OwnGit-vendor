package com.runhang.sell.mapper;

import com.runhang.sell.model.VendorAdvert;
import com.runhang.sell.model.VendorAdvertExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface VendorAdvertMapper {
    int countByExample(VendorAdvertExample example);

    int deleteByExample(VendorAdvertExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VendorAdvert record);

    int insertSelective(VendorAdvert record);

    List<VendorAdvert> selectByExample(VendorAdvertExample example);

    VendorAdvert selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VendorAdvert record, @Param("example") VendorAdvertExample example);

    int updateByExample(@Param("record") VendorAdvert record, @Param("example") VendorAdvertExample example);

    int updateByPrimaryKeySelective(VendorAdvert record);

    int updateByPrimaryKey(VendorAdvert record);

    /** 获得所有的售货机投放广告的信息
     * @return
     */
    List<VendorAdvert> selectAll();

    /** 根据售货机部署id获取广告信息
     * @param vdId
     * @return
     */
    List<VendorAdvert> selectAllByVdId(Integer vdId);

    /** 根据广告id获取售货机id
     * @param adId
     * @return
     */
    Integer getVdIdByAdId(Integer adId);
}
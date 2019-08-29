package com.runhang.sell.mapper;

import com.runhang.sell.model.Vendor;
import com.runhang.sell.model.VendorExample;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

public interface VendorMapper {
    int countByExample(VendorExample example);

    int deleteByExample(VendorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Vendor record);

    int insertSelective(Vendor record);

    List<Vendor> selectByExample(VendorExample example);

    Vendor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Vendor record, @Param("example") VendorExample example);

    int updateByExample(@Param("record") Vendor record, @Param("example") VendorExample example);

    int updateByPrimaryKeySelective(Vendor record);

    int updateByPrimaryKey(Vendor record);
    /**
     * 根据厂商id查询所有类别的方法
     * @return
     */
    Set<String> getAllTypeByManufacturerId(Integer manufacturerId);

    /** 根据售货机编号修改TrackNum
     * @param vendor
     * @return
     */
    int updateTrackNumByVdCode(Vendor vendor);

    /** 根据id获取售货机编码
     * @return
     */
    String getVdcodeById(Integer id);

    /** 获取所有的售货机唯一标识
     * @return
     */
    List<String> getVdCodeAll();

    List<String> getvdCodeNotOffline();

    /** 根据唯一编码获取id
     * @param vdCode
     * @return
     */
    Integer getIdByVdCode(String vdCode);

    /**
     * 根据设备唯一编号获取设备编号
     * @param vdCode
     * @return
     */
    String getDeviceNumberByVdCode(String vdCode);

}
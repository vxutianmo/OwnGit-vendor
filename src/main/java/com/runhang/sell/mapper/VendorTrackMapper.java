package com.runhang.sell.mapper;

import com.runhang.sell.model.VendorTrack;
import com.runhang.sell.model.VendorTrackExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface VendorTrackMapper {
    int countByExample(VendorTrackExample example);

    int deleteByExample(VendorTrackExample example);

    int deleteByPrimaryKey(Integer id);

    Integer insert(VendorTrack record);

    int insertSelective(VendorTrack record);

    List<VendorTrack> selectByExample(VendorTrackExample example);

    VendorTrack selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VendorTrack record, @Param("example") VendorTrackExample example);

    int updateByExample(@Param("record") VendorTrack record, @Param("example") VendorTrackExample example);

    int updateByPrimaryKeySelective(VendorTrack record);

    int updateByPrimaryKey(VendorTrack record);
    /**
     * @Description 根据货道id获取售货机id
     * @Param [trackId]
     * @return java.lang.Integer
     * @Author zhangyan
     * @Date 16:22 2018/8/21
     */
    Integer getVdIdByTrackId(Integer trackId);

    /** 根据售货机id查询id
     * @param vdId
     * @return
     */
    List<Integer> getIdByVdId(@Param("vdId") String vdId);

    /** 根据售货机id删除货道信息表数据
     * @param vdId
     * @return
     */
    int deleteByvdId(Integer vdId);


    /** 根据货道id获得货道编码
     * @param cId
     * @return
     */
    String getCodeBycId(Integer cId);
}
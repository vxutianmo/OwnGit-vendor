package com.runhang.sell.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.util.StringUtil;
import com.runhang.framework.result.Result;
import com.runhang.sell.mapper.*;
import com.runhang.sell.model.*;
import com.runhang.sell.service.VendorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2018/8/16 17:56
 * @Version 1.0
 * @Description
 **/
@Service
public class VendorServiceImpl implements VendorService {

    @Resource
    private VendorMapper vendorMapper;
    @Resource
    private VendorTrackDeployMapper vendorTrackDeployMapper;
    @Resource
    private VendorDeployMapper vendorDeployMapper;
    @Resource
    private VendorTrackMapper vendorTrackMapper;
    @Resource
    private OrderMapper orderMapper;
    @Resource
    private GoodsMapper goodsMapper;
    @Resource
    private ManufacturerMapper manufacturerMapper;
    @Resource
    private AccountMapper accountMapper;

    Logger log = LoggerFactory.getLogger(VendorServiceImpl.class);

    @Override
    public Result<Vendor> selectVendorMessageByVendorCode(String vendorCode) {
        VendorExample vendorExample = new VendorExample();
        VendorExample.Criteria criteria = vendorExample.createCriteria().andDeletedEqualTo(0);
        if (StringUtil.isNotEmpty(vendorCode)) {
            criteria.andVdCodeEqualTo(vendorCode);
        }
        List<Vendor> vendorList = vendorMapper.selectByExample(vendorExample);
        if (vendorList.isEmpty()) {
            return Result.returnError("SalesProcessServiceImpl selectVendorDeployByVendorId error : vendorList is null");
        }
        Vendor vendor = vendorList.get(0);
        if (vendor == null) {
            return Result.returnError("SalesProcessServiceImpl selectVendorDeployByVendorId error : vdId is null");
        }
        return Result.returnSuccess(vendor);
    }

    @Override
    public String insertVendorMessageByVendorCode(String vendorCode) {
        Integer ret1 = vendorMapper.getIdByVdCode(vendorCode);
        if (ret1 == null) {
            return "0";
        } else {
            return "1";
        }
    }

    @Override
    public String insertVendorMessageByVendor(String vdCode) {
        try {
            log.info("售货机初始化");
            String vdCodetp = vdCode.substring(0, 2);
            String vdType = "";
            String vdName = "";
            if ("00".equals(vdCodetp)) {
                vdType = "SOUP_MACHINE";
                vdName = "汤机默认名字" + (int) (1 + Math.random() * (100 - 1 + 1));
            } else if ("01".equals(vdCodetp)) {
                vdType = "NOODLE_MACHINE";
                vdName = "蒸面机默认名字" + (1 + Math.random() * (100 - 1 + 1));
            }
            Integer manufacturerId = manufacturerMapper.selectIdByName("欧特美");
            if(manufacturerId == null){
                Manufacturer manufacturer1 = new Manufacturer();
                manufacturer1.setName("欧特美");
                manufacturerMapper.insertSelective(manufacturer1);
                manufacturerId = manufacturer1.getId();
            }
            Vendor vendor = new Vendor();
            vendor.setManufacturerId(manufacturerId);
            vendor.setVdCode(vdCode);
            vendor.setVdName(vdName);
            vendor.setVdType(vdType);
            vendorMapper.insertSelective(vendor);
            Integer ret1 = vendorMapper.getIdByVdCode(vdCode);
            log.info("售货机初始化End=====售货机部署初始化=====");
            VendorDeploy vendorDeploy = new VendorDeploy();
            vendorDeploy.setVdId(ret1);
            vendor.setVdName(vdName);
            vendorDeploy.setStatus(0);
            vendorDeploy.setAlarmStatus(0);
            vendorDeploy.setAddress("无");
            vendorDeploy.setStartTime(new Date());
            vendorDeployMapper.insertSelective(vendorDeploy);
            log.info("售货机部署初始化End=====货道初始化=====");
            for (int i = 1; i <= 3; i++) {
                VendorTrack vendorTrack = new VendorTrack();
                vendorTrack.setVdId(ret1);
                vendorTrack.setTrackCode(String.valueOf(i));
                vendorTrack.setTrackType("null");
                vendorTrack.setMaxCount(0);
                vendorTrackMapper.insertSelective(vendorTrack);
                Integer trackId = vendorTrack.getId();
                Integer ret2 = vendorDeployMapper.getIdByVdId(ret1);
                VendorTrackDeploy vendorTrackDeploy = new VendorTrackDeploy();
                vendorTrackDeploy.setDeployId(ret2);
                vendorTrackDeploy.setStatus(0);
                vendorTrackDeploy.setCurrentCount(0);
                vendorTrackDeploy.setTrackId(trackId);
                vendorTrackDeployMapper.insertSelective(vendorTrackDeploy);
            }
            return "0";
        } catch (Exception e) {
            log.error(" insertVendorMessageByVendor error :"+ e.getMessage());
            e.printStackTrace();
            return "1";
        }
    }

    @Override
    public String insertVendorMessageByVendorStatus(String vdCode, String vdStatus, String Data1, String Data2, String Data3) {
        try {
            String vdCodetp = vdCode.substring(0, 2);
            Integer ret1 = vendorMapper.getIdByVdCode(vdCode);
            Integer ret2 = vendorDeployMapper.getIdByVdId(ret1);
            int Status = 0;
            if ("00".equals(vdCodetp)) {
                if ("00".equals(vdStatus)) {
                    Status = 1;//正常运行
                } else if ("04".equals(vdStatus)) {
                    Status = 4;//清洗
                } else if ("16".equals(vdStatus)) {
                    Status = 5;//故障
                } else if ("01".equals(vdStatus)) {
                    insertVendorMessageByOrder(vdCode, "大碗", ret2);
                } else if ("02".equals(vdStatus)) {
                    insertVendorMessageByOrder(vdCode, "中碗", ret2);
                } else if ("03".equals(vdStatus)) {
                    insertVendorMessageByOrder(vdCode, "小碗", ret2);
                }
            } else if ("01".equals(vdCodetp)) {
                if ("00".equals(vdStatus)) {
                    Status = 1;
                } else if ("04".equals(vdStatus)) {
                    Status = 6;//停止运行(停机)
                } else if ("16".equals(vdStatus)) {
                    Status = 5;
                }
            }
            log.info("更改状态");
            VendorDeploy vendorDeploy = vendorDeployMapper.selectByPrimaryKey(ret2);
            vendorDeploy.setStatus(Status);
            vendorDeployMapper.updateByPrimaryKey(vendorDeploy);

        } catch (Exception e) {
            log.error(" insertVendorMessageByVendorStatus error :"+ e.getMessage());
            e.printStackTrace();
        }
        return "1";
    }

    @Override
    @Transactional
    public String insertVendorMessageByOrder(String vdCode, String vdStatus, Integer ret) {
        try {
            log.info(" ====生成订单");
            int id = goodsMapper.seledtIdByName(vdStatus);
            VendorTrackDeploy vendorTrackDeploy = vendorTrackDeployMapper.selectByPrice(id,ret);
            String chid = vendorTrackMapper.getCodeBycId(vendorTrackDeploy.getTrackId());
            HashMap data = new HashMap();
            data.put("proid", id);
            data.put("chid", chid);
            data.put("toPrice", 0);
            data.put("name", vdStatus);
            data.put("sinPrice", 0);
            data.put("payType", 1);
            data.put("count", 1);
            HashMap salists = new HashMap();
            salists.put("salists", data);
            String detail = JSON.toJSONString(salists);
            Integer ret1 = vendorMapper.getIdByVdCode(vdCode);
            Integer ret2 = vendorDeployMapper.getIdByVdId(ret1);
            Integer busin = vendorDeployMapper.getBusin(ret2);
            Order order = new Order();
            Date day = new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
            String code = "N" + df.format(day) + (int) (1 + Math.random() * (100 - 1 + 1));
            order.setOrderCode(code);
            order.setOrderStartTime(new Date());
            order.setOrderEndTime(new Date());
            order.setOrderDetail(detail);
            order.setOrderTotal((long) 0);
            order.setOrderStatus("2");
            order.setPayAmount((long) 0);
            order.setPayStatus("1");
            order.setPayStartTime(new Date());
            order.setPayEndTime(new Date());
            order.setVdId(ret2);
            order.setOrderType("0");
            order.setIsEvaluation(0);
            orderMapper.insertSelective(order);
            Account account = new Account();
            account.setGoodsId(id);
            account.setTrackId(vendorTrackDeploy.getId());
            account.setBusinessId(busin);
            account.setOrderId(order.getId());
            account.setGoodsNumber(Integer.valueOf(1));
            account.setSinglePrice((long) 0);
            account.setTotalPrice((long) 0);
            accountMapper.insertSelective(account);
        } catch (Exception e) {
            log.error(" insertVendorMessageByOrder error :"+ e.getMessage());
            e.printStackTrace();
        }
        return "1";
    }

    @Override
    public String getDeviceNumber(String code){
//        String device =  vendorMapper.getDeviceNumberByVdCode(code);
//        if(StringUtils.isEmpty(device)){
//            device = code;
//        }
        String device = "30163529";//如果编号不是数字默认编号

        if(isInteger(code)){
            if(code.length()>=8){
                device = code.substring(code.length()-8);
            }
        }
        return device;
    }

    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }
}

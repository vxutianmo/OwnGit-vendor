package com.runhang.sell.entity.fresh.request;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;

/**
 * Description: 售货机温控信息
 *
 * @author: wangyuxin
 * @date: 2018/9/29 16:55
 **/
@Data
public class VendorTempControlMessage implements Serializable {

    public VendorTempControlMessage() {
    }

    public VendorTempControlMessage(Integer serialNumber,
                                    Integer temperatureControl,
                                    Integer temperature,
                                    Integer compressorRun,
                                    Integer compressorRest,
                                    String vendorCode) {
        this.serialNumber = serialNumber;
        this.temperatureControl = temperatureControl;
        this.temperature = temperature;
        this.compressorRun = compressorRun;
        this.compressorRest = compressorRest;
        this.vendorCode = vendorCode;
    }

    /**
     * 一台售货机中的压缩机数量
     */
    private Integer serialNumber;
    /**
     * 售货机温控模式
     */
    private Integer temperatureControl;
    /**
     * 售货机温控设置的温度
     */
    private Integer temperature;
    /**
     * 售货机的压缩机工作时长
     */
    private Integer compressorRun;
    /**
     * 售货机的压缩机休息时长
     */
    private Integer compressorRest;

    /**
     * 售货机编号
     */
    private String vendorCode;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}

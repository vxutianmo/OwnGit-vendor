package com.runhang.sell.entity.old.push;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.runhang.sell.entity.fresh.request.AppUpdate;
import com.runhang.sell.model.AppPushBody;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName AppUpdateMessage
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/11 0011 15:17
 * @Version 1.0
 * @Description App地址信息。
 **/
@Data
public class AppAddressMessage implements Serializable {

    /**DBApp对应地址*/
    @JSONField(serialzeFeatures= SerializerFeature.WriteMapNullValue ,name = "DBAddress")
    private String DBAddress;
    /**CloudAPP对应地址*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name = "CloudAddress")
    private String CloudAddress;
    /**UIAPP对应地址*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name = "UIAddress")
    private String UIAddress;
    /**HWAPP对应地址*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name = "HWAddress")
    private String HWAddress;
    /**UPAPP对应地址*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name = "UPAddress")
    private String UPAddress;
    /**DMAPP对应地址*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name = "DMAddress")
    private String DMAddress;
    /**更新个数*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name = "UpNotice")
    private Integer UpNotice;

    public AppAddressMessage(){

    }

    public AppAddressMessage(String DBAddress,
                             String CloundAddress,
                             String UIAddress,
                             String HWAddress,
                             String UPAddress,
                             String DMAddress,
                             Integer UpNotice){
        this.DBAddress = DBAddress;
        this.CloudAddress = CloundAddress;
        this.UIAddress = UIAddress;
        this.HWAddress = HWAddress;
        this.UPAddress = UPAddress;
        this.DMAddress = DMAddress;
        this.UpNotice = UpNotice;
    }

    public AppAddressMessage(AppUpdate appUpdate){
        this.DBAddress = appUpdate.getAddressMessage().getDbAddress();
        this.CloudAddress = appUpdate.getAddressMessage().getCloudAddress();
        this.UIAddress = appUpdate.getAddressMessage().getUiAddress();
        this.HWAddress = appUpdate.getAddressMessage().getHwAddress();
        this.UpNotice = appUpdate.getAddressMessage().getUpNotice();
        this.UPAddress = appUpdate.getAddressMessage().getUpdateAddress();
        this.DMAddress = appUpdate.getAddressMessage().getDmAddress();
    }

    public AppAddressMessage(AppPushBody body){
        this.DBAddress = body.getAddressMessage().getDbAddress();
        this.CloudAddress = body.getAddressMessage().getCloudAddress();
        this.UIAddress = body.getAddressMessage().getUiAddress();
        this.HWAddress = body.getAddressMessage().getHwAddress();
        this.UpNotice = body.getAddressMessage().getUpNotice();
        this.UPAddress = body.getAddressMessage().getUpdateAddress();
        this.DMAddress = body.getAddressMessage().getDmAddress();
    }

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
    @JSONField(name = "DBAddress")
    public String getDBAddress() {
        return DBAddress;
    }
    @JSONField(name = "CloudAddress")
    public String getCloudAddress() {
        return CloudAddress;
    }
    @JSONField(name = "UIAddress")
    public String getUIAddress() {
        return UIAddress;
    }
    @JSONField(name = "HWAddress")
    public String getHWAddress() {
        return HWAddress;
    }
    @JSONField(name = "DMAddress")
    public String getDMAddress() {
        return DMAddress;
    }
    @JSONField(name = "UPAddress")
    public String getUPAddress() {
        return UPAddress;
    }
    @JSONField(name = "UpNotice")
    public Integer getUpNotice() {
        return UpNotice;
    }

    //    @Override
//    public String toString() {
//        return "{\"DBAddress\":\"" + DBAddress + "\",\"CloudAddress\":\"" + CloudAddress + "\",\"UIAddress\":\"" +
//                UIAddress +"\","+ "\"HWAddress\":\"" + HWAddress + "\",\"UpNotice\":"
//                + UpNotice +"}";
//    }

}

package com.runhang.sell.push;

import com.runhang.sell.core.jpush.JDPush;
import com.runhang.sell.core.jpush.JiguangPushTwo;
import com.runhang.sell.entity.old.push.*;
import com.runhang.sell.service.impl.JiGuangServiceImpl;
import com.runhang.sell.service.impl.VendorDeployServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @ClassName PushService
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/10 0010 16:44
 * @Version 1.0
 * @Description 极光推送服务。
 **/
@Component
public class JPushService {

    @Autowired
    JiGuangServiceImpl jiGuangService;

    @Autowired
    JDPush jdPush;

    @Autowired
    VendorDeployServiceImpl vendorDeployService;

    public enum TYPE {

        /**
         * 默认为cloud app
         */
        DEFAULT("CLOUD_APP"),
        /**
         * update app
         */
        DOWNLOAD("UPDATE_APP");

        private String type;

        TYPE(String type) {
            this.type = type;
        }

        public TYPE setType(String type) {
            this.type = type;
            return this;
        }

        public String getType() {
            return type;
        }
    }


    /**
     * 推送所有设备
     * 会根据vendorCode查询推送ID，如果vendorCode = null，着推送所有设备
     * 因为vendorCode，type会被共享，这里添加同步，防止多线程同时访问
     * 同步方法对性能影响最大， 以后同步改在方法内部
     *
     * @param pushMsg 推送数据
     */

    public void jiguangPush(String pushMsg, JPushService.TYPE type) {
        jiguangPush(pushMsg, null, type);
    }

    public void jiguangPush(String pushMsg, String vendorCode, JPushService.TYPE type) {
        Map<String, Object> parm = new HashMap<>(16);
        String pushId = null;
        if (null != vendorCode) {
            parm.put("vendorCode", vendorCode);
            if (type.equals(TYPE.DEFAULT)) {
                pushId = jiGuangService.getPushIdByVendCode(vendorCode);
            } else if (type.equals(TYPE.DOWNLOAD)) {
                pushId = jiGuangService.getUpdatePushIdByVenCode(vendorCode);
            }
            if (null == pushId) {
                return;
            }
            List<String> registrationIds = new ArrayList<>();
            registrationIds.add(pushId);
            parm.put("registrationId", registrationIds);
        } else {
            List<String> pushIds = vendorDeployService.selectVendorDeployPushId(type);
            if (!pushIds.isEmpty()) {
                parm.put("registrationId", pushIds);
            }else {
                //如果没有查到推送ID，就不推送，防止后面推送到所有机器上
                return;
            }
        }
        parm.put("msg", pushMsg);
        parm.put("type", type);
        jdPush.jPushAndroid(parm);
    }

}

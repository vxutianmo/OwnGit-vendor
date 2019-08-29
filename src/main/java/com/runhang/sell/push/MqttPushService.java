package com.runhang.sell.push;

import com.runhang.sell.core.mqtt.MqttPushClient;
import com.runhang.sell.mapper.VendorMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName MqttService
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/10 0010 16:44
 * @Version 1.0
 * @Description Mqtt推送服务。
 **/
@Slf4j
@Component
public class MqttPushService{
    @Autowired
    private VendorMapper vendorMapper;

    @Autowired
    private MqttPushClient mqttPushClient;

    public enum TYPE {
        /**点对点推送*/
        PTP,
        /**广播推送*/
        RADIO
    }
    public enum To {
        /**推送到Cloud*/
        CLOUD,
        /**推送到update*/
        UPDATE
    }

    /**
     * @Author: zhangyan
     * @Date: 2018/10/25 9:53
     * @Param: [message, type, vendorCode, outLog]
     * @Return: void
     * @Description: 进行mqtt推送，选择type为RADIO可以不传售货机唯一编号
     *  to设置推送对应的app
     *  outLog参数选择性设置,建议设置此参数，方便后期
     */
    public void mqttPush(String message, MqttPushService.TYPE type, MqttPushService.To to, String vendorCode, String outLog){
        if(type == null){
            log.error(outLog == null ? "推送类型未选择，mqtt推送失败":outLog+"-推送类型未选择，mqtt推送失败");
        }
        if(to == null){
            log.error(outLog == null ? "推送app未选择，mqtt推送失败":outLog+"-推送app未选择，mqtt推送失败");
        }
        if(type.equals(TYPE.PTP)){
            if("".equals(vendorCode)||vendorCode == null){
               log.error(outLog == null ? "售货机编号为空，mqtt推送失败":outLog+"-售货机编号为空，mqtt推送失败");
                return;
            }
            if(to.equals(To.UPDATE)){
                sendStringMessage("u"+vendorCode,message);
            }else{
                sendStringMessage(vendorCode,message);
            }
            log.error(outLog == null?"使用mqtt推送的消息-->"+message:outLog+"-使用mqtt推送的消息-->"+message);
        }
        if(type.equals(TYPE.RADIO)){
            List<String> list = vendorMapper.getvdCodeNotOffline();
            if(list.size()==0){
                log.error(outLog == null?"没有售货机，mqtt推送失败":outLog+"-没有售货机，mqtt推送失败");
            }
            for (String s : list) {
                if(to.equals(To.UPDATE)){
                    sendStringMessage("u"+vendorCode,message);
                }else{
                    sendStringMessage(vendorCode,message);
                }
            }
            log.error(outLog == null?"使用mqtt推送的消息(推送"+list.size()+"次)-->"+message:outLog+"-使用mqtt推送的消息(共推送了"+list.size()+"个对象)-->"+message);
        }
    }

    //添加要发送的数据
    public void sendStringMessage(String newTopic,String message){
        try {
            //mqttApi.pushStringApi(this,topic,message);
            mqttPushClient.publish(newTopic,message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //添加要发送的数据
    public void sendByteMessage(String topic,byte[] message){
        try {
            //mqttApi.pushByteApi(this,topic,message);
            mqttPushClient.publish(topic,message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //订阅主题:只订阅不发布。
    public void mqttSubscribeTopic(String topic){
        try {
            //mqttApi.mqttSubscribeTopic(this,topic);
            mqttPushClient.subscribe(topic);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

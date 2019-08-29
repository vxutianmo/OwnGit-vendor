package com.runhang.sell.core.mqtt;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 * @ClassName PushCallback
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/22 0022 17:25
 * @Version 1.0
 * @Description TODO
 **/
@Slf4j
public class PushCallback implements MqttCallback {

    @Override
    public void connectionLost(Throwable cause) {
        // 连接丢失后，一般在这里面进行重连
        log.debug("连接断开，可以做重连");
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken token) {
        log.debug("deliveryComplete---------" + token.isComplete());

    }

    @Override
    public void messageArrived(String topic, MqttMessage message) throws Exception {
        // subscribe后得到的消息会执行到这里面
        log.debug("接收消息主题 : " + topic);
        log.debug("接收消息Qos : " + message.getQos());
        log.debug("接收消息内容 : " + new String(message.getPayload()));
    }

}

package com.runhang.sell.core.mqtt.core;
import org.eclipse.paho.client.mqttv3.MqttException;

/**
 * 备注：Mqtt接口。
 * Created by wangzhaosen on 2017/3/8.
 */
public class MqttApi {

    private MqttServer mqttServer = MqttServer.getInstance();

    /**
     *订阅主题。
     */
    public void mqttSubscribeTopic(MessageCallback messageCallback, String topic)throws MqttException {
        mqttServer.mqttSubscribeTopic(messageCallback,topic);
    }

    /**
     * 发送消息。
     */
    public void pushStringApi(MessageCallback messageCallback, String topic, String sendMessage) throws MqttException{
        mqttServer.sendStrMessage(messageCallback,topic,sendMessage);
    }

    /**
     *发送消息。
     */
    public void pushByteApi(MessageCallback messageCallback, String topic, byte[] sendMessage)throws MqttException{
        mqttServer.sendByteMessage(messageCallback,topic,sendMessage);
    }
}

package com.runhang.sell.core.mqtt.core;

import org.eclipse.paho.client.mqttv3.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangzhaosen on 2017/3/8.
 */
public class MqttCallbackImpl implements MqttCallback {

    private Map<String,MessageCallback> messageCallbackMap = new HashMap<>();

    private static MqttCallbackImpl instance = null;
    private MqttCallbackImpl(MessageCallback messageCallback, String topic){
        if(!messageCallbackMap.containsKey(topic)){
            messageCallbackMap.put(topic,messageCallback);
        }
    }
    public static MqttCallbackImpl getInstance(MessageCallback messageCallback, String topic){
        if(instance == null){
            instance = new MqttCallbackImpl(messageCallback,topic);
        }
        if(!instance.messageCallbackMap.containsKey(topic)){
            instance.messageCallbackMap.put(topic,messageCallback);
        }
        return instance;
    }

    @Override
    public void connectionLost(Throwable throwable) {
        System.out.println(throwable.toString()+"---connectionLost---");
    }

    @Override
    public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {
        messageCallbackMap.get(s).useCallbackMessage(mqttMessage);
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
        System.out.print(iMqttDeliveryToken.toString()+"---deliveryToken---");
    }
}

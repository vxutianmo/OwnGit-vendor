package com.runhang.sell.core.mqtt.core;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 * Created by wangzhaosen on 2017/3/8.
 */
public interface MessageCallback {
    void useCallbackMessage(MqttMessage message) throws MqttException;
}

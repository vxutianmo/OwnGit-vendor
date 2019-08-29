package com.runhang.sell.core.mqtt;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName MqttPushClient
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/22 0022 17:21
 * @Version 1.0
 * @Description TODO
 **/
@Slf4j
public class MqttPushClient {

    private MqttClient client;

    @Autowired
    MqttConfiguration mqttConfiguration;


    private void connect(){
        try {
            String serverUrl = MqttConfiguration.PRE_FIX + mqttConfiguration.getHost() + ":" + mqttConfiguration.getPort();
            log.error("---------------------mqtt:"+serverUrl+"---------------------------------------");
            client = new MqttClient(serverUrl, System.currentTimeMillis()+"", new MemoryPersistence());
            MqttConnectOptions options = new MqttConnectOptions();
            options.setCleanSession(false);
            options.setUserName(mqttConfiguration.getUsername());
            options.setPassword(mqttConfiguration.getPassword().toCharArray());
            options.setConnectionTimeout(MqttConfiguration.TIME_OUT);
            options.setKeepAliveInterval(MqttConfiguration.KEEP_ALIVE);
            options.setAutomaticReconnect(true);
            try {
                client.setCallback(new PushCallback());
                client.connect(options);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 发布，默认qos为0，非持久化
     * @param topic
     * @param pushMessage
     */
    public void publish(String topic,String pushMessage){
        subscribe(topic);
        publish(0, false, topic, pushMessage);
    }

    public void publish(String topic,byte[] pushMessage){
        subscribe(topic);
        publish(0, false, topic, pushMessage.toString());
    }
    /**
     * 发布
     * @param qos
     * @param retained
     * @param topic
     * @param pushMessage
     */
    public void publish(int qos,boolean retained,String topic,String pushMessage){
        MqttMessage message = new MqttMessage();
        message.setQos(qos);
        message.setRetained(retained);
        message.setPayload(pushMessage.toString().getBytes());
        MqttTopic mTopic = client.getTopic(topic);
        if(null == mTopic){
            log.error("topic not exist");
        }
        MqttDeliveryToken token;
        try {
            token = mTopic.publish(message);
            token.waitForCompletion();
        } catch (MqttPersistenceException e) {
            e.printStackTrace();
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

    /**
     * 订阅某个主题，qos默认为0
     * @param topic
     */
    public void subscribe(String topic){
        subscribe(topic,0);
    }

    /**
     * 订阅某个主题
     * @param topic
     * @param qos
     */
    public void subscribe(String topic,int qos){
        try {
            client.subscribe(topic, qos);
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

}

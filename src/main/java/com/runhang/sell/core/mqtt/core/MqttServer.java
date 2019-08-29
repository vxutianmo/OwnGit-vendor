package com.runhang.sell.core.mqtt.core;

import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangzhaosen on 2017/3/8.
 */
public class MqttServer {

    private MqttClient client;
    private MqttConnectOptions options;
    private List<String> subscribeTopics = new ArrayList<>();

    /**一下配置信息先写死，后期转移到yml配置文件中去*/
    private static final String USER_NAME = "admin";
    private static final String PASS_WORD = "password";
    private static final String NET_TYPE = "tcp";
    private static final String CLIENT_ID = "863424031077009";
    private static final String IP = "192.168.1.4";
    private static final String PORT = "61613";
    private static final int TIME_OUT = 10;
    private static final int ALIVE_INTERVAL = 20;

    private static MqttServer mqttServer = new MqttServer();
    private MqttServer(){
    }

    public static MqttServer getInstance(){
        if(mqttServer == null){
            mqttServer = new MqttServer();
        }
        return mqttServer;
    }

    /**
     * 新建连接客户端。
     */
    private void createClient()throws MqttException {
        String uri = NET_TYPE+"://"+IP+":"+PORT;
        client = new MqttClient(uri,CLIENT_ID,new MemoryPersistence());
    }

    /**
     * 新建连接选项。
     */
    private void createOptions(){
        options = new MqttConnectOptions();
        options.setCleanSession(true);
        options.setUserName(USER_NAME);
        options.setPassword(PASS_WORD.toCharArray());
        options.setConnectionTimeout(TIME_OUT);         // 设置超时时间
        options.setKeepAliveInterval(ALIVE_INTERVAL);   // 设置会话心跳时间
    }

    /**
     * 对新主题进行订阅。
     */
    public void mqttSubscribeTopic(MessageCallback messageCallback, String subscribeTopic)
            throws MqttException {
        if(client == null){
            createClient();
        }
        if(!client.isConnected()){
            if(options == null){
                createOptions();
            }
            while (!client.isConnected()){
                client.connect(options);
            }
        }
        if(!subscribeTopics.contains(subscribeTopic)){
            subscribeTopics.add(subscribeTopic);
            client.setCallback(MqttCallbackImpl.getInstance(messageCallback,subscribeTopic));
            client.subscribe(listToArray());
        }

    }

    private String[] listToArray(){
        String[] topicArray = new String[this.subscribeTopics.size()];
        for(int i=0;i<this.subscribeTopics.size();i++){
            topicArray[i] = this.subscribeTopics.get(i);
        }
        return topicArray;
    }
    /**
     * 发送字符串消息。
     */
    void sendStrMessage(MessageCallback messageCallback, String subscribeTopic, String sendMessage)
            throws MqttException{
        sendByteMessage(messageCallback,subscribeTopic,sendMessage.getBytes());
    }

    /**
     * 发送字节信息。
     */
    void sendByteMessage(MessageCallback messageCallback, String subscribeTopic, byte[] sendMessage)
            throws MqttException{
        mqttSubscribeTopic(messageCallback,subscribeTopic);
        MqttMessage message = new MqttMessage();
        message.setQos(1);
        message.setRetained(true);
        message.setPayload(sendMessage);
        MqttTopic mqttTopic = client.getTopic(subscribeTopic);
        MqttDeliveryToken token = mqttTopic.publish(message);
        while (!token.isComplete()) {
            token.waitForCompletion(1000);
        }
    }
}

package com.runhang.sell.core.mqtt;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @ClassName MqttConfiguration
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/22 0022 17:18
 * @Version 1.0
 * @Description MQTT配置信息。
 **/
@Component
@Setter
@Getter
@Data
public class MqttConfiguration {
    @Value("${runhang.mqtt.host}")
    private String host;
    @Value("${runhang.mqtt.port}")
    private String port;
    @Value("${runhang.mqtt.username}")
    private String username;
    @Value("${runhang.mqtt.password}")
    private String password;
    //采用默认数据
    public static int TIME_OUT = 30000;
    public static int KEEP_ALIVE = 3000;
    public static String PRE_FIX = "tcp://";

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}

package com.runhang.sell.core.mqtt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 *
 * @author huhongyuan
 * Date: 2018-09-26
 * Time: 13:46
 * Description:
 */

@Configuration
public class Mqtt {
    @Bean(initMethod = "connect")
    MqttPushClient getMqttClient() {
        return new MqttPushClient();
    }
}
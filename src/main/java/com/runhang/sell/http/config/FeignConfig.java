package com.runhang.sell.http.config;

import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @ClassName FeignConfig
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/9/17 15:00
 * @Version 1.0
 * @Description Feign配置信息。
 **/
public class FeignConfig {
    /**每隔100毫秒重试一次，最大重试时间为1秒，重试次数为5次*/
    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default(2000,SECONDS.toMillis(5),5);
    }

    @Bean
    public Request.Options options() {
        return new Request.Options(6000, 6000);
    }
}

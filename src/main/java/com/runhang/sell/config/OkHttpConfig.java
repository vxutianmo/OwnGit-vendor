package com.runhang.sell.config;

import com.runhang.framework.plugins.OkHttpPlugin;
import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 *
 * @author huhongyuan
 * Date: 2018-11-21
 * Time: 11:10
 * Description:
 */

@Configuration
public class OkHttpConfig {
    @Bean
    public OkHttpClient init() {
        return OkHttpPlugin.init();
    }
}
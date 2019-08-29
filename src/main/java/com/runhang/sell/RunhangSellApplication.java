package com.runhang.sell;

import com.runhang.sell.netty.NettyServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName RunhangServiceInterfaceApplication
 * @Description
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/7/14 15:09
 * @Version 1.0
 **/
@MapperScan(value = {"com.runhang.sell.mapper","com.runhang.base.mapper"})
@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = {"com.runhang.sell","com.runhang.base"})
@EnableEurekaClient
@EnableFeignClients
@EnableDiscoveryClient
@EnableHystrixDashboard
@EnableSwagger2
public class RunhangSellApplication implements CommandLineRunner {


    //vue fetch跨域访问
    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*"); // 1允许任何域名使用
        corsConfiguration.addAllowedHeader("*"); // 2允许任何头
        corsConfiguration.addAllowedMethod("*"); // 3允许任何方法（post、get等）
        return corsConfiguration;
    }

    //vue fetch跨域访问
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig()); // 4
        return new CorsFilter(source);
    }


    public static void main(String[] args) {
        SpringApplication.run(RunhangSellApplication.class, args);
    }
    @Override
    public void run(String... strings) {
        NettyServer n = new NettyServer();
        n.run();
    }
}

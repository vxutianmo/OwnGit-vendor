package com.runhang.sell.config;

import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

/**
 * Created by diligentkong  in 10:49 2018/7/12 0012
 */
@Component
@Slf4j
public class WechatMpConfig {


    @Bean
    public WxMpService wxMpService(){
        WxMpService wxMpService = new WxMpServiceImpl();
        wxMpService.setWxMpConfigStorage(wxMpConfigStorage());
        return wxMpService;
    }

    @Bean
    public WxMpConfigStorage wxMpConfigStorage(){
        WxMpInMemoryConfigStorage wxMpConfigStorage = new WxMpInMemoryConfigStorage();

        //TODO
        // 山东润航番哆啦星球(线下)
        wxMpConfigStorage.setAppId("wxabc0c03b2b2a8960");
        wxMpConfigStorage.setSecret("8ceb08455c26c6b07b69f093ab249623");


        //TODO
        // 山东润航番哆啦（线上）
//        wxMpConfigStorage.setAppId("wx34ef79f920f100cf");
//        wxMpConfigStorage.setSecret("23c7beb739de8beb45253463c4bdffd4");

        return wxMpConfigStorage;
    }



}

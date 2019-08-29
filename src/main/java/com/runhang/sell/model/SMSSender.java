package com.runhang.sell.model;

import com.runhang.base.model.core.Sender;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
@RefreshScope
@ConfigurationProperties(prefix = "sender")
public class SMSSender extends Sender {

}
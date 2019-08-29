package com.runhang.sell.vo.lipstick;

import lombok.Data;

import java.util.Date;

@Data
public class GameOrderDetail {
    private String tradeNo = "";
    private String payState = "";
    private int sum = 0;
    private Double integ = 0d;
    private String tradeState = "";
    private String venName = "";
    private String venType = "";
    private String venAdd = "";
    private Date startTime = null;
    private Date endTime = null;
    private String orderState;
    private String gameState;
    private Integer type;
}

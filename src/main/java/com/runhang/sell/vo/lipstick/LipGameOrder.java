package com.runhang.sell.vo.lipstick;

import lombok.Data;

import java.util.Date;

@Data
public class LipGameOrder {
    private String orderNo;
    private String venName;
    private String proName;
    private Date startTime;
    private Double price;
}

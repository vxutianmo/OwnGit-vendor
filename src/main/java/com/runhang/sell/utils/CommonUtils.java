package com.runhang.sell.utils;


import java.util.Random;

public class CommonUtils {

    //生成支付订单号
    public static String genPayCode(){
        String first = TimeUtils.getNoDate();
        String second =getRandomFive();
        String third = getRandomTwo();

        return first + second + third;
    }

    public static String getRandomFive(){
        Random random = new Random();

        int ranInt = random.nextInt(10000) + 10000;

        return ""+ranInt;
    }

    public static String getRandomTwo(){
        Random random = new Random();

        int ranInt = random.nextInt(90) + 10;

        return ""+ranInt;
    }
}

package com.runhang.sell.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by bobo on 2017/7/18.
 */
public class TimeUtils {
    public static Date getDefaultTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dt = null;
        try{
            dt = sdf.parse("1970-01-01 00:00:00");
        }catch(Exception e){
            e.printStackTrace();
        }

        if(dt == null){
            dt = new Date();
        }

        return dt;
    }

    /**
     * 获取当前时间的格式化文本
     * 17718101013
     * @return 返回时间格式化文本
     */
    public static String getNowDateCode(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyMdHms");

        return sdf.format(new Date());
    }

    public static String getNowDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return sdf.format(new Date());
    }

    public static Date StrTimeFormat(String strTime){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dt = null;
        try{
            dt = sdf.parse(strTime);
        }catch(Exception e){
            e.printStackTrace();
        }

        if(dt == null){
            dt = new Date();
        }

        return dt;
    }

    public static String timeFormat(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return sdf.format(date);
    }
    //获取前一天的日期
    public static Date getNextDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        date = calendar.getTime();
        return date;
    }

    public static String getNoDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

        return sdf.format(new Date());
    }
}

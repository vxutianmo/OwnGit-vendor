package com.runhang.sell.utils;

import java.security.MessageDigest;

/**
 * @ClassName MD5Utils
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/7/25 10:42
 * @Version 1.0
 * @Description MD5加密解密工具类。
 **/
public class MD5Utils {

    private final static String[] hexDigits = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};

    /**
      *@Author wangzhaosen@runhangtech.com
      *@Date 2018/8/11 0011 9:44
      *@Param
      *@return
      *@Description 把inputString加密
      **/
    public static String md5(String inputStr){
        return encodeByMD5(inputStr);
    }

    /**
     * 验证输入的编码是否正确
     * @param encryptionCode 真正的加密码（加密后的真密码）
     * @param inputString 输入的字符串
     * @return 验证结果，boolean类型
     */
    public static boolean authenticateCode(String encryptionCode,String inputString){
        if(encryptionCode.equals(encodeByMD5(inputString))){
            return true;
        }else{
            return false;
        }
    }

    /**
      *@Author wangzhaosen@runhangtech.com
      *@Date 2018/8/11 0011 9:49
      *@Param
      *@return
      *@Description 对字符串进行MD5编码
      **/
    private static String encodeByMD5(String originString){
        if (originString!=null) {
            try {
                //创建具有指定算法名称的信息摘要
                MessageDigest md5 = MessageDigest.getInstance("MD5");
                //使用指定的字节数组对摘要进行最后更新，然后完成摘要计算
                byte[] results = md5.digest(originString.getBytes());
                //将得到的字节数组变成字符串返回
                String result = byteArrayToHexString(results);
                return result;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 轮换字节数组为十六进制字符串
     * @param b 字节数组
     * @return 十六进制字符串
     */
    private static String byteArrayToHexString(byte[] b){
        StringBuffer resultSb = new StringBuffer();
        for(int i=0;i<b.length;i++){
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }

    /**
      *@Author wangzhaosen@runhangtech.com
      *@Date 2018/8/11 0011 9:45
      *@Param
      *@return
      *@Description 将一个字节转化成十六进制形式的字符串
      **/
    private static String byteToHexString(byte b){
        int n = b;
        if(n<0){
            n=256+n;
        }
        int d1 = n/16;
        int d2 = n%16;
        return hexDigits[d1] + hexDigits[d2];
    }

    public static void main(String[] args){
        String message = encodeByMD5("123");
        System.out.print(authenticateCode(encodeByMD5("123"),"123"));
        System.out.println(message);
    }
}

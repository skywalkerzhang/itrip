package org.hzdb.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Utils {

    public static String enctypeCode(String oldWord){
        StringBuilder newWord=new StringBuilder();
        try {
            //1 获取加密对象
            MessageDigest md5=MessageDigest.getInstance("md5");
            //2 解决原始数据为byte数组
            byte [] bs =  md5.digest(oldWord.getBytes());
            //3 设置加密规则
            //e10adc3949ba59abbe56e057f20f883e
            //e1adc3949ba59abbe56e057f2f883e
            //e10adc3949ba59abbe56e057f20f883e
                String temp = "";
                for(byte b:bs){
                    int a = b;
                    if(a<0){
                        a+=256;
                    }
                    temp=Integer.toHexString(a);
                    if(temp.length()<2){
                        temp="0"+temp;
                    }
                    newWord.append(temp);
                }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }


        return newWord.toString();
    }


}

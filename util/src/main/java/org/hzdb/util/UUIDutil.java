package org.hzdb.util;

import java.util.UUID;

public class UUIDutil {// GUID 一个系统下UUID 随机字符串 ，3000年不重复

    public  static String getUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }


     public static String getUUID(int length){
        return UUID.randomUUID().toString().substring(0,length);
    }



}

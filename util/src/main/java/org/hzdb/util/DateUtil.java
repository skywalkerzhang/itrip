package org.hzdb.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {


            public static String getDateString(Date date,String rule){
                SimpleDateFormat sdf = new SimpleDateFormat(rule);
                return sdf.format(date);
            }


            public static Date getDateByString(String time){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
                try {
                    return sdf.parse(time);
                } catch (ParseException e) {
                    e.printStackTrace();
                    return new Date();
                }
            }


}

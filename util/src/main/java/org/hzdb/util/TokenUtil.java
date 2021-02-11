package org.hzdb.util;

import org.hzdb.beans.pojo.entity.ItripUser;
import org.hzdb.beans.pojo.vo.Token;

import java.util.Date;

/**
 *  对token的CURD
 */
public class TokenUtil {


    /**  增  删 redis  改  查
     *  Token的生成
     *          时间 PC: 2小时
     *          移动端： 无限
     */

    public static Token getToke(ItripUser user,String src){
        Token token = new Token();
        Date d=new Date();
        token.setGenTime(d.getTime());
        if(src.equalsIgnoreCase("PC")) {
            token.setExpTime(token.getGenTime() + 3600 * 2*1000);
        }else{
            token.setExpTime(Long.MAX_VALUE);
        }
        //token.setToken("token:"+"来源-用户信息加密-ID-6位随机码-时间戳");
        token.setToken("token:"+src+
                "-"+Md5Utils.enctypeCode(user.getUsercode())+
                "-"+user.getId()+
                "-"+UUIDutil.getUUID(6)+
                "-"+DateUtil.getDateString(d,"yyyyMMddHHmmss"));
        return token;
    }



}

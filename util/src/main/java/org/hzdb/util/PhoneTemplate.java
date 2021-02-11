package org.hzdb.util;

import com.cloopen.rest.sdk.CCPRestSmsSDK;

/**
 * 短信工具类
 */
public class PhoneTemplate extends CCPRestSmsSDK {


        public PhoneTemplate(String url,String port,String sid,String token,String appid){
            super.init(url,port);
            super.setAccount(sid,token);
            super.setAppId(appid);
        }


}

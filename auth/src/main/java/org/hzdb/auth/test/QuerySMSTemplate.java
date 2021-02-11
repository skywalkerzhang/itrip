package org.hzdb.auth.test;

import com.cloopen.rest.sdk.BodyType;
import com.cloopen.rest.sdk.CCPRestSmsSDK;

import java.util.HashMap;
import java.util.Set;



public class QuerySMSTemplate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//生产环境请求地址：app.cloopen.com
		String serverIp = "app.cloopen.com";
		//请求端口
		String serverPort = "8883";
		//主账号,登陆云通讯网站后,可在控制台首页看到开发者主账号ACCOUNT SID和主账号令牌AUTH TOKEN
		String accountSId = "8a216da864f9f15b01650d047de50c94";
		String accountToken = "44ad5f630e864fc7ae6083f90a0bdf25";
		//请使用管理控制台中已创建应用的APPID
		String appId = "8a216da864f9f15b01650d047e300c9a";

		CCPRestSmsSDK sdk = new CCPRestSmsSDK();


		sdk.init(serverIp, serverPort);
		sdk.setAccount(accountSId, accountToken);
		sdk.setAppId(appId);
		sdk.setBodyType(BodyType.Type_JSON);
		String to = "18395945990";
		String templateId= "1";
		String[] datas = {"5656","2"};
		sdk.sendTemplateSMS(to,templateId,datas);
		//HashMap<String, Object> result = sdk.sendTemplateSMS(to,templateId,datas);

	}

}

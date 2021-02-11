package org.hzdb.trade.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class WxPayController {

        //1 创建订单 发请求给微信  1 构建请求参数  map  转换xml  s 统一下单API
    @RequestMapping("wxbuy")
        public Object sendMsgToWx(String oid) throws Exception {
        Map<String, String> data = new HashMap<String, String>();
        data.put("body", "爱旅行三天两夜玩游戏");
        data.put("appid", "wxab8acb865bb1637e");
        data.put("mch_id", "11473623");
        data.put("nonce_str", WXPayUtil.generateNonceStr());

        data.put("out_trade_no", WXPayUtil.generateNonceStr());
        data.put("fee_type", "CNY");
        data.put("total_fee", "1");
        data.put("spbill_create_ip", "123.12.12.123");
        data.put("notify_url", "http://ir4hys.natappfree.cc/trade/wxpay/notify");
        data.put("trade_type", "NATIVE");  // 此处指定为扫码支付
       String qianming= WXPayUtil.generateSignedXml(data,"2ab9071b06b9f739b950ddb41db2690d");
       String reviceMsg =  WXPayRequest.sendMsgToWeiXin("https://"+WXPayConstants.DOMAIN_API+WXPayConstants.UNIFIEDORDER_URL_SUFFIX,qianming);
       System.out.println(reviceMsg);
       return WXPayUtil.xmlToMap(reviceMsg);

    }

    @PostMapping("wxpay/notify")
    public void wxnotify(HttpServletRequest request, HttpServletResponse response) throws Exception {
             String resultfromWx= IOUtils.toString(request.getInputStream(),"utf-8");
            Map<String,String> map= WXPayUtil.xmlToMap(resultfromWx);
            System.out.println(resultfromWx);
            if(map.get("return_code").equals("SUCCESS")&&map.get("result_code").equals("SUCCESS")){
                //支付成功
                System.out.println("先判断是否已经处理过，如果没有处理就数据库操作");
                response.getWriter().write("<xml>\n" +
                       "  <return_code><![CDATA[SUCCESS]]></return_code>\n" +
                       "  <return_msg><![CDATA[OK]]></return_msg>\n" +
                       "</xml>");
            }
    // 主动查询是否

    }



}

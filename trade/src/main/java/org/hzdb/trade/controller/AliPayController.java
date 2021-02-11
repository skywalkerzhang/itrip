package org.hzdb.trade.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradePagePayModel;
import com.alipay.api.domain.AlipayTradePayModel;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradePayRequest;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.alipay.api.response.AlipayTradePagePayResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@RestController
public class AliPayController {
            @RequestMapping("buy")
            public void showOrder( HttpServletRequest request, HttpServletResponse response) throws Exception {
                // 发送请求给阿里，然后将阿里的页面显示给用户
                if(request.getParameter("tradeno")!=null) {
                    System.out.println(request.getParameter("tradeno"));
                    // 商户订单号，商户网站订单系统中唯一订单号，必填
                    String out_trade_no = request.getParameter("tradeno");
                    // 订单名称，必填
                    String subject = "ilx";
                    // 付款金额，必填
                    String total_amount = "1000";
                    // 商品描述，可空
                    String body = "threeday";
                    // 超时时间 可空
                    String timeout_express = "2m";
                    // 销售产品码 必填 APP  手机  电脑 。。。
                    String product_code = "FAST_INSTANT_TRADE_PAY";
                    /**********************/
                    // SDK 公共请求类，包含公共请求参数，以及封装了签名与验签，开发者无需关注签名与验签
                    //调用RSA签名方式
                    AlipayClient client = new DefaultAlipayClient(AlipayConfig.URL, AlipayConfig.APPID, AlipayConfig.RSA_PRIVATE_KEY, AlipayConfig.FORMAT, AlipayConfig.CHARSET, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.SIGNTYPE);
                    //手机支付
                    AlipayTradeWapPayRequest alipay_request = new AlipayTradeWapPayRequest();

                    // 封装请求支付信息  JSON 格式
                    AlipayTradeWapPayModel model = new AlipayTradeWapPayModel();
                    model.setOutTradeNo(out_trade_no);
                    model.setSubject(subject);
                    model.setTotalAmount(total_amount);
                    model.setBody(body);
                    model.setTimeoutExpress(timeout_express);
                    model.setProductCode(product_code);
                    alipay_request.setBizModel(model);
                    // 设置异步通知地址
                    alipay_request.setNotifyUrl(AlipayConfig.notify_url);
                    // 设置同步地址
                    alipay_request.setReturnUrl(AlipayConfig.return_url);

                    // form表单生产
                    String form = "";
                    try {
                        // 调用SDK生成表单  前端页面
                        form = client.pageExecute(alipay_request).getBody();
                        System.out.println(form);

                        response.setContentType("text/html");
                        response.getWriter().write(form);//直接将完整的表单html输出到页面

                        response.getWriter().flush();
                        response.getWriter().close();
                    } catch (AlipayApiException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }}
    @RequestMapping("buy2")
    public void showOrder2( HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 发送请求给阿里，然后将阿里的页面显示给用户
        if(request.getParameter("tradeno")!=null) {
            System.out.println(request.getParameter("tradeno"));
            // 商户订单号，商户网站订单系统中唯一订单号，必填
            String out_trade_no = request.getParameter("tradeno");
            // 订单名称，必填
            String subject = "ilx";
            // 付款金额，必填
            String total_amount = "1000";
            // 商品描述，可空
            String body = "threeday";
            // 超时时间 可空
            String timeout_express = "2m";
            // 销售产品码 必填 APP  手机  电脑 。。。
            String product_code = "FAST_INSTANT_TRADE_PAY";
            /**********************/
            // SDK 公共请求类，包含公共请求参数，以及封装了签名与验签，开发者无需关注签名与验签
            //调用RSA签名方式
            AlipayClient client = new DefaultAlipayClient(AlipayConfig.URL, AlipayConfig.APPID, AlipayConfig.RSA_PRIVATE_KEY, AlipayConfig.FORMAT, AlipayConfig.CHARSET, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.SIGNTYPE);
            //手机支付
            AlipayTradePagePayRequest alipay_request = new AlipayTradePagePayRequest();

            // 封装请求支付信息  JSON 格式
            AlipayTradePagePayModel model = new AlipayTradePagePayModel();
            model.setOutTradeNo(out_trade_no);
            model.setSubject(subject);
            model.setTotalAmount(total_amount);
            model.setBody(body);
            model.setTimeoutExpress(timeout_express);
            model.setProductCode(product_code);
            alipay_request.setBizModel(model);
            // 设置异步通知地址
            alipay_request.setNotifyUrl(AlipayConfig.notify_url);
            // 设置同步地址
            alipay_request.setReturnUrl(AlipayConfig.return_url);

            // form表单生产
            String form = "";
            try {
                // 调用SDK生成表单  前端页面
                form = client.pageExecute(alipay_request).getBody();
                System.out.println(form);

                response.setContentType("text/html");
                response.getWriter().write(form);//直接将完整的表单html输出到页面

                response.getWriter().flush();
                response.getWriter().close();
            } catch (AlipayApiException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }}

    /**
         * 用户名：、。、、、    name ="username'      String name=
     *     密码：。。。。。   id=     name="pwd"  123
     *     确认密码：。。。。。id     name="pwd"  456      123,456
     */

    //异步通知    25小时 发8次  99.9999999%  业务处理时需要判断是否已经处理过 success
                @PostMapping("alinotify")
                public void  alinotify(HttpServletRequest request ,HttpServletResponse response) throws IOException, AlipayApiException {
                    //获取支付宝POST过来反馈信息
                    Map<String,String> params = new HashMap<String,String>();
                    Map<String,String[]> requestParams = request.getParameterMap();
                    for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
                        String name = (String) iter.next();
                        String[] values = (String[]) requestParams.get(name);
                        String valueStr = "";
                        for (int i = 0; i < values.length; i++) {
                            valueStr = (i == values.length - 1) ? valueStr + values[i]
                                    : valueStr + values[i] + ",";
                        }

                        //乱码解决，这段代码在出现乱码时使用
                       // valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
                        params.put(name, valueStr);
                    }
                    System.out.println("异步结果信息，可能出现多次："+params);

                    boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.CHARSET, AlipayConfig.SIGNTYPE); //调用SDK验证签名

                    //——请在这里编写您的程序（以下代码仅作参考）——

	/* 实际验证过程建议商户务必添加以下校验：
	1、需要验证该通知数据中的out_trade_no是否为商户系统中创建的订单号，
	2、判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额），
	3、校验通知中的seller_id（或者seller_email) 是否为out_trade_no这笔单据的对应的操作方（有的时候，一个商户可能有多个seller_id/seller_email）
	4、验证app_id是否为该商户本身。
	*/
                    if(signVerified) {//验证成功
                        //商户订单号
                        String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");

                        //支付宝交易号
                        String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");

                        //交易状态
                        String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"),"UTF-8");

                        if(trade_status.equals("TRADE_FINISHED")){
                            //判断该笔订单是否在商户网站中已经做过处理
                            //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                            //如果有做过处理，不执行商户的业务程序
                            //交易结束，修改状态
                            //注意：
                            //退款日期超过可退款期限后（如三个月可退款），支付宝系统发送该交易状态通知
                        }else if (trade_status.equals("TRADE_SUCCESS")){
                            //判断该笔订单是否在商户网站中已经做过处理
                            //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                            //如果有做过处理，不执行商户的业务程序
                            System.out.println("先要进行判断，判断订单是否已经处理过。");// 4 / 10
                            System.out.println("此处进行数据库库存修改。修改状态");
                            System.out.println("添加记录");
                            //注意：
                            //付款完成后，支付宝系统发送该交易状态通知
                        }
                        response.getWriter().write("success2");

                    }else {//验证失败
                        response.getWriter().write("fail");

                        //调试用，写文本函数记录程序运行情况是否正常
                        //String sWord = AlipaySignature.getSignCheckContentV1(params);
                        //AlipayConfig.logResult(sWord);
                    }
                }

                //同步通知    只发1次  商家可能收不到。不能进行业务处理。页面跳转
             @GetMapping("/alireturnurl")
            public void  reutrlurl(HttpServletResponse response,HttpServletRequest request) throws IOException, AlipayApiException {
                 //获取支付宝GET过来反馈信息
                 Map<String,String> params = new HashMap<String,String>();
                 Map<String,String[]> requestParams = request.getParameterMap();
                 for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
                     String name = (String) iter.next();
                     String[] values = (String[]) requestParams.get(name);
                     String valueStr = "";
                     for (int i = 0; i < values.length; i++) {
                         valueStr = (i == values.length - 1) ? valueStr + values[i]
                                 : valueStr + values[i] + ",";
                     }
                     //乱码解决，这段代码在出现乱码时使用
                   valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
                     params.put(name, valueStr);
                 }
                 System.out.println("同步结果信息，只出现一次："+params);

                 boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.CHARSET, AlipayConfig.SIGNTYPE); //调用SDK验证签名

                 //——请在这里编写您的程序（以下代码仅作参考）——
                 if(signVerified) {
                     //商户订单号
                     String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");

                     //支付宝交易号
                     String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");

                     //付款金额
                     String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"),"UTF-8");
                        //如果结果为真就跳到成功页面
                     response.sendRedirect("https://www.baidu.com?name=xxx");
                 }else {
                     response.sendRedirect("https://www.163.com?name=yyy");
                 }


            }

}

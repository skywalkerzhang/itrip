package org.hzdb.auth.test;

import javax.mail.Message;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class TestMail {

    public static void main(String[] args) throws Exception {

            //邮件发送服务器对象
        /**
         * (particularly
         *      mail.store.protocol,  协议
                 mail.transport.protocol,协议
                mail.host,  服务器主机
                mail.user,  使用服务器人
               mail.from   发的人
         */

        Properties prop =new Properties();
        prop.setProperty("mail.transport.protocol","smtp");
        prop.setProperty("mail.host","smtp.qq.com");
        prop.setProperty("mail.user","530677568@qq.com");
        prop.setProperty("mail.from","530677568@qq.com");
        Session session= Session.getInstance(prop);
        //发送对象
        Transport ts = session.getTransport();
        ts.connect("530677568@qq.com","shslgjttjphnbhhf");
        //邮件对象
        Message msg = new MimeMessage(session);
        // 添加联系人
        msg.addRecipient(Message.RecipientType.TO,new InternetAddress("940875538@qq.com"));
        msg.setText("你好，激活已经发送，请尽快激活，欢迎注册我们网站，一路顺风。。。你的码是：xxxyyyzzz");
        msg.setSubject("这是来自爱旅行官方网站的激活邮件，不需要回复");
        ts.sendMessage(msg,msg.getAllRecipients());
        ts.close();



    }

}

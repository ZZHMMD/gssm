package com.demo.util;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public final class MailUtil {

    private String username;

    private String password;

    private String hostname;

    public MailUtil(String username,String password,String hostname){
       this.username = username;
       this.password = password;
       this.hostname = hostname;
    }

    public void activeUser(String to,int id,String code) throws Exception {

        Properties props = new Properties();
        props.put("mail.smtp.host",hostname);
        props.put("mail.smtp.auth",true);

        Session session = Session.getDefaultInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(username));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(to,"人事大佬"));
        //主题
        message.setSubject("欢迎您注册闪电公司会员");
        //正文
        message.setContent("<h1>来自闪电公司的激活邮件，点击链接激活账号：</h1><br/><h3><a href='http://localhost:8080/gssm/active?id="+id+"&code="+code+"'>点击此处激活账号</a></h3>", "text/html;charset=utf-8");
        // 3.发送激活邮件
        Transport.send(message);
    }

}
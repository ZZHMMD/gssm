package mail;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public final class MailUtil {

    // 邮件发送者地址
    private static final String SenderEmailAddr = "15160000933@163.com";
    // 邮件发送者邮箱用户
    private static final String SMTPUserName = "15160000933@163.com";
    // 邮件发送者邮箱密码
    private static final String SMTPPassword = "Zeng1234";
    // 邮件发送者邮箱SMTP服务器
    private static final String SMTPServerName = "mail.huahuayu.com.cn";
    // 传输类型
    private static final String TransportType = "smtp";
    // 属性
    private static Properties props;

    private MailUtil() {}

    /*静态构造器*/
    static {
        MailUtil.props = new Properties();
        // 存储发送邮件服务器的信息
        MailUtil.props.put("mail.smtp.host", MailUtil.SMTPServerName);
        // 同时通过验证
        MailUtil.props.put("mail.smtp.auth", "true");
        MailUtil.props.put("mail.smtp.starttls.enable","true");
        //开启Debug调试
        MailUtil.props.setProperty("mail.debug","false");
    }

    public static void activeUser(String to,String code) throws Exception {
        // 1.创建连接对象
        Properties props = new Properties();
        props.put("mail.smtp.host", "mail.huahuayu.com.cn");
//        props.put("mail.smtp.host", "smtp.163.com");
        props.put("mail.smtp.auth", "true");
        Session session = Session.getDefaultInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("root@huahuayu.com.cn", "");
            }
        });
        // 2.创建邮件对象
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("root@huahuayu.com.cn"));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(to,"客户经理"));
        //主题
        message.setSubject("欢迎你的注册");
        //正文
        message.setContent("<h1>来自星云系统的激活邮件，点击链接激活账号：</h1><h3><a href='http://localhost:8081/active?code="+code+"'>http://localhost:8081/active?code="+code+"</a></h3>", "text/html;charset=utf-8");
        // 3.发送激活邮件
        Transport.send(message);
    }

    /**
     * 发送邮件
     * @param emailAddr:收信人邮件地址
     * @param mailTitle:邮件标题
     * @param mailConcept:邮件内容
     */
    public static void sendMail(String emailAddr, String mailTitle, String mailConcept) {
        // 根据属性新建一个邮件会话，null参数是一种Authenticator(验证程序) 对象
        Session s = Session.getInstance(MailUtil.props, null);
        // 设置调试标志,要查看经过邮件服务器邮件命令，可以用该方法
        s.setDebug(false);
        // 由邮件会话新建一个消息对象
        Message message = new MimeMessage(s);
        try {
            // 设置发件人
            Address from = new InternetAddress(MailUtil.SenderEmailAddr);
            message.setFrom(from);

            // 设置收件人
            Address to = new InternetAddress(emailAddr);
            message.setRecipient(Message.RecipientType.TO, to);

            // 设置主题
            message.setSubject(mailTitle);
            // 设置信件内容
            message.setText(mailConcept);
            // 设置发信时间
            message.setSentDate(new Date());
            // 存储邮件信息
            message.saveChanges();

            Transport transport = s.getTransport(MailUtil.TransportType);
            // 要填入你的用户名和密码；
            transport.connect(MailUtil.SMTPServerName, MailUtil.SMTPUserName,
                    MailUtil.SMTPPassword);

            // 发送邮件,其中第二个参数是所有已设好的收件人地址
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("发送邮件,邮件地址:" + emailAddr + " 标题:" + mailTitle
                    + " 内容:" + mailConcept + "成功!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("发送邮件,邮件地址:" + emailAddr + " 标题:" + mailTitle
                    + " 内容:" + mailConcept + "失败! 原因是" + e.getMessage());
        }
    }

    public static void postFixSendMail(){

    }
}
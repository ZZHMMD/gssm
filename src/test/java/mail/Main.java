package mail;


import java.net.URLDecoder;
import java.net.URLEncoder;

public class Main {

    public static void main(String[] args) throws Exception {
//        String text="消息发送！！！！";
//        MailUtil.sendMail("15160000933@163.com", "这是一个测试",text);
//        MailUtil.activeUser("15160000933@163.com","这个是一个测试");
//        MailTest test = new MailTest("zzhmmd@huahuayu.com.cn","Zeng1234","15160000933@163.com","test","test");
//        MailTest test = new MailTest("15160000933@163.com","Zeng1234","15160000933@163.com","test","test");
//        test.send();'

        String url="http://localhost:8080/gssm/active?username=zzhmmd&id=1&code=10010";
        String encode = URLEncoder.encode(url, "utf-8");
        System.out.print(url);
    }
}

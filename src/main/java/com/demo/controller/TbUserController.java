package com.demo.controller;

import com.demo.pojo.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class TbUserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/login")
    public String login(HttpServletRequest request,String username, String password, HttpServletResponse response){
         if(username.equals("admin") && password.equals("admin")){

             Cookie usernameCookie = new Cookie("username",username);
             usernameCookie.setMaxAge(500);
             usernameCookie.setPath("/");
             response.addCookie(usernameCookie);

             HttpSession session = request.getSession();
             User user  = new User();
             user.setUsername(username);
             user.setPassword(password);
             session.setAttribute("user",user);
         }
        return "welcome";
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request,HttpServletResponse response){
        //删除cookie
        Cookie usernameCookie = new Cookie("usernmae","");
        usernameCookie.setMaxAge(0);
        usernameCookie.setPath("/");
        response.addCookie(usernameCookie);
        request.getSession().removeAttribute("user");
        return "redirect:login.jsp";
    }

    @RequestMapping("/logincookie")
    public String autoLogin(HttpServletRequest request,HttpServletResponse response){
        System.out.println("进入了自动登录的Controller！");
        Cookie[] cookies = request.getCookies();
        if(cookies==null){
            return "redirect:login";
        }
        HttpSession session = request.getSession(false);
        String sessionId = session.getId();

        for(Cookie cookie:cookies){
            if (cookie.getName().equals("JSESSIONID")) {
                if(!cookie.getValue().equals(sessionId)){
                    return "redirect:login";
                }
            }
        }

        for (Cookie cookie2:cookies){
            if(cookie2.getName().equals("username")&&cookie2.getValue()!=null){
                String cookieUsername = cookie2.getValue();
                try{
                    String realPassword = userService.getUserByUsername(cookieUsername).getPassword();
                    if (session.getAttribute("password").equals(realPassword)){
                        return "welcome";
                    }else{
                        return "redirect:login.jsp";
                    }

                }catch (NullPointerException e){
                    return "redirect:login.jsp";
                }

            }
        }

        return "redirect:login.jsp";
    }

    @RequestMapping("/welcomepage")
    public String toWelcomePage(){
        return "welcome";
    }
}

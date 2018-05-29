package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");

    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<base href=\"");
      out.print(basePath );
      out.write("\" />\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>注册</title>\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"assert/favicon.ico\">\r\n");
      out.write("    <link href=\"assert/css/bootstrap.min14ed.css?v=3.3.6\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"assert/css/font-awesome.min93e3.css?v=4.4.0\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"assert/css/plugins/iCheck/custom.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"assert/css/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"assert/css/style.min862f.css?v=4.1.0\" rel=\"stylesheet\">\r\n");
      out.write("    <script>if(window.top !== window.self){ window.top.location = window.location;}</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"gray-bg\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"middle-box text-center loginscreen   animated fadeInDown\">\r\n");
      out.write("    <div style=\"padding-top: 40%;\">\r\n");
      out.write("        <h3>欢迎注册</h3>\r\n");
      out.write("        <p>创建一个新账户</p>\r\n");
      out.write("        <form id=\"registerForm\" class=\"m-t\" role=\"form\" action=\"/gssm/resgister\" method=\"post\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <input type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"请输入用户名\" required minlength=\"3\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <input type=\"password\" id=\"password\" name=\"password\" class=\"form-control\" placeholder=\"请输入密码\" required minlength=\"5\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <input type=\"password\"  class=\"form-control\" placeholder=\"请再次输入密码\" required minlength=\"5\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <input type=\"text\" name=\"nickname\" class=\"form-control\" placeholder=\"请输入昵称\" >\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <input type=\"email\" name=\"email\" class=\"form-control\" placeholder=\"请输入邮箱\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <input type=\"text\" name=\"tel\" class=\"form-control\" placeholder=\"请输入电话号码\" required minlength=\"11\" maxlength=\"11\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group text-left\">\r\n");
      out.write("                <div class=\"checkbox i-checks\">\r\n");
      out.write("                    <label class=\"no-padding\">\r\n");
      out.write("                        <input id=\"agree\" type=\"checkbox\" required=\"#agree:checked\"><i></i> 我同意注册协议</label>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary block full-width m-b\">注 册</button>\r\n");
      out.write("\r\n");
      out.write("            <p class=\"text-muted text-center\">\r\n");
      out.write("                <small>已经有账户了？</small>\r\n");
      out.write("                <a href=\"login.jsp\">点此登录</a>\r\n");
      out.write("            </p>\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"assert/js/jquery.min.js?v=2.1.4\"></script>\r\n");
      out.write("<script src=\"assert/js/plugins/validate/jquery.validate.min.js\"></script>\r\n");
      out.write("<script src=\"assert/js/plugins/validate/messages_zh.min.js\"></script>\r\n");
      out.write("<script src=\"assert/js/bootstrap.min.js?v=3.3.6\"></script>\r\n");
      out.write("<script src=\"assert/js/plugins/iCheck/icheck.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("        $(\".i-checks\").iCheck({checkboxClass: \"icheckbox_square-green\", radioClass: \"iradio_square-green\",});\r\n");
      out.write("        // $(\"#registerForm\").validate({\r\n");
      out.write("        //     debug:true,\r\n");
      out.write("        //     rules: {\r\n");
      out.write("        //         username: {\r\n");
      out.write("        //             required: true,\r\n");
      out.write("        //             minlength: 2\r\n");
      out.write("        //         },\r\n");
      out.write("        //         password: {\r\n");
      out.write("        //             required: true,\r\n");
      out.write("        //             minlength: 5\r\n");
      out.write("        //         },\r\n");
      out.write("        //         repassword: {\r\n");
      out.write("        //             required: true,\r\n");
      out.write("        //             minlength: 5,\r\n");
      out.write("        //             equalTo: \"#password\"\r\n");
      out.write("        //         },\r\n");
      out.write("        //         email: {\r\n");
      out.write("        //             required: true,\r\n");
      out.write("        //             email: true\r\n");
      out.write("        //         },\r\n");
      out.write("        //         tel:{\r\n");
      out.write("        //             required:true,\r\n");
      out.write("        //             rangelength:[11,11]\r\n");
      out.write("        //         },\r\n");
      out.write("        //         agree: {\r\n");
      out.write("        //             required:\"#agree:checked\"\r\n");
      out.write("        //         }\r\n");
      out.write("        //     },\r\n");
      out.write("        //     messages: {\r\n");
      out.write("        //         username: {\r\n");
      out.write("        //             required: \"请输入用户名\",\r\n");
      out.write("        //             minlength: \"用户名必需由两个字母组成\"\r\n");
      out.write("        //         },\r\n");
      out.write("        //         password: {\r\n");
      out.write("        //             required: \"请输入密码\",\r\n");
      out.write("        //             minlength: \"密码长度不能小于 5 个字母\"\r\n");
      out.write("        //         },\r\n");
      out.write("        //         repassword: {\r\n");
      out.write("        //             required: \"请输入密码\",\r\n");
      out.write("        //             minlength: \"密码长度不能小于 5 个字母\",\r\n");
      out.write("        //             equalTo: \"两次密码输入不一致\"\r\n");
      out.write("        //         },\r\n");
      out.write("        //         tel:{\r\n");
      out.write("        //             required: \"请输入电话号码\",\r\n");
      out.write("        //             rangelength:\"请输入正确的电话号码\"\r\n");
      out.write("        //         },\r\n");
      out.write("        //         email: \"请输入一个正确的邮箱\",\r\n");
      out.write("        //         agree: \"请接受我们的声明\"\r\n");
      out.write("        //     }\r\n");
      out.write("        // });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

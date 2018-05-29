package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("<base href=\"");
      out.print(basePath );
      out.write("\" />\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>登录</title>\n");
      out.write("\n");
      out.write("  <link rel=\"shortcut icon\" href=\"assert/favicon.ico\">\n");
      out.write("  <link href=\"assert/css/bootstrap.min14ed.css?v=3.3.6\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assert/css/font-awesome.min93e3.css?v=4.4.0\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assert/css/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assert/css/style.min862f.css?v=4.1.0\" rel=\"stylesheet\">\n");
      out.write("  <script>if(window.top !== window.self){ window.top.location = window.location;}</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"gray-bg\">\n");
      out.write("\n");
      out.write("<div class=\"middle-box text-center loginscreen  animated fadeInDown\">\n");
      out.write("  <div style=\"padding-top: 45%; \">\n");
      out.write("    <h3>注册大合集demo</h3>\n");
      out.write("    <form class=\"m-t\" role=\"form\" action=\"/login\">\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"用户名\" required=\"\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"密码\" required=\"\">\n");
      out.write("      </div>\n");
      out.write("      <button type=\"submit\" class=\"btn btn-primary block full-width m-b\">登 录</button>\n");
      out.write("      <p class=\"text-muted text-center\"> <a href=\"login.html#\"><small>忘记密码了？</small></a> | <a href=\"register.jsp\">注册一个新账号</a>\n");
      out.write("      </p>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<script src=\"assert/js/jquery.min.js?v=2.1.4\"></script>\n");
      out.write("<script src=\"assert/js/bootstrap.min.js?v=3.3.6\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write(" $(document).ready(function () {\n");
      out.write("\n");
      out.write(" });\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

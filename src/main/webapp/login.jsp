<%--
  Created by IntelliJ IDEA.
  User: ZengZH
  Date: 2018/5/26
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath %>" />
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>登录</title>

  <link rel="shortcut icon" href="assert/favicon.ico">
  <link href="assert/css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">
  <link href="assert/css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
  <link href="assert/css/animate.min.css" rel="stylesheet">
  <link href="assert/css/style.min862f.css?v=4.1.0" rel="stylesheet">
  <script>if(window.top !== window.self){ window.top.location = window.location;}</script>
</head>

<body class="gray-bg">

<div class="middle-box text-center loginscreen  animated fadeInDown">
  <div style="padding-top: 45%; ">
    <h3>注册大合集demo</h3>
    <form class="m-t" role="form" action="/login" method="post">
      <div class="form-group">
        <input type="text" class="form-control" name="username" placeholder="用户名" required="">
      </div>
      <div class="form-group">
        <input type="password" class="form-control" name="password" placeholder="密码" required="">
      </div>
      <button type="submit" class="btn btn-primary block full-width m-b">登 录</button>
      <p class="text-muted text-center"> <a href="login.html#"><small>忘记密码了？</small></a> | <a href="register.jsp">注册一个新账号</a>
      </p>
    </form>
  </div>
</div>
<script src="assert/js/jquery.min.js?v=2.1.4"></script>
<script src="assert/js/bootstrap.min.js?v=3.3.6"></script>
<script type="text/javascript">
 $(document).ready(function () {

 });
</script>
</body>
</html>

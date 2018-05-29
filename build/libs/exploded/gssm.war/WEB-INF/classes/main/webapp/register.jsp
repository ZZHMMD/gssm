<%--
  Created by IntelliJ IDEA.
  User: ZengZH
  Date: 2018/5/26
  Time: 16:49
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
    <title>注册</title>
    <link rel="shortcut icon" href="assert/favicon.ico">
    <link href="assert/css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">
    <link href="assert/css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
    <link href="assert/css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="assert/css/animate.min.css" rel="stylesheet">
    <link href="assert/css/style.min862f.css?v=4.1.0" rel="stylesheet">
    <script>if(window.top !== window.self){ window.top.location = window.location;}</script>
</head>
<body class="gray-bg">

<div class="middle-box text-center loginscreen   animated fadeInDown">
    <div style="padding-top: 40%;">
        <h3>欢迎注册</h3>
        <p>创建一个新账户</p>
        <form id="registerForm" class="m-t" role="form" action="/gssm/resgister" method="post">
            <div class="form-group">
                <input type="text" name="username" class="form-control" placeholder="请输入用户名" required minlength="3">
            </div>
            <div class="form-group">
                <input type="password" id="password" name="password" class="form-control" placeholder="请输入密码" required minlength="5">
            </div>
            <div class="form-group">
                <input type="password"  class="form-control" placeholder="请再次输入密码" required minlength="5">
            </div>
            <div class="form-group">
                <input type="text" name="nickname" class="form-control" placeholder="请输入昵称" >
            </div>
            <div class="form-group">
                <input type="email" name="email" class="form-control" placeholder="请输入邮箱" required>
            </div>
            <div class="form-group">
                <input type="text" name="tel" class="form-control" placeholder="请输入电话号码" required minlength="11" maxlength="11">
            </div>

            <div class="form-group text-left">
                <div class="checkbox i-checks">
                    <label class="no-padding">
                        <input id="agree" type="checkbox" required="#agree:checked"><i></i> 我同意注册协议</label>
                </div>
            </div>
            <button type="submit" class="btn btn-primary block full-width m-b">注 册</button>

            <p class="text-muted text-center">
                <small>已经有账户了？</small>
                <a href="login.jsp">点此登录</a>
            </p>

        </form>
    </div>
</div>
<script src="assert/js/jquery.min.js?v=2.1.4"></script>
<script src="assert/js/plugins/validate/jquery.validate.min.js"></script>
<script src="assert/js/plugins/validate/messages_zh.min.js"></script>
<script src="assert/js/bootstrap.min.js?v=3.3.6"></script>
<script src="assert/js/plugins/iCheck/icheck.min.js"></script>
<script>
    $(document).ready(function(){
        $(".i-checks").iCheck({checkboxClass: "icheckbox_square-green", radioClass: "iradio_square-green",});
        // $("#registerForm").validate({
        //     debug:true,
        //     rules: {
        //         username: {
        //             required: true,
        //             minlength: 2
        //         },
        //         password: {
        //             required: true,
        //             minlength: 5
        //         },
        //         repassword: {
        //             required: true,
        //             minlength: 5,
        //             equalTo: "#password"
        //         },
        //         email: {
        //             required: true,
        //             email: true
        //         },
        //         tel:{
        //             required:true,
        //             rangelength:[11,11]
        //         },
        //         agree: {
        //             required:"#agree:checked"
        //         }
        //     },
        //     messages: {
        //         username: {
        //             required: "请输入用户名",
        //             minlength: "用户名必需由两个字母组成"
        //         },
        //         password: {
        //             required: "请输入密码",
        //             minlength: "密码长度不能小于 5 个字母"
        //         },
        //         repassword: {
        //             required: "请输入密码",
        //             minlength: "密码长度不能小于 5 个字母",
        //             equalTo: "两次密码输入不一致"
        //         },
        //         tel:{
        //             required: "请输入电话号码",
        //             rangelength:"请输入正确的电话号码"
        //         },
        //         email: "请输入一个正确的邮箱",
        //         agree: "请接受我们的声明"
        //     }
        // });

    });
</script>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath %>" />
<html>
<body>
<h2>Hello World!</h2>
<div style="align-content: center;">
    <form action="/gssm/login" method="post" >
        <input type="text" name="username" value="${user.username}"><br>
        <input type="text" name="password" value="${user.password}"><br>
        <input type="submit" value="点击">
    </form>
</div>
</body>
</html>

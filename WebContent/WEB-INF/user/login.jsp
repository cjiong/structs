<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
<center>
<h2>Login Page</h2>
<form action="user/login" method="post">
	用户名:<input type="text" name="user.username"><br>
	密码:<input type="text" name="user.userpassword"><br>
	<input type="submit" value="Submit">
	<input type="button" value="Register" onclick="window.location.href='user/toRegisterAction'">
</form>
</center>    
</body>
</html>
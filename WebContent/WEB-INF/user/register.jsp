<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
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
<title>注册</title>
</head>
<body>
<center>
<h2>注册</h2>
<form action="user/register" method="post">
    用户名:<input type="text" name="user.username"><br>
    密码:<input type="text" name="user.userpassword"><br>
    <input type="submit" value="提交"> 
    <input type="button" value="登录" onclick="window.location.href='user/toLoginAction'">
</form>
</center>   
</body>
</html>
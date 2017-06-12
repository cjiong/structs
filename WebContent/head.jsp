<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<base href="<%=basePath%>">
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<link href="css/div.css" rel="stylesheet" type="text/css" />

<br><br>
<center>
<font size=7>学生信息管理系统</font><br><br>
<table class="center" cellspacing=0 cellpadding=0 >
	<tr valign="bottom">
		<td><a href="indexAcion" target="_parent"><font size=5>首页</font></a></td>
		<td><a href="operation/toAddPage" target="_parent"><font size=5>添加</font></a></td>
		<td><a href="operation/toEditPage" target="_parent"><font size=5>修改</font></a></td>
		<td><a href="operation/toSelectPage" target="_parent"><font size=5>查询</font></a></td>
	</tr>
</table>
</center>

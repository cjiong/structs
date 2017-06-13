<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/head.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑</title>
</head>
<body><br>
<center>学生列表<br><br></center>

<table border="1">
<tr>
	<td>学生学号</td>
	<td>学生姓名</td>
	<td>学生性别</td>
	<td>学生生日</td>
	<td>学生学院</td>
	<td>删除</td>
	<td>修改</td>
</tr>
<s:iterator var="selectList" value="#request.selectList" status="status">
<tr>
    <td><s:property value="#selectList.stu_number" /></td>
    <td><s:property value="#selectList.stu_name" /></td>
    <td><s:property value="#selectList.stu_sex" /></td>
    <td><s:property value="#selectList.stu_birthday" /></td>
    <td><s:property value="#selectList.stu_department" /></td>
    <td><input type="button" value="删除" onclick="window.location.href='operation/deleteAction?number=<s:property value="#selectList.stu_number" />'"></td>
    <td><input type="button" value="修改" onclick="window.location.href='operation/toUpdatePage?number=<s:property value="#selectList.stu_number" />'"></td>
</tr>
</s:iterator>
</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/head.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改信息</title>
</head>
<body><br>
<center>
<form action="operation/updateAction" method="post">
<table border="1px">
<tr>
    <td>修改信息</td>
</tr>
<tr>
    <td>学号：</td>
    <td><input type="text" name="student.stu_number" value="<s:property value="#request.selectOne.stu_number"/>"></td>
</tr>
<tr>
    <td>姓名：</td>
    <td><input type="text" name="student.stu_name" value="<s:property value="#request.selectOne.stu_name"/>"></td>
</tr>
<tr>
    <td>性别：</td>
    <td>
        <input type="radio" name="student.stu_sex" value="男"> 男
        <input type="radio" name="student.stu_sex" value="女"> 女
    </td>
</tr>
<tr>
    <td>出生日期：</td>
    <td><input type="text" name="student.stu_birthday" value="<s:property value="#request.selectOne.stu_birthday"/>" /></td>
</tr>
<tr>
    <td>学院：</td>
    <td><input type="text" name="student.stu_department" value="<s:property value="#request.selectOne.stu_department"/>"></td>
</tr>
<tr>
    <td align="center" colspan="2">
        <input type="submit" value="更新">
        <input type="reset" value="重置">
    </td>
</tr>
</table>
</form>
</center>
</body>
</html>
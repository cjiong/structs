<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/head.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
<center><br>
<form action="operation/selectAction" method="post">
    输入学生学号<input type="text" name="number">
    <input type="submit" value="查找">
    <input type="reset" value="清空">
</form>

<table border="1">
	<tr>
	    <td>学生学号</td>
	    <td>学生姓名</td>
	    <td>学生性别</td>
	    <td>学生生日</td>
	    <td>学生学院</td>
	</tr>
	<s:iterator var="selectList" value="#request.selectList" status="status">
	<tr>
	    <td><s:property value="#selectList.stu_number" /></td>
	    <td><s:property value="#selectList.stu_name" /></td>
	    <td><s:property value="#selectList.stu_sex" /></td>
	    <td><s:property value="#selectList.stu_birthday" /></td>
	    <td><s:property value="#selectList.stu_department" /></td>
	</tr>
	</s:iterator>
</table> 

</center>
</body>
</html>
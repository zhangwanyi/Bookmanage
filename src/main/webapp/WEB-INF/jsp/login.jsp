<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
	<form action="login" method="post">
	<table border="1">
		<tr>
			<td colspan="2"><h1>登录图书管理系统</h1></td>
		</tr>
		<tr>
			<td>用户名：</td>
			<td><input name="name"></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input name="password"></td>
		</tr>
		<tr>
			<td colspan="2"><button>登录</button></td>
		</tr>
		<c:if test="${message!=null}">
		<tr>
			<td colspan="2" style="color:red;">${message}</td>
		</tr>
		</c:if>
	</table>
	</form>
</body>
</html>
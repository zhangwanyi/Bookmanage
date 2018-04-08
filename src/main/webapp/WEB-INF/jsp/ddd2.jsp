<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书列表</title>
</head>
<body>
	<h1>图书系统管理员欢迎您！</h1>
	<form action="index">
	<table border="1">
		<tr>
			<td colspan="8"><h1>图书详细信息列表</h1></td>
		</tr>
		<tr>
			<td>书名</td>
			<td>作者</td>
			<td>出版社</td>
			<td>出版日期</td>
			<td>页数</td>
			<td>价格</td>
			<td>内容摘要</td>
			<td>操作</td>
		</tr>
		<c:forEach var="c" items="${bookList}">
		<tr>
			<td>${c.name}</td>
			<td>${c.author}</td>
			<td>${c.publish}</td>
			<td>${c.publishDate}</td>
			<td>${c.page}</td>
			<td>${c.price}</td>
			<td>${c.content}</td>
			<td><a href="edit?id=${c.id}">修改</a><a href="del?id=${c.id}">删除</a></td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="8"><a href="edit">新增图书</a>共${count}条记录&nbsp;
			每页<input name="pageSize" value="${pageSize}">条&nbsp;第${page}页/共${yeshu}页&nbsp;
			<a>第一页</a><a>上一页</a><a>下一页</a><a>最后一页</a>&nbsp;转到第<input name="page" value="${page}">
			&nbsp;<button>GO</button></td>
		</tr>
	</table>
	</form>
</body>
</html>
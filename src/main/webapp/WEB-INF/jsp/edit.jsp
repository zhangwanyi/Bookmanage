<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增或修改</title>
</head>
<body>
	<form action="save" method="post">
	<input name="id" type="hidden" value="${id}">
	<table border="1">
		<tr>
			<td colspan="2"><h1>增加图书</h1></td>
		</tr>
		<tr>
			<td>书名(*)</td>
			<td><input name="book.name" value="${book.name}"></td>
		</tr>
		<tr>
			<td>作者(*)</td>
			<td><input name="book.author" value="${book.author}"></td>
		</tr>
		<tr>
			<td>出版社(*)</td>
			<td><input name="book.publish" value="${book.publish}"></td>
		</tr>
		<tr>
			<td>出版日期(*)</td>
			<td><input name="book.publicshDate" value="${book.publishDate}">(yyyy-MM-dd)</td>
		</tr>
		<tr>
			<td>页数</td>
			<td><input name="book.page" value="${book.page}"></td>
		</tr>
		<tr>
			<td>价格</td>
			<td><input name="book.price" value="${book.price}"></td>
		</tr>
		<tr>
			<td>内容摘要</td>
			<td><textarea rows="5" cols="20" name="book.content">${book.content}</textarea></td>
		</tr>
		<tr>
			<td colspan="2"><button>提交</button><a href="index">返回</a></td>
		</tr>
	</table>
	</form>
</body>
</html>
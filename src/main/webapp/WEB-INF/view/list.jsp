<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link href="/resource/css/index3.css" rel="stylesheet">
<body>
	<table>
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>密码</td>
		</tr>
		<c:forEach items="${list}" var="l">
			<tr>
				<td>${l.id}</td>
				<td>${l.name}</td>
				<td>${l.pwd}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
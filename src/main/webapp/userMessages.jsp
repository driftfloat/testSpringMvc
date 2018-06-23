<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>消息列表</title>
<script type="text/javascript"
	src="<c:url value='/jquery-1.8.3.js'/>"></script>
</head>
<body>
	<h3>消息列表</h3>
	<hr />
	<form action="<c:url value='/web/login.html'/>" name="loginUserForm" id="loginUserForm">
		<table border="1">
			<tr>
				<td>发送用户id</td>
				<td>接收用户id</td>
				<td>消息</td>
			</tr>
			<c:forEach var="message" items="${userMessages}"> 
			<tr>
				<td>${message.fromUserId } </td>
				<td>${message.userId } </td>
				<td>${message.fromUserName }</td>
			</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>
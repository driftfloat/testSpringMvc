<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发送消息</title>
<script type="text/javascript"
	src="<c:url value='/jquery-1.8.3.js'/>"></script>
<script type="text/javascript">
	function send() {
		var url = "<c:url value='/web/message/send.html'/>";
		$.post(url
			,$("#messageForm").serialize()
			, function(data) {
				if (data == "1") {
					alert("发送成功!");
// 					location="<c:url value='/web/index.html'/>";
				} else {
					alert("发送失败!");
			}
		});
	}
</script>
</head>
<body>
	<h3>发送消息</h3>
	<hr />
	<form action="<c:url value='/web/message/send.html'/>" name="messageForm" id="messageForm">
		<table>
			<tr>
				<td>接收用户id</td>
				<td><input type="text" name="userId" id="userId"></td>
			</tr>
			<tr>
				<td>内容</td>
				<td><input type="text" name="fromUserName" id="fromUserName"></td>
			</tr>
			<tr>
				<td><input type="button" onclick="send()" value="发送"></td>
				<td><input type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<script type="text/javascript"
	src="<c:url value='/jquery-1.8.3.js'/>"></script>
<script type="text/javascript">
	function login() {
// 		var registerUrl = "<c:url value='/web/login.html'/>";
// 		var username = $("#username");
// 		var phone = $("#phone");
// 		var email = $("#email");
// 		var formData = {
// 			"username" : username,
// 			"phone" : phone,
// 			"email" : email
// 		};
// 		$.post(registerUrl
// 			,$("#loginUserForm").serialize()
// 			, function(data) {
// 				if (data == "1") {
// 					alert("登录成功!");
// 					location="<c:url value='/web/index.html'/>";
// 				} else {
// 					alert("用户名或密码错误!");
// 			}
// 		});
	}
</script>
</head>
<body>
	<h3>登录</h3>
	<hr />
	<form action="<c:url value='/web/login.html'/>" name="loginUserForm" id="loginUserForm">
		<table>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="username" id="username"></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="password" id="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="提交"></td>
				<td><input type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
</body>
</html>
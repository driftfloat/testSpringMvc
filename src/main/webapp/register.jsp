<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<script type="text/javascript"
	src="<c:url value='/jquery-1.8.3.js'/>"></script>
<script type="text/javascript">
	$(function() {
// 		$("#register").click(function() {
			// 		alert("Hello World!");
// 			var registerUrl = "<c:url value='/web/addUser.html'/>";
// 			var username = $("#username");
// 			var phone = $("#phone");
// 			var email = $("#email");
// 			var data = {
// 				"username" : username,
// 				"phone" : phone,
// 				"email" : email
// 			};
			// 		alert(registerUrl);
			// 		$.post(registerUrl, data, function(rtn){
			// // 			if(rtn=="1"){
			// // 				alert("register Success!");
			// // 			}else{
			// // 				alert("register Fail!");
			// // 			}
			// 		});

// 			$.ajax({
// 				url : registerUrl,
// 				dataType : "json",
// 				data : data,
// 				async : true,
// 				cache : false,
// 				type : "post",
// 				success : function(flag) {
// 				}
// 			});
// 		});
	})
	function addUser() {
		var registerUrl = "<c:url value='/web/addUser.html'/>";
// 		var username = $("#username");
// 		var phone = $("#phone");
// 		var email = $("#email");
// 		var formData = {
// 			"username" : username,
// 			"phone" : phone,
// 			"email" : email
// 		};
		$.post(registerUrl
			,$("#addUserForm").serialize()
			, function(data) {
				if (data == "1") {
					alert("register Success!");
				} else {
					alert("register Fail!");
			}
		});

	}
</script>
</head>
<body>
	<h3>注册</h3>
	<hr />
	<form action="<c:url value='/register.html'/>" name="addUserForm" id="addUserForm">
		<table>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="username" value="username" id="username"></td>
			</tr>
			<tr>
				<td>电话</td>
				<td><input type="text" name="phone" value="phone1" id="phone"></td>
			</tr>
			<tr>
				<td>EMail</td>
				<td><input type="text" name="email" value="email1" id="email"></td>
			</tr>
			<tr>
				<td><input type="button" value="提交" id="register" onclick="addUser()"></td>
				<td><input type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
</body>
</html>
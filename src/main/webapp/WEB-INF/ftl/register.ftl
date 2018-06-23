<script type="text/javascript" src="${rc.contextPath}/jquery-1.8.3.js"></script>
<script type="text/javascript">
	function addUser() {
		var registerUrl = "${rc.contextPath}/web/addUser.html";
		$.post(registerUrl
			,$("#addUserForm").serialize()
			, function(data) {
				if (data == "1") {
					alert("register Success!");
					location='${rc.contextPath}/web/index';
				} else {
					alert("register Fail!");
			}
		});

	}
</script>
	<h3>注册</h3>
	<hr />
	<form action="${rc.contextPath}/register.html" name="addUserForm" id="addUserForm">
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

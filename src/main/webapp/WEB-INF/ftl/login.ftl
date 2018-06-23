<@layout.mainLayout title="登录">	
	<h3>登录</h3>
	<hr />
	<form action="${rc.contextPath}/web/login.html" name="loginUserForm" id="loginUserForm">
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

</@layout.mainLayout>
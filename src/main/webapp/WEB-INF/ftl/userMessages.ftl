<@layout.mainLayout title="消息列表">
	<h3>消息列表</h3>
	<hr />
		<table border="1">
			<tr>
				<td>发送用户id</td>
				<td>接收用户id</td>
				<td>消息</td>
			</tr>
			<#list userMessages as message>
			<tr>
				<td>${message.fromUserId } </td>
				<td>${message.userId } </td>
				<td>${message.fromUserName }</td>
			</tr>	
			</#list>
		</table>
</@layout.mainLayout>
<@layout.mainLayout title="发送消息">

<script type="text/javascript" src="${rc.contextPath}/jquery-1.8.3.js"></script>
<script type="text/javascript">
	function send() {
		var url = "${rc.contextPath}/web/message/send.html";
		$.post(url
			,$("#messageForm").serialize()
			, function(data) {
				if (data == "1") {
					alert("发送成功!");
					location="${rc.contextPath}/web/index.html";
				} else {
					alert("发送失败!");
			}
		});
	}
</script>
	<h3>发送消息</h3>
	<hr />
	<form action="${rc.contextPath}/web/message/send.html" name="messageForm" id="messageForm">
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

</@layout.mainLayout>	
<@layout.mainLayout title="提问">	

<script type="text/javascript" src="${rc.contextPath}/jquery-1.8.3.js"></script>
<script type="text/javascript">
	function add() {
		var url = "${rc.contextPath}/web/question/add";
		$.post(url
			,$("#addForm").serialize()
			, function(data) {
				if (data == "1") {
					alert("add question Success!");
					location='${rc.contextPath}/web/question/list';
				} else {
					alert("add question Fail!");
			}
		});

	}
</script>
	<h3>提问</h3>
	<hr />
	<form name="addForm" id="addForm">
		<table>
			<tr>
				<td>标题</td>
				<td><input type="text" name="questionTitle" id="questionTitle"></td>
			</tr>
			<tr>
				<td>内容</td>
				<td><input type="text" name="questionContent" id="questionContent"></td>
			</tr>
			<tr>
				<td><input type="button" value="提交" onclick="add()"></td>
				<td><input type="reset" value="重置"></td>
			</tr>
		</table>
	</form>

</@layout.mainLayout>	
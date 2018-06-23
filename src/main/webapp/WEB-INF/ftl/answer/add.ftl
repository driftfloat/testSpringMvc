<@layout.mainLayout title="回答问题">
<script type="text/javascript" src="${rc.contextPath}/jquery-1.8.3.js"></script>
<script type="text/javascript">
	function add() {
		var url = "${rc.contextPath}/web/answer/add";
		$.post(url
			,$("#addForm").serialize()
			, function(data) {
				if (data == "1") {
					alert("answer Success!");
					location='${rc.contextPath}/web/question/list';
				} else {
					alert("answer Fail!");
			}
		});

	}
</script>
	<h3>回答</h3>
	<hr />
	<form name="addForm" id="addForm">
		<input type="hidden" name="questionId" value="${questionId}" id="questionId">
		<table>
			<tr>
				<td>标题</td>
				<td><input type="text" name="questionTitle"  id="questionTitle"></td>
			</tr>
			<tr>
				<td>内容</td>
				<td><input type="text" name="answerContent" id="answerContent"></td>
			</tr>
			<tr>
				<td><input type="button" value="提交" onclick="add()"></td>
				<td><input type="reset" value="重置"></td>
			</tr>
		</table>
	</form>

</@layout.mainLayout>	
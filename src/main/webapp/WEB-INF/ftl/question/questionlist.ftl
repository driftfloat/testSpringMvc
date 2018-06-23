<@layout.mainLayout title="问题列表">
	<h3>问题列表</h3>
	<a href="${rc.contextPath}/web/question/toAdd.html">提问</a>
	<hr />
		<table border="1">
			<tr>
				<td>标题</td>
				<td>内容</td>
				<td>创建用户id</td>
				<td>功能</td>
			</tr>
			<#list questions as q>
			<tr>
				<td>${q.questionTitle } </td>
				<td>${q.questionContent } </td>
				<td>${q.userId } </td>
				<td><a href="${rc.contextPath}/web/answer/list?questionId=${q.questionId}">回答列表</a> </td>
			</tr>	
			</#list>
		</table>
</@layout.mainLayout>
<@layout.mainLayout title="回答问题列表">
	<h3>回答列表</h3>
	<a href="${rc.contextPath}/web/answer/toAdd?questionId=${questionId}">回答</a>
	<a href="${rc.contextPath}/web/question/list.html">问题列表</a>
	<a href="${rc.contextPath}/web/index">首页</a>
	<hr />
		<table border="1">
			<tr>
				<td>问题标题</td>
				<td>回答内容</td>
				<td>回答用户id</td>
			</tr>
			<#list answers as a>
			<tr>
				<td>${a.questionTitle } </td>
				<td>${a.answerContent } </td>
				<td>${a.userId } </td>
			</tr>	
			</#list>
		</table>
</@layout.mainLayout>
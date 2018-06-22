<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String path=pageContext.getServletContext().getContextPath() ;
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index</title>
<script type="text/javascript" src="<%=pageContext.getServletContext().getContextPath() %>/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
function add(){
// 	alert($("#myfile")[0].value);
	$("#addForm").submit();
}
</script>
</head>
<body>
<h1>upload</h1>
<form id="addForm" action="<%=request.getContextPath()%>/web/add" method="POST" enctype="multipart/form-data">  
    yourfile: <input type="file" id="myfiles"  name="myfiles" /><br/>  
<!--     <input type="submit" value="添加"/>   -->
<!-- 	<input type="button" onclick="add()" value="添加"/> -->
</form>  
<input type="button" onclick="add()" value="添加"/>
</body>
</html>
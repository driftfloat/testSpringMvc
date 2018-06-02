<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="author" content="moocss">
 
    <title>Error</title>
</head>
<body>

<p class="error-code">
    404
</p>

<p class="not-found">Not<br/>Found</p>

<div class="clear"></div>
<div class="content">
    The page your are looking for is not found.
    <br>
    <a href="<%=path%>/service/manage/loginPage">Go Home</a>
</div>
</body>
</html>
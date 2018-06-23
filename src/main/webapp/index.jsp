<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>
<body>
<h3>登录</h3>
<hr/>
<a href="<c:url value='/web/toRegister.html'/>">注册用户</a>
<br/>
欢迎光临, ${user.username }
<br/>
<a href="<c:url value='/web/message/list.html'/>">消息列表</a>
<br/>
<a href="<c:url value='/web/message/toSend.html'/>">发送消息</a>

</body>
</html>
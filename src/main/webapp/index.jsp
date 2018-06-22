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
<<<<<<< HEAD
<h1>首页</h1>
<a href="<%=pageContext.getServletContext().getContextPath() %>/web/add">add</a>
=======
<h3>登录</h3>
<hr/>
<a href="<c:url value='/web/toRegister.html'/>">注册用户</a>
<br/>
欢迎光临, ${user.username }
>>>>>>> 3fe5ae9b7e8cc5ca9963fc9178b21d74eb51d4a1
</body>
</html>
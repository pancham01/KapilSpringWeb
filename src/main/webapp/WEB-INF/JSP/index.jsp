<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
	<h1>This is my Home page</h1>
	<!-- Assuming context path is required -->
	<img src="${pageContext.request.contextPath}/resources/images/imgg.jpg"
		alt="image" width="200" />
</body>
</html>
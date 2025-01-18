<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Employee Form</title>
</head>
<body>
	<h2>Employee Form</h2>
	<form action="${pageContext.request.contextPath}/addEmployee" method="post">
		Name: <input type="text" name="name"><br> Department: <input
			type="text" name="department"><br> Salary: <input
			type="text" name="salary"><br>
		<button type="submit">Save</button>
	</form>

</body>
</html>


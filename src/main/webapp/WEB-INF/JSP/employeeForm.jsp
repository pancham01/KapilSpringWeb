<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Employee Form</title>
</head>
<body>
	<h2>Employee Form</h2>
	<form action="${pageContext.request.contextPath}/employee/submit"
		method="post">
		<label for="name">Name:</label> <input type="text" id="name"
			name="name" /><br />
		<br /> <label for="department">Department:</label> <input type="text"
			id="department" name="department" /><br />
		<br /> <label for="age">Age:</label> <input type="number" id="age"
			name="age" /><br />
		<br />

		<button type="submit">Submit</button>
	</form>
</body>
</html>


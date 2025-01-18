<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Employee Details</title>
</head>
<body>
    <h2>Submitted Employee Details</h2>
    <p>Name: ${employee.name}</p>
    <p>Department: ${employee.department}</p>
    <p>Age: ${employee.age}</p>
</body>
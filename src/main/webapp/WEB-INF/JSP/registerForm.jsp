<%@  taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Register</title></head>
<body>
    <h2>User Registration</h2>
    <form action="register" method="post">
        Name: <input type="text" name="name"/><br/><br/>
        Email: <input type="email" name="email"/><br/><br/>
        Country: 
        <select name="country">
            <c:forEach var="country" items="${countries}">
                <option value="${country}">${country}</option>
            </c:forEach>
        </select><br/><br/>
        <input type="submit" value="Register"/>
    </form>
</body>
</html>

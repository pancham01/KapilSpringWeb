<!DOCTYPE html>
<html>
<head>
    <title>Form</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/submitForm" method="post">
        <label>Username: <input type="text" name="username"/></label><br/>
        <label>Email: <input type="email" name="email"/></label><br/>
        <button type="submit">Submit</button>
    </form>
</body>
</html>

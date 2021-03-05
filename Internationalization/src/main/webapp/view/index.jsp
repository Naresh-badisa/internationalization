<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
<form action="/index" method="GET">
<form:message code="username"></form:message>
<input type="text" name="name"><br>
<form:message code="password"></form:message>
<input type="password" name="password"><br>
<input type="submit" name="submit" value="Login">
</form>
</body>
</html>
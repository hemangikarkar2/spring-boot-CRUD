<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<body>
		<c:form action="insert" method="post" modelAttribute="data">
		
		first Name :<c:input path="firstname"/><br/>
		
		lastName:<c:input path="lastname"/><br/>
		
		email:<c:input path="email"/><br/>
		
		contact Number <c:input path="contactnumber"/><br/>
		
		<c:hidden path="id" />
		
		<input type="submit" value="submit" /> 
		</c:form>
</body>
</html>
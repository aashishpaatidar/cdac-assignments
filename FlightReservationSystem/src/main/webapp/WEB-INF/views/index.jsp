<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">Flight Reservation Application</h2>
	<h3 align="center">
		<a href="<spring:url value='/user/login'/>"><button type="button">Login</button></a>
	</h3>
	<h3 align="center">
		<a href="<spring:url value='/user/signup'/>"><button type="button">Sign
				Up</button></a>
	</h3>
	<h5 align="center" style="color: green;">${requestScope.signup_msg}</h5>
</body>
</html>
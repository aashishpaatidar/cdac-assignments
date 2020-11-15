<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4 align="center">Flight Booked with Id:
		${sessionScope.status.id}</h4>
	<p align="center">
		<a href="<spring:url value='/flight/search'></spring:url>">Find
			More Flights</a>
	</p>
	<p align="center">
		<a href="<spring:url value='/user/logout'></spring:url>"><button
				style="background-color: blue;" type="button">Logout</button></a>
	</p>
</body>
</html>
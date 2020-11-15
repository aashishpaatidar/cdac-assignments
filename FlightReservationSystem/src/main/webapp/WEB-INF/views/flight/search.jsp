<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4 align="center">Flight Search</h4>
	<p style="size: 10px;" align="center">Welcome,
		${sessionScope.user_details.name}</p>
	<form:form method="post" modelAttribute="flight">
		<table style="background-color: gray; margin: auto" border="1">
			<tr>
				<td><form:label path="departure">From</form:label></td>
				<td><form:select path="departure">
						<form:options />
					</form:select></td>

			</tr>
			<tr>
				<td><form:label path="arrival">To</form:label></td>
				<td><form:select path="arrival">
						<form:options />
					</form:select></td>
			</tr>
			<tr>
				<td><form:label path="date">Departure Date</form:label></td>
				<td><form:input type="date" path="date" /></td>
			</tr>
			<tr>
				<td><input
					style="color: white; background-color: blue; width: 10em; margin: auto;"
					type="submit" value="Search" /></td>
			</tr>
		</table>
	</form:form>
	<h4 align="center" style="color: red;">${requestScope.msg}</h4>
	<p align="center">
		<a href="<spring:url value='/user/logout'></spring:url>"><button
				style="background-color: blue;" type="button">Logout</button></a>
	</p>
</body>
</html>
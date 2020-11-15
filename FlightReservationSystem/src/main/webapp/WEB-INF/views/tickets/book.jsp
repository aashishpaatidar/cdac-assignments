<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4 align="center">Flight Details:</h4>
	<p align="center">Airline: ${requestScope.flight.airline}</p>
	<p align="center">Departure: ${requestScope.flight.departure}</p>
	<p align="center">Arrival: ${requestScope.flight.arrival}</p>
	<p align="center">Departure date: ${requestScope.flight.date}</p>

	<form:form method="post" modelAttribute="ticket">
		<table style="background-color: gray; margin: auto" border="1">
			<tr>
				<td>Passenger Name</td>
				<td><form:input path="customerName" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><form:input path="phone" /></td>
			</tr>
			<tr>
				<td><input
					style="color: white; background-color: blue; width: 10em; margin: auto;"
					type="submit" value="Continue" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>
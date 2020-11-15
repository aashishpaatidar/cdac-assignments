<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3 align="center">Available Flights</h3>
	<table style="background-color: gray; margin: auto"
		border="1">
		<tr>
			<th>Airline</th>
			<th>From</th>
			<th>To</th>
			<th>Departure Date</th>
			<th></th>
		</tr>
		<c:forEach var="flight" items="${requestScope.flight_list}">
			<tr>
				<td>${flight.airline}</td>
				<td>${flight.departure}</td>
				<td>${flight.arrival}</td>
				<td>${flight.date}</td>
				<td><a href="<spring:url value='/tickets/book?id=${flight.id}'></spring:url>"><button
							style="background-color: blue;" type="button">Book</button></a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
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
<h4 align="center">Enter Card Details</h4>
<form:form method="post" modelAttribute="cardDetails">
		<table style="background-color:gray; margin: auto" border="1">
			<tr>
				<td>Card Number</td>
				<td><form:input type="number" path="cardNo"/></td>

			</tr>
			<tr>
				<td>Name on Card</td>
				<td><form:input path="cardName"/></td>
			</tr>
			<tr>
				<td>Expire Date</td>
				<td><form:input	type="date" path="expDate" /></td>
			</tr>
			<tr>
				<td>CVV</td>
				<td><input	type="password" name="cvv" maxlength="3" /></td>
			</tr>
			<tr>
				<td><input
					style="color: white; background-color: blue; width: 10em; margin: auto;"
					type="submit" value="Pay"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
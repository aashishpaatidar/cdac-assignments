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
<h3 align="center">Enter User Details</h3>
	<form:form method="post" modelAttribute="user">
		<table style="background-color: gray; margin: auto" border="1">
			<tr>
				<td>Name</td>
				<td><form:input path="name"/></td>

			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:input type="password" path="password" /></td>
			</tr>
			<tr>
				<td><input
					style="color: white; background-color: blue; width: 10em; margin: auto;"
					type="submit" value="Sign Up" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
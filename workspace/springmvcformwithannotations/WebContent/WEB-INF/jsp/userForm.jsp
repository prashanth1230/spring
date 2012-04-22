<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<style>
.error {
color: #ff0000;
font-style: italic;
}
</style>
</head>
<body>

<form:form method="POST" commandName="user">
	<table>
		<tr>
			<td>User Name :</td>
			<td><form:input path="name" /></td>
			<td><form:errors path="name" cssClass="error" /></td>
		</tr>
		<tr>
			<td>Password :</td>
			<td><form:password path="password" /></td>
			<td><form:errors path="password" cssClass="error" /></td>
		</tr>
		<tr>
			<td>Gender :</td>
			<td><form:radiobutton path="gender" value="M" label="M" /> 
				<form:radiobutton path="gender" value="F" label="F" /></td>
			<td><form:errors path="gender" cssClass="error" /></td>	
		</tr>
		<tr>
			<td>Country :</td>
			<td><form:select path="country">
				<form:option value="" label="Select" />
				<form:option value="1" label="India" />
				<form:option value="2" label="USA" />
				<form:option value="3" label="UK" />
			</form:select></td>
			<td><form:errors path="country" cssClass="error" /></td>
		</tr>
		<tr>
			<td>About you :</td>
			<td><form:textarea path="aboutYou" /></td>
			<td><form:errors path="aboutYou" cssClass="error" /></td>
		</tr>
		<tr>
			<td>Community :</td>
			<td><form:checkbox path="community" value="Spring"
				label="Spring" /> <form:checkbox path="community" value="Hibernate"
				label="Hibernate" /> <form:checkbox path="community" value="Struts"
				label="Struts" /></td>
			<td><form:errors path="community" cssClass="error" /></td>
		</tr>
		<tr>
			<td colspan="3"><form:checkbox path="mailingList"
				label="Would you like to join our mailinglist?" /></td>
		</tr>
		<tr>
			<td colspan="3"><input type="submit" value="Register"></td>
		</tr>
	</table>
</form:form>

</body>
</html>
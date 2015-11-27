<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="invia" method="post" commandName="user">
		<table>
			<tr>
				<td>nome:</td>
				<td><form:input path="name" />
					<form:errors path="name"></form:errors></td>
			</tr>
			<tr>
				<td>cognome:</td>
				<td><form:input path="surname" />
					<form:errors path="surname" /></td>
			</tr>
			<tr>
				<td>giorno:</td>
				<td><form:input path="day" /></td>
			</tr>
			<tr>
				<td>mese:</td>
				<td><form:input path="month" /></td>
			</tr>
			<tr>
				<td>anno:</td>
				<td><form:input path="year" /></td>
			</tr>
			<tr>
				<td>Regione:</td>
				<td><form:select path="region">
						<form:option value="NONE" label="--- Select ---" />
						<form:options items="${regionList}" />
					</form:select></td>
			</tr>
			<tr>
				<td>Province:</td>
				<td><form:input path="province" /></td>
			</tr>
			<tr>
				<td>Country:</td>
				<td><form:input path="country" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save Changes" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
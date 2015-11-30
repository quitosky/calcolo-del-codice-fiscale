<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
nome:<c:out value="${name}"></c:out>
<br>
cognome:<c:out value="${surname}"></c:out>
<br>
giorno:<c:out value="${day}"></c:out>
<br>
nome:<c:out value="${month}"></c:out>
<br>
nome:<c:out value="${year}"></c:out>
<br>
region:<c:out value="${region}"></c:out>
<br>

provincia:<c:out value="${province}"></c:out>
<br>
country:<c:out value="${country}"></c:out>
<br>
sex:<c:out value="${sex}"></c:out>
</body>
</html>
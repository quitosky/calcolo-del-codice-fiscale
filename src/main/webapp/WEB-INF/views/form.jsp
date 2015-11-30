<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//Dlabel HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dlabel">
<html>

<head>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"
	rel="stylesheet">
</head>
<body>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>

	<script src="<c:url value="/resources/bootstrap/js/util.js"/>"></script>
	<div class="container-fluid">
		<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<form:form action="invia" method="post" commandName="user">
				<div class="form-group">

					<label>nome:</label>
					<form:input path="name" class="form-control" />
					<form:errors path="name" class="form-control"></form:errors>
				</div>
				<div class="form-group">
					<label>cognome:</label>
					<form:input path="surname" class="form-control" />
					<form:errors path="surname" class="form-control" />
				</div>
				<div class="form-group">
					<label>sesso:</label>
					</br>
					<form:checkboxes class="checkbox-inline" path="sex" items="${sexList}" />
				</div>
				<div class="form-group">
					<label>giorno:</label>
					<form:input path="day" class="form-control" />
				</div>
				<div class="form-group">
					<label>mese:</label>
					<form:input path="month" class="form-control" />
				</div>
				<div class="form-group">
					<label>anno:</label> <form:input path="year"
							class="form-control" />
				</div>
				<div class="form-group">
					<label>Regione:</label>
					<form:select path="region" class="form-control">
						<form:option value="NONE" label="--- Select ---" />
						<form:options items="${regionList}" />
					</form:select>
				</div>
				<div class="form-group">
					<label>Province:</label>
					<form:select path="province" class="form-control">

					</form:select>
				</div>
				<div class="form-group">
					<label>Country:</label>
					<form:select path="country" class="form-control" />
				</div>
				<div class="form-group">
					<input type="submit" value="Sslva" class="btn btn-default" />
				</div>

			</form:form>
			</div>
			<div class="col-md-2"></div>
		</div>
	</div>
</body>
</html>
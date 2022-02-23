<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Customer Form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="customer">
			First Name* : <form:input path="firstName"/>
						  <form:errors path="firstName" cssClass="error" />
			
			<br><br>
			Last Name* : <form:input path="lastName"/>
						 <form:errors path="lastName" cssClass="error" 	/>
			<br><br>
			
			Enter a number between 0 to 10 : <form:input path="number"/>
											 <form:errors path="number" cssClass="error"/>
			<br><br>
			Postal Code: <form:input path="postalCode"/>
						 <form:errors path="postalCode" cssClass="error" />
			
			<br><br>
			Course Code: <form:input path="courseCode"/>
						 <form:errors path="courseCode" cssClass="error" />
			
			<br><br>
			
			<input type="submit" value="Submit">
		</form:form>
	</body>
</html>
	
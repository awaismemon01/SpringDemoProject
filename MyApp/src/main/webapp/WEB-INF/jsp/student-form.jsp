<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
			<title>Student Form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
			First Name: <form:input path="firstName"/>
			<br><br>
			Last Name* : <form:input path="lastName"/>
<%-- 					<form:errors path="lastName" cssClass="error" 	/> --%>
			<br><br>

			Language Preference: <form:radiobuttons path="language" items="${student.languageOptions}"/>
			
			<br><br>
			
			Operating Systems Comfortable with: 
								<form:checkboxes items="${student.osOptions}" path="os"/>

			<br><br>
			
			Country: <form:select path="country">
						<form:options items="${student.countryOptions}" />
					</form:select>
			
			
			<br><br>

			<input type="submit" value="Submit">
		</form:form>
	</body>
</html>
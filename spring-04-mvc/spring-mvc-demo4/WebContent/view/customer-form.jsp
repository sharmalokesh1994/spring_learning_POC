<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>

<body>

<i> * means Required field</i>

<form:form action="processForm" modelAttribute="customer">

	First Name <form:input path="firstName"/>
	<br><br>
	Last Name* <form:input path="lastName"/>
	
	<form:errors path="lastName"></form:errors>
	<br><br>
	Free Pass* <form:input path="freepass"/>
	
	<form:errors path="freepass"></form:errors>
	<br><br>
	Postal Code* <form:input path="postalCode"/>
	
	<form:errors path="postalCode"></form:errors>
	<br><br>
	
	Course Code* <form:input path="courseCode"/>
	
	<form:errors path="courseCode"></form:errors>
	<br><br>

	<input type="submit" value="Submit">

</form:form>

</body>

</html>
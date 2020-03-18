<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>

<body>


<form:form action="processForm" modelAttribute="student">

	First Name <form:input path="firstName"/>
	<br><br>
	Last Name <form:input path="lastName"/>
	<br><br>
	
	Country : 
	
	<form:select path="state">
	
	<!-- 	
		<form:option value="India" label="India"></form:option>
		<form:option value="France" label="France"></form:option>
		<form:option value="Germany" label="Germany"></form:option>
		<form:option value="Brazil" label="Brazil"></form:option>
		 -->
		 
		 
	  <form:options items="${student.stateOptions}"/>
		
		
	</form:select>
	
	<br><br>
	
	<form:select path="country">
		
		
		<form:options items="${theCountryOptions}"/>
		
	</form:select>
	
	<br><br>
	
	Fav Language : 
	PHP : <form:radiobutton path="favLanguage" value="PHP"/>
	JAVA : <form:radiobutton path="favLanguage" value="JAVA"/>
	C:<form:radiobutton path="favLanguage" value="C"/>
	
	<br><br>
	Fav OS : 
	win : <form:checkbox path="favOS" value="win"/>
	lin : <form:checkbox path="favOS" value="lin"/>
	mac : <form:checkbox path="favOS" value="mac"/>
	
	<br><br>
	<input type="submit" value="Submit">

</form:form>

</body>

</html>
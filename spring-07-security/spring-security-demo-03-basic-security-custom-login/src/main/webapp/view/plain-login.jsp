<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>custom-login-page</title>

<style>
		.failed {
			color: red;
		}
	</style>

</head>
<body>

<h3>My Custom Login Page</h3>

<!-- pageContext.request.contextPath = Context root of the page -->
	<form:form action="${pageContext.request.contextPath}/authenticateTheUser">


	<!-- Check for login error -->
	<!-- spring security will pass the error parameter in case of invalid authentication Now we can use jstl to check "error" param -->
		<c:if test="${param.error != null}">
		
			<i class="failed">Sorry! You entered invalid username/password.</i>
			
		</c:if>

		<p>
			User name: <input type="text" name="username" />
		</p>

		<p>
			Password: <input type="password" name="password" />
		</p>
		
		<input type="submit" value="Login" />


	</form:form>

</body>
</html>
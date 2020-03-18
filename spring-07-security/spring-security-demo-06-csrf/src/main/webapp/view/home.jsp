<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>

<h2> Welcome To Home Page </h2>

	<form:form action="${pageContext.request.contextPath}/logout" 
								   method="POST" >
			<button type="submit" value="Log Out">Log Out</button>					 
	</form:form>

</body>
</html>
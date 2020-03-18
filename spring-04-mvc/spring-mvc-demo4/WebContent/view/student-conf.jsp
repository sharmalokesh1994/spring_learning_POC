<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>


Student Confirm is : ${student.firstName} ${student.lastName} <br><br> ${student.country} 
<br><br>${student.favLanguage} 


<ul>
	<c:forEach var="temp" items="${student.favOS}" >
	
		<li> ${temp} </li>
	
	</c:forEach>

</ul>

</body>

</html>
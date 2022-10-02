<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Student confirmation</title>
	</head>
	<body>
		The Student is confirmed: ${ student.firstName } ${ student.lastName }
		
		<br><br>
		
		Country: ${ student.country }
		
		<br><br>
		
		Favorite Language: ${ student.favoriteLanguage }
		
		<br><br>
		
		Operating Systems:
		
		<ul>
			<c:forEach var="tmp" items="${ student.operatingSystems }">
				<li> ${ tmp } </li>
			</c:forEach>
		</ul>
		
	</body>
</html>
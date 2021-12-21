<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
	<title>luv2code Company Home Page</title>

</head>

	<hr>
<body>
	<h2>luv2code company home page - Yoohoo - silly - No SOUP!!!</h2>
	<hr>
	
	<p>
	Welcome to the luv2code company home page!
	</p>
	
	<!-- Add a logout button -->
	<form:form action="${pageContext.request.contextPath}/logout"
	           method="POST">
	          
	     <input type="submit" value="logout" />
	           
	</form:form>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${recipe.getTitle()}</title>
</head>
<body>
	<h1>${recipe.getTitle()}</h1>	
	<p>${recipe.getDescription()}</p>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New recipe form</title>
</head>
<body>
	<h1>New recipe form</h1>
	<%-- <form method="post" action="/5CookBook/saveRecipe" >
	<input type="text" id="title" name="title">
	<input type="text" id="description" name="description">
	
	<input type="submit" value="create"/>
	</form> --%>
	<form:form modelAttribute="recipe" method="post" action="/5CookBook/save-recipe">
	<form:input path="title" id="title"/>
	<form:input path="description" id="description" value="${recipe.description}"/>
	<input type="submit" value="create" />
	
	</form:form>
	
</body>
</html>

<!-- 

value="${recipe.title}" -->
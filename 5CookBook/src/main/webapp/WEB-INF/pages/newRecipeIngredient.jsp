<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add an ingredient to your recipe</title>
</head>
<body>
<component:navbar />
	<h1>Select a new ingredient for ${recipe.getTitle()}</h1>
	
	<form:form modelAttribute="recipeIngredientDto" method="post" action="/5CookBook/recipes/${id}/ingredients/save">
		<div>
            <label for="ingredient">Ingredient:</label>
            <form:select path="ingredientId">
	            <form:option value="">Select an ingredient</form:option>
	            <form:options items="${ingredients}" itemValue="id" itemLabel="name" />
        	</form:select>
        </div>
        <div>
            <label for="quantity">Quantity:</label>
            <form:input type="number" path="quantity" />
        </div>
        <div>
            <input class="bouton" type="submit" value="Add Ingredient" />
        </div>
	</form:form>
<component:footer />
</body>
<style>
<%@include file="styles.css"%>
</style>
</html>
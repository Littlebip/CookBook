<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New recipe form</title>
</head>
<body>
	<h1>New recipe form</h1>

	<form:form modelAttribute="recipe" method="post"
		action="/5CookBook/save-recipe">
		<form:input type="text" path="title" id="title" value="${recipe.title}" placeholder="title"/><br>
		<form:textarea path="description" id="description" value="${recipe.description}" placeholder="description"/><br>
		
		<c:forEach items="${recipe.recipeIngredients}" varStatus="status">
			<form:select path="recipeIngredients[${status.index}].ingredient.name" id="recipeIngredientName">
				<form:option value="">Select your recipe ingredients</form:option>
				<form:options items="${ingredients.values()}" itemValue="name" itemLabel="name"/>
			</form:select><br>
			<form:input type="number"  path="recipeIngredients[${status.index}].quantityInGrams" id="recipeIngredientQuantity" /><br>
		</c:forEach>
		

		<input type="submit" value="create" />
	</form:form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Here is your recipe</title>
</head>
<body>
	<h1>${recipe.getTitle()}</h1>	
	<p>${recipe.getDescription()}</p>
	<p>My recipe: ${recipe}</p>
	
	<ul>
	<!-- check if need to add an if to check there are recipeIngredients -->
	<%-- <c:if test="${recipe.getRecipeIngredients().size() != 0}">	</c:if> --%>
		<c:forEach items="${recipe.recipeIngredients}" var="current" varStatus="counter">
			<li>
				<c:out value="${current.getIngredient().getName()} : " />
				<c:out value="${current.getQuantityInGrams()} grams" />
			</li>
		</c:forEach>
	</ul>
	
	<%-- <div id="ingredients-list">
		<!-- recipe ingredient -- to create recipeIngredient -- by default one displayed -->
		<c:forEach items="${recipe.recipeIngredients}" varStatus="status">
				<div class="ingredient-input">
					<form:select path="recipeIngredients[${status.index}].ingredient.name" id="recipeIngredientName">
						<form:option value="">Select your recipe ingredients</form:option>
						<form:options items="${ingredients.values()}" itemValue="name" itemLabel="name"/>
					</form:select>
					<form:input type="number"  path="recipeIngredients[${status.index}].quantityInGrams" id="recipeIngredientQuantity" /><br>
				</div>	
		</c:forEach>
	</div> --%>
	
	<a href="${id}/ingredients/new">Add an ingredient</a>
		
		<!-- to add additional recipe ingredients -->
		<!-- <button type="button" id="add-ingredient-input">Add ingredient</button> -->
		
	
	<a href="/5CookBook">Back to homepage</a>
</body>
</html>
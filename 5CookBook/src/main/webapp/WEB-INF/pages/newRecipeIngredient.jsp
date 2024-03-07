<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add an ingredient to your recipe</title>
</head>
<body>
	<form:form modelAttribute="recipeIngredient" method="post" action="/{id}/ingredients/save">
	<%-- <div id="ingredients-list">
			<!-- recipe ingredient -- to create recipeIngredient -- by default one displayed -->  --%>
			<c:forEach items="${recipe.recipeIngredients}" varStatus="status">
					<div class="ingredient-input">
						<form:select path="recipeIngredients[${status.index}].ingredient.name" id="recipeIngredientName">
							<form:option value="">Select your recipe ingredients</form:option>
							<c:forEach items="${ingredientsList}" var="ingredient">
			                    <form:option value="${ingredient.getName()}">${ingredient.name}</form:option>
			                </c:forEach>
						</form:select>
						<form:input type="number"  path="recipeIngredients[${status.index}].quantityInGrams" id="recipeIngredientQuantity" /><br>
					</div>	
			</c:forEach>
			
			
			
		<!-- </div> -->
		
		<input type="submit" value="add an ingredient" />
	</form:form>
		<!-- to add additional recipe ingredients -->
		<!-- <button type="button" id="add-ingredient-input">Add ingredient</button> -->
		

		

</body>
</html>
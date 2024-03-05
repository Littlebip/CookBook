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

	<form:form modelAttribute="recipe" method="post" action="/5CookBook/save-recipe">
		<!-- recipe title -->
		<form:input type="text" path="title" id="title" value="${recipe.title}" placeholder="title"/><br>
		<!-- recipe description -->
		<form:textarea path="description" id="description" value="${recipe.description}" placeholder="description"/><br>
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
		<!-- to add additional recipe ingredients -->
		<!-- <button type="button" id="add-ingredient-input">Add ingredient</button> -->
		

		<input type="submit" value="create a recipe" />
	</form:form>
	
	
	<%-- <h1>${recipe.getTitle()}</h1>	
	<p>${recipe.getDescription()}</p>
	<c:if test="${recipe.getRecipeIngredients().size() != 0}">
		<c:forEach items="${recipe.getRecipeIngredients()}" var="current">
			<c:out value="${current.getIngredient().getName()}"/>
			<c:out value="${current.getQuantityInGrams}"/>
		</c:forEach>
	</c:if>
	
	<a href="new-recipe-ingredient">Add an ingredient</a> --%>
	
	<!-- TODO: add to a separate javascript file -->
	<!-- <script>
		let addIngBtn = document.getElementById("add-ingredient-input");
		addIngBtn.addEventListener('click', addRecipeIngredient);
		
		function addRecipeIngredient() {
			console.log("triggered");
			/* let ingredientIndex = document.querySelectorAll(".ingredient-input").length; */
			let newIngredientHtml = '<c:forEach items="${recipe.recipeIngredients}" varStatus="status">' + 			
										'<div class="ingredient-input">' +
										'<form:select path="recipeIngredients[${status.index}].ingredient.name" id="recipeIngredientName">' + 
											'<form:option value="">Select your recipe ingredients</form:option>' + 
											'<form:options items="${ingredients.values()}" itemValue="name" itemLabel="name"/>' + 
										'</form:select>' +
										'<form:input type="number"  path="recipeIngredients[${status.index}].quantityInGrams" id="recipeIngredientQuantity" /><br>' +
									'</div>' +
									'</c:forEach>';
			let ingredientsList = document.getElementById("ingredients-list");
			let newDiv = document.createElement('div');
			newDiv.innerHTML = newIngredientHtml;
			ingredientsList.appendChild(newDiv);
		}
	
	</script> -->
</body>
</html>
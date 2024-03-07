<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">

    <title>New Recipe</title>
    <script src="https://kit.fontawesome.com/a076d05399.js"></script>
</head>

<body class="bRecipe">

    <div class="banner-container">
        <!-- Image de la bannière -->
        <img src="https://cdn.discordapp.com/attachments/1186591715323293706/1214848633095069716/banner2.jpg?ex=65fa9af4&is=65e825f4&hm=c2358e84f3963589ed7b72ddc9695f07a708cea508b1d121c5849ba868a27ab9&" alt="fruits" class="banner-image">
        <!-- Texte sur la bannière -->
        <div class="banner-text">
            <p>Chef, tell me more</p>
        </div>
    </div>
    <div class="form">
    <form:form modelAttribute="recipe" method="post" action="save">
		<!-- recipe title -->
		<label for="recipeTitle">Recipe title :</label><br>
		<form:input type="text" path="title" id="recipeTitle" name="recipeTitle" value="${recipe.title}" placeholder="title"/><br>
		<!-- recipe description -->
		<label for="recipeInstructions">Instructions</label><br>
		<form:textarea path="description" id="recipeInstructions" name="recipeInstructions" rows="4" cols="50" value="${recipe.description}" placeholder="description"/><br>
		
	<input type="submit" value="create a recipe" class="bouton" />
	</form:form>
	
	
    <%-- <form action="" method="post">
        <label for="recipeTitle">Recipe title :</label><br>
        <input type="text" id="recipeTitle" name="recipeTitle"><br><br> --%>
        
        <!-- ingredients -->
        <!-- <label for="ingredients">Ingredients </label><br>
        <select id="ingredients" name="ingredients" multiple>
            Remplacer par ingredient de la  base de données
            <option value="ingredient1">Ingredient 1</option>
            <option value="ingredient2">Ingredient 2</option>
            <option value="ingredient3">Ingredient 3</option>
        </select><br><br> -->

        <%-- <label for="recipeInstructions">Instructions</label><br>
        <textarea id="recipeInstructions" name="recipeInstructions" rows="4" cols="50"></textarea><br><br>



        <input type="submit" value="Add to my Cook Book" class="submit">
    </form> --%>
</div>


</body>
 <style>
<%@include file="styles.css"%>
</style>

</html>


<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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

	<form:form modelAttribute="recipe" method="post" action="save">
		<!-- recipe title -->
		<form:input type="text" path="title" id="title" value="${recipe.title}" placeholder="title"/><br>
		<!-- recipe description -->
		<form:textarea path="description" id="description" value="${recipe.description}" placeholder="description"/><br>
		<div id="ingredients-list">
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
			
				<%-- 	
			
		</div>
		<!-- to add additional recipe ingredients -->
		<!-- <button type="button" id="add-ingredient-input">Add ingredient</button> -->
		

		<input type="submit" value="create a recipe" />
	</form:form>
	
	
	<h1>${recipe.getTitle()}</h1>	
	<p>${recipe.getDescription()}</p>
	<c:if test="${recipe.getRecipeIngredients().size() != 0}">
		<c:forEach items="${recipe.getRecipeIngredients()}" var="current">
			<c:out value="${current.getIngredient().getName()}"/>
			<c:out value="${current.getQuantityInGrams}"/>
		</c:forEach>
	</c:if>
	
	<a href="new-recipe-ingredient">Add an ingredient</a>
	
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
</html> --%>
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
	<p>${recipe.getTitle()} -- ajouter des ingredients:</p>
	
	
	
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
            <input type="submit" value="Add Ingredient" />
        </div>
		
		
		
		<%-- <select id="ingredient">
			<option value="">Select your recipe ingredient</form:option>
			<c:forEach items="${ingredients}" var="ing">
                   <option value="${ing.id}">${ing.name}</option>
               </c:forEach>
               <!-- <option value="1">sel</option>
               <option value="2">poivre</option> -->
		</select>
		<form:input type="number"  path="quantityInGrams" id="quantity" name="quantityInGrams"/><br>

		
		<input type="submit" value="add an ingredient" />
		<!-- <a href="save">ok</a> --> --%>
	</form:form>
		<!-- to add additional recipe ingredients -->
		<!-- <button type="button" id="add-ingredient-input">Add ingredient</button> -->
		

		

</body>
</html>
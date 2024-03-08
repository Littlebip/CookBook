<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Your delicious recipe</title>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
	
</head>
<body>
	<component:navbar />
	
	<div class="container">
		<h1 class="recipe-title">${recipe.title}</h1>
		
		<c:if test="${recipe.recipeKcal != 0}">
		<h3>For ${recipe.recipeKcal} kcal of pure pleasure!</h3>
		</c:if>
		
	
	<hr style="width:50%;text-align:left;margin-left:0">
	
	<h2 class="recipe-subtitles">You'll need :</h2>
	
	<c:if test="${empty recipe.recipeIngredients}">
		<a class="bouton" href="${id}/ingredients/new">add ingredient</a>
	</c:if>
	
	<c:if test="${not empty recipe.recipeIngredients}">
		
		<ul>
			<c:forEach items="${recipe.recipeIngredients}" var="current" varStatus="counter">
				<li>
					<c:out value="${current.ingredient.name} : " />
					<c:out value="${current.quantityInGrams} grams" />
				</li>
			</c:forEach>
			<a class="bouton" href="${id}/ingredients/new">add another ingredient</a>
		</ul>
	</c:if>
	
	
	<hr style="width:50%;text-align:left;margin-left:0">
	
	<h2 class="recipe-subtitles">Steps to victory :</h2>
	<p>${recipe.description}</p>

	<a class="bouton"href="/5CookBook">back</a>
	</div>
	
	<div class="bottom-space"></div>
	<component:footer />
</body>
<style>
<%@include file="styles.css"%>
</style>
</html>
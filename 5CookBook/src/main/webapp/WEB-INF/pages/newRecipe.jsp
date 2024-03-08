<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- <link rel="stylesheet" href="style.css"> -->

<title>New Recipe</title>
<script src="https://kit.fontawesome.com/a076d05399.js"></script>
</head>

<body class="bRecipe">
	<component:navbar />

	<div class="banner-container">
		<!-- Image de la bannière -->
		<img src="https://cdn.discordapp.com/attachments/1186591715323293706/1214848633095069716/banner2.jpg?ex=65fa9af4&is=65e825f4&hm=c2358e84f3963589ed7b72ddc9695f07a708cea508b1d121c5849ba868a27ab9&" alt="fruits" class="banner-image">
		<!-- Texte sur la bannière -->
		<div class="second-banner-text">
			<p>Chef, tell me more</p>
		</div>
	</div>
	<div class="form">
		<form:form modelAttribute="recipe" method="post" action="save">
			<!-- recipe title -->
			<label for="recipeTitle">Title</label>
			<br>
			<form:input type="text" path="title" id="recipeTitle"
				name="recipeTitle" value="${recipe.title}" placeholder="title" />
			<br>
			<!-- recipe description -->
			<label for="recipeInstructions">Instructions</label>
			<br>
			<form:textarea path="description" id="recipeInstructions"
				name="recipeInstructions" rows="4" cols="50"
				value="${recipe.description}" placeholder="description" />
			<br>

			<input class="bouton" type="submit" value="create" />
		</form:form>
	</div>
	<div class="bottom-space"></div>
	
	<component:footer />
</body>
<style>
<%@include file="styles.css"%>
</style>
</html>
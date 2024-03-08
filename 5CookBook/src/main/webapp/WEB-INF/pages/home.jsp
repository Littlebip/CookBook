<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
<!-- 	<link rel="stylesheet" href="styles.css"> -->
	<link href="<c:url value="/resources/styles.css"/>" rel="stylesheet">
	<script src="https://kit.fontawesome.com/a076d05399.js"></script>
</head>
<body>
	<component:navbar />
	<div class="main-content">
		<div class="banner-container">
			<!-- Image de la bannière -->
			<img src="https://cdn.discordapp.com/attachments/1186591715323293706/1213059054239227965/banner1.jpg?ex=65f41848&is=65e1a348&hm=e0a67561ec6e7dd29dff8a3dd52d6b82a51fdf71f48bcbead0c62a0db7c02a20&" alt="fruits" class="banner-image">
			<!-- Texte sur la bannière -->
			<div class="home-banner-text">
				<p>Chef.</p>
				<p> Cooking with you, everywhere.</p>
				<a class="main-button" href="recipes/new">new recipe</a>
			</div>
		</div>
		
		<div>
			<h2>My recipes</h2>
			<c:forEach items="${recipes}" var="recipe">
			    <div class="recipe">
			        <h3>${recipe.title}</h3>
			        <%-- <p>${recipe.recipeKcal} kcal</p> --%>
			        <a href="recipes/${recipe.id}">Have a look</a>
			    </div>
			</c:forEach>
		</div>
		<div class="bottom-space"></div>
	
	</div>
	<component:footer />
</body>
<style>
<%@include file="styles.css"%>
</style>
</html>

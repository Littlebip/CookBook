<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${recipe.getTitle()}</title>
</head>
<body>
	<h1>${recipe.getTitle()}</h1>	
	<p>${recipe.getDescription()}</p>
	
	<ul>
		<c:forEach items="${recipe.recipeIngredients}" var="current" varStatus="counter">
			<li>
				<c:out value="${current.getIngredient().getName()} : " />
				<c:out value="${current.getQuantityInGrams()} grams" />
			</li>
		</c:forEach>
	</ul>
	
	<a href="/5CookBook">Back to homepage</a>
</body>
</html>
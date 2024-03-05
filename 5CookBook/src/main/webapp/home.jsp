<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>My cookbook project</title>
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
		<link rel="stylesheet" href="styles.css">
	</head>
	<body>
		<component:navbar />
		<h1>Homepage</h1>
		<a href="recipes/new">new recipe</a>
		<a href="load">load database</a>
		<component:footer />
	
	
	</body>
</html>
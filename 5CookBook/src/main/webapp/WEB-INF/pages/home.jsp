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
	<link rel="stylesheet" href="styles.css" type="text/css"> 
	<link href="<c:url value="/resources/styles.css"/>" rel="stylesheet">
	<script src="https://kit.fontawesome.com/a076d05399.js"></script>
</head>
<body>
	<header>
		<div class="header">
			<!-- header-->
			<nav class="menu">
				<ul>
					<li><a href="Login">Login</a></li>
				</ul>
			</nav>
		</div>
	</header>
	<div class="banner-container">
		<!-- Image de la bannière -->
		<img src="https://cdn.discordapp.com/attachments/1186591715323293706/1213059054239227965/banner1.jpg?ex=65f41848&is=65e1a348&hm=e0a67561ec6e7dd29dff8a3dd52d6b82a51fdf71f48bcbead0c62a0db7c02a20&" alt="fruits" class="banner-image">
		<!-- Texte sur la bannière -->
		<div class="banner-text">
			<p>Chef.</p>
			<p> Cooking with you, everywhere.</p>
		</div>
	</div>
	
	<form action="recipes/new">
      <button type="submit" class="bouton">New recipe</button>
    </form>
	
	

	<div>
		<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore
			magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
			commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat
			nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit
			anim id est laborum.</p>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore
				magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
				commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat
				nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit
				anim id est laborum.</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore
					magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
					commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat
					nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit
					anim id est laborum.</p>
	</div>




	<footer class="footer">
		<ul class="social-icons">
			<li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
			<li><a href="#"><i class="fab fa-twitter"></i></a></li>
			<li><a href="#"><i class="fab fa-instagram"></i></a></li>
			<li><a href="#"><i class="fab fa-linkedin-in"></i></a></li>
		</ul>
	</footer>
</body>
 <style>
<%@include file="styles.css"%>
</style>
</html>



<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
		<!-- <a href="load">load database</a> -->
		<component:footer />
	
	
	</body>
</html> --%>

<%-- <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags"%>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
    <component:navbar />
    <!-- test db link -->
        <div align="center">
            <h1>Contact List</h1>
            <table border="1">
            <tr>
                <th>No</th>
                <th>Username</th>
             </tr>
                 
                <c:forEach var="user" items="${testUserList}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${user.username}</td>
                             
                </tr>
                </c:forEach>             
            </table>
        </div>
        
      
        <a href="recipes/new">new recipe</a>
        
        <component:footer />
    </body>
</html> --%>
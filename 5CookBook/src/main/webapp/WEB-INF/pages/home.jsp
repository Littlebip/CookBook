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

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <%-- <div align="center">
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
        </div> --%>
        
      
        <a href="recipes/new">new recipe</a>
        
        <component:footer />
    </body>
</html>
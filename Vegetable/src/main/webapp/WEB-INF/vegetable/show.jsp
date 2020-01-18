<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Single Vegetable</title>
</head>
<body>
  <h5>ID: ${veg.id} </h5>
  <h5>Name: ${veg.name} </h5>
  <h5>Grams: ${veg.grams} </h5>
  <h5>Fat: ${veg.fat} </h5>
  <h5>Protein: ${veg.protein} </h5>
  <h5>Carbs: ${veg.carbs} </h5>
  <h5>Fiber: ${veg.fiber} </h5>
  <h5>Type: ${veg.type} </h5>
  
  <c:if test="${! empty vegetable}">
	<form action="modifyFilm.do" method="GET">
		<input type="hidden" name="VegId" value="${veg.id}" />
		<input type="submit" name="Edit" value="Edit" />
	</form>
	<form action="deleteFilm.do" method="POST">
		<input type="hidden" name="VegId" value="${veg.id}" />
		<input type="submit" name="Delete" value="Delete" />
	</form>
	</c:if>
	<br>
	<form action="home.do" method="GET">
		<input type="submit" value="Home" />
	</form>
</body>
</html>
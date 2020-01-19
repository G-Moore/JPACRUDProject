<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Single Vegetable</title>
</head>
<body>
	<c:choose>
		<c:when test="${! empty veg}">
			<ul>
				<li>ID: ${veg.id}</li>
				<li>Name: ${veg.name}</li>
				<li>Grams: ${veg.grams}</li>
				<li>Fat: ${veg.fat}</li>
				<li>Protein: ${veg.protein}</li>
				<li>Carbs: ${veg.carbs}</li>
				<li>Fiber: ${veg.fiber}</li>
				<li>Type: ${veg.type}</li>
			</ul>
		</c:when>
	<c:otherwise>
		<p>No Vegetable Found</p>
	</c:otherwise>
	</c:choose>
	<form action="modify.do" method="GET">
		<input type="hidden" name="VegId" value="${veg.id}" /> 
		<input type="submit" name="Edit" value="Edit" />
	</form>
	<form action="delete.do" method="GET">
		<input type="hidden" name="VegId" value="${veg.id}" /> 
		<input type="submit" name="Delete" value="Delete" />
	</form>

	<br>
	<form action="/" method="GET">
		<input type="submit" value="Home" />
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Vegetables</title>
</head>
<body>
	<h2>Search Results</h2>
	
	<c:if test="${! empty veg}">
		<a href="showVeg.do?vid=${veg.id}">${veg.name}</a><br>
	</c:if>
	<c:if test="${! empty vegs}">
	<ul>
		<c:forEach var="vegetable" items="${vegs}">
		<li>
		<a href="showVeg.do?vid=${vegetable.id}">${vegetable.name}</a>
		</li>
		</c:forEach>
	</ul>
	</c:if>
	<c:if test="${empty veg}">No Results Found</c:if>
	<form action="/" method="GET">
		<input type="submit" value="Home" />
	</form>
</body>


</html>
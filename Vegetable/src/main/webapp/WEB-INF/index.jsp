<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vegetable Powers</title>
</head>
<body>
<h1>Vege tables</h1>
<form action="getVeg.do" method="GET">
  Vegetable ID: <input type="text" name="vid" />
  <input type="submit" value="Show Vegetable" />
</form>
<c:forEach var="vegetable" items="${vegs}">
		<li>
		 <a href="getVeg.do?vid=${vegetable.id}">${vegetable.name}</a>
		</li>
</c:forEach> 
</body>
</html>
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
<h1>Vegetables</h1>
<form action="listVeg.do" method="GET">
  Vegetable ID: <input type="number" name="vid" />
  <input type="submit" value="Show Vegetable" />
</form>
<form action="createNewPage.do">
  <input type="submit" value="Add Vegetable" />
</form>
</body>
</html>
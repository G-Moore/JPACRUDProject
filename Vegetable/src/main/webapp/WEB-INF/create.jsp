<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create a Vegetable</title>
</head>
<body>
	<H1>Create</H1>
	<form action="create.do" method="POST">

		<label for="name">Name</label> 
			<input type="text" name="name" /><br>

		<label for="grams">Grams</label>
		 	<input type="text" name="grams" /><br>

		<label for="fat">Fat</label>
			 <input type="text" name="fat" /><br> 
			 
		<label for="protein">Protein</label>
			  <input type="text" name="protein" /><br>

		<label for="carbs">Carbs</label>
			 <input type="text" name="carbs" /><br>

		<label for="fiber">Fiber</label>
			 <input type="text" name="fiber" /><br>

		<label for="type">Type</label>
			 <input type="text" name="type" /><br>
			 
		<input type="hidden" name="vegId" value="${veg.id}" /> 
		<input type="submit" name="Submit" value="Submit" />
	</form>

	<form action="/" method="GET">
		<input type="submit" value="Home" />
	</form>

</body>
</html>
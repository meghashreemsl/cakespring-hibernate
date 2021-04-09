<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	 <form action="product.do">
	 <table>
	<tr>
	   <td><label>product cake ID:</label> </td>
	   <td><input type="text" name="p_cakeId"></td>
	</tr>
	<tr>
		<td><label>cake name:</label></td>
		<td> <input type="text" name="p_cakeName"></td>
	</tr>
	<tr>
	    <td><label>cake price:</label><td>
	    <td> <input type="text" name="p_cakePrice"></td>
	</tr>
	<tr>
		<td><label>quantity:</label></td>
	 	<td><input type="text" name="p_quantity"></td>
	 </tr>

	<tr>
		<td><label>rating:</label> </td>
		<td><input type="text" name="p_rating"></td>
	</tr>
	<tr>
		<td><input type="submit" value="add product"></td>
	</tr>
</table>
</form>
	
</body>
</html>
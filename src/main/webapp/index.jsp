<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cake shop</title>

<link rel="stylesheet" href="css/style.css">
<script type="text/javascript" src="js/validations.js"></script>

</head>
<body class="megha" style="background-image:url('cake1.jpg');height: 100vh;background-position:center; background-size: cover; ">

	<div class="h_style">
		<label>Cake Shop</label>
		<input type="button" value="logout" style="margin-left:90%;" >
	</div>

	<form name="meg" action="cake.do" onsubmit="return validate()"
		class="formstyle" method="post">
		<table class="table_style"style="margin-left: auto; margin-right: auto;">
			<tr>
				<td align="right"><label style="color: white; font-size: 25px;">Id:</label></td>
				<td><input type="text" name="cakeId"></td>
			</tr>

			<tr>
				<td align="right"><label style="color: white; font-size: 25px;">UserName:</label></td>
				<td><input id="uName" type="text" name="userName"><span
					id="userNamelocation" style="color: red"></span></td>
			</tr>
			<tr>
				<td align="right"><label style="color: white; font-size: 25px;">EmailId:</label></td>
				<td><input type="email" name="emailId"><span
					id="emailId" style="color: red"></span></td>
			</tr>
			<tr>
				<td align="right"><label style="color: white; font-size: 25px;">ContactNo:</label></td>
				<td><input type="number" name="contactNo"><span
					id="contactNo" style="color: red"></span></td>
			</tr>
			<tr>

				<td align="right"><label style="color: white; font-size: 25px;">DOB:</label></td>
				<td><input type="date" name="dob"><br> <span id="dob" style="color: red"></span></td>
			</tr>

			<tr>
				<td align="right"><label style="color: white; font-size: 25px;">Gender:</label>
				</td>
			<td align="right"><input type="radio" id="male" name="gender"
					value="male"> <label for="male"
					style="color: white; font-size: 25px;">Male</label> <input
					type="radio" id="female" name="gender" value="female"> <label
					for="female" style="color: white; font-size: 25px;">Female</label>
					<input type="radio" id="other" name="gender" value="other">
					<label for="other" style="color: white; font-size: 25px;">Other</label>
					<span id="gender" style="color: red"></span><br>
			</td>
			<tr>
			<tr>
				<td align="right"><label style="color: white; font-size: 25px;">Password:</label></td>
				<td><input type="password" name="password"><span
					id="password" style="color: red"></span></td>
			</tr>
			<tr>
				<td align="right"><label style="color: white; font-size: 25px;">ConfirmPassword:</label></td>
				<td><input type="password" name="confirmPassword"><span
					id="confirmPassword" style="color: red"></span></td>
			</tr>
			<tr>
				<td align="right"><input type="button" value="cancel"></td>
				<td align="center"><input type="submit" value="register"></td>
			</tr>
		</table>
	</form>
	<div class="f_style">@copyright</div>
</body>
</html>
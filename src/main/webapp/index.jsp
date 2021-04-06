<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!--  <link rel="stylesheet" type="text/css" href="<c:url value="/style.css"/>">-->
<link rel="stylesheet" value="style.css">
<!-- <script type="text/javascript" src="validations.js"></script>-->
<script>
function validate(){ 

		var userNam=document.f1.userName.value;
		var nm=/^[0-9a-zA-Z]+$/;
		var emailId =document.f1.emailId.value;
		var cn=document.f1.contactNo.value;
		var cn1=/^{10}$/;
		var dob = document.f1.dob.value;
		var gender= document.f1.gender.value;
		var password=document.f1.password.value;
		var pwd= /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$/;
		var confirmPassword=document.f1.confirmPassword.value;
		
		var status = false;
		

		/*document.f1.userName.value "/^[0-9a-zA-Z]+$/"*/
	if(userNam == "" || userNam== null){
		document.getElementById("userName");
	    alert("Please enter your name");
		status = false;
	}
	
	else{
		status= true;
	}
	
	 if(!userNam.match(nm)){
		document.getElementById("userName");
	    alert("enter only alphanumeric data");
		status = false;
	}else{
		status= true;
	}
	
	if(emailId == ""){
		document.getElementById("emailId");
	    alert("Please enter your emailid");
		status = false;
	}else{
		status=true;
	}
	if(cn == "" )
	{
		document.getElementById("contactNo");
	    alert("Please enter your contactNo");
		status = false;
	}
	else{
		status=true;
	}
	if(dob=="" || dob==null){
		document.getElementById("dob");
	    alert("Please enter your dob");
		status = false;
	}
	else{
		status=true;
	} 

	if(gender=="" || gender ==null) {
			document.getElementById("gender");
			alert("Please select approriate option");
			status = false;
	}else{
	    status=true;
	}

	if(password == "" || password == null){
			document.getElementById("password");
			alert("Please enter your password");
			status = false;
	}else{
		status=true;
	}

	if(password.match(pwd)){
		document.getElementById("password");
		alert("Please enter your password");
		status = false;
}else{
	status=true;
}
	}
	if(confirmPassword == ""){
		document.getElementById("confirmPassword");
		alert("Please enter your confirmPassword");
		status = false;
	}else{
	status=true;
	}
	return status;
	}
	}
</script>
</head>
<body class="megha" style="background-image:url('cake2.jpg');
text-align:center;
background-attachment:fixed;
background-repeat: no repeat;
 background-size: cover;
padding-top:center;">
	<header >
	<div >
	<h1 style="color:white" >Cake Shop</h1>
	<input type="button" value="logout">
	</div>
	</header>

	<form name="f1" action="cake.do" onsubmit="return validate()" class="formstyle">
<div class= "center" style="text-align:center;">
<label style="color:white;font-size:25px;">Id:</label><input type="text" name="cakeId" > 
</div>
		<div class="center" style="text-align:center;">
		<label style="color:white;font-size:25px;">UserName:</label><input type="text" name="userName" ><span id="userName" style="color: red"></span> 
		</div>
		<div>
		<label style="color:white;font-size:25px;">EmailId:</label><input type="email" name="emailId" ><span id="emailId" style="color: red"></span>
		</div>
		<div>
		<label style="color:white;font-size:25px;">Contact No:</label><input type="text" name="contactNo" ><span id="contactNo" style="color: red"></span>
		</div>
		<div>
		<label style="color:white;font-size:25px;">DOB:</label><input type="date" name="dob" ><br> <span id="dob" style="color: red"></span> 
		</div>
		<div>
		<label style="color:white;font-size:25px;" >Gender:</label>
		</div>
		<div>
		<input type="radio" id="male" name="gender" value="male" > 
			<label for="male" style="color:white;font-size:25px;">Male</label> 
			<input type="radio" id="female" name="gender" value="female" > 
			<label for="female" style="color:white;font-size:25px;">Female</label> 
			<input type="radio" id="other" name="gender" value="other" > 
			<label for="other" style="color:white;font-size:25px;">Other</label>
			<span id="gender" style="color: red"></span><br>
		</div>
		
		<div>
		 <label style="color:white;font-size:25px;">Password:</label><input type="password" name="password" style="color:white"><span id="password" style="color: red"></span>
		</div>
		<div>
		<label style="color:white;font-size:25px;">ConfirmPassword:</label><input type="password" name="confirmPassword" style="color:white"><span id="confirmPassword" style="color: red"></span> 
		</div>
		  <div>
		  <input type="submit" value="register" >
		<input type="button" value="cancel">
		  </div>
	</form>

	<footer>
	<div class="footer" style="margin-top:200px;font-size:20px;color:black;background-color:pink;padding:30px;padding-right:0px;">
	@copyright 
	</div>
	 </footer>
</body>
</html>
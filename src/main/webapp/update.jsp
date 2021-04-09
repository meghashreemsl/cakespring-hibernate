<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<form action="update1.do">

update id:<input type="text" name="cakeId" placeholder="${cakeregistration.getCakeId()}">
update username:<input type="text" name="userName" placeholder="${cakeregistration.getUserName()}">
emailid: <input type="email" name="emailId" value="${cakeregistration.getEmailId()}"> 
update contact no :<input type="text" name="contactNo" placeholder="${cakeregistration.getContactNo()}">
update  Dob:<input type="date" name="dob" value="${cakeregistration.getDob()}">
update gender :<input type="text" name="gender" placeholder="${cakeregistration.getGender()}">
<input type="submit" value="update">
</form>

</body>
</html>
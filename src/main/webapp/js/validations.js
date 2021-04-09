function validate() {

	var userNam = document.forms["meg"]["userName"].value;
	// var userNam = document.forms["meg"]["userName"].value;
	// var userNam = document.f1.userName.value;
	// var nm = /^[0-9a-zA-Z]+$/;
	var emailId = document.meg.emailId.value;
	var cn = document.meg.contactNo.value;
	// var cn1=/^{10}$/;
	var dob = document.meg.dob.value;
	var gender = document.meg.gender.value;
	var password = document.meg.password.value;
	//var pwd= /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$/;
	var confirmPassword = document.meg.confirmPassword.value;
	var status = false;

	/* document.f1.userName.value "/^[0-9a-zA-Z]+$/" */
	if (userNam == "" || userNam == null) {
		console.log("invalid username");
		document.getElementById("userNamelocation").innerHTML = "Please enter your name";
		status = false;
	} else {
		console.log("valid username");
		document.getElementById("userName").innerHTML = "correct";
		status = true;
	}

	// if (!userNam.match(nm)) {
	// document.getElementById("userName").innerHTML = "enter only
	// alphanumericdata";
	// status = false;
	// } else {
	// document.getElementById("confirmPassword").innerHTML = "correct";
	// status = true;
	// }

	if (emailId == "") {
		console.log("invalid emailId");
		document.getElementById("emailId").innerHTML = "Please enter your emailid";
		status = false;
	} else {
		console.log("valid emailId");
		document.getElementById("confirmPassword").innerHTML = "correct";
		status = true;
	}

	if (cn == "") {
		console.log("invalid cn");
		document.getElementById("contactNo").innerHTML = "Please enter your contactNo";
		status = false;
	} else {
		console.log("valid cn");
		document.getElementById("confirmPassword").innerHTML = "correct";
		status = true;
	}

	/*
	 * if(contactNo.match(cn1) && contactNo.length != 10){ console.log("invalid
	 * cn"); document.getElementById("contactNo").innerHTML="Please match the
	 * format"; status = false; } else{ console.log("valid cn");
	 * document.getElementById("confirmPassword").innerHTML="correct";
	 * status=true; }
	 */
	 if (dob == "" || dob == null) {
	 console.log("invalid dob");
	document.getElementById("dob").innerHTML = "Please enter your dob";
	status = false;
	 } else {
	console.log("valid dob");
	document.getElementById("confirmPassword").innerHTML = "correct";
	status = true;
	 }
	
	 if (gender == "" || gender == null) {
	 console.log("invalid gender");
	 document.getElementById("gender").innerHTML = "Please select approriate option";
	status = false;
	 } else {
	 console.log("valid gender");
	document.getElementById("confirmPassword").innerHTML = "correct";
	status = true;
	}
	
	 if (password == "" || password == null) {
	console.log("invalid password");
	document.getElementById("password").innerHTML = "Please enter your password";
	status = false;
	 } else {
	console.log("valid password");
	document.getElementById("confirmPassword").innerHTML = "correct";
	status = true;
	 }
	//
	// if (password.match(pwd)) {
	// document.getElementById("password").innerHTML = "Please enter your
	// password";
	// status = false;
	// } else {
	// document.getElementById("confirmPassword").innerHTML = "correct";
	// status = true;
	// }
	 if (confirmPassword == "") {
	 console.log("invalid confirmPassword");
	 document.getElementById("confirmPassword").innerHTML = "Please enter your confirmPassword";
	status = false;
	} else {
	console.log("valid confirmPassword");
	document.getElementById("confirmPassword").innerHTML = "correct";
	status = true;
	}
	return status;
}
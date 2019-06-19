<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<script type="text/javascript">
			//function to check validation (Required field)
			function checkReqFields(){
				var returnValue;
				var fname=document.getElementById("txtName").value;				
				var lname=document.getElementById("txtName1").value;
				var age=document.getElementById("txtage").value;				
				var phn=document.getElementById("mb").value;
				var uid=document.getElementById("u").value;
				var pass=document.getElementById("pass").value;			
				returnValue=true;
				if(fname.trim()==""){
					document.getElementById("reqTxtName").innerHTML="* Name is required.";
					returnValue=false;
				}
				if(lname.trim()==""){
					document.getElementById("reqTxtName1").innerHTML="* last Name is required.";
					returnValue=false;
				}
				if(age.trim()==""){
					document.getElementById("reqTxtage").innerHTML="* age is required.";
					returnValue=false;
				}				
				if(phn.trim()==""){
					document.getElementById("reqTxtmb").innerHTML="* Phone number is required.";
					returnValue=false;
				}
				if(uid.trim()==""){
					document.getElementById("reqTxtuid").innerHTML="* UID number is required.";
					returnValue=false;
				}
				if(pass.trim()==""){
					document.getElementById("reqTxtpass").innerHTML="* Password is required.";
					returnValue=false;
				}							
				return returnValue;
			}
		function myFunction() {
 		 var x = document.getElementById("pass");
  		if (x.type === "password") {
    		x.type = "text";
  		} else {
   		 x.type = "password";
 		}
			}
		</script>
		<style >body{
color:black;
}</style>

</head>
<body background="D:\764758\CreditCardOnboarding\bac.jpg" style="background-size: cover;"><p style="text-align:center">
<form action="RegisterUser" onsubmit="return checkReqFields()" method="post">
 <div class="content" >
	<h1 style="color: white; font-size: 46px; text-align:center">Registration</h1>
		<h3><label>Enter First name</label></h3>		
		<input type="text" id="txtName" name="fname" pattern="(?=.*[a-z])(?=.*[A-Z]).{3,}" title="Must contain at least  one uppercase and lowercase letter, and at least 3 or more characters" maxlength="50"/>
		<span id="reqTxtName" class="reqError"></span>		
		<h3><label>Enter Last name</label></h3>
		<input type="text" id="txtName1" name="lname"/>
		<span id="reqTxtName1" class="reqError"></span>
		<h3><label>Enter age</label></h3>
		<input type="text" id="txtage" name="age"/>
		<span id="reqTxtage" class="reqError"></span>
		<h3><label>Select gender</h3></label>
       	 <!-- <class="custom-select" style="width:70px;"> -->
		<select type="text" name="gender">
		<option value="male">Male</option>
		<option value="female">Female</option>
		<option value="others">Others</option>
		</select><br>						
		<h3><label>Enter mobile number</label></h3>
		<input type="text" id="mb" name="number"   pattern="(?=.*\d).{10,}" title="Must contain at least 10 digits" maxlength="10"/>
		<span id="reqTxtmb" class="reqError"></span>
		<h3><label>Enter UID</label></h3>
		<input type="text" id="u" name="uid"  pattern="(?=.*\d).{12,}" title="Must contain at least 12 digits" maxlength="12"/>
		<span id="reqTxtuid" class="reqError"></span>
		<h3><label>Password</label></h3>
		<input type="password"  id="pass" placeholder="Password" name="pwd"  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 6 or more characters" />
		<span id="reqTxtpass" class="reqError"></span>
		<h6><input type="checkbox" onclick="myFunction()">Show Password</h6>	
<input type="submit" value="Register"/>
</div>
</form>
</body>
</html>
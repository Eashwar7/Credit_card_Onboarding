<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Track Application</title>
<style >
				function checkReqFields(){
				var returnValue;
				var uid=document.getElementById("uid").value;
				var pass=document.getElementById("password").value;			
				returnValue=true;
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
.content {

  max-width: 450px;
  margin: auto;
  padding: 20px;
  margin-top:200px;

}
</style>
</head>
<body background="D:\764758\CreditCardOnboarding\track.jpg" style="background-size: cover;" >
<div align="center" class="content">
<form  action="ApplicationServlet" onsubmit="return checkReqFields()" method="post"> 
UID<br><input type="text" name="uid" pattern="(?=.*\d).{12,}" title="Must contain at least 12 digits" maxlength="12"/><br><br>
<span id="reqTxtuid" class="reqError"></span>
Password<br><input type="password" name="pass" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 6 or more characters"/><br><br>
<span id="reqTxtpass" class="reqError"></span>
<input type="submit" value="Track"/>
</form>
</div>
</body>
</html>
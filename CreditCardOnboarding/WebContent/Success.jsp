<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration success</title>
<style>
td{
color: black;
font-size: 4mm;
}
.content {

  max-width: 450px;
  margin: auto;
  padding: 20px;
  margin-top:15px;
  color: blue;
}
</style>
</head>
<body background="D:\764758\CreditCardOnboarding\success.jpg" style="background-size: cover;">
<div align="center" class="content">
<table>
<tr><td>First Name </td><td><h4>:${requestScope.fname}</h4></td></tr>
<tr><td>last Name </td><td><h4>:${requestScope.lname}</h4></td></tr>
<tr><td>UID </td><td><h4>:${requestScope.uid}</h4></td></tr>
</table>
<br>
Credit Card Applied
<form action="Application.jsp">
<input type="submit" value="Track Status" />
</form>
</div>
</body>
</html>
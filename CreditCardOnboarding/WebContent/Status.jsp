<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Application Status</title>
<style>
h4{color:white;
}
.content {

  max-width: 450px;
  margin: auto;
  padding: 20px;
  margin-top:150px;
  color: blue;
}
</style>
</head>
<body background="D:\764758\CreditCardOnboarding\status.jpg" style="background-size: cover;">
<div align="center" class="content" >
<table>
<tr><td>UID </td><td><h4>:${requestScope.msg.uid}</h4></td></tr>
<tr><td>Application ID </td><td><h4>:${requestScope.msg.application_id}</h4></td></tr>
<tr><td>Applied Date </td><td><h4>:${requestScope.msg.application_date}</h4></td></tr>
<tr><td>Application status </td><td><h4>:${requestScope.msg.status}</h4></td></tr>
</table>
<a href="index.html">GO TO HOME PAGE</a>
</div>
</body>
</html>
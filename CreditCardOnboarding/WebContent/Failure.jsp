<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Failure</title>
</head>
<body>
<%
String str=(String)request.getAttribute("msg");
if(str!=null)
	out.print(str);
%>
<br>
<a href="Registration.jsp">Go to Registration Page</a>
</body>
</html>
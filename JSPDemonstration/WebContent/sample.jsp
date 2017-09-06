<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>



<%!int count = 0;
%>

<% 
	int localVar =20;
	localVar++; 
%>





<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users</title>
</head>
<body>

<h1> 
This page is viewed <%= count++  %>
</h1>

<p> The variable value for local is <%= localVar>0 ? localVar++ : localVar-- %> </p>



</body>
</html>
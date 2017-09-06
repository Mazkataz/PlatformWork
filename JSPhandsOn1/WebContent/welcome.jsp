<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>



<%! int pageviews =0;

String getHour(int x)
{
	return x > 12  ? "Good Evening" : "Good Morning"; 
}



%>

<%
//hello 
java.util.Calendar Cal = new java.util.GregorianCalendar(); 
java.util.Date date= Cal.getTime();
java.text.DateFormat format = new SimpleDateFormat("dd-MM-yyyy"); 
String dateval = format.format(date); 
String at = date.toString();
java.util.Calendar newDate  = new java.util.GregorianCalendar(); 
//newDate.set(java.util.Calendar.HOUR_OF_DAY, 12);
int hour = Cal.get(java.util.Calendar.HOUR_OF_DAY); 
//date.before(newDate.getTime() ) ?  out.print("Good Evening") : out.print("Good Morning")
%>






<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello! Welcome to my humble Abode</title>
</head>
<body>
<h1> Z Bank - Your Perfect Bank </h1> <b>      
<div>   </div> <%= 	 hour > 12  ? "Good Evening" : "Good Morning" %> 
<div>  </div> Thank you for your support 
<div> </div> You are visitor number <%= ++pageviews %>

</b>
<div> </div>
<%= dateval  %>

</body>
</html>
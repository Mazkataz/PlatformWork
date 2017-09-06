<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%! 
String gender =null;
String user = null;
String password =null;
String Sports =null;
String Music =null;
String Country =null; 
%>

<% 

gender = session.getAttribute("gender")!= null ? session.getAttribute("gender").toString() : null;
user = session.getAttribute("user")!= null ? session.getAttribute("user").toString() : null;
password = session.getAttribute("pass")!= null ? session.getAttribute("pass").toString() : null;
Sports = session.getAttribute("Sports")!= null ? session.getAttribute("Sports").toString() : null;
Music = session.getAttribute("Music")!= null ? session.getAttribute("Music").toString() : null;
Country = session.getAttribute("Country")!= null ? session.getAttribute("Country").toString() : null;



%>
<table style = "width:100%">
 <tr>
    <th>Firstname</th>
    <th>Lastname</th> 
    <th>Gender</th>
    <th> Hobbies </th>
    <th>Country </th>
  </tr>
  <tr>
  <div></div>
    <td><%= user!=null ? user : ' ' %></td>
    <td><%= password!=null ? password : ' ' %></td> 
    <td><%= gender!=null ? gender : ' ' %></td>
        <td><%= Sports!=null ? Sports : ' ' %>
            <%= Music!=null ? Music : ' ' %></td>
          <td> <%= Country!=null ? Country : ' ' %></td>
            
    
  </tr>


</body>
</html>
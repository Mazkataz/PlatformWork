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
static final String nullPassword = "Password cannot be null"; 

%> 

<%
String user = request.getParameter("user");
String password = request.getParameter("pass");
String gender = request.getParameter("gender");
String Dance = request.getParameter("Dance");
String Sports = request.getParameter("Sports");
String Music = request.getParameter("Music");
String Painting = request.getParameter("Painting");
String Country = request.getParameter("dropdown");


	
%>




	<%
	String message=null ; 


		if (user!=null && user!= "" && password != null && password!= "") {

			session.setAttribute("user", user);
			session.setAttribute("pass", password);
			session.setAttribute("gender", gender);
			session.setAttribute("Music", Music);
			session.setAttribute("Dance", Dance);
			session.setAttribute("Painting", Painting);
			session.setAttribute("Sports", Sports);
			session.setAttribute("Country", Country);

			response.sendRedirect("details.jsp");

		}

		else if(request.getParameter("submit")!=null) {
			message = "Password cannot be null";
			
		}
	%>

<%= message!=null ? message : ' '%>

	<form method="GET">

		<input type="text" name="user">
		 <input type="password"name="pass" />
			 Gender: 
			 Male <input type="radio" name="gender" value="Male" />
			 Female <input type="radio" name="gender" value="FeMale" /> 
		Hobbies <input type="checkbox" name="Hobbies" value="Dance" /> 
		sports<input type="checkbox"name="Hobbies" value="Sports" /> 
		music<input type="checkbox" name="Hobbies"value="Music" /> 
		painting<input type="checkbox" name="Hobbies" value="Painting" /> 
			<select name =dropdown>
			<option value="Usa">USA </option>
			<option value="Canada">CANADA </option>
			<option value="China"> CHINA </option>
			<option value="India">INDIA </option>
			<option value="Russia">RUSSIA </option>


		</select> 
		
		<input type="submit" name="Register" />
	</form>




</body>
</html>
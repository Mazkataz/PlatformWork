<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	String message = "invalid message"; 

		String user = request.getParameter("user");
		String password = request.getParameter("pass");

		if ("tom".equals(user) && "jerry".equals(password)) {

			session.setAttribute("user", user);

			response.sendRedirect("success.jsp");

		}

		else if(request.getParameter("sub")!=null) {
			 message = "invalid message"; 
			
		}
	%>

<%= message!=null ? message : ' '%>

	<form method="GET">

		<input type="text" name="user" /> <input type="password" name="pass" />
		<input type="submit" name="sub" />




	</form>



</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<%@ include  file = "header.jsp"%>

	<div>
		<form method="post" action="greetings.jsp">
			<input type="text" name="user" /> <input type="submit"
				name="submitTo" />

		</form>

	</div>

<%@include file = "footer.html"%> 

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Start</title>
</head>
<body>
	
	<form method="post" action="informations">
		<!-- Field name -->
		<label for="name">Name:</label>
		<input type=text name="name" id="name" title="Fill the field Name" required/><br/>
		
		<!-- Field email -->
		<label for="name">Email:</label>
		<input type=text name="email" id="email" title="Fill the field Email" required/>
		
		<!-- Button submit -->
		<input type=submit value="Ok"/>
	</form>
	
</body>
</html>
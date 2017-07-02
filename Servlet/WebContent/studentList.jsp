<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students List</title>
</head>
<body>
	<div align="center">
		<P>Students List</P>
		<table border="1">
			<tr>
				<td>Registration</td>
				<td>Name</td>
				<td>Telephone</td>
				<td>Register Date</td>
				<td>Commands</td>
			</tr>
			<c:forEach var="student" items="${listStudent}">
				<tr>
					<td>${student.registration}</td>
					<td>${student.name}</td>
					<td>${student.telephone}</td>
					<td><fmt:formatDate value="${student.registerdate}" type="both" pattern="MM/dd/yyyy"/>  
					<td><a href="StudentServlet?action=Delete&registration=${student.refistration}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		<c:if test="${fn:length(listStudent) > 0}">
   		There are ${fn:length(listStudent)} students!
 		</c:if><br> 		
	</div>
	<a href="menu.jsp">Back</a>
 
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Student Register</title>
</head>
<body>
	<div align="center">
		<form method="post" action="StudentServlet">
			<fieldset>
				<legend>Students Register</legend>
				
				<label>Registration: </label>
				<input name="registration" required value="${student.registration}"
					placeholder="0000000" /><br /> 
				
				<label>FullName:</label>
				<input name="full name" autofocus="autofocus"
					placeholder="Name" value="${student.name}"/><br />
 
				<label>Telephone:</label>
				<input type="telephone" name="telephone"
					placeholder="9-9999-9999" value="${student.telephone}"/><br />
				
				<label>Email:</label>
				<input type="email" name="email"
					placeholder="edvaldomelo@byui.edu" value="${student.email}"/><br />
				
				<label>Register Date:</label>
				<input type="date" name="registerDate" value="${student.registerDate}"
					placeholder="12/22/1974" /><br />
				
				<label>Action</label>
					
				<select
					name="action" required>
					<option selected value="Add">Add</option>
					<option value="Edit">Edit</option>
					<option value="Delete">Delete</option>
					<option value="Consulting">Consulting</option>
				</select><br />
				<input type="submit" value="Send">
				<input type="reset" value="Clean"> <br />
			</fieldset>
		</form>
	</div>
</body>
</html>
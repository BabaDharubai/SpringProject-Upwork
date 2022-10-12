<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add freelancer</title>
</head>
<body>
<form action="add-freelancer">
<h3>Enter the Freelancer Details</h3>
<table>
	<tr>
		<td>Freelancer Name</td>
		<td><input type="text" name="freelancerName"></td>
	</tr>
	<tr>
		<td>Freelancer ID</td>
		<td><input type="number" name="freelancerId"><br></td>
	</tr>
	<tr>
		<td>Category</td>
		<td><input type="radio" name="category" value="Development & IT">Development and IT<br>
		 <input type="radio" name="category" value="Design & Creative">Design and Creative<br>
		<input type="radio" name="category" value="Sales & Marketing">Sales and Marketing <br>
		<input type="radio" name="category" value="Writing & Translation">Writing and Translation
		</td>
	</tr>
	<tr>
		<td>Skill</td>
		<td><input type="text" name="skill"></td>
	</tr>
	<tr>
		<td>Experience</td>
		<td><input type="number" name="experience"></td>
	</tr>
	<tr>
		<td>Cost</td>
		<td><input type="number" name="cost"></td>
	</tr>
	
	<tr>
		<td>Location</td>
		<td><input type="text" name="location"></td>
	</tr>
	<tr>
		<td>Type</td>
		<td><input type="radio" name="type" value="Full-Time">Full-Time<input type="radio" name="type" value="Part-Time">Part-Time</td>
	</tr>
	<tr>
	<td colspan="2"><input type="submit" value="AddFreelancer"></td>
	</tr>
	</table>
	</form>
</body>
</html>
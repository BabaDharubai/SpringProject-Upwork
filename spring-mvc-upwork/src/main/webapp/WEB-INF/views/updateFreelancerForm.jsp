<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="update-cost">
		<table>
			<tr>
				<td>Freelancer Name</td>
				<td><input type="text" name="name" value="${freelancer.freelancerName}"></td>
			</tr>
			<tr>
				<td>Freelancer ID</td>
				<td><input type="number" name="id" value="${freelancer.freelancerId}"></td>
			</tr>
			<tr>
				<td>Category</td>
				<td><input type="text" name="category" value="${freelancer.category}"></td>
			</tr>
			<tr>
				<td>Skill</td>
				<td><input type="text" name="skill" value="${freelancer.skill}"></td>
			</tr>
			<tr>
				<td>Experience</td>
				<td><input type="number" name="experience" value="${freelancer.experience}"></td>
			</tr>
			<tr>
				<td>Cost</td>
				<td><input type="number" name="cost" value="${freelancer.cost}"></td>
			</tr>
			<tr>
				<td>Type</td>
				<td><input type="text" name="type" value="${freelancer.type}"></td>
			</tr>
			<tr>
				<td>Location</td>
				<td><input type="text" name="location" value="${freelancer.location}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="update"></td>
			</tr>
		</table>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="text-align:right">
<a href="admin">Admin</a>
</div>
<div>
<form action="search">
        <label >Filter:</label>
        <select name="choice">
          <optgroup label="Skill">
            <option value="Developer">Developer</option>
            <option value="sales">sales</option>
            <option value="FullStack">FullStack</option>
            <option value="Java">Java</option>
          </optgroup>
        </select>
        <input type="submit" value="Submit">
      </form>
</div>
<h3>Available Freelancers</h3>
${freelancers}
</body>
</html>
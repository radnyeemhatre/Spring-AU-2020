<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Delete Employee</h2>
<div align="center">
<form action="delemp" method="POST" modelAttribute="Employeed">
Enter Id :<input type="Number" name="id">
<input type="submit" value="delete">
</form>

</div>
<p><a href="index.jsp">Home Page</a> </p> 

</body>
</html>
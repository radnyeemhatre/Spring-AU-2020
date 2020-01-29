<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>VIEW</title>
</head>
<body>
<h1>View Employee Details</h1>
<table  >  
<tr><th>Id</th><th>Name</th><th>Email</th><th>Department</th></tr>  
   <c:forEach items="${el}" var="emp">   
   <tr>  
   <td>${emp.id}</td>  
   <td>${emp.name}</td> 
   <td>${emp.email}</td>  
   <td>${emp.dept}</td>  
   </tr>  
   </c:forEach>  
</table>  
<p><a href="index.jsp">Home Page</a> </p> 
</body>
</html>
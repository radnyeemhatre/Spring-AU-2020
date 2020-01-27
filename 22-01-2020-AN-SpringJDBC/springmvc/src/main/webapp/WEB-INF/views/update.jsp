<%@page import="com.springau.doa.EmployeeDao"%>
<%@page import= "com.springau.model.Employee"%>
<%@page import ="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
        <form action="updemp" method="POST" modelAttribute="Employee">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Employee Registration</h2></td>
                </tr>
                <tr>
                    <td>Employee Id</td>
                    <td><input  name="id" type="Number" /></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input  name="name" /></td>
                </tr>
                <tr>
                    <td>E-mail:</td>
                    <td><input   name="email"/></td>
                </tr>
                <tr>
                    <td>Department</td>
                    <td><input  name="dept" /></td>
                </tr>
                
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="UpdateDtails" /></td>
                </tr>
            </table>
        </form>
        <p><a href="index.jsp">Home Page</a> </p> 
        
</html>
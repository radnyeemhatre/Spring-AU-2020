<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
    <div align="center">
        <form action="addemp" method="POST" modelAttribute="Employee">
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
                    <td colspan="2" align="center"><input type="submit" value="Submit" /></td>
                </tr>
            </table>
        </form>
    </div>
    <p><a href="index.jsp">Home Page</a> </p> 
    
</body>
</html>
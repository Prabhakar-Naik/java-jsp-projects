<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.dao.EmployeeDAO,com.bean.*,java.util.*"%> 
 <!-- taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" --> 
 
<h1>Users List</h1> 
 
<% 
List<Employee> list=EmployeeDAO.getAllRecords(); 
request.setAttribute("list",list); 
%> 
 
<table border="1" width="90%"> 
<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th> 
<th>Sex</th><th>Country</th><th>Salary</th><th>Edit</th><th>Delete</th></tr> 
<c:forEach items="${list}" var="u"> 

<tr><td>${u.getEmpId()}</td><td>${u.getEmpname()}</td><td>${u.getPassword()}</td> 
<td>${u.getEmail()}</td><td>${u.getSex()}</td><td>${u.getCountry()}</td> <td>${u.geEmpsalary()}</td>
<td><a href="editform.jsp?id=${u.getEMPid()}">Edit</a></td> 
<td><a href="deleteuser.jsp?id=${u.getEMPid()}">Delete</a></td></tr> 
</c:forEach> 
</table> 
<br/><a href="adduserform.jsp">Add New User</a>
</body>
</html>
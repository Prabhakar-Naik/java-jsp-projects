<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.dao.EmployeeDAO,com.bean.Employee"%> 
 
<% 
String id=request.getParameter("EMPid"); 
Employee u=EmployeeDAO.getRecordById(Integer.parseInt(id)); 

%> 

<h1>Edit Form</h1> 
<form action="edituser.jsp" method="post"> 
<input type="hidden" name="EMPid" value="<%=u.getEMPid() %>"/> 
<table> 
<tr><td>Name:</td><td> 
<input type="text" name="EMPname" value="<%=u.getEMPname() %>"/></td></tr> 
<tr><td>Password:</td><td> 
<input type="password" name="password" value="<%= u.getPassword()%>"/></td></tr> 
<tr><td>Email:</td><td> 
<input type="email" name="email" value="<%= u.getEmail()%>"/></td></tr> 
<tr><td>Sex:</td><td> 
<input type="radio" name="sex" value="male"/>Male 
<input type="radio" name="sex" value="female"/>Female </td></tr> 
<tr><td>Country:</td><td> 
<select name="country"> 
<option>India</option> 
<option>Pakistan</option> 
<option>Afghanistan</option> 
<option>Burma</option> 
<option>Other</option> 
</select> 
</td></tr> 
<tr><td>Salary:</td><td>
<input type="text" name="EMPsalary" value="<%=u.getEMPsalary() %>"/></td></tr>

<tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr> 
</table> 
</form>
</body>
</html>
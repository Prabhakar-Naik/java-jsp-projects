<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User Form</title>
</head>
<body>
<%@page import="com.dao.EmployeeDAO"%> 
<%@page import="com.bean.Employee" %>
<jsp:useBean id="u" class="com.bean.Employee"></jsp:useBean>
<jsp:setProperty property="*" name="u"/> 
 
<% 
int i=EmployeeDAO.save(u); 
if(i>0){ 
response.sendRedirect("adduser-success.jsp"); 
}else{ 
response.sendRedirect("adduser-error.jsp"); 
} 
%>
</body>
</html>
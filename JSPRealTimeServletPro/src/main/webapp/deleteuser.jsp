<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.dao.EmployeeDAO"%> 
<jsp:useBean id="u" class="com.bean.Employee"></jsp:useBean> 
<jsp:setProperty property="*" name="u"/> 
<% 
EmployeeDAO.delete(u);
response.sendRedirect("viewusers.jsp"); 
%>
</body>
</html>
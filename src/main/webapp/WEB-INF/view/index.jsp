<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import = "java.util.*"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <h1>This is my homepage</h1>
 <!-- In this tag we write our code so here using httpServletrequest object to get data from controller -->
 <%
         String name=(String)request.getAttribute("Name");
         String EmpId=(String)request.getAttribute("Empid");
         List<String> team=(List<String>) request.getAttribute("d");
 %>
  
 <h1>
 Name is
 <%=name%>
 </h1>
 <h1>
 Employee Id is
 <%=EmpId%>
 </h1>
 <h1>My team members</h1>
 <%
 
 for(String s:team){
 %>
	 <h1> 
	 <%=s %>
	 </h1>
 
 <%
            }
 %>
 
</body>
</html>
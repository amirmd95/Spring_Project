<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import = "java.time.LocalDateTime"%>
    <%@page import = "java.util.Calendar"%>
    
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help section</title>
</head>
<body>
<h1>This is my help file</h1>
<a href='#'>Help</a>

<h1>Student name =
<%-- <%=name %> --%>
${name}
</h1>
<br>
<h1>Roll Number=
<%-- <%=roll %> --%>
${roll}
</h1>
<h1> Time is 
<%-- <%=time %> --%>
${time}
</h1>



<c:forEach var="item" items="${array }">
<h1>${item}</h1>

</c:forEach>

</body>
</html>
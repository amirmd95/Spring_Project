<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/WEB-INF/view/Style/style.css">

<meta charset="ISO-8859-1">
<title>Welcome</title>

</head>
<body style="background-color: silver";>
 <h3 class=text-center>${Header}</h3>
  <p class=text-center>${desc }</p> 
  <h1 style="color:green;">Registration is successful.your id is ${user.id} </h1>
<hr>

<h1 style="color:blue;">Welcome ${user.username }</h1>
<h2 style="color:black;">Your email is ${user.email }</h2>
<h3 style="color:red;">Your password is ${user.password }</h3>
</body>
</html>
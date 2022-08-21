<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" 
    href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" 
    integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" 
    crossorigin="anonymous">

    <title>Registration Form</title>
  </head>
  <body style="background-color: teal;">
  <div class="text-center">
   
   </div>
    <div class="container mt-5">
    <h3 class=text-center>${Header}</h3>
     <p class=text-center>${desc }</p> 
     
    <form action="process" method="post">
    
              <div class="form-group">
                   <label for="exampleInputEmail1">Email address</label> 
                       <input type="email" 
                       class="form-control" 
                       id="exampleInputEmail1" 
                       aria-describedby="emailHelp" 
                       placeholder="Enter email" 
                       name="email">
             </div>
   
  
             <div class="form-group">
                   <label for="userName">UserName</label>
                        <input type="text" 
                        name="username" 
                        class="form-control" 
                        id="userName" 
                        aria-describedby="emailHelp">
    
             </div>
             
             <div class="form-group">
                   <label for="userPassword">Password</label>
                         <input type="password" 
                         name="password" 
                         class="form-control" 
                         id="userPassword">
  
            </div>
             <div class="container mt-5 text-center">
           <button type="submit" class="btn btn-success">Sign up</button>
           </div>
  </form>

    </div>
  </body>
</html>
    
<%-- 
    Document   : occupierlogin23-30
    Created on : 18 Oct, 2023, 9:43:51 AM
    Author     : INDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
        <link rel="stylesheet" type="text/css" href="Instance/InstanceLogin.css">
    </head>
    <body>
    <div class="login-container">
    <form id="loginForm" action="loginChecker1823" method="post">
    <h2>Login</h2>
      <div class="form-group">
      <input type ="text" id="username" name="mailid" placeholder="Enter E-mail Here" />
      <i class="fas fa-user"></i>
      </div>
      <div class="form-group">
      <input type ="password" id="password" name="password" placeholder="Enter Password Here" />
      <i class="fas fa-lock"></i>
      </div>
       <input type="submit" class="submit" value="Login" />
      </form>
     <p>Don't have an account? <a href="occupierregistration23-30.jsp">Sign up</a></p>
     </div>
     <!-- Bootstrap JS and jQuery -->
     <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
     <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
     <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
     <!-- Font Awesome JS -->
     <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js"></script>

     <!-- Custom JavaScript -->
    </body>
</html>
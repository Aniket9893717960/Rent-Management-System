<%-- 
    Document   : adminlogin
    Created on : 2 Sep, 2023, 10:42:01 AM
    Author     : INDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link rel="stylesheet" type="text/css" href="Instance/InstanceLogin.css">
    </head>
<center>
    <body><header>
        <h2>LOGIN PAGE</h2>
        </header>
        <p> <strong>if you are the new user of our services. So, firstly register
                        on our Page by clicking on registration Page link</strong></p>
                        <a href="adminRegistration.jsp" ><button>Registration Page</button></a>
         <form action="AloginChecker"  method="post">
        <table border="0">
            
                <tr>
                    <td>Email Id:</td>
                    <td><input type ="text" name="mailid" placeholder="Enter E-mail Here" /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type ="password" name="password" placeholder="Enter Password Here" /></td>
                </tr>
                <tr>
                    <td><button><input type="reset" value="Reset" /></button></td>
                    <td><button><input type="submit" value="Login" /></button></td>
                
                </tr>
                    </table>
         </form>
</center>
    </body>
</html>

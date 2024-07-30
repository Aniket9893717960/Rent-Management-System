<%-- 
    Document   : adminRegistration
    Created on : 1 Oct, 2023, 2:17:26 AM
    Author     : INDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
        <link rel="stylesheet" type="text/css" href="Instance/InstanceRU.css">
    </head>
    <body>
        <div class="container">
            <h2>REGISTRATION PAGE</h2>
        
        
         <form  action="AregistrationChecker"  method="post">
        <table >
           
              <div class="subtables">
             <tr>
                    <td>First Name:</td>
                    <td><input type ="text" name="firstname" placeholder="Enter firstname Here" /></td>
                </tr>
            </div>
            <div class="subtables">
                <tr>
                    <td>Last Name:</td>
                    <td><input type ="text" name="lastname" placeholder="Enter Lastname Here" /></td>
                </tr>
            </div>
                <div class="subtables">
                <tr>
                    <td>Email ID:</td>
                    <td><input type ="email" name="mailid" placeholder="Enter Email ID" /></td>
                </tr>
                </div>
            <div class="subtables">
                <tr>
                    <td>PlaceHolder :</td>
                    <td><input type ="text" name="placehlder" placeholder="Enter placeholder" /></td>
                </tr>
            </div>
    </body>
</html>

<%-- 
    Document   : occupierregistration23-30
    Created on : 18 Oct, 2023, 9:47:51 AM
    Author     : INDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
        <link rel="stylesheet" type="text/css" href="Instance/InstanceRU.css">
    </head>
    <body>
        <div class="registration-container">
         <h2>Registration</h2>
         <form  action="registrationChecker1823"  method="post" enctype="multipart/form-data">
<div class="form-row">
        <div class="col">
        <input type ="text" name="firstname" placeholder="Enter firstname" />
        </div>
        <div class="col">
        <input type ="text" name="lastname" placeholder="Enter Lastname" />
        </div>
      </div>
      <div class="form-group">
          <input type ="email" name="mailid" placeholder="Enter Email ID" />
      </div>
      <div class="form-group">
          <input type ="text" name="Oname" placeholder="Enter Organization Name" />
      </div>
      <div class="form-group">
          <input type ="text" name="Oaddress" placeholder="Enter Organization Address" />
       </div>
      <div class="form-group">
          <input type ="text" name="age" placeholder="Enter age" />
       </div>
      <div class="form-group">
          <input type ="date" name="dob" placeholder="Enter Date Of Birth" />
      </div>
      <div class="form-group">
          <input type ="text" name="Mexpectation" placeholder="Enter Money-Expectation" />
      </div>
      <div class="form-group">
          <input type ="text" name="demand" placeholder="Enter demand in BHK" />
      </div>
      <div class="form-group">
          <input type ="text" name="address" placeholder="Enter Address" />
       </div>
      <div class="form-group">
          <input type ="text" name="address1" placeholder="Enter Additional Address" /></td>
      </div>
      <div class="form-group">
          <input type ="text" name="zipcode" placeholder="Enter zipcode" /></td>
      </div>
      <div class="form-group">
          <input type ="number" name="phoneno" placeholder="Enter Phone Number" /></td>
      </div>
       <input  type="submit" class="submit" value="submit" />
       </form>
      </div>
  <!-- Bootstrap JS and jQuery -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <!-- Font Awesome JS -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js"></script>

    </body>
</html>
<%-- 
    Document   : adminResetPassword
    Created on : 3 Sep, 2023, 5:26:25 AM
    Author     : INDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Reset Password</title>
<link rel="stylesheet" type="text/css" href="Instance/InstanceRP.css">
    </head>
<body>
    <div class="reset-container"><center>
      <a href ="adminlogin.jsp"><button>Sign In</button></a>
      <br>
    <h2>Reset Password</h2>
    </center>
    <form action="AresetPasswordChecker" method="post">
      <div class="input-group">
          <table>
              <tr>
                  <td><label for="email">Email</label></td>
          <td><input type="email" id="mailid" name="email" required></td>
              </tr>
      </div>
      <div class="input-group">
          <tr>
              <td><label for="password">New Password</label></td>
          <td><input type="password" id="password" name="password" required></td>
        </tr>
      </div>
      <div class="input-group">
          <tr>
              <td><label for="confirm-password">Confirm Password</label></td>
          <td><input type="password" id="cp" name="confirm-password" required></td>
        </tr>
      </div>
        <tr>
            <td><button type="submit" value="Reset">Reset Password</button></td>
    </tr>
</table>
    </form>
  </div>
</body>
</html>

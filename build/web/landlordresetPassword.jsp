<%-- 
    Document   : resetPassword
    Created on : 15 Aug, 2023, 7:35:22 AM
    Author     : INDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Reset Password</title>
<style>
  body {
    margin: 0;
    padding: 0;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    background-color: #FFFAF0; /* Yellow background color */
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
  }

  .container {
    width: 380px;
    background-color: #FFC107; /* Yellow container background */
    padding: 40px;
    border-radius: 10px;
    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
    text-align: center;
  }

  h2 {
    margin-bottom: 30px;
    color: #FFF; /* White text color */
    font-size: 24px;
    letter-spacing: 1px;
  }

  input {
    width: calc(100% - 40px);
    padding: 15px;
    margin-bottom: 20px;
    border: 2px solid #FFA000; /* Orange border color */
    border-radius: 25px;
    box-sizing: border-box;
    font-size: 16px;
    transition: border-color 0.3s;
  }

  input:focus {
    border-color: #FF8F00; /* Darker shade of orange on focus */
    outline: none;
  }

  button {
    width: calc(100% - 40px);
    padding: 15px;
    border: none;
    background-color: #FFA000; /* Orange button color */
    color: #fff; /* White text color */
    border-radius: 25px;
    cursor: pointer;
    font-size: 16px;
    transition: background-color 0.3s;
  }

  button:hover {
    background-color: #FF8F00; /* Darker shade of orange on hover */
  }

  .message {
    margin-top: 20px;
    color: #FFF; /* White text color */
    font-size: 14px;
  }

  .message a {
    color: #FFF; /* White text color */
    text-decoration: none;
    transition: color 0.3s;
  }

  .message a:hover {
    color: #FFA000; /* Orange color on hover */
  }
</style>
</head>
<body>
    <div class="container">
    <h2>Set Password</h2>
      <br>
    <form action="resetPasswordChecker" method="post">
    <input type="email"  name="mailid" placeholder="Enter Email Id" required>
    <input type="password"  name="password" placeholder=" Password" required>
    <input type="password"  name="confirm-password" placeholder="Confirm Password" required>
    <button type="submit" value="set">Reset Password</button>
    </form>
    <div class="message">Already have an account? <a href="landlordlogin.jsp">Click Here For Login</a></div>
  </div>
</body>
</html>


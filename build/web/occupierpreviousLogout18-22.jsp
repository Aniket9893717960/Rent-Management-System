<%-- 
    Document   : previousLogout18-22
    Created on : 3 Aug, 2023, 10:16:44 AM
    Author     : INDIA
--%>
<%@page import="db.DBConnector"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="controllerOccupier.PreviousDeleteChecker1823" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Delete Account</title>
  <link rel="stylesheet" type="text/css" href="InstancepreviousLogout.css">
</head>
<body>
  <div class="container">
    <h1>Delete Account</h1>
      
      <%    
            /*By this oommand we havee to enable session
        session object is behave like a global object*/
            String mailid = (String) session.getAttribute("mailid");
            String password = (String) session.getAttribute("password");
            
            if(mailid ==null || mailid.trim().equals(""))
{
    response.sendRedirect("occupierlogin18-22.jsp");
}
            Statement st = null;
            ResultSet rs = null;
      %>
       <form id="deleteAccountForm">
      <label for="password">Password:</label>
      <input type="password" id="password" name="password" required>
      <%
                try {
                    st = DBConnector.getStatement();
                    String query = "SELECT email_id FROM occupier WHERE password='" + password + "'";
                    System.out.println("Query =" + query);

                    rs = st.executeQuery(query);
            if (rs.next()) 
            {
            %>
    
            <table>
                <tr>
                    <td>email id:</td>
                    <td><h3><%=rs.getString("mailid")%></h3></td>
                </tr>
            </table>
                    
    <p>Are you sure you want to delete your account? This action cannot be undone.</p>
      <%
                        }
                    } catch (SQLException ex) {
                        System.out.println(ex);
                    }%>
      <button type="submit">Delete Account</button>
    </form>
  </div>
</body>
</html>


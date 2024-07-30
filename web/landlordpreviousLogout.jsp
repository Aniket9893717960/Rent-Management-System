<%-- 
    Document   : previousLogout
    Created on : 15 Aug, 2023, 10:49:59 AM
    Author     : INDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="db.DBConnector"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Delete Account</title>
  <link rel="stylesheet" type="text/css" href="Instance/InstancepreviousLogout.css">
</head>
 <body>
 <div class="container">
    <h1>Delete Account</h1>
      <form id="deleteAccountForm">
      <label for="password">Password:</label>
      <input type="password" id="password" name="password" required>
      <p>Are you sure you want to delete your account? This action cannot be undone.</p>
      <a href="occupierDelete18-22.jsp"><button><input type="submit" value="Delete" /></button></a>
       <%    
            /*By this oommand we havee to enable session
        session object is behave like a global object*/
            String mailid = (String) session.getAttribute("mailid");
            String password = (String) session.getAttribute("password");
            
            if(mailid ==null || mailid.trim().equals(""))
{
    response.sendRedirect("landlordlogin.jsp");
}
            
            Statement st = null;
            ResultSet rs = null;
      
                try {
                    st = DBConnector.getStatement();
                    String query = "SELECT email_id FROM landlord WHERE password='"+password+"'";
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
      <%
                        }
                    } catch (SQLException ex) {
                        System.out.println(ex);
                    }%>
    </form>
  </div>
</body>
</html>

<%-- 
    Document   : adminProfile
    Created on : 2 Sep, 2023, 10:02:18 AM
    Author     : INDIA
--%>

<%@page import="db.DBConnector"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Page</title>
        <link rel="stylesheet" type="text/css" href="Instance/InstanceProfile.css">
    </head>
    <body>
        <div class="pro">
        <div class="profile-pic">
        </div>
            
      <%
            String mailid = (String) session.getAttribute("mailid");
            if(mailid ==null || mailid.trim().equals(""))
{
    response.sendRedirect("adminlogin.jsp");
}
            Statement st = null;
            ResultSet rs = null;
        %>
        <form action="AshowChecker"  method="post">
            <%
                try {
                    st = DBConnector.getStatement();
                    String query = "SELECT * FROM admin WHERE email_id='" + mailid + "'";
                    System.out.println("Query =" + query);

                    rs = st.executeQuery(query);
            if (rs.next()) 
            {
            %>
            <table>
                <div class="profile-info">
                <tr>
                    <td>Admin ID:</td>
                    <td><%=rs.getString("admin_id")%></td>
                </tr>
                <tr>
                    <td>First Name:</td>
                    <td><%=rs.getString("first_name")%></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><%=rs.getString("last_name")%></td>
                </tr>
                <tr>
                    <td>email id:</td>
                    <td><%=rs.getString("email_id")%></td>
                </tr>
                <tr>
                    <td>PlaceHolder:</td>
                    <td><%=rs.getString("placeholder")%></td>
                </tr>
                </div>
                <%
                        }
                    } catch (SQLException ex) {
                        System.out.println(ex);
                    }%>

                <tr>
                    <td><a href="adminResetPassword.jsp">Reset Password</a></td>
                </tr>
            </table>
        </form>
    </body>
</html>


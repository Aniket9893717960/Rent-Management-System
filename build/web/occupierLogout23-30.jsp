<%-- 
    Document   : occupierLogout23-30
    Created on : 29 Sep, 2023, 1:49:03 AM
    Author     : INDIA
--%>

<%@page import="java.util.Date"%>
<%@page import="java.sql.SQLException"%>
<%@page import="db.DBConnector"%>
<%@page import="java.sql.ResultSet"%>
<%@page import ="model.occupier.LogoutAuthenticator"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout Button</title>
    <link rel="stylesheet" type="text/css" href="Instance/InstanceLogout.css">
</head>
<body>
    <div id="logout-button">
    <h1>Welcome, User!</h1>
    <p>You are currently logged in.</p>
    <form action="Logout2330"  method="post">
         <table>
          <tr>
                    <td>Landlord_id:</td>
                    <td><input type ="text" name="lid" placeholder="Enter landlord ID" /></td>
                </tr>
         </table>
          <%  String lid = (String)session.getAttribute("lid1");
              String mailid = (String)session.getAttribute("mailid");
         Date d1 = new Date();
         System.out.println(d1);;
            
            if(lid==null || lid.trim().equals(""))
            {
                response.sendRedirect("gethome.jsp");
            }
            Statement st = null;
            ResultSet rs = null;
try
          {
              int i=0;
               st = DBConnector.getStatement();
                String query = "UPDATE clockofadmin SET landlord_id ='"+lid+"',logout_time ='"+d1+"' WHERE email_id='"+mailid+"'";
              System.out.println("Query="+query);
               i=st.executeUpdate(query);
               
                if (i>=0) 
            {
                        }
                        }
catch (SQLException ex) {
                        System.out.println(ex);
                    }
         %>  
                    
                    <input type="submit" value="Logout">
                    </form>

    </div>
</body>
</html>

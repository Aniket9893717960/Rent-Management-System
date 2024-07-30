<%-- 
    Document   : certicate
    Created on : 17 Jul, 2023, 8:07:01 AM
    Author     : INDIA
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="db.DBConnector"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>certificate Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.2/font/bootstrap-icons.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="landlordcertificate.css" >
    </head>
    <body>
        <a href="landlordresetPassword.jsp"><button style="background-color:#FFEB3B;">Set Password</button></a>
         <%
            String mailid = (String) session.getAttribute("mailid");
            if(mailid ==null || mailid.trim().equals(""))
{
    response.sendRedirect("landlordlogin.jsp");
}
            Statement st = null;
            ResultSet rs = null;
        %>
        <div class="certificate">
            <div class="certificate-header">
                <h1 class="certificate-title" style="color:#FFEB3B;">Certificate OF Guarantee</h1>
            </div>
            <form action="CertificateChecker" method="post">
                <center>
             <%
                try {
                    st = DBConnector.getStatement();
                    String query = "SELECT * FROM landlord WHERE email_id='"+mailid+"'";
                    System.out.println("Query =" + query);

                    rs = st.executeQuery(query);
            if (rs.next()) 
            {
            %>
            <strong><p>landlord No.</p><%=rs.getString("landlord_id")%></strong>
            <strong><p>Customer Name</p><%=rs.getString("first_name")%>  <%=rs.getString("last_name")%></strong>
            <strong><p>Address</p><%=rs.getString("address")%></strong>
            <strong><p>Additional Address</p><%=rs.getString("address2")%></strong>
            </form>
            <div class="certificate-content">
        <p> we hereby guarantee and warrant for our landlord to use our merchandise or our name owned.</p>
        <p>for the period time the landlord in prossession of the company will repair the replace defective</p>
        <p>components which will not be no additional charge to the landlord owner.</p>
        <p class="date">Date of Award</p>
      <p class="signature">Authorized Signature</p>
      <div class="certificate-signature">
            <img src="image/signature.jpeg" alt="Signature" class="signature-img">
            <p>Aniket Rathore<br>CEO, GET Home Company</p>
      </div>
            </div>
            <%
                        }
                    } catch (SQLException ex) {
                        System.out.println(ex);
                    }%>
                    
                     </center>
    </body>
</html>

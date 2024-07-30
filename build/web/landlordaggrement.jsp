<%-- 
    Document   : aggrement
    Created on : 17 Jul, 2023, 7:25:09 AM
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
        <title>Agreement Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.2/font/bootstrap-icons.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="landlordaggrement.css" >
    </head>
    <body>
         <%
            String mailid = (String) session.getAttribute("mailid");
            if(mailid ==null || mailid.trim().equals(""))
{
    response.sendRedirect("landlordlogin.jsp");
}
            Statement st = null;
            ResultSet rs = null;
        %>
        <button id="agreeButton">Agree</button>
        <div class="agreement" id="agreement-content">
            <div class="aggrement -header">
        <strong><h1 style="font-size: 24px;font-weight: bold;background-color: yellow;align-content: center;">Service Agreement</h1></strong>
            </div>
            <h4>GET HOME</h4>
    <h4>Indore[M.P]</h4>
    <form action="aggrementChecker"  method="post">
    <%
                try {
                    st = DBConnector.getStatement();
                    String query = "SELECT * FROM landlord WHERE email_id='"+mailid+"'";
                    System.out.println("Query =" + query);

                    rs = st.executeQuery(query);
            if (rs.next()) 
            {
            %>

            <h4><b><%=rs.getString("first_name")%></b></h4>
            <h4><b><%=rs.getString("address")%></b></h4>
            <h4>[<b><%=rs.getString("zipcode")%></b>]</h4>
    <p>Subject: Guarantee for Losses Incurred</p>

    <p>Dear <b><%=rs.getString("first_name")%></b><%=rs.getString("last_name")%></p>

    <p>This agreement ("Agreement") is made between [Your Company Name] ("Company") and <%=rs.getString("first_name")%> ("Landlord") on this day of [Date], regarding the rental of the property located at <%=rs.getString("address")%>[Property Address].</p>

    <p>Guarantee:</p>
    <p>Company hereby guarantees to Landlord, for the duration of the lease agreement, full compensation for any financial loss or damage incurred by Landlord resulting from any actions, omissions, or defaults by Company or its employees, agents, or representatives, in accordance with the terms and conditions stated in this Agreement.</p>

    <p>Scope of Guarantee:</p>
    <p>The guarantee provided by Company covers all financial losses and damages, including but not limited to:</p>
<p>a) Unpaid rent or utility bills.</p>
<p>b) Property damage caused by Company or its employees, agents, or representatives.</p>
<p>c) Breach of any terms and conditions of the lease agreement.</p>

<p>Notification of Loss:</p>
<p>In the event of any loss or damage covered by this Agreement, Landlord shall promptly notify Company in writing, providing detailed information regarding the loss or damage sustained. Company shall respond within [number of days] upon receipt of such notification.</p>

<p>Company's Obligations:</p>
<p>Upon receiving a valid notification of loss, Company shall undertake the following obligations:</p>
<p>a) Compensate Landlord for the full amount of the financial loss or damage incurred, within [number of days] from the date of receipt of the notification.</p>
<p>b) Take necessary actions to rectify any breach of the lease agreement committed by Company or its employees, agents, or representatives.</p>

<p>Limitations:</p>
<p>This guarantee does not extend to losses or damages resulting from acts of God, natural disasters, war, or any other event beyond the control of Company. Furthermore, the guarantee shall not apply if Landlord fails to fulfill its obligations as outlined in the lease agreement.</p>

<p>Indemnification:</p>
<p>Company shall indemnify and hold Landlord harmless from any liability, loss, or damage arising from any claims, demands, or lawsuits related to the actions, omissions, or defaults of Company or its employees, agents, or representatives.</p>

<p>Governing Law:</p>
<p>This Agreement shall be governed by and construed in accordance with the laws of the [State/Country], without regard to its conflict of laws principles.</p>

</p>Entire Agreement:</p>
<p>This Agreement constitutes the entire understanding between Company and Landlord concerning the subject matter hereof and supersedes all prior agreements, understandings, negotiations, and discussions, whether oral or written.</p>

<p>Please sign below to indicate your acceptance of the terms and conditions of this Agreement. A duplicate copy of this Agreement is enclosed for your records.</p>

<p>Thank you for your cooperation. We look forward to maintaining a mutually beneficial relationship.</p>

<p>Sincerely,</p>

<h4>Aniket Rathore</h4>
<h4>Founder</h4>
<h4>Get Home Company</h4>

<p>Accepted and agreed:</p>
<h4><b><%=rs.getString("first_name")%><%=rs.getString("last_name")%></b></h4>
<h4>[Landlord's Signature]</h4>
<h4>[Date]</h4>
<%
                        }
                    } catch (SQLException ex) {
                        System.out.println(ex);
                    }%>
    </form>
     </div>
  <script src="agreeButton.js"></script>
                    <input type="checkbox" />Click here if you accept all conditions
                    <a href="landlordcertificate.jsp" ><button style="background-color:#FFEB3B;">Landlord Certificate</button></a>
</strong>
    </body>
</html>

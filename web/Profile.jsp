<%-- 
    Document   : Profile
    Created on : 28 Sep, 2023, 10:46:31 AM
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
        <title>Profile Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
        <link rel="stylesheet" type="text/css" href="Instance/InstanceProfile.css">
    </head>
    <body><center>
        <div class="pro">
        <div class="profile-pic">
        </div>
            
      <%    
            String email_id = request.getParameter("email_id");
            String id = (String) session.getAttribute("landlord_id");
            String imageFileName = (String) request.getAttribute("imageFileName");
            System.out.println(imageFileName);
            if(email_id ==null || email_id.trim().equals(""))
{
    response.sendRedirect("home.jsp");
}
            Statement st = null;
            ResultSet rs = null;
        %>
        <form action="showChecker1823"  method="post">
            
            <%    
                try {
                    st = DBConnector.getStatement();
                    String query = "SELECT * FROM occupier  where email_id='"+email_id+"'";
                    System.out.println("Query =" + query);
                    rs = st.executeQuery(query);
            if (rs.next()) 
            {
            %>
            <div class="profile-card">
                <img src="person.jpg" alt="Profile Picture">
                <h2><%=rs.getString("first_name")%><br><%=rs.getString("last_name")%></h2>
                 <div class="detail">
                    <span class="label">Occupier ID:</span>
                    <span><%=rs.getString("occupier_id")%></span>
                 </div>
                <div class="detail">
                    <span class="label">Landlord ID:</span>
                    <span><%=rs.getString("landlord_id")%></span>
                </div>
                <div class="detail">
                    <span class="label">email id:</span>
                    <span><%=rs.getString("email_id")%></span>
                </div>
                <div class="detail">
                    <span class="label">Organization Name:</span>
                    <span><%=rs.getString("Oname")%></span>
                </div>
                <div class="detail">
                    <span class="label">Organization Address:</span>
                    <span><%=rs.getString("Oaddress")%></span>
                </div>
                <div class="detail">
                    <span class="label">Age:</span>
                    <span><%=rs.getString("age")%></span>
                </div>
                <div class="detail">
                    <span class="label">Date Of Birth:</span>
                    <span><%=rs.getString("dob")%></span>
                </div>
                <div class="detail">
                    <span class="label">Money Expactation:</span>
                    <span><%=rs.getString("Mexpectation")%></span>
                </div>
                <div class="detail">
                    <span class="label">Demand:</span>
                    <span><%=rs.getString("demand")%></span>
                </div>
                <div class="detail">
                    <span class="label">Proper Address:</span>
                    <span><%=rs.getString("address")%></span>
                </div>
                <div class="detail">
                    <span class="label">Proper Additional Address:</span>
                    <span><%=rs.getString("address2")%></span>
                </div>
                <div class="detail">
                    <span class="label">ZIP CODE:</span>
                    <span><%=rs.getString("zipcode")%></span>
                </div>
                <div class="detail">
                    <span class="label">Phone No:</span>
                    <span><%=rs.getString("phone_no")%></span>
                </div>
                <div class="place-photo">
                     <img src="place.jpg" alt="Place Picture">
                </div>
                <%
                        }
                    } catch (SQLException ex) {
                        System.out.println(ex);
                    }%>
             </div>
        </form>
        <!-- Bootstrap JS and jQuery -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <!-- Font Awesome JS -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js"></script>
    </body>
</html>
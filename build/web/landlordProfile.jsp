<%-- 
    Document   : landlordProfile
    Created on : 30 Aug, 2023, 3:23:55 AM
    Author     : INDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="db.DBConnector"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
        <link rel="stylesheet" type="text/css" href="Instance/InstanceProfile.css">
    </head>
    <body>
        <br> <br>
            <a  href="landlordresetPassword.jsp"><button>Reset Password</button></a>
            <a href="landlordupdate.jsp"><button>Update Account</button></a>
            <a href="occupierLogout23-30.jsp"><button>Logout</button></a>

        
        <div class="pro">
        <div class="profile-pic">
        </div>
            <form action="showChecker"  method="post">
      <%    
            String mailid = (String) session.getAttribute("mailid");
            Cookie email = new Cookie("mailid",mailid);
            response.addCookie(email);
            String imageFileName = (String) request.getAttribute("imageFileName");
            System.out.println(imageFileName);
            if(mailid ==null || mailid.trim().equals(""))
{
    response.sendRedirect("landlordlogin.jsp");
}
            Statement st = null;
            ResultSet rs = null;
                try {
                    st = DBConnector.getStatement();
                    String query = "SELECT * FROM landlord WHERE email_id='"+mailid+"'";
                    System.out.println("Query =" + query);

                    rs = st.executeQuery(query);
            if (rs.next()) 
            {
                String lid1 = rs.getString("landlord_id");
                session.setAttribute("lid1",lid1);
            %>
            <div class="profile-card">
                <img src="person.jpg" alt="Profile Picture">
                <h2><%=rs.getString("first_name")%><br><%=rs.getString("last_name")%></h2>
                <div class="detail">
                    <span class="label">Landlord ID:</span>
                    <span><%=rs.getString("landlord_id")%></span>
                </div>
                <div class="detail">
                    <span class="label">email id:</span>
                    <span><%=rs.getString("email_id")%></span>
                </div>
                <div class="detail">
                    <span class="label">Space Available:</span>
                    <span><%=rs.getString("available")%></span>
                </div>
                <div class="detail">
                    <span class="label">Demand:</span>
                    <span><%=rs.getString("demands")%></span>
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

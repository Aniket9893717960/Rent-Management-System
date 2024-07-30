<%-- 
    Document   : ServicesPage
    Created on : 1 Aug, 2023, 5:21:05 AM
    Author     : INDIA
--%>

<%@page import="java.util.Date"%>
<%@page import="java.sql.SQLException"%>
<%@page import="db.DBConnector"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Services Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.2/font/bootstrap-icons.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="ServicesPages.css">
    </head>
    <body>
    <center>
        <section style="align-content: center;text-align: center;">
        <div class="container mt-2 pt-8">
            <div class="row">
                <div class="col-12 col-sm-5 col-md-4 n-auto"> 
                    <div class="card border-0 shadow"> 
                        <div class="card-body">
                            <form action="">
        <header>
            <a href="landlordProfile.jsp"><button type="button" class="btn btn-primary">Profile</button></a>
  </header>
        <label for="text-field">Destination Name:</label>
        
        <input type="text" id="address" name="address" class="form-control my-3 py-2" onkeyup=" searchFun()">
        <label for="text-field">Home Size(In BHK):</label>
        
        <input type="text" id="demand"  name="demands" class="form-control my-3 py-2">
        <label for="text-field">PIN Code :</label>
        <input type="text" id="zipcode" placeholder="pin..." class="form-control my-3 py-2">
        <div class="text-center">
        </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
      </section>
    </center> 
        <%  String first_name = (String) session.getAttribute("first_name");
            String last_name = (String) session.getAttribute("last_name");
            String demands = (String) session.getAttribute("demands");
            String address = (String) session.getAttribute("address");
            String mailid = (String) session.getAttribute("mailid");
            String email_id = (String) session.getAttribute("email_id");
            if(mailid ==null || mailid.trim().equals(""))
{
    response.sendRedirect("gethome.jsp");
}
            Statement st = null;
            ResultSet rs = null;
                try {
                    st = DBConnector.getStatement();
                    String query = "SELECT * FROM occupier";
                    System.out.println("Query =" + query);

                    rs = st.executeQuery(query);
            %>
            <div class="container mt-5">
            <table id ="myTable" class="table table-responsive table-bordered border-dark text-hover text-center text-capitalize">
            <tr class ="table-dark table-action text-uppercase text-white">
                <th style="width:40%;">email_id</th>
                <th style="width:30%;">address</th>
                <th style="width:30%;">Space Required</th>
            </tr>
            <% while(rs.next())
            {  %>
            
                      <tr>
                          <td>
                              <form action="Profile.jsp" method="post">
                                  <input type="hidden" name="email_id" value="<%=rs.getString("email_id")%>"/>
                            <input type="submit" class="btn btn-secondary" value="<%=rs.getString("email_id")%>" />
                              </form> </td>
                          
                 <td><%=rs.getString("address")%></td>
                <td><%=rs.getString("demand")%></td>
                
                 </tr>
              </div>
            <%          }
                        }
                     catch (SQLException ex) {
                        System.out.println(ex);
                    }%>       
            </table>
           <script>
        const searchFun = () =>{
        let Filter = document.getElementById('address').value.toUpperCase();
        
        let myTable = document.getElementById('myTable');
        
        let tr = myTable.getElementsByTagName('tr');
        
        for(var i=0;i<tr.length;i++){
        let td = tr[i].getElementsByTagName('td')[1];  
        
        if(td) {
            let textvlaue = td.textContent || td.innerHTML;
            
            if(textvlaue.toUpperCase().indexOf(Filter) > -1){
                tr[i].style.display = "";
            }
            else {
                tr[i].style.display = "none";
            }
          }
        }
       }
        </script>
    </body>
</html>

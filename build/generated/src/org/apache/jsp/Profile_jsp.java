package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import db.DBConnector;
import java.sql.ResultSet;
import java.sql.Statement;

public final class Profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Profile Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Instance/InstanceProfile.css\">\n");
      out.write("    </head>\n");
      out.write("    <body><center>\n");
      out.write("        <br><br>\n");
      out.write("        <div class =\"manu-bar\">\n");
      out.write("        <ul>\n");
      out.write("        <li><a href=\"occupierresetPassword23-30.jsp\"><button>Reset Password</button></a></li>\n");
      out.write("        <li><a href=\"occupierpreviousLogout23-30.jsp\"><button>Delete Account</button></a></li>\n");
      out.write("        <li><a href=\"occupierupdate23-30.jsp\"><button>Update Account</button></a></li>\n");
      out.write("        <li> <a href=\"occupierLogout23-30.jsp\"><button>Logout</button></a> </li>\n");
      out.write("        </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"pro\">\n");
      out.write("        <div class=\"profile-pic\">\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("      ");

            String mailid = (String) session.getAttribute("email_id");
            String id = (String) session.getAttribute("landlord_id");
            String imageFileName = (String) request.getAttribute("imageFileName");
            System.out.println(imageFileName);
            if(mailid ==null || mailid.trim().equals(""))
{
    response.sendRedirect("home.jsp");
}
            Statement st = null;
            ResultSet rs = null;
        
      out.write("\n");
      out.write("        <form action=\"SHOWChecker\"  method=\"post\">\n");
      out.write("            \n");
      out.write("            ");

                try {
                    st = DBConnector.getStatement();
                    String query = "SELECT landlord.landlord_id,occupier_id18,landlord.first_name,landlord.last_name,landlord.email_id,available,demands,landlord.age,landlord.dob,landlord.Mexpectation,landlord.address,landlord.address2,landlord.city,landlord.state,landlord.zipcode,landlord.phone_no\n" +
"FROM landlord INNER JOIN occupier18 ON landlord.landlord_id = occupier18.landlord_id\n" +
"INNER JOIN occupier23 ON landlord.landlord_id = occupier23.landlord_id\n" +
"INNER JOIN occupier30 ON landlord.landlord_id = occupier30.landlord_id WHERE landlord_id ='"+id+"'";
                    System.out.println("Query =" + query);

                    rs = st.executeQuery(query);
            if (rs.next()) 
            {
            
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <div class=\"profile-info\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Occupier ID:</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("landlord_id"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>First Name:</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("first_name"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Last Name:</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("last_name"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>email id:</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("email_id"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Organization Name:</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("Oname"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                </div>\n");
      out.write("                <div class =\"Profile-details\">\n");
      out.write("        <h2><strong><center> About Me</center></strong></h2>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Organization Address:</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("Oaddress"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Age:</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("age"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Date Of Birth:</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("dob"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Money Expactation:</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("Mexpectation"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Demand:</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("demand"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Address:</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("address"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Additional Address:</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("address2"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>City:</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("city"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>State:</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("state"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>ZIP CODE:</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("zipcode"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Phone No:</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("phone_No"));
      out.write("</td>\n");
      out.write("                </tr\n");
      out.write("            </table>\n");
      out.write("                ");

                        }
                        }
catch (SQLException ex) {
                        System.out.println(ex);
                    }
      out.write("\n");
      out.write("                </center>\n");
      out.write("                </div>\n");
      out.write("                </form>\n");
      out.write("           \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

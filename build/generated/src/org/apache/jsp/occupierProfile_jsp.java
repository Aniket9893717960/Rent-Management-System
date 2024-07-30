package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import db.DBConnector;
import java.sql.ResultSet;
import java.sql.Statement;

public final class occupierProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>");
    String lid = (String)session.getAttribute("lid");
String mailid = (String) session.getAttribute("mailid");
                 
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Profile Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Instance/InstanceProfile.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            <a  href=\"occupierresetPassword18-22.jsp\"><button>Reset Password</button></a>\n");
      out.write("            <a href=\"occupierupdate18-22.jsp\"><button>Update Account</button></a>\n");
      out.write("            <a href=\"occupierLogout23-30.jsp\"><button>Logout</button></a>\n");
      out.write("        <div class=\"pro\">\n");
      out.write("        <div class=\"profile-pic\">\n");
      out.write("        </div>\n");
      out.write("            <form action=\"showChecker1823\"  method=\"post\">\n");
      out.write("                ");

            
            String imageFileName = (String) request.getAttribute("imageFileName");
            System.out.println(imageFileName);
            if(mailid ==null || mailid.trim().equals(""))
{
    response.sendRedirect("occupierlogin18-22.jsp");
}
            Statement st = null;
            ResultSet rs = null;
       
                try {
                    st = DBConnector.getStatement();
                    String query = "SELECT * FROM occupier WHERE email_id='"+mailid+"'";
                    System.out.println("Query =" + query);

                    rs = st.executeQuery(query);
            if (rs.next()) 
            {
                String lid1 = rs.getString("landlord_id");
                session.setAttribute("lid1",lid1);
            
      out.write("\n");
      out.write("                <div class=\"profile-card\">\n");
      out.write("                <img src=\"person.jpg\" alt=\"Profile Picture\">\n");
      out.write("                <h2>");
      out.print(rs.getString("first_name"));
      out.write("<br>");
      out.print(rs.getString("last_name"));
      out.write("</h2>\n");
      out.write("                 <div class=\"detail\">\n");
      out.write("                    <span class=\"label\">Occupier ID:</span>\n");
      out.write("                    <span>");
      out.print(rs.getString("occupier_id"));
      out.write("</span>\n");
      out.write("                 </div>\n");
      out.write("                <div class=\"detail\">\n");
      out.write("                    <span class=\"label\">Landlord ID:</span>\n");
      out.write("                    <span>");
      out.print(rs.getString("landlord_id"));
      out.write("</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"detail\">\n");
      out.write("                    <span class=\"label\">email id:</span>\n");
      out.write("                    <span>");
      out.print(rs.getString("email_id"));
      out.write("</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"detail\">\n");
      out.write("                    <span class=\"label\">Organization Name:</span>\n");
      out.write("                    <span>");
      out.print(rs.getString("Oname"));
      out.write("</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"detail\">\n");
      out.write("                    <span class=\"label\">Organization Address:</span>\n");
      out.write("                    <span>");
      out.print(rs.getString("Oaddress"));
      out.write("</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"detail\">\n");
      out.write("                    <span class=\"label\">Age:</span>\n");
      out.write("                    <span>");
      out.print(rs.getString("age"));
      out.write("</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"detail\">\n");
      out.write("                    <span class=\"label\">Date Of Birth:</span>\n");
      out.write("                    <span>");
      out.print(rs.getString("dob"));
      out.write("</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"detail\">\n");
      out.write("                    <span class=\"label\">Money Expactation:</span>\n");
      out.write("                    <span>");
      out.print(rs.getString("Mexpectation"));
      out.write("</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"detail\">\n");
      out.write("                    <span class=\"label\">Demand:</span>\n");
      out.write("                    <span>");
      out.print(rs.getString("demand"));
      out.write("</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"detail\">\n");
      out.write("                    <span class=\"label\">Proper Address:</span>\n");
      out.write("                    <span>");
      out.print(rs.getString("address"));
      out.write("</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"detail\">\n");
      out.write("                    <span class=\"label\">Proper Additional Address:</span>\n");
      out.write("                    <span>");
      out.print(rs.getString("address2"));
      out.write("</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"detail\">\n");
      out.write("                    <span class=\"label\">ZIP CODE:</span>\n");
      out.write("                    <span>");
      out.print(rs.getString("zipcode"));
      out.write("</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"detail\">\n");
      out.write("                    <span class=\"label\">Phone No:</span>\n");
      out.write("                    <span>");
      out.print(rs.getString("phone_no"));
      out.write("</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"place-photo\">\n");
      out.write("                     <img src=\"place.jpg\" alt=\"Place Picture\">\n");
      out.write("                </div>\n");
      out.write("                ");

                        }
                    } catch (SQLException ex) {
                        System.out.println(ex);
                    }
      out.write("\n");
      out.write("             </div>\n");
      out.write("        </form>\n");
      out.write("        <!-- Bootstrap JS and jQuery -->\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("  <!-- Font Awesome JS -->\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

package org.apache.jsp.Occupier.age18_002d22;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.DBConnector;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public final class profile18_002d23_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Profile Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"profile18-22.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"pro\">\r\n");
      out.write("        <div class=\"profile-pic\">\r\n");
      out.write("        </div>\r\n");
      out.write("            \r\n");
      out.write("      ");

            String mailid = (String) session.getAttribute("mailid");
            if(mailid ==null || mailid.trim().equals(""))
{
    response.sendRedirect("login18-22.jsp");
}
            Statement st = null;
            ResultSet rs = null;
        
      out.write("\r\n");
      out.write("        <form action=\"showChecker\"  method=\"post\">\r\n");
      out.write("            ");

                try {
                    st = DBConnector.getStatement();
                    String query = "SELECT * FROM emp WHERE empmailid='" + mailid + "'";
                    System.out.println("Query =" + query);

                    rs = st.executeQuery(query);
            if (rs.next()) 
            {
            
      out.write("\r\n");
      out.write("            <table>\r\n");
      out.write("                <div class=\"profile-info\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Occupier ID:</td>\r\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("occupier_id"));
      out.write("</h3></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>First Name:</td>\r\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("name"));
      out.write("</h3></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Last Name:</td>\r\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("lastname"));
      out.write("</h3></td>\r\n");
      out.write("                </tr>  \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Organization Name:</td>\r\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("organisation"));
      out.write("</h3></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class =\"Profile-details\">\r\n");
      out.write("        <h2><strong><center> About Me</center></strong></h2>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Organization Address:</td>\r\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("organisation_address"));
      out.write("</h3></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Age:</td>\r\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("age"));
      out.write("</h3></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Date Of Birth:</td>\r\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("dateofbirth"));
      out.write("</h3></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Money Expactation:</td>\r\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("money_expactation"));
      out.write("</h3></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Demand:</td>\r\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("demand"));
      out.write("</h3></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Address:</td>\r\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("empaddress"));
      out.write("</h3></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Additional Address:</td>\r\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("empaddress2"));
      out.write("</h3></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>City:</td>\r\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("empcity"));
      out.write("</h3></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>State:</td>\r\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("empstate"));
      out.write("</h3></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>ZIP CODE:</td>\r\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("empzipcode"));
      out.write("</h3></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Phone No:</td>\r\n");
      out.write("                    <td><h3>");
      out.print(rs.getString("empphoneNo"));
      out.write("</h3></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");

                        }
                    } catch (SQLException ex) {
                        System.out.println(ex);
                    }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><a href=\"logout.jsp\">Sign Out</a></td>\r\n");
      out.write("                    <td><a href=\"deletejsp.jsp\">Delete Account</a></td>\r\n");
      out.write("                    <td><a href=\"update.jsp\">Update Account</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

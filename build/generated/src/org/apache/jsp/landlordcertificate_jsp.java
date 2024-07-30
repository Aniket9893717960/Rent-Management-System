package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import db.DBConnector;
import java.sql.ResultSet;
import java.sql.Statement;

public final class landlordcertificate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>certificate Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"landlordcertificate.css\" >\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"occupierLogout23-30.jsp\"><button>Start Working</button></a>\n");
      out.write("         ");

            String mailid = (String) session.getAttribute("mailid");
            if(mailid ==null || mailid.trim().equals(""))
{
    response.sendRedirect("landlordlogin.jsp");
}
            Statement st = null;
            ResultSet rs = null;
        
      out.write("\n");
      out.write("        <div class=\"certificate\">\n");
      out.write("            <div class=\"certificate-content\">\n");
      out.write("                <h1>Certificate OF Guarantee</h1>\n");
      out.write("            </div>\n");
      out.write("            <form action=\"CertificateChecker\" method=\"post\">\n");
      out.write("                <center>\n");
      out.write("             ");

                try {
                    st = DBConnector.getStatement();
                    String query = "SELECT * FROM landlord WHERE email_id='"+mailid+"'";
                    System.out.println("Query =" + query);

                    rs = st.executeQuery(query);
            if (rs.next()) 
            {
            
      out.write("\n");
      out.write("            <strong><p>landlord No.</p>");
      out.print(rs.getString("landlord_id"));
      out.write("</strong>\n");
      out.write("            <strong><p>Customer Name</p>");
      out.print(rs.getString("first_name"));
      out.write(' ');
      out.write(' ');
      out.print(rs.getString("last_name"));
      out.write("</strong>\n");
      out.write("            <strong><p>Address</p>");
      out.print(rs.getString("address"));
      out.write("</strong>\n");
      out.write("            <strong><p>Additional Address</p>");
      out.print(rs.getString("address2"));
      out.write("</strong>\n");
      out.write("            <strong><p>City</p>");
      out.print(rs.getString("city"));
      out.write("</strong>\n");
      out.write("            </form>\n");
      out.write("        <p> we hereby guarantee and warrant for our landlord to use our merchandise or our name owned.</p>\n");
      out.write("        <p>for the period time the landlord in prossession of the company will repair the replace defective</p>\n");
      out.write("        <p>components which will not be no additional charge to the landlord owner.</p>\n");
      out.write("        \n");
      out.write("        <p class=\"date\">Date of Award</p>\n");
      out.write("      <p class=\"signature\">Authorized Signature</p>\n");
      out.write("        </div>\n");
      out.write("            ");

                        }
                    } catch (SQLException ex) {
                        System.out.println(ex);
                    }
      out.write("\n");
      out.write("                    \n");
      out.write("                    <a href=\"ServicesPage.jsp\"><button>Start Working</button></a>\n");
      out.write("                     </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

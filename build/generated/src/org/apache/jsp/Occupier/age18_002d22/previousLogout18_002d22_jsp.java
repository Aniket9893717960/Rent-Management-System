package org.apache.jsp.Occupier.age18_002d22;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.DBConnector;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public final class previousLogout18_002d22_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>Delete Account</title>\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"previousLogout18-22.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"container\">\n");
      out.write("      ");

            String mailid = (String) session.getAttribute("mailid");
            String password = (String) session.getAttribute("password");
            if(mailid ==null || mailid.trim().equals(""))
{
    response.sendRedirect("login18-22.jsp");
}
            Statement st = null;
            ResultSet rs = null;
        
      out.write("\n");
      out.write("    <h1>Delete Account</h1>\n");
      out.write("    <p>Are you sure you want to delete your account? This action cannot be undone.</p>\n");
      out.write("    ");

                try {
                    st = DBConnector.getStatement();
                    String query = "SELECT * FROM emp WHERE emppassword='" + password + "'";
                    System.out.println("Query =" + query);

                    rs = st.executeQuery(query);
            if (rs.next()) 
            {
            
      out.write("\n");
      out.write("    <form id=\"deleteAccountForm\">\n");
      out.write("      <label for=\"password\">Password:</label>\n");
      out.write("      <input type=\"password\" id=\"password\" name=\"password\" required>\n");
      out.write("      ");

                        }
                    } catch (SQLException ex) {
                        System.out.println(ex);
                    }
      out.write("\n");
      out.write("      <button type=\"submit\">Delete Account</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
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

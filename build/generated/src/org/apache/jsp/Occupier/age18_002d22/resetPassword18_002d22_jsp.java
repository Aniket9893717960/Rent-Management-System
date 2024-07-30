package org.apache.jsp.Occupier.age18_002d22;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class resetPassword18_002d22_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>Reset Password</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resetPassword18-22.css\">\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"reset-container\">\n");
      out.write("    <h2>Reset Password</h2>\n");
      out.write("    <form action=\"#\" method=\"post\">\n");
      out.write("      <div class=\"input-group\">\n");
      out.write("          <table>\n");
      out.write("              <tr>\n");
      out.write("                  <td><label for=\"email\">Email</label></td>\n");
      out.write("          <td><input type=\"email\" id=\"email\" name=\"email\" required></td>\n");
      out.write("              </tr>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"input-group\">\n");
      out.write("          <tr>\n");
      out.write("              <td><label for=\"password\">New Password</label></td>\n");
      out.write("          <td><input type=\"password\" id=\"password\" name=\"password\" required></td>\n");
      out.write("        </tr>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"input-group\">\n");
      out.write("          <tr>\n");
      out.write("              <td><label for=\"confirm-password\">Confirm Password</label></td>\n");
      out.write("          <td><input type=\"password\" id=\"confirm-password\" name=\"confirm-password\" required></td>\n");
      out.write("        </tr>\n");
      out.write("      </div>\n");
      out.write("        <tr>\n");
      out.write("            <td><button type=\"submit\" value=\"Reset\">Reset Password</button></td>\n");
      out.write("            <td><a href =\"login18-22.jsp\"><button>Sign In</button></a></td>\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
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

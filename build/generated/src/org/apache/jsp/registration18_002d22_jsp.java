package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration18_002d22_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registration Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"registration18-22.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"reg\">\n");
      out.write("            <h2>REGISTRATION PAGE</h2>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <form  action=\"registrationChecker1823\"  method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("        <table >\n");
      out.write("           \n");
      out.write("            <div class=\"subtables\">\n");
      out.write("             <tr>\n");
      out.write("                    <td>First Name:</td>\n");
      out.write("                    <td><input type =\"text\" name=\"firstname\" placeholder=\"Enter firstname Here\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"subtables\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Last Name:</td>\n");
      out.write("                    <td><input type =\"text\" name=\"lastname\" placeholder=\"Enter Lastname Here\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </div>\n");
      out.write("                <div class=\"subtables\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Email ID:</td>\n");
      out.write("                    <td><input type =\"email\" name=\"email\" placeholder=\"Enter Email ID\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                </div>\n");
      out.write("            <div class=\"subtables\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Organization Name:</td>\n");
      out.write("                    <td><input type =\"text\" name=\"Oname\" placeholder=\"Enter Organization name\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"subtables\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Organization Address:</td>\n");
      out.write("                    <td><input type =\"text\" name=\"Oaddress\" placeholder=\"Enter Organization Address\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"subtables\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Age:</td>\n");
      out.write("                    <td><input type =\"text\" name=\"age\" placeholder=\"Enter age\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"subtables\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Date Of Birth:</td>\n");
      out.write("                    <td><input type =\"date\" name=\"dob\" placeholder=\"Enter Date Of Birth\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"subtables\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>money-expectation:</td>\n");
      out.write("                    <td><input type =\"text\" name=\"Mexpactation\" placeholder=\"Enter Money-Expectation\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"subtables\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>demand(BHK):</td>\n");
      out.write("                    <td><input type =\"text\" name=\"demand\" placeholder=\"Enter demand in BHK\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"subtables\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Address:</td>\n");
      out.write("                    <td><input type =\"text\" name=\"address\" placeholder=\"Enter Address\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"subtables\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Additional Address:</td>\n");
      out.write("                    <td><input type =\"text\" name=\"address1\" placeholder=\"Enter Additional Address\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"subtables\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>City:</td>\n");
      out.write("                    <td><input type =\"text\" name=\"city\" placeholder=\"Enter City\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"subtables\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>State:</td>\n");
      out.write("                    <td><input type =\"text\" name=\"state\" placeholder=\"Enter State\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                </div>\n");
      out.write("            <div class=\"subtables\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>ZIP CODE:</td>\n");
      out.write("                    <td><input type =\"number\" name=\"zipcode\" placeholder=\"Enter zipcode\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"subtables\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Phone No:</td>\n");
      out.write("                    <td><input type =\"number\" name=\"phoneno\" placeholder=\"Enter Phone Number\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                </div>\n");
      out.write("            <div class=\"subtables\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Passport size Photo: </td>\n");
      out.write("                        <br />\n");
      out.write("                        <td><input type=\"file\" name=\"image\" size=\"50\" /></td>\n");
      out.write("            </form><br />\n");
      out.write("                </tr>\n");
      out.write("                </div>\n");
      out.write("            <div class=\"subtables\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><button><input type=\"reset\" value=\"Reset\" /></button></td>\n");
      out.write("                    <td><button><input type=\"submit\" value=\"submit\" name=\"Add image\" size=\"50\"/></button></td>\n");
      out.write("                </tr>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
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

package org.apache.jsp.Occupier.age18_002d22;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login18_002d22_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"login18-22.css\">\n");
      out.write("    </head>\n");
      out.write("<center>\n");
      out.write("    <body><header>\n");
      out.write("        <h2>LOGIN PAGE</h2>\n");
      out.write("        </header>\n");
      out.write("        <p> <strong>if you are the new user of our services. So, firstly register\n");
      out.write("                        on our Page by clicking on registration Page link</strong></p>\n");
      out.write("                        <a href=\"registration18-22.jsp\" ><button>Registration Page</button></a>\n");
      out.write("         <form action=\"loginChecker1823\"  method=\"post\">\n");
      out.write("        <table border=\"0\">\n");
      out.write("            \n");
      out.write("                <tr>\n");
      out.write("                    <td>Email Id:</td>\n");
      out.write("                    <td><input type =\"text\" name=\"mailid\" placeholder=\"Enter E-mail Here\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password:</td>\n");
      out.write("                    <td><input type =\"password\" name=\"password\" placeholder=\"Enter Password Here\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><button><input type=\"reset\" value=\"Reset\" /></button></td>\n");
      out.write("                    <td><button><input type=\"submit\" value=\"Login\" /></button></td>\n");
      out.write("                \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                    </table>\n");
      out.write("         </form>\n");
      out.write("                 \n");
      out.write("        \n");
      out.write("</center>\n");
      out.write("    </body>\n");
      out.write("</html>");
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

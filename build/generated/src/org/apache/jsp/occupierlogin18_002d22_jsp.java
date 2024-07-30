package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class occupierlogin18_002d22_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Instance/InstanceLogin.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"login-container\">\n");
      out.write("    <form id=\"loginForm\" action=\"loginChecker1823\" method=\"post\">\n");
      out.write("    <h2>Login</h2>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("      <input type =\"text\" id=\"username\" name=\"mailid\" placeholder=\"Enter E-mail Here\" />\n");
      out.write("      <i class=\"fas fa-user\"></i>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("      <input type =\"password\" id=\"password\" name=\"password\" placeholder=\"Enter Password Here\" />\n");
      out.write("      <i class=\"fas fa-lock\"></i>\n");
      out.write("      </div>\n");
      out.write("       <input type=\"submit\" class=\"submit\" value=\"Login\" />\n");
      out.write("      </form>\n");
      out.write("     <p>Don't have an account? <a href=\"occupierregistration18-22.jsp\">Sign up</a></p>\n");
      out.write("     </div>\n");
      out.write("     <!-- Bootstrap JS and jQuery -->\n");
      out.write("     <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("     <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js\"></script>\n");
      out.write("     <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("     <!-- Font Awesome JS -->\n");
      out.write("     <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js\"></script>\n");
      out.write("\n");
      out.write("     <!-- Custom JavaScript -->\n");
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

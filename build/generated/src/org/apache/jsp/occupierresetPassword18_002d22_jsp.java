package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class occupierresetPassword18_002d22_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\n");
      out.write("  body {\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
      out.write("    background-color: #FFFAF0; /* Yellow background color */\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    height: 100vh;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .container {\n");
      out.write("    width: 380px;\n");
      out.write("    background-color: #FFC107; /* Yellow container background */\n");
      out.write("    padding: 40px;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("    text-align: center;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  h2 {\n");
      out.write("    margin-bottom: 30px;\n");
      out.write("    color: #FFF; /* White text color */\n");
      out.write("    font-size: 24px;\n");
      out.write("    letter-spacing: 1px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  input {\n");
      out.write("    width: calc(100% - 40px);\n");
      out.write("    padding: 15px;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    border: 2px solid #FFA000; /* Orange border color */\n");
      out.write("    border-radius: 25px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    font-size: 16px;\n");
      out.write("    transition: border-color 0.3s;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  input:focus {\n");
      out.write("    border-color: #FF8F00; /* Darker shade of orange on focus */\n");
      out.write("    outline: none;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  button {\n");
      out.write("    width: calc(100% - 40px);\n");
      out.write("    padding: 15px;\n");
      out.write("    border: none;\n");
      out.write("    background-color: #FFA000; /* Orange button color */\n");
      out.write("    color: #fff; /* White text color */\n");
      out.write("    border-radius: 25px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    font-size: 16px;\n");
      out.write("    transition: background-color 0.3s;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  button:hover {\n");
      out.write("    background-color: #FF8F00; /* Darker shade of orange on hover */\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .message {\n");
      out.write("    margin-top: 20px;\n");
      out.write("    color: #FFF; /* White text color */\n");
      out.write("    font-size: 14px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .message a {\n");
      out.write("    color: #FFF; /* White text color */\n");
      out.write("    text-decoration: none;\n");
      out.write("    transition: color 0.3s;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .message a:hover {\n");
      out.write("    color: #FFA000; /* Orange color on hover */\n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("    <h2>Set Password</h2>\n");
      out.write("      <br>\n");
      out.write("    <form action=\"resetPasswordChecker1823\" method=\"post\">\n");
      out.write("          <input type=\"email\"  name=\"mailid\" placeholder=\"Enter Email Id\" required>\n");
      out.write("          <input type=\"password\" name=\"password\" placeholder=\" Password\" required>\n");
      out.write("          <input type=\"password\" name=\"confirm-password\" placeholder=\"Confirm Password\" required>\n");
      out.write("          <button type=\"submit\" value=\"set\">Reset Password</button>\n");
      out.write("    </form>\n");
      out.write("    <div class=\"message\">Already have an account? <a href=\"occupierlogin18-22.jsp\">Click Here For Login</a></div>\n");
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

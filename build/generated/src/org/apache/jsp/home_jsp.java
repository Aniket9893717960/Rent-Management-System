package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("  <title>Web Application</title>\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"home.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("    <nav>\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("        <li><a href=\"\">About</a></li>\n");
      out.write("        <li><a href=\"#\">Services</a></li>\n");
      out.write("        <li><a href=\"#\">Contact</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("  <section class=\"hero\">\n");
      out.write("    <div class=\"hero-content\">\n");
      out.write("      <h1>Welcome to our Web Application</h1>\n");
      out.write("      <p>Discover the amazing features we offer!</p>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <section class=\"features\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"feature\">\n");
      out.write("          <a href=\"landlordlogin.jsp\" ><button>LandLord </button></a>\n");
      out.write("        <p>A person who rents a house to people for money.</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"feature\">\n");
      out.write("          <a href=\"occupier.jsp\"><button>Occupier </button></a>\n");
      out.write("        <p>a person who lives in or uses a houses,pieces, of land,etc</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"feature\">\n");
      out.write("          <a href=\"adminlogin.jsp\" ><button>Admin </button></a>\n");
      out.write("        <p>the administration of a business,organization,etc.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      </section>\n");
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

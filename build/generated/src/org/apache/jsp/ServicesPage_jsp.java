package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.sql.SQLException;
import db.DBConnector;
import java.sql.ResultSet;
import java.sql.Statement;

public final class ServicesPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Services Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.2/font/bootstrap-icons.min.css\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"ServicesPages.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("      <section>\n");
      out.write("        <div class=\"container mt-2 pt-8\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-12 col-sm-5 col-md-4 n-auto\"> \n");
      out.write("                    <div class=\"card border-0 shadow\"> \n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <form action=\"\">\n");
      out.write("        <header>\n");
      out.write("            <a href=\"landlordProfile.jsp\"><button type=\"button\" class=\"btn btn-primary\">Profile</button></a>\n");
      out.write("  </header>\n");
      out.write("        <label for=\"text-field\">Destination Name:</label>\n");
      out.write("        \n");
      out.write("        <input type=\"text\" id=\"address\" name=\"address\" class=\"form-control my-3 py-2\" onkeyup=\" searchFun()\">\n");
      out.write("        <label for=\"text-field\">Home Size(In BHK):</label>\n");
      out.write("        \n");
      out.write("        <input type=\"text\" id=\"demand\"  name=\"demands\" class=\"form-control my-3 py-2\">\n");
      out.write("        <label for=\"text-field\">PIN Code :</label>\n");
      out.write("        <input type=\"text\" id=\"zipcode\" placeholder=\"pin...\" class=\"form-control my-3 py-2\">\n");
      out.write("        <div class=\"text-center\">\n");
      out.write("        </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("        ");
  String first_name = (String) session.getAttribute("first_name");
            String last_name = (String) session.getAttribute("last_name");
            String demands = (String) session.getAttribute("demands");
            String address = (String) session.getAttribute("address");
            String mailid = (String) session.getAttribute("mailid");
            String email_id = (String) session.getAttribute("email_id");
            if(mailid ==null || mailid.trim().equals(""))
{
    response.sendRedirect("gethome.jsp");
}
            Statement st = null;
            ResultSet rs = null;
                try {
                    st = DBConnector.getStatement();
                    String query = "SELECT * FROM occupier";
                    System.out.println("Query =" + query);

                    rs = st.executeQuery(query);
            
      out.write("\n");
      out.write("            <div class=\"container mt-5\">\n");
      out.write("            <table id =\"myTable\" class=\"table table-responsive table-bordered border-dark text-hover text-center text-capitalize\">\n");
      out.write("            <tr class =\"table-dark table-action text-uppercase text-white\">\n");
      out.write("                <th style=\"width:40%;\">email_id</th>\n");
      out.write("                <th style=\"width:30%;\">address</th>\n");
      out.write("                <th style=\"width:30%;\">Space Required</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
 while(rs.next())
            {  
      out.write("\n");
      out.write("            \n");
      out.write("                      <tr>\n");
      out.write("                          <td>\n");
      out.write("                              <form action=\"Profile.jsp\" method=\"post\">\n");
      out.write("                                  <input type=\"hidden\" name=\"email_id\" value=\"");
      out.print(rs.getString("email_id"));
      out.write("\"/>\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-secondary\" value=\"");
      out.print(rs.getString("email_id"));
      out.write("\" />\n");
      out.write("                              </form> </td>\n");
      out.write("                          \n");
      out.write("                 <td>");
      out.print(rs.getString("address"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("demand"));
      out.write("</td>\n");
      out.write("                \n");
      out.write("                 </tr>\n");
      out.write("              </div>\n");
      out.write("            ");
          }
                        }
                     catch (SQLException ex) {
                        System.out.println(ex);
                    }
      out.write("       \n");
      out.write("            </table>\n");
      out.write("           <script>\n");
      out.write("        const searchFun = () =>{\n");
      out.write("        let Filter = document.getElementById('address').value.toUpperCase();\n");
      out.write("        \n");
      out.write("        let myTable = document.getElementById('myTable');\n");
      out.write("        \n");
      out.write("        let tr = myTable.getElementsByTagName('tr');\n");
      out.write("        \n");
      out.write("        for(var i=0;i<tr.length;i++){\n");
      out.write("        let td = tr[i].getElementsByTagName('td')[1];  \n");
      out.write("        \n");
      out.write("        if(td) {\n");
      out.write("            let textvlaue = td.textContent || td.innerHTML;\n");
      out.write("            \n");
      out.write("            if(textvlaue.toUpperCase().indexOf(Filter) > -1){\n");
      out.write("                tr[i].style.display = \"\";\n");
      out.write("            }\n");
      out.write("            else {\n");
      out.write("                tr[i].style.display = \"none\";\n");
      out.write("            }\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("       }\n");
      out.write("        </script>\n");
      out.write("    </center>\n");
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

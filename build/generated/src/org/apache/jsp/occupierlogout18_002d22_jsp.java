package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.DBConnector;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.HttpSession;
import controllerOccupier.deleteChecker1823;

public final class occupierlogout18_002d22_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Delete Account Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String delete = (String) session.getAttribute("mailid");
            if(delete ==null || delete.trim().equals(""))
{
    response.sendRedirect("occupierlogin18-22.jsp");
}
            Statement st = null;
        
      out.write("\n");
      out.write("        <table>\n");
      out.write("            \n");
      out.write("            <td>\n");
      out.write("                ");

                if(delete!=null)
                {
                try {
             st = DBConnector.getStatement();
            String query="DELETE FROM occupier18 where email_id='"+delete+"'";
            System.out.println("Query=" +query);
            
             int i =st.executeUpdate(query);
            
            if(i!=0){
                
      out.write("\n");
      out.write("             <tr>\n");
      out.write("                    <td>User email-id ID:</td>\n");
      out.write("                    <td><h1>");
      out.print(delete);
      out.write("</h1></td>\n");
      out.write("             </tr>\n");
      out.write("             <tr><td><h2> Is Deleted</h2></td></tr>\n");
      out.write("                ");

            }
        }
      
        catch(SQLException e){
            System.out.println(e);
        }
} 

      out.write("\n");
      out.write("            </td>\n");
      out.write("                </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import db.DBConnector;
import java.sql.ResultSet;
import java.sql.Statement;

public final class landlordaggrement_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Agreement Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.2/font/bootstrap-icons.min.css\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"landlordaggrement.css\" >\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

            String mailid = (String) session.getAttribute("mailid");
            if(mailid ==null || mailid.trim().equals(""))
{
    response.sendRedirect("landlordlogin.jsp");
}
            Statement st = null;
            ResultSet rs = null;
        
      out.write("\n");
      out.write("        <button id=\"agreeButton\">Agree</button>\n");
      out.write("        <div class=\"agreement\" id=\"agreementText\" >\n");
      out.write("            <div class=\"aggrement -header\">\n");
      out.write("        <strong><h1 class=\"agreement-title\">Service Agreement</h1></strong>\n");
      out.write("            </div>\n");
      out.write("            <h4>GET HOME</h4>\n");
      out.write("    <h4>Indore[M.P]</h4>\n");
      out.write("    <form action=\"aggrementChecker\"  method=\"post\">\n");
      out.write("    ");

                try {
                    st = DBConnector.getStatement();
                    String query = "SELECT * FROM landlord WHERE email_id='"+mailid+"'";
                    System.out.println("Query =" + query);

                    rs = st.executeQuery(query);
            if (rs.next()) 
            {
            
      out.write("\n");
      out.write("\n");
      out.write("            <h4><b>");
      out.print(rs.getString("first_name"));
      out.write("</b></h4>\n");
      out.write("            <h4><b>");
      out.print(rs.getString("address"));
      out.write("</b></h4>\n");
      out.write("            <h4>[<b>");
      out.print(rs.getString("zipcode"));
      out.write("</b>]</h4>\n");
      out.write("            <div class=\"agreement-content\">\n");
      out.write("    <p>Subject: Guarantee for Losses Incurred</p>\n");
      out.write("\n");
      out.write("    <p>Dear <b>");
      out.print(rs.getString("first_name"));
      out.write("</b>");
      out.print(rs.getString("last_name"));
      out.write("</p>\n");
      out.write("\n");
      out.write("    <p>This agreement (\"Agreement\") is made between [Your Company Name] (\"Company\") and ");
      out.print(rs.getString("first_name"));
      out.write(" (\"Landlord\") on this day of [Date], regarding the rental of the property located at ");
      out.print(rs.getString("address"));
      out.write("[Property Address].</p>\n");
      out.write("\n");
      out.write("    <p>Guarantee:</p>\n");
      out.write("    <p>Company hereby guarantees to Landlord, for the duration of the lease agreement, full compensation for any financial loss or damage incurred by Landlord resulting from any actions, omissions, or defaults by Company or its employees, agents, or representatives, in accordance with the terms and conditions stated in this Agreement.</p>\n");
      out.write("\n");
      out.write("    <p>Scope of Guarantee:</p>\n");
      out.write("    <p>The guarantee provided by Company covers all financial losses and damages, including but not limited to:</p>\n");
      out.write("<p>a) Unpaid rent or utility bills.</p>\n");
      out.write("<p>b) Property damage caused by Company or its employees, agents, or representatives.</p>\n");
      out.write("<p>c) Breach of any terms and conditions of the lease agreement.</p>\n");
      out.write("\n");
      out.write("<p>Notification of Loss:</p>\n");
      out.write("<p>In the event of any loss or damage covered by this Agreement, Landlord shall promptly notify Company in writing, providing detailed information regarding the loss or damage sustained. Company shall respond within [number of days] upon receipt of such notification.</p>\n");
      out.write("\n");
      out.write("<p>Company's Obligations:</p>\n");
      out.write("<p>Upon receiving a valid notification of loss, Company shall undertake the following obligations:</p>\n");
      out.write("<p>a) Compensate Landlord for the full amount of the financial loss or damage incurred, within [number of days] from the date of receipt of the notification.</p>\n");
      out.write("<p>b) Take necessary actions to rectify any breach of the lease agreement committed by Company or its employees, agents, or representatives.</p>\n");
      out.write("\n");
      out.write("<p>Limitations:</p>\n");
      out.write("<p>This guarantee does not extend to losses or damages resulting from acts of God, natural disasters, war, or any other event beyond the control of Company. Furthermore, the guarantee shall not apply if Landlord fails to fulfill its obligations as outlined in the lease agreement.</p>\n");
      out.write("\n");
      out.write("<p>Indemnification:</p>\n");
      out.write("<p>Company shall indemnify and hold Landlord harmless from any liability, loss, or damage arising from any claims, demands, or lawsuits related to the actions, omissions, or defaults of Company or its employees, agents, or representatives.</p>\n");
      out.write("\n");
      out.write("<p>Governing Law:</p>\n");
      out.write("<p>This Agreement shall be governed by and construed in accordance with the laws of the [State/Country], without regard to its conflict of laws principles.</p>\n");
      out.write("\n");
      out.write("</p>Entire Agreement:</p>\n");
      out.write("<p>This Agreement constitutes the entire understanding between Company and Landlord concerning the subject matter hereof and supersedes all prior agreements, understandings, negotiations, and discussions, whether oral or written.</p>\n");
      out.write("\n");
      out.write("<p>Please sign below to indicate your acceptance of the terms and conditions of this Agreement. A duplicate copy of this Agreement is enclosed for your records.</p>\n");
      out.write("\n");
      out.write("<p>Thank you for your cooperation. We look forward to maintaining a mutually beneficial relationship.</p>\n");
      out.write("\n");
      out.write("<p>Sincerely,</p>\n");
      out.write("\n");
      out.write("<h4>Aniket Rathore</h4>\n");
      out.write("<h4>Founder</h4>\n");
      out.write("<h4>Get Home Company</h4>\n");
      out.write("\n");
      out.write("<p>Accepted and agreed:</p>\n");
      out.write("            </div>\n");
      out.write("<h4><b>");
      out.print(rs.getString("first_name"));
      out.print(rs.getString("last_name"));
      out.write("</b></h4>\n");
      out.write("<h4>[Landlord's Signature]</h4>\n");
      out.write("<h4>[Date]</h4>\n");

                        }
                    } catch (SQLException ex) {
                        System.out.println(ex);
                    }
      out.write("\n");
      out.write("    </form>\n");
      out.write("     </div>\n");
      out.write("  <script src=\"agreeButton.js\"></script>\n");
      out.write("                    <input type=\"checkbox\" />Click here if you accept all conditions\n");
      out.write("                    <a href=\"landlordcertificate.jsp\" ><button>Landlord Certificate</button></a>\n");
      out.write("</strong>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gethome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Rent Management System</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.2/font/bootstrap-icons.min.css\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.19.0/font/bootstrap-icons.css\"></script>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"gethome.css\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("       \n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-light bg-light fixed-top\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\"><span class=\"text-warning\">Get</span>Home</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("      <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#home\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#about\">About</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#services\">Services</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#portfolio\">Portfolio</a>\n");
      out.write("        </li>\n");
      out.write("         <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#team\">Team</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"mailto:rathoreaniket70@gmail.com\">Contact</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("      \n");
      out.write("<div id=\"carouselExampleCaptions\" class=\"carousel slide\">\n");
      out.write("  <div class=\"carousel-indicators\">\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("      <img src=\"image/home-1.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h5>Your Dream House</h5>\n");
      out.write("        <p>Some representative placeholder content for the first slide.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"image/home-2.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h5>Rent Management</h5>\n");
      out.write("        <p>Some representative placeholder content for the first slide.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"image/home-3.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h5>True Emotions</h5>\n");
      out.write("        <p>Some representative placeholder content for the first slide.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"visually-hidden\">Previous</span>\n");
      out.write("  </button>\n");
      out.write("  <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"visually-hidden\">Next</span>\n");
      out.write("  </button>\n");
      out.write("</div>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <!--about section-->\n");
      out.write("      \n");
      out.write("      <section id=\"about\" class=\"about section-padding\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                  <div class=\"col-lg-4 col-md-12 col-12\">\n");
      out.write("                      <div class=\"about-img\">\n");
      out.write("                          <img src=\"image/about.jpg\" alt=\"\" class=\"img-fluid\">\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-lg-8 col-md-12 col-12 ps-lg-5 mt-md-5\">\n");
      out.write("                      <div class=\"about-text\">\n");
      out.write("                          <h2> We Provide Best Quality<br>Services Ever</h2>\n");
      out.write("                          <p>Get Home is an Web application which aims  to creating an online platform that connects \n");
      out.write("                          landlord and occupier directly,eliminating the need for Rent Management Brockers.\n");
      out.write("                          This innovative platform will empower landlords to give on rent his properties with greater transparency\n");
      out.write("                          ,efficiency and cost-effectiveness</p>\n");
      out.write("                           <p>Get Home simplifies the rental process, offering features such as direct communication, real-time updates, and secure transactions. \n");
      out.write("                           This not only reduces the overall costs associated with renting but also enhances the renting experience for both landlords and tenants.</p>\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("      </section>\n");
      out.write("      \n");
      out.write("      <!--services section-->\n");
      out.write("      \n");
      out.write("      <section id=\"services\" class=\"services section-padding\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                  <div class=\"col-md-12\">\n");
      out.write("                      <div class=\"section-header text-center pb-5\">\n");
      out.write("                          <h2>Our services</h2>\n");
      out.write("                          <p>For Accessing over Services First you have to sign in according to your Eligibility.</p>\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"row\">\n");
      out.write("                  <div class=\"col-12 col-md-12 col-lg-4\">\n");
      out.write("                    <div class=\"card text-dark text-center bg-light pb-2\">\n");
      out.write("                          <div class=\"card-body\">\n");
      out.write("                              <i class=\"bi bi-houses\"></i>\n");
      out.write("                              <h3 class=\"card-title\">Landlord</h3>\n");
      out.write("                              <p class=\"lead\">The owner of property(such as land,houses,or apartmants )that is leased or rented to another.\n");
      out.write("                              the master of an inn or lodging house:</p>\n");
      out.write("                              <a href=\"landlordlogin.jsp\"><button class=\"btn btn-warning text-light\">Sign In</button></a>\n");
      out.write("                         </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("              <div class=\"col-12 col-md-12 col-lg-4\">\n");
      out.write("                      <div class=\"card text-dark text-center bg-light pb-2\">\n");
      out.write("                          <div class=\"card-body\">\n");
      out.write("                              <i class=\"bi bi-stripe\"></i>\n");
      out.write("                              <h3 class=\"card-title\">Occupier[School Student]</h3>\n");
      out.write("                              <p class=\"lead\">If an occupants is a student than he will register on this option.\n");
      out.write("                                  This will be accessible for students whose age is between 16-20.</p>\n");
      out.write("                              <a href=\"occupierlogin18-22.jsp\"><button class=\"btn btn-warning text-light\">Sign In</button></a>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("                <div class=\"col-12 col-md-12 col-lg-4\">\n");
      out.write("                      <div class=\"card text-dark text-center bg-light pb-2\">\n");
      out.write("                          <div class=\"card-body\">\n");
      out.write("                              <i class=\"bi bi-bank\"></i>\n");
      out.write("                              <h3 class=\"card-title\">Occupier[Collage Student]</h3>\n");
      out.write("                              <p class=\"lead\">If an occupants is a collage Student or Job holder than he will register on this option.\n");
      out.write("                                  This will be accessible for students whose age is between 21-29.</p>\n");
      out.write("                              <a href=\"occupierlogin23-30.jsp\"><button class=\"btn btn-warning text-light\">Sign In</button></a>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("                <div class=\"col-12 col-md-12 col-lg-4\">\n");
      out.write("                      <div class=\"card text-dark text-center bg-light pb-2\">\n");
      out.write("                          <div class=\"card-body\">\n");
      out.write("                              <i class=\"bi bi-person\"></i>\n");
      out.write("                              <h3 class=\"card-title\">Occupier[30+ and Married]</h3>\n");
      out.write("                              <p class=\"lead\">If an occupants is a Married or 30+ Age than he will register on this option.\n");
      out.write("                                  This will be accessible for students whose age is between 30+.</p>\n");
      out.write("                              <a href=\"occupierlogin30.jsp\"><button class=\"btn btn-warning text-light\">Sign In</button></a>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("      </section>\n");
      out.write("      \n");
      out.write("      <!--portfolio section -->\n");
      out.write("      \n");
      out.write("      <section id=\"portfolio\" class=\"portfolio section-padding\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("               <div class=\"row\">\n");
      out.write("                  <div class=\"col-md-12\">\n");
      out.write("                      <div class=\"section-header text-center pb-5\">\n");
      out.write("                          <h2>Our Projects</h2>\n");
      out.write("                          <p>On the Insert tab, the galleries include <br>items that are designed to coordinate with the overall look </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-12 col-md-12 col-lg-4\">\n");
      out.write("                      <div class=\"card text-light text-center bg-dark pb-2\">\n");
      out.write("                          <div class=\"card-body text-light\">\n");
      out.write("                              <div class=\"img-area md-4\">\n");
      out.write("                                  <img src=\"image/project-1.jpg\" alt=\"\" class=\"img-fluid\">\n");
      out.write("                              </div>\n");
      out.write("                              <h3 class=\"card-title\">Building Make</h3>\n");
      out.write("                              <p class=\"lead\">On the Insert tab, the galleries include items that are designed to coordinate with the overall look of your document.\n");
      out.write("                                  You can use these galleries to insert tables, headers, footers, lists, cover pages, and other document building blocks. \n");
      out.write("                              </p>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-12 col-md-12 col-lg-4\">\n");
      out.write("                      <div class=\"card text-light text-center bg-dark pb-2\">\n");
      out.write("                          <div class=\"card-body text-light\">\n");
      out.write("                              <div class=\"img-area md-4\">\n");
      out.write("                                  <img src=\"image/project-2.jpg\" alt=\"\" class=\"img-fluid\">\n");
      out.write("                              </div>\n");
      out.write("                              <h3 class=\"card-title\">Building Make</h3>\n");
      out.write("                              <p class=\"lead\">On the Insert tab, the galleries include items that are designed to coordinate with the overall look of your document.\n");
      out.write("                                  You can use these galleries to insert tables, headers, footers, lists, cover pages, and other document building blocks. \n");
      out.write("                              </p>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("                <div class=\"col-12 col-md-12 col-lg-4\">\n");
      out.write("                      <div class=\"card text-light text-center bg-dark pb-2\">\n");
      out.write("                          <div class=\"card-body text-light\">\n");
      out.write("                              <div class=\"img-area md-4\">\n");
      out.write("                                  <img src=\"image/project-3.jpg\" alt=\"\" class=\"img-fluid\">\n");
      out.write("                              </div>\n");
      out.write("                              <h3 class=\"card-title\">Building Make</h3>\n");
      out.write("                              <p class=\"lead\">On the Insert tab, the galleries include items that are designed to coordinate with the overall look of your document.\n");
      out.write("                                  You can use these galleries to insert tables, headers, footers, lists, cover pages, and other document building blocks. \n");
      out.write("                              </p>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("      </section>\n");
      out.write("      \n");
      out.write("      <!--team section-->\n");
      out.write("      \n");
      out.write("      <section id=\"team\" class=\"team section-padding\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                  <div class=\"col-md-12\">\n");
      out.write("                      <div class=\"section-header text-center pb-5\">\n");
      out.write("                          <h2>Our Team</h2>\n");
      out.write("                          <p>On the Insert tab, the galleries include <br>items that are designed to coordinate with the overall look </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("              <center>\n");
      out.write("              <div class=\"row\">\n");
      out.write("                  <div class=\"col-12 col-md-6 col-lg-3\">\n");
      out.write("                      <div class=\"card text-center\">\n");
      out.write("                          <div class=\"card-body\">\n");
      out.write("                              <img src=\"image/founder.jpeg\" alt=\"\" class=\"img-fluid rounded-circle\">\n");
      out.write("                              <h3 class=\"card-title py-2\">Aniket Rathore</h3>\n");
      out.write("                              <p class=\"card-text\">Back End Developer </p>\n");
      out.write("                              \n");
      out.write("                              <p class=\"socials\">\n");
      out.write("                                  <a href=\"https://www.facebook.com/aniket.rathore.1297943?mibextid=ZbWKwL\" class=\"btn btn-primary\" target=\"_blank\" rel=\"noopener noreferrer\"> <i class=\"bi bi-facebook text-dark mx-1\"></i></a>\n");
      out.write("                                  <a href=\"https://instagram.com/aniket_rathore_123?igshid=MzMyNGUyNmU2YQ==\" class=\"btn btn-primary\" target=\"_blank\" rel=\"noopener noreferrer\"><i class=\"bi bi-linkedin text-dark mx-1\"></i></a>\n");
      out.write("                                  <a href=\"https://www.linkedin.com/in/aniket-rathore-56047924a\" class=\"btn btn-primary\" target=\"_blank\" rel=\"noopener noreferrer\"><i class=\"bi bi-instagram text-dark mx-1\"></i></a>\n");
      out.write("                              </p>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-12 col-md-6 col-lg-3\">\n");
      out.write("                      <div class=\"card text-center\">\n");
      out.write("                          <div class=\"card-body\">\n");
      out.write("                              <img src=\"image/Front.jpeg\" alt=\"\" class=\"img-fluid rounded-circle\">\n");
      out.write("                              <h3 class=\"card-title py-2\">Shivam Jat</h3>\n");
      out.write("                              <p class=\"card-text\"> Front End Developer</p>\n");
      out.write("                              \n");
      out.write("                              <p class=\"socials\">\n");
      out.write("                                  <a href=\"https://www.linkedin.com/in/shivam-jaat-0935262aa?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app\" class=\"btn btn-primary\" target=\"_blank\" rel=\"noopener noreferrer\"><i class=\"bi bi-linkedin text-dark mx-1\"></i></a>\n");
      out.write("                                  <a href=\"https://www.instagram.com/1shivam.jaat?igsh=NGVhN2U2NjQ0Yg==\" class=\"btn btn-primary\" target=\"_blank\" rel=\"noopener noreferrer\"><i class=\"bi bi-instagram text-dark mx-1\"></i></a>\n");
      out.write("                              </p>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-12 col-md-6 col-lg-3\">\n");
      out.write("                      <div class=\"card text-center\">\n");
      out.write("                          <div class=\"card-body\">\n");
      out.write("                              <img src=\"image/DBA.jpeg\" alt=\"\" class=\"img-fluid rounded-circle\">\n");
      out.write("                              <h3 class=\"card-title py-2\">Niraj Mahajan</h3>\n");
      out.write("                              <p class=\"card-text\">Database Administrator</p>\n");
      out.write("                              \n");
      out.write("                              <p class=\"socials\">\n");
      out.write("                                  <a href=\"https://www.linkedin.com/in/niraj-mahajan-4547a5218\" class=\"btn btn-primary\" target=\"_blank\" rel=\"noopener noreferrer\"><i class=\"bi bi-linkedin text-dark mx-1\"></i></a>\n");
      out.write("                                  <a href=\"https://instagram.com/thename_isniraj?utm_source=qr&igshid=NGExMmI2YTkyZg%3D%3D\" class=\"btn btn-primary\" target=\"_blank\" rel=\"noopener noreferrer\"><i class=\"bi bi-instagram text-dark mx-1\"></i></a>\n");
      out.write("                              </p>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("          </center>\n");
      out.write("      </section>\n");
      out.write("      \n");
      out.write("\n");
      out.write("      <!--footer -->\n");
      out.write("      \n");
      out.write("      <footer class=\"bg-dark p-2 text-center\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("              <p class=\"text-white\"> All Right Reserved @website Name</p>\n");
      out.write("          </div>\n");
      out.write("      </footer> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" ></script>\n");
      out.write("\n");
      out.write("  </body>\n");
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
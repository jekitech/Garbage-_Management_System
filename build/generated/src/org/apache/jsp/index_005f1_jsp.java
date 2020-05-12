package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <!--\n");
      out.write("    /   Multipurpose: Free Template by FreeHTML5.co\n");
      out.write("    /   Author: https://freehtml5.co\n");
      out.write("    /   Facebook: https://facebook.com/fh5co\n");
      out.write("    /   Twitter: https://twitter.com/fh5co\n");
      out.write("    -->\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <!-- Document title -->\n");
      out.write("    <title>County Garbage Management</title>\n");
      out.write("    <!-- Stylesheets & Fonts -->\n");
      out.write("    <!-- Google Fonts -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,400i,700,700i%7CRajdhani:400,600,700\"\n");
      out.write("        rel=\"stylesheet\">\n");
      out.write("    <!-- Plugins Stylesheets -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets1/css/loader/loaders.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets1/css/font-awesome/font-awesome.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets1/css/bootstrap.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets1/css/aos/aos.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets1/css/swiper/swiper.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets1/css/lightgallery.min.css\">\n");
      out.write("    <!-- Template Stylesheet -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets1/css/style.css\">\n");
      out.write("    <!-- Responsive Stylesheet -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets1/css/responsive.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- Loader Start -->\n");
      out.write("    <div class=\"css-loader\">\n");
      out.write("        <div class=\"loader-inner line-scale d-flex align-items-center justify-content-center\"></div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Loader End -->\n");
      out.write("    <!-- Header Start -->\n");
      out.write("    <header class=\"position-absolute w-100\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"top-header d-none d-sm-flex justify-content-between align-items-center\">\n");
      out.write("                <div class=\"contact\">\n");
      out.write("                    <a href=\"tel:+1234567890\" class=\"tel\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i>+254-01668744</a>\n");
      out.write("                    <a href=\"mailto:info@yourmail.com\"><i class=\"fa fa-envelope\"\n");
      out.write("                            aria-hidden=\"true\"></i>jekithetech@gmail.com</a>\n");
      out.write("                </div>\n");
      out.write("                <nav class=\"d-flex aic\">\n");
      out.write("                    <a href=\"auth.jsp\" class=\"login\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i>Login</a>\n");
      out.write("                    <ul class=\"nav social d-none d-md-flex\">\n");
      out.write("                        <li><a href=\"https://www.facebook.com/fh5co\" target=\"_blank\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <nav class=\"navbar navbar-expand-md navbar-light\">\n");
      out.write("                \n");
      out.write("                <div class=\"group d-flex align-items-center\">\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\n");
      out.write("                        data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\n");
      out.write("                        aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span\n");
      out.write("                            class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("                    <a class=\"login-icon d-sm-none\" href=\"#\"><i class=\"fa fa-user\"></i></a>\n");
      out.write("                    <a href=\"register.jsp\" class=\"cart\"><i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i>Sign Up</a>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <a class=\"search-icon d-none d-md-block\" href=\"#\"><i class=\"fa fa-search\"></i></a>\n");
      out.write("                \n");
      out.write("                <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav\">\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Home</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">About Us</a></li>\n");
      out.write("                       \n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Contact Us</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <form class=\"bg-white search-form\" method=\"get\" id=\"searchform\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input class=\"field form-control\" id=\"s\" name=\"s\" type=\"text\" placeholder=\"Search\">\n");
      out.write("                            <span class=\"input-group-btn\">\n");
      out.write("                                <input class=\"submit btn btn-primary\" id=\"searchsubmit\" name=\"submit\" type=\"submit\"\n");
      out.write("                                    value=\"Search\">\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    <!-- Header End -->\n");
      out.write("    <!-- Hero Start -->\n");
      out.write("    <section class=\"hero\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-12 offset-md-1 col-md-11\">\n");
      out.write("                    <div class=\"swiper-container hero-slider\">\n");
      out.write("                        <div class=\"swiper-wrapper\">\n");
      out.write("                            <div class=\"swiper-slide slide-content d-flex align-items-center\">\n");
      out.write("                                <div class=\"single-slide\">\n");
      out.write("                                    <h1 data-aos=\"fade-right\" data-aos-delay=\"200\">County Garbage<br> Management System\n");
      out.write("                                        \n");
      out.write("                                    </h1>\n");
      out.write("                                    <p data-aos=\"fade-right\" data-aos-delay=\"600\">Need to live Healthy?Clean your environment!<br> Like a good neighbor County Garbage Management system\n");
      out.write("                                        <br>is there for you.\n");
      out.write("                                    </p>\n");
      out.write("                                    <a data-aos=\"fade-right\" data-aos-delay=\"900\" href=\"#\" class=\"btn btn-primary\">There is no need to wait</a>\n");
      out.write("                                    <a data-aos=\"fade-right\" data-aos-delay=\"900\" href=\"#\" class=\"btn btn-primary\">Join us today</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"swiper-slide slide-content d-flex align-items-center\">\n");
      out.write("                                <div class=\"single-slide\">\n");
      out.write("                                    <h1 data-aos=\"fade-right\" data-aos-delay=\"200\">Why<br> Choose Us?\n");
      out.write("                                    </h1>\n");
      out.write("                                    <p data-aos=\"fade-right\" data-aos-delay=\"600\">Because we make it \n");
      out.write("                                        happen! <br> We are the future ,you will forever have strength at your side.\n");
      out.write("                                    </p>\n");
      out.write("                                    <a data-aos=\"fade-right\" data-aos-delay=\"900\" href=\"#\" class=\"btn btn-primary\">There is no need to wait</a>\n");
      out.write("                                    <a data-aos=\"fade-right\" data-aos-delay=\"900\" href=\"#\" class=\"btn btn-primary\">Join us today</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Add Control -->\n");
      out.write("            <span class=\"arr-left\"><i class=\"fa fa-angle-left\"></i></span>\n");
      out.write("            <span class=\"arr-right\"><i class=\"fa fa-angle-right\"></i></span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"texture\"></div>\n");
      out.write("        <div class=\"diag-bg\"></div>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <section class=\"featured\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\" data-aos=\"fade-right\" data-aos-delay=\"400\" data-aos-duration=\"800\">\n");
      out.write("                    <div class=\"title\">\n");
      out.write("                        <h6 class=\"title-primary\">about Tamplate</h6>\n");
      out.write("                        <h1 class=\"title-blue\">a rich featured, epic & premium work.</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <p>There are many variations of passages of available but the majority have suffered alteration in\n");
      out.write("                        some form, by injected humour, or randomised words which don't look even slightly believable. If\n");
      out.write("                        you are going to use a passage of you need to be sure there isn't anything embarrassing hidden\n");
      out.write("                        in the middle of text. All the generators on the Internet.</p>\n");
      out.write("                    <div class=\"media-element d-flex justify-content-between\">\n");
      out.write("                        <div class=\"media\">\n");
      out.write("                            <i class=\"fa fa-magic mr-4\"></i>\n");
      out.write("                            <div class=\"media-body\">\n");
      out.write("                                <h5>any offer</h5>\n");
      out.write("                                New York, United States\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"media\">\n");
      out.write("                            <i class=\"fa fa-magic mr-4\"></i>\n");
      out.write("                            <div class=\"media-body\">\n");
      out.write("                                <h5>any offer</h5>\n");
      out.write("                                New York, United States\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary\">See More</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\" data-aos=\"fade-left\" data-aos-delay=\"400\" data-aos-duration=\"800\">\n");
      out.write("                    <div class=\"featured-img\">\n");
      out.write("                        <img class=\"featured-big\" src=\"assets1/images/featured-img1.jpg\" alt=\"Featured 1\">\n");
      out.write("                        <img class=\"featured-small\" src=\"assets1/images/featured-img2.jpg\" alt=\"Featured 2\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("    <footer>\n");
      out.write("        \n");
      out.write("        <!-- Foot Note Start -->\n");
      out.write("        <div class=\"foot-note\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div\n");
      out.write("                    class=\"footer-content text-center text-lg-left d-lg-flex justify-content-between align-items-center\">\n");
      out.write("                    <p class=\"mb-0\" data-aos=\"fade-right\" data-aos-offset=\"0\">&copy; 2019 All Rights Reserved. Design by <a href=\"https://freehtml5.co/multipurpose\" target=\"_blank\" class=\"fh5-link\">FreeHTML5.co</a>.</p>\n");
      out.write("                    <p class=\"mb-0\" data-aos=\"fade-left\" data-aos-offset=\"0\"><a href=\"#\">Terms Of Use</a><a\n");
      out.write("                            href=\"#\">Privacy & Security\n");
      out.write("                            Statement</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Foot Note End -->\n");
      out.write("    </footer>\n");
      out.write("    <!-- Footer Endt -->\n");
      out.write("    <!--jQuery-->\n");
      out.write("    <script src=\"assets1/js/jquery-3.3.1.js\"></script>\n");
      out.write("    <!--Plugins-->\n");
      out.write("    <script src=\"assets1/js/bootstrap.bundle.js\"></script>\n");
      out.write("    <script src=\"assets1/js/loaders.css.js\"></script>\n");
      out.write("    <script src=\"assets1/js/aos.js\"></script>\n");
      out.write("    <script src=\"assets1/js/swiper.min.js\"></script>\n");
      out.write("    <script src=\"assets1/js/lightgallery-all.min.js\"></script>\n");
      out.write("    <!--Template Script-->\n");
      out.write("    <script src=\"assets1/js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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

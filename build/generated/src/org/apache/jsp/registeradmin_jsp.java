package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registeradmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<title>County Garbage Management System</title>\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("\t\t<!-- MATERIAL DESIGN ICONIC FONT -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"fonts4/material-design-iconic-font/css/material-design-iconic-font.min.css\">\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- STYLE CSS -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css4/style.css\">\n");
      out.write("\t</head>\n");
      out.write("\n");
      out.write("\t<body>\n");
      out.write("\n");
      out.write("\t\t<div class=\"wrapper\" style=\"background-image: url('images4/bg-registration-form-2.jpg');\">\n");
      out.write("\t\t\t<div class=\"inner\">\n");
      out.write("                            <form action=\"RegisterAdmin\" method=\"post\" enctype=\"multipart/form-data\" name=\"form\">\n");
      out.write("\t\t\t\t\t<h3>Registration Form</h3>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"\">Name</label>\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"name\" required=\"\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"\">Id No</label>\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"idno\" required=\"\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"\">Username</label>\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"username\" required=\"\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"\">Mobile Number</label>\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"mobile\" required=\"\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"\">Staff No</label>\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"staff\" required=\"\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t<div class=\"form-wrapper\">\n");
      out.write("\t\t\t\t\t\t<label for=\"\">Password</label>\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" name=\"password\" required=\"\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-wrapper\">\n");
      out.write("\t\t\t\t\t\t<label for=\"\">Confirm Password</label>\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" required=\"\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"col-lg-2 control-label\">Image Link</label>\n");
      out.write("                                                        <input type=\"file\" id=\"exampleInputFile3\" name=\"image\" required=\"\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t<div class=\"checkbox\">\n");
      out.write("\t\t\t\t\t\t<label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\"> I caccept the Terms of Use & Privacy Policy.\n");
      out.write("\t\t\t\t\t\t\t<span class=\"checkmark\"></span>\n");
      out.write("\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<button>Register Now</button>\n");
      out.write("                                        <div class=\"container signin\">\n");
      out.write("                                            <p>Already have an account? <a href=\"auth.jsp\" onclick=\"validate(this.form)\">Sign in</a>.</p>\n");
      out.write("                                          </div\n");
      out.write("\t\t\t\t</form>\n");
      out.write("                            \n");
      out.write("                            <script language=\"Javascript\">\n");
      out.write("                                \n");
      out.write("                                function validate(form){\n");
      out.write("                                    if(form.name.value.length < 2){\n");
      out.write("                                        alert(\"Name should have atleast two characters\")\n");
      out.write("                                        form.name.focus();\n");
      out.write("                                    }\n");
      out.write("                                }\n");
      out.write("                            </script>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</body><!-- This templates was made by Colorlib (https://colorlib.com) -->\n");
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

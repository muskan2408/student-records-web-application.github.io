package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\n");
      out.write("    <meta name=\"description\" content=\"\" />\n");
      out.write("    <meta name=\"author\" content=\"\" />\n");
      out.write("    <title>Free Education Template</title>\n");
      out.write("    <!-- BOOTSTRAP CORE STYLE CSS -->\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- FONT AWESOME CSS -->\n");
      out.write("<link href=\"assets/css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- FLEXSLIDER CSS -->\n");
      out.write("<link href=\"assets/css/flexslider.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- CUSTOM STYLE CSS -->\n");
      out.write("    <link href=\"assets/css/mystyle.css\" rel=\"stylesheet\" />    \n");
      out.write("  <!-- Google\tFonts -->\n");
      out.write("\t<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css' />\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<style>\n");
      out.write("\t\n");
      out.write("\t#content a {\n");
      out.write("    position:absolute;\n");
      out.write("   margin-top:150px;\n");
      out.write("\tmargin-left:100px;\n");
      out.write("\tcolor:white;\n");
      out.write("\tfont-size:24px;\n");
      out.write("}\n");
      out.write("\t#content {\n");
      out.write("  height: 400px;\n");
      out.write("  width: 400px;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("#image {\n");
      out.write("  position: fixed;\n");
      out.write("  left: 0;\n");
      out.write("  top: 0;\n");
      out.write("  width:100%;\n");
      out.write("  height:100%;\n");
      out.write("  background-image:linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.2)), url();\n");
      out.write("  background-position:center;\n");
      out.write("  background-size:cover;\n");
      out.write("}\n");
      out.write("#text {\n");
      out.write("  z-index: 100;\n");
      out.write("  \n");
      out.write("  position: relative;\n");
      out.write("  color: white;\n");
      out.write("  font-size: 34px;\n");
      out.write("  font-weight: bold;\n");
      out.write("  left: 520px;\n");
      out.write("  font-family:verdana;\n");
      out.write("  underline:2px;\n");
      out.write("  top: 100px;\n");
      out.write("}\n");
      out.write("#text1 {\n");
      out.write("  z-index: 100;\n");
      out.write("  \n");
      out.write("  position: relative;\n");
      out.write("  color: white;\n");
      out.write("  font-size: 44px;\n");
      out.write("  font-weight: bold;\n");
      out.write("  left: 520px;\n");
      out.write("  font-family:tamoha;\n");
      out.write("  underline:2px;\n");
      out.write("  top: 350px;\n");
      out.write("}\n");
      out.write("table{\n");
      out.write(" \n");
      out.write(" margin-top:250px;\n");
      out.write(" margin-left:520px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\t   *:focus\n");
      out.write("\t   {\n");
      out.write("\t    outline: none;\n");
      out.write("\t\n");
      out.write("\t   }\n");
      out.write("\t   body\n");
      out.write("\t   {\n");
      out.write("\t    margin:0;\n");
      out.write("\t\tpadding:0;\n");
      out.write("\t\tbackground: #ddd;\n");
      out.write("\t\tfont-size: 16px;\n");
      out.write("\t\tcolor: #222;\n");
      out.write("\t\tfont-family:tamoha;\n");
      out.write("\t\tfont-weight:300;\n");
      out.write("\t\t \n");
      out.write("\t\n");
      out.write("\t\tbackground : url(bg.jpg);\n");
      out.write("\t\tbackground-position:below;\n");
      out.write("\t\tbackground-size:cover;\n");
      out.write("\t\t\n");
      out.write("\t   }\n");
      out.write("\t \n");
      out.write("\t #particles-js\n");
      out.write("{\n");
      out.write("\theight:100%;\n");
      out.write("\t\n");
      out.write("\tbackground-image: linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.3)), url(image.jpg);\n");
      out.write("background-size:cover;\n");
      out.write("background-position:center;\n");
      out.write("\t  \n");
      out.write(" border-radius:15px;\n");
      out.write("\t  box-shadow: 0 2px 4px rgba(0,0,0,0.4);\n");
      out.write("\t}\n");
      out.write("\t  #login-box\n");
      out.write("\t  {\n");
      out.write("\t  position:relative;\n");
      out.write("\t  margin :5% auto;\n");
      out.write("\t  width: 350px;\n");
      out.write("          margin-left: 480px;\n");
      out.write("          margin-top: 180px;\n");
      out.write("\t  height:500px;\n");
      out.write("\t  background:white;\n");
      out.write("\t  border-radius:15px;\n");
      out.write("\t  box-shadow: 0 2px 4px rgba(0,0,0,0.4);\n");
      out.write("\t  }\n");
      out.write("\t  \n");
      out.write("\t  .left\n");
      out.write("\t  {\n");
      out.write("\t    position:absolute;\n");
      out.write("\t\ttop:0;\n");
      out.write("\t\tleft:0;\n");
      out.write("\t\tbox-sizing: border-box;\n");
      out.write("\t\tpadding:40px;\n");
      out.write("\t\twidth: 300px;\n");
      out.write("\t\theight:400px;\n");
      out.write("\t\t\n");
      out.write("\t  \n");
      out.write("\t  }\n");
      out.write("\t h1\n");
      out.write("\t {\n");
      out.write("\t    margin: 0 0 20px 0;\n");
      out.write("\t\tfont-weight: 300;\n");
      out.write("\t\tfont-size: 28px;\n");
      out.write("\t\tcolor:white;\n");
      out.write("\t\t\n");
      out.write("\t \n");
      out.write("\t }\n");
      out.write("\tinput[type=\"text\"],\n");
      out.write("     input[type=\"password\"]\n");
      out.write("{\n");
      out.write("\n");
      out.write("    display:block;\n");
      out.write("\tbox-shadow :20px;\n");
      out.write("\tmargin-top: 10px;\n");
      out.write("\tpadding:4px;\n");
      out.write("\twidth:220px;\n");
      out.write("\theight:32px;\n");
      out.write("\tborder:none;\n");
      out.write("\tborder-bottom:1px solid #aaa;\n");
      out.write("\tfont-family:tamoha;\n");
      out.write("\tfont-weight:400;\n");
      out.write("\tfont-size:15px;\n");
      out.write("\ttransition: 0.2s ease;\n");
      out.write("\t}\t \n");
      out.write("\t\n");
      out.write("\tinput[type=\"text\"]:focus,\n");
      out.write("     input[type=\"password\"]:focus\n");
      out.write("\t {\n");
      out.write("\t   border-bottom: 2px solid #16a085;\n");
      out.write("\t   \n");
      out.write("\t   color: #16a085;\n");
      out.write("\t   transition: 0.2s ease;\n");
      out.write("\t }\n");
      out.write("\t\n");
      out.write("\t input[type=\"submit\"]\n");
      out.write("\t \n");
      out.write("\t {\n");
      out.write("\t   \n");
      out.write("\t   margin-top:28px;\n");
      out.write("\t   width: 100%;\n");
      out.write("\t   height:32px;\n");
      out.write("\t   background:#16a085;\n");
      out.write("\t   border:none;\n");
      out.write("\t   border-radius:25px;\n");
      out.write("\t   color:white;\n");
      out.write("\t   font-family: tamoha;\n");
      out.write("\t   text-transform: uppercase;\n");
      out.write("\t   font-weight:500;\n");
      out.write("\t   transition: 0.1s ease;\n");
      out.write("\t   cursor:pointer;\n");
      out.write("\t   box-shadow: 5px 5px 10px rgba(0,0,0,0.15);\n");
      out.write("\t \n");
      out.write("\t }\n");
      out.write("\t\n");
      out.write("\t.input[type=\"submit\"]:hover,\n");
      out.write("\t.input[type=\"submit\"]:focus\n");
      out.write("\t{\n");
      out.write("\t opacity:0.8;\n");
      out.write("\t box-shadow: 0 2px 4px rgba(0,0,0,0.4);\n");
      out.write("\t transition: 0.1s ease;\n");
      out.write("\t\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tinput[type=\"submit\"]:active\n");
      out.write("\t{\n");
      out.write("\t \n");
      out.write("\t opacity:1;\n");
      out.write("\t box-shadow: 0 1px 2px rgba(0,0,0,0.4);\n");
      out.write("\t transition:0.1s ease;\n");
      out.write("\t}\n");
      out.write("\t input[type=\"reset\"]\n");
      out.write("\t \n");
      out.write("\t {\n");
      out.write("\t   \n");
      out.write("\t   margin-top:25px;\n");
      out.write("\t   width: 100%;\n");
      out.write("\t   height:32px;\n");
      out.write("\t   background:#16a085;\n");
      out.write("\t   border:none;\n");
      out.write("\t   border-radius:25px;\n");
      out.write("\t   color:white;\n");
      out.write("\t   font-family: tamoha;\n");
      out.write("\t   \n");
      out.write("\t   text-transform: uppercase;\n");
      out.write("\t   font-weight:500;\n");
      out.write("\t   transition: 0.1s ease;\n");
      out.write("\t   cursor:pointer;\n");
      out.write("\t   box-shadow: 5px 5px 10px rgba(0,0,0,0.15);\n");
      out.write("\t \n");
      out.write("\t }\n");
      out.write("\t\n");
      out.write("\t.input[type=\"reset\"]:hover,\n");
      out.write("\t.input[type=\"reset\"]:focus\n");
      out.write("\t{\n");
      out.write("\t opacity:0.8;\n");
      out.write("\t box-shadow: 0 2px 4px rgba(0,0,0,0.4);\n");
      out.write("\t transition: 0.1s ease;\n");
      out.write("\t\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tinput[type=\"reset\"]:active\n");
      out.write("\t{\n");
      out.write("\t \n");
      out.write("\t opacity:1;\n");
      out.write("\t box-shadow: 0 1px 2px rgba(0,0,0,0.4);\n");
      out.write("\t transition:0.1s ease;\n");
      out.write("\t}\n");
      out.write("\t.or{\n");
      out.write("\tposition:absolute;\n");
      out.write("\ttop:180px;\n");
      out.write("\tleft:280px;\n");
      out.write("\twidth:40px;\n");
      out.write("\theight:40px;\n");
      out.write("\tbackground: #3498db;\n");
      out.write("\tborder-radius:50%;\n");
      out.write("\tbox-shadow:0 2px 4px rgba(0,0,0,0.4);\n");
      out.write("\tline-height:41px;\n");
      out.write("\ttext-align:center;\n");
      out.write("\tcolor:white;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.right\n");
      out.write("\t{\n");
      out.write("\tposition:absolute;\n");
      out.write("\ttop: 0;\n");
      out.write("\tright:0;\n");
      out.write("\tbox-sizing:border-box;\n");
      out.write("\tpadding:40px;\n");
      out.write("\twidth:300px;\n");
      out.write("\theight: 400px;\n");
      out.write("\tborder-radius:0 2px 2px 0;\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t}\n");
      out.write("\tbutton.social-signin\n");
      out.write("\t{\n");
      out.write("\tmargin-bottom:20px;\n");
      out.write("\twidth:220px;\n");
      out.write("\theight:36px;\n");
      out.write("\tborder:none;\n");
      out.write("\tborder-radius:2px;\n");
      out.write("\tcolor:white;\n");
      out.write("\tfont-family:tamoha;\n");
      out.write("\tfont-weight:500;\n");
      out.write("\ttransition: .2s ease;\n");
      out.write("\tcursor:pointer;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tbutton.social-signin:hover,\n");
      out.write("\tbutton.social-signin:focus\n");
      out.write("\t{\n");
      out.write("\t   box-shadow: 0 2px 4px rgba(0,0,0,0.4);\n");
      out.write("\t   transition:0.2s ease;\n");
      out.write("\t}\n");
      out.write("\tbutton.social-signin:active\n");
      out.write("\t{\n");
      out.write("\t   box-shadow: 0 1px 2px rgba(0,0,0,0.4);\n");
      out.write("\t   transition:0.2s ease;\n");
      out.write("\t}\n");
      out.write("\tbutton.social-signin.facebook\n");
      out.write("\t{\n");
      out.write("\tbackground: #32508e;\n");
      out.write("\t}\n");
      out.write("\tbutton.social-signin.twitter\n");
      out.write("\t{\n");
      out.write("\tbackground: #55acee;\n");
      out.write("\t}\n");
      out.write("\tbutton.social-signin.google\n");
      out.write("\t{\n");
      out.write("\tbackground: #dd4b39;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t</style>\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("   \n");
      out.write(" <div class=\"navbar navbar-inverse navbar-fixed-top \" id=\"menu\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\"><img class=\"logo-custom\" src=\"assets/img/online-academy.png\" alt=\"\"  /></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navbar-collapse collapse move-me\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li ><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("                     <li><a href=\"index.jsp\">FEATURES</a></li>\n");
      out.write("                    <li><a href=\"index.jsp\">FACULTY</a></li>\n");
      out.write("\t\t\t\t\t \n");
      out.write("                     <li><a href=\"index.jsp\">COURSES</a></li>\n");
      out.write("                     <li><a href=\"index.jsp\">CONTACT</a></li>\n");
      out.write("\t\t\t\t\t    <li><a href=\"index.jsp\">SIGN OUT</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("      <!--NAVBAR SECTION END-->\n");
      out.write("\t  \n");
      out.write("\t  \n");
      out.write("\t <div id=\"content\">\n");
      out.write("\n");
      out.write("  <p id=\"text\" data-scroll-reveal=\"enter from the bottom after 0.4s\">\n");
      out.write("   STUDENT RECORDS\n");
      out.write("  </p>\n");
      out.write("  \n");
      out.write("  <ul>\n");
      out.write("   <li style=\"width:10px; display:table-cell; padding-left: -250px; \"> <a  href=\"InsertStudent.jsp\">Insert_Student</a> </li> \n");
      out.write("\t <li style=\"width:20px; display:table-cell; padding-left: 200px;  \"  > <a  href=\"DeleteStudent.jsp\">Delete_Student</a> </li> \n");
      out.write("\t <li style=\"width:10px; display:table-cell; padding-left: 200px; \"  > <a  href=\"UpdateStudent.jsp\">Update_Student</a> </li> \n");
      out.write("\t <li style=\"width:10px; display:table-cell; padding-left: 220px; \"> <a  href=\"SearchStudent.jsp\">Search_Student</a> </li> \n");
      out.write("\t <li style=\"width:20px; display:table-cell; padding-left: 220px; \"> <a  href=\"SearchAll.jsp\">SearchAll_Student</a> </li> \n");
      out.write("<!--\t</ul>\n");
      out.write("      <center>   \n");
      out.write("        <form method=\"post\" action=\"InsertStudent.jsp\">  \n");
      out.write("        <table border=\"2\">\n");
      out.write("        <tr>\n");
      out.write("            <th>RollNo </th>\n");
      out.write("           <td><input type=\"text\" name=\"txtRno\"></td>\n");
      out.write("        </tr>    \n");
      out.write("        <tr>\n");
      out.write("            <th>Name </th>\n");
      out.write("           <td><input type=\"text\" name=\"txtName\"></td>\n");
      out.write("        </tr>    \n");
      out.write("        <tr>\n");
      out.write("            <th>Phone</th>\n");
      out.write("           <td><input type=\"text\" name=\"txtPh\"></td>\n");
      out.write("        </tr>    \n");
      out.write("        <tr>\n");
      out.write("            <th>Email</th>\n");
      out.write("           <td><input type=\"text\" name=\"txtEmail\"></td>\n");
      out.write("        </tr>    \n");
      out.write("        <tr>\n");
      out.write("            <th>Address</th>\n");
      out.write("           <td><input type=\"text\" name=\"txtAdd\"></td>\n");
      out.write("        </tr>   \n");
      out.write("<tr>\n");
      out.write("            <th>Qualification  </th>\n");
      out.write("           <td><input type=\"text\" name=\"txtQua\"></td>\n");
      out.write("        </tr>   \t\t\n");
      out.write("        <tr>\n");
      out.write("         <td></td>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"submit\" value=\"Submit\">\n");
      out.write("                <input type=\"reset\" value=\"Reset\"></td>\n");
      out.write("        </tr>  \n");
      out.write("         </table>\n");
      out.write("    </form>\n");
      out.write("               </center>   -->\n");
      out.write("\n");
      out.write(" <p id=\"text1\" data-scroll-reveal=\"enter from the bottom after 0.4s\">\n");
      out.write("   WELCOME!!\n");
      out.write("  </p>\n");
      out.write("  \n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("       </body>\n");
      out.write("\t   </html>");
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

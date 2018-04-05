package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.FileOutputStream;
import connection.MyCon;
import java.io.*;
import java.sql.*;

public final class DownLoadImage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>File Upload to Database Demo</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <center>\n");
      out.write("        <h1>File Download to Database Demo</h1>\n");
      out.write("        <form method=\"post\" action=\"DownLoadImage.jsp\">\n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>First Name: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"firstName\" size=\"50\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                        <input type=\"submit\" value=\"Download\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("      ");
 
          try
         {      
           Connection con=null;
           con=MyCon.getConnection();
           PreparedStatement ps=null;
           ResultSet rs=null;
           String sql,fname=null;
            fname=request.getParameter("firstName");
            out.println("Before If..............");
          if(fname!=null)  
          {     
              out.println("After If..............");
           sql="select * from studentdata where first_name=?";
           ps=con.prepareStatement(sql);
           ps.setString(1, fname);
           rs=ps.executeQuery();
           String name,sname;
           Blob B;
           if(rs.next())
           {      
            name=rs.getString(1);
            sname=rs.getString(2);
            B=rs.getBlob(3);
            int size;
            size=(int)B.length();
            byte b[];
            b=B.getBytes(1,size);
            for(int i=1;i<3;i++)
            {
            FileOutputStream fos=new FileOutputStream("C://OnlineImages/"+ i + ".jpg");
            
            fos.write(b);
            fos.close();
           }
            out.println(name);
            out.println(sname);
            out.println("File Get..............");
           }  
          } 
         }
          catch(Exception e)
          {
             out.println(e);
          }    
      
      out.write("  \n");
      out.write("    </center>\n");
      out.write("</body>\n");
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

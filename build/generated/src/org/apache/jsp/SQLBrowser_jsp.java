package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import connection.MyCon;
import java.sql.Connection;

public final class SQLBrowser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <center> \n");
      out.write("           <form action=\"CreateDatabase\" method=\"post\"> \n");
      out.write("           Enter name of Database to be created:<input type=\"text\" name=\"createDatabase\" >\n");
      out.write("           <br><br>  \n");
      out.write("            <input type=\"submit\" value=\"Create Database\" name=\"Database\"><br><br>\n");
      out.write("            Use Existing Database:<input type=\"text\" name=\"useDatabase\" >\n");
      out.write("           <br><br>  \n");
      out.write("            <input type=\"submit\" value=\"Use Database\" name=\"Database\"></form><br><br><font color=\"red\" size=\"6\"> S</font><font color=\"blue\" size=\"6\">Q</font>\n");
      out.write("      \n");
      out.write("           <font color=\"green\" size=\"6\">L</font>   \n");
      out.write("        <font color=\"yellow\" size=\"6\">B</font><font color=\"black\" size=\"6\">R</font>      \n");
      out.write("        <font color=\"green\" size=\"6\">O</font><font color=\"red\" size=\"6\">W</font>      \n");
      out.write("        <font color=\"blue\" size=\"6\">S</font><font color=\"black\" size=\"6\">E</font>      \n");
      out.write("        <font color=\"red\" size=\"6\">R</font>\n");
      out.write("        <form method=\"post\" action=\"SQLBrowser.jsp\">\n");
      out.write("            <textarea rows=\"10\" cols=\"70\" name=\"txtsql\"></textarea>    \n");
      out.write("           <br> \n");
      out.write("            <input type=\"submit\" value=\"Execute\">\n");
      out.write("        </form>\n");
      out.write("     ");
 
       String sql=null, name;
       sql=request.getParameter("txtsql");
       name=request.getParameter("createDatabase");
       if(sql!=null)
       {
           Connection con;
           con=MyCon.getConnection();
           PreparedStatement ps=null;
           ResultSet rs=null;
           ResultSetMetaData rsmd=null;
           if(sql.toUpperCase().startsWith("CREATE TABLE"))
           {
           
             Statement stmt = con.createStatement();
             {
            // create a new table
                 
            stmt.execute(sql);
           }
            out.println("Table Created Successfully... ");
           }
           else
           {
           if(sql.toUpperCase().startsWith("SELECT"))
           {
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                rsmd=rs.getMetaData();
                out.println(rsmd.getColumnCount());
               out.println("<table border=1>");
                out.println("<tr>");
              for(int i=1;i<=rsmd.getColumnCount();i++)
              {    
                out.println("<th>"+rsmd.getColumnName(i)+"</th>");
              } 
              out.println("</tr>");
              
               
               while(rs.next())
              {
                  out.println("<tr>");
                 for(int i=1;i<=rsmd.getColumnCount();i++)
                 {  
                    out.println("<td>"+rs.getString(i)+"</td>");
                 }   
                out.println("</tr>");  
              }  
                
                out.println("<table>");
                
           }   
           
           else
           {
               ps=con.prepareStatement(sql);
               int n;
               n=ps.executeUpdate();
               out.println("record effected : " + n);
           }   
           }     
           
       }   
       
     
     
      out.write("   \n");
      out.write("       </center>    \n");
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

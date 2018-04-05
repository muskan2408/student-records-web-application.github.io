<%-- 
    Document   : SQLBrowser
    Created on : Jan 29, 2018, 8:44:16 PM
    Author     : vivek
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="connection.MyCon"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <center> 
           <form action="CreateDatabase" method="post"> 
           Enter name of Database to be created:<input type="text" name="createDatabase" >
           <br><br>  
            <input type="submit" value="Create Database" name="Database"><br><br>
            Use Existing Database:<input type="text" name="useDatabase" >
           <br><br>  
            <input type="submit" value="Use Database" name="Database"></form><br><br><font color="red" size="6"> S</font><font color="blue" size="6">Q</font>
      
           <font color="green" size="6">L</font>   
        <font color="yellow" size="6">B</font><font color="black" size="6">R</font>      
        <font color="green" size="6">O</font><font color="red" size="6">W</font>      
        <font color="blue" size="6">S</font><font color="black" size="6">E</font>      
        <font color="red" size="6">R</font>
        <form method="post" action="SQLBrowser.jsp">
            <textarea rows="10" cols="70" name="txtsql"></textarea>    
           <br> 
            <input type="submit" value="Execute">
        </form>
     <% 
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
       
     
     %>   
       </center>    
    </body>
</html>

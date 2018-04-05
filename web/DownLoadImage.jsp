<%@page import="java.io.FileOutputStream"%>
<%@page import="connection.MyCon"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         
    pageEncoding="ISO-8859-1"%>
<%@page import="java.io.*"%>
<%@page  import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Upload to Database Demo</title>
</head>
<body>
    <center>
        <h1>File Download to Database Demo</h1>
        <form method="post" action="DownLoadImage.jsp">
            <table border="0">
                <tr>
                    <td>First Name: </td>
                    <td><input type="text" name="firstName" size="50"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Download">
                    </td>
                </tr>
            </table>
        </form>
        <%! 
        static int i=1;
        %> 
      <% 
          
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
            
            for(i=1;i<2;i++)
            {
            FileOutputStream fos=new FileOutputStream("C://OnlineImages/"+ i+ ".jpg");
            
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
      %>  
    </center>
</body>
</html>
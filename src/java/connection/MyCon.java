
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyCon {
static Connection con;
static PreparedStatement ps;
static public Connection getConnection()
{
    try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver load successfully");
            
       
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root","root");
            System.out.println("Database connected");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyCon.class.getName()).log(Level.SEVERE, null, ex);
        }
    return con;


}

 public static Connection getConnection1(String name)
    {
       try
       {
          Class.forName("com.mysql.jdbc.Driver");
         // System.out.println("Driver load");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+name,"root","root");
         // System.out.println("Database Connection Success");
       }
       catch(Exception e)
       {
          System.out.println(e);
       }
       return con;      
    }
    
}

 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import model.*;
import connection.MyCon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import model.Student;

/**
 *
 * @author muskankataria24
 */
public class StudentDAO {
    
   
    
   
public boolean insertdata(Student s)throws Exception
{
Connection con=null;
PreparedStatement ps=null;
ResultSet rs=null;

con=MyCon.getConnection();
String sql;
sql="insert into studentinfo values(?,?,?,?,?,?)";
ps=con.prepareStatement(sql);
ps.setInt(1, s.getrNo());
ps.setString(2, s.getName());
ps.setLong(3,s.getPhone());
ps.setString(4, s.getEmail());
ps.setString(5, s.getAddress());
ps.setString(6, s.getQualification());

    return ps.executeUpdate()>= 0;
}
  public boolean deleteByRollNo(int rno) throws Exception    
   {
       
      Connection con=null;
     con=MyCon.getConnection();
     PreparedStatement ps=null;
     String sql;
     sql="delete from studentinfo where rno=?";
     ps=con.prepareStatement(sql);
     ps.setInt(1, rno);
     
     if(ps.executeUpdate()>0)
         return true;
     
     return false;
     
   }


public Student SearchByRno(int rno) throws Exception    
   {
        Connection con=null;
        ResultSet rs=null;
        con=MyCon.getConnection();
        PreparedStatement ps=null;
        String sql;
        sql="select * from studentinfo where rno=?";
        ps=con.prepareStatement(sql);
        ps.setInt(1, rno);
        Student S=new Student();
        rs=ps.executeQuery();
        if(rs.next())
        {
           S.setrNo(rs.getInt(1));
           S.setName(rs.getString(2));
           S.setPhone(rs.getLong(3));
           S.setEmail(rs.getString(4));
           S.setAddress(rs.getString(5));
           S.setQualification(rs.getString(6));
        }
        else
            S=null;
        
        return S;
        
   }

public boolean UpdateStudent(Student S) throws Exception    
   {
       
    Connection con=null;
     con=MyCon.getConnection();
     PreparedStatement ps=null;
     String sql;
     sql="update studentinfo set name=?,phone=?,email=?,address=?, qualification=? where rno=? ";
      ps=con.prepareStatement(sql);
      ps.setInt(6, S.getrNo());
      ps.setString(1, S.getName());
      ps.setLong(2, S.getPhone());
      ps.setString(3, S.getEmail());
      ps.setString(4, S.getAddress()); 
        ps.setString(5, S.getQualification()); 
        if(ps.executeUpdate()>0)
         return true;
     
     return false;
   }

    public List<Student> SearchAll() throws Exception{
         Connection con=null;
        ResultSet rs=null;
        con=MyCon.getConnection();
        PreparedStatement ps=null;
        String sql;
        sql="select * from studentinfo";
        List<Student> mylist=new LinkedList<Student>();
        ps=con.prepareStatement(sql);
         rs=ps.executeQuery();
        
         while(rs.next())
         {
              Student S=new Student(); 
           S.setrNo(rs.getInt(1));
           S.setName(rs.getString(2));
           S.setPhone(rs.getLong(3));
           S.setEmail(rs.getString(4));
           S.setAddress(rs.getString(5));
           S.setQualification(rs.getString(6));
           mylist.add(S);
          // S=null;
         }
         
         return mylist;
        //To change body of generated methods, choose Tools | Templates.
    }

   public boolean signup(String username,String email, String password) throws SQLException
{
Connection con=null;
PreparedStatement ps=null;
ResultSet rs=null;

con=MyCon.getConnection();
String sql;
sql="insert into signup values(?,?,?)";
ps=con.prepareStatement(sql);

ps.setString(1, username);
ps.setString(2, email);
ps.setString(3, password);
   if(ps.executeUpdate()>0)
    return true;
  
   return false;
}
 public boolean checkLogin(String email,String pass) throws Exception
   {
       
        Connection con=null;
        ResultSet rs=null;
        con=MyCon.getConnection();
        PreparedStatement ps=null;
        String sql;
        sql="select * from signup where email=? and password=?";
        ps=con.prepareStatement(sql);
        ps.setString(1, email);
        ps.setString(2, pass);
        rs=ps.executeQuery();
        if(rs.next())
          return true;
        return false;
   }

     public boolean message(String name,String email, String message) throws SQLException
{
Connection con=null;
PreparedStatement ps=null;
ResultSet rs=null;

con=MyCon.getConnection();
String sql;
sql="insert into message values(?,?,?)";
ps=con.prepareStatement(sql);

ps.setString(1, name);
ps.setString(2, email);
ps.setString(3, message);
    return ps.executeUpdate()>= 0;
  

}



}
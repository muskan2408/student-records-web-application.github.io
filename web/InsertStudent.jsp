<%-- 
    Document   : InsertStudent
    Created on : 24 Jan, 2018, 2:36:38 AM
    Author     : muskankataria24
--%>

<%@page import="model.Student"%>
<%@page import="dao.StudentDAO"%>
<%--<%@page import="model.Student"%>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="stud" class="model.Student">
    <jsp:getProperty name="stud" property="rNo"></jsp:getProperty>
</jsp:useBean>
<jsp:useBean id="stud1" class="model.Student">
    <jsp:setProperty name="stud1" property="*"></jsp:setProperty>
</jsp:useBean>
<%@include file="record.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>InsertJSP Page</title>
        <style>
	
	#content a {
    position:absolute;
   margin-top:150px;
	margin-left:100px;
	color:white;
	font-size:24px;
}
	#content {
  height: 400px;
  width: 400px;
  position: relative;
}
#image {
  position: fixed;
  left: 0;
  top: 0;
  width:100%;
  height:100%;
  background-image:linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.2)), url();
  background-position:center;
  background-size:cover;
}
#text {
  z-index: 100;
  
  position: relative;
  color: white;
  font-size: 34px;
  font-weight: bold;
  left: 520px;
  font-family:verdana;
  underline:2px;
  top: 100px;
}
#text1 {
  z-index: 100;
  position: relative;
  color: green;
  font-size: 30px;
  font-weight: normal;
  left: 10px;
  font-family:verdana;
  underline:2px;
 margin-top: 50px;
  margin-left: 500px;
 top: 200px;
  margin-bottom: 100px;
}
#text2 {
  z-index: 100;
  position: relative;
  color: red;
  font-size: 30px;
  font-weight: normal;
  left: 10px;
  font-family:verdana;
  underline:2px;
  //text-align: center;
  margin-top: 50px;
  margin-left: 550px;
 top: 200px;
  margin-bottom: 100px;
  
}
table{
 
 margin-top:250px;
 margin-left:520px;
}

	   *:focus
	   {
	    outline: none;
	
	   }
	   body
	   {
	    margin:0;
		padding:0;
		background: #ddd;
		font-size: 16px;
		color: #222;
		font-family:tamoha;
		font-weight:300;
		 
	
		background : url(bg.jpg);
		background-position:below;
		background-size:cover;
		
	   }
	 
	 #particles-js
{
	height:100%;
	
	background-image: linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.3)), url(image.jpg);
background-size:cover;
background-position:center;
	  
 border-radius:15px;
	  box-shadow: 0 2px 4px rgba(0,0,0,0.4);
	}
	  #login-box
	  {
	  position:absolute;
	  margin :5% auto;
	  width: 350px;
          margin-left: 550px;
          top:200px;
	  height:500px;
	  background:white;
	  border-radius:15px;
	  box-shadow: 0 2px 4px rgba(0,0,0,0.4);
	  }
	  
	  .left
	  {
	    position:absolute;
		top:0;
		left:0;
		box-sizing: border-box;
		padding:40px;
		width: 300px;
		height:400px;
		
	  
	  }
	 h1
	 {
	    margin: 0 0 20px 0;
		font-weight: 300;
		font-size: 28px;
		color:white;
		
	 
	 }
	input[type="text"],
     input[type="password"]
{

    display:block;
	box-shadow :20px;
	margin-top: 10px;
	padding:4px;
	width:220px;
	height:32px;
	border:none;
	border-bottom:1px solid #aaa;
	font-family:tamoha;
	font-weight:400;
	font-size:15px;
	transition: 0.2s ease;
	}	 
	
	input[type="text"]:focus,
     input[type="password"]:focus
	 {
	   border-bottom: 2px solid #16a085;
	   
	   color: #16a085;
	   transition: 0.2s ease;
	 }
	
	 input[type="submit"]
	 
	 {
	   
	   margin-top:28px;
	   width: 100%;
	   height:32px;
	   background:#16a085;
	   border:none;
	   border-radius:25px;
	   color:white;
	   font-family: tamoha;
	   text-transform: uppercase;
	   font-weight:500;
	   transition: 0.1s ease;
	   cursor:pointer;
	   box-shadow: 5px 5px 10px rgba(0,0,0,0.15);
	 
	 }
	
	.input[type="submit"]:hover,
	.input[type="submit"]:focus
	{
	 opacity:0.8;
	 box-shadow: 0 2px 4px rgba(0,0,0,0.4);
	 transition: 0.1s ease;
	
	}
	
	input[type="submit"]:active
	{
	 
	 opacity:1;
	 box-shadow: 0 1px 2px rgba(0,0,0,0.4);
	 transition:0.1s ease;
	}
	 input[type="reset"]
	 
	 {
	   
	   margin-top:25px;
	   width: 100%;
	   height:32px;
	   background:#16a085;
	   border:none;
	   border-radius:25px;
	   color:white;
	   font-family: tamoha;
	   
	   text-transform: uppercase;
	   font-weight:500;
	   transition: 0.1s ease;
	   cursor:pointer;
	   box-shadow: 5px 5px 10px rgba(0,0,0,0.15);
	 
	 }
	
	.input[type="reset"]:hover,
	.input[type="reset"]:focus
	{
	 opacity:0.8;
	 box-shadow: 0 2px 4px rgba(0,0,0,0.4);
	 transition: 0.1s ease;
	
	}
	
	input[type="reset"]:active
	{
	 
	 opacity:1;
	 box-shadow: 0 1px 2px rgba(0,0,0,0.4);
	 transition:0.1s ease;
	}
	.or{
	position:absolute;
	top:180px;
	left:280px;
	width:40px;
	height:40px;
	background: #3498db;
	border-radius:50%;
	box-shadow:0 2px 4px rgba(0,0,0,0.4);
	line-height:41px;
	text-align:center;
	color:white;
	}
	
	.right
	{
	position:absolute;
	top: 0;
	right:0;
	box-sizing:border-box;
	padding:40px;
	width:300px;
	height: 400px;
	border-radius:0 2px 2px 0;
	
	
	}
	button.social-signin
	{
	margin-bottom:20px;
	width:220px;
	height:36px;
	border:none;
	border-radius:2px;
	color:white;
	font-family:tamoha;
	font-weight:500;
	transition: .2s ease;
	cursor:pointer;
	}
	
	button.social-signin:hover,
	button.social-signin:focus
	{
	   box-shadow: 0 2px 4px rgba(0,0,0,0.4);
	   transition:0.2s ease;
	}
	button.social-signin:active
	{
	   box-shadow: 0 1px 2px rgba(0,0,0,0.4);
	   transition:0.2s ease;
	}
	button.social-signin.facebook
	{
	background: #32508e;
	}
	button.social-signin.twitter
	{
	background: #55acee;
	}
	button.social-signin.google
	{
	background: #dd4b39;
	}
	
	
	
	
	
	</style>
        <script lang="javascript">
            function validate()
            {
                var phone, email,atindex,dotindex, rollno, address, qualification,name;
                phone=document.getElementById("PHONE").value;
                email=document.getElementById("EMAIL").value;
                rollno=document.getElementById("ROLLNO").value;
                address=document.getElementById("ADDRESS").value;
                qualification=document.getElementById("QUALIFICATION").value;
                name=document.getElementById("NAME").value;
                atindex=email.indexOf('@');
            dotindex=email.lastIndexOf('.');
           
                  if(rollno==="")
            {   
                //alert("User Name Can't be left blank");
                document.getElementById("ROLLNO").focus();
                return false;
            }
              if(name==="")
            {   
                //alert("User Name Can't be left blank");
                document.getElementById("NAME").focus();
                return false;
            }
              if(address==="")
            {   
                //alert("User Name Can't be left blank");
                document.getElementById("ADDRESS").focus();
                return false;
            }
              if(qualification==="")
            {   
                //alert("User Name Can't be left blank");
                document.getElementById("QUALIFICATION").focus();
                return false;
            }
            if(email==="")
            {   
                //alert("User Name Can't be left blank");
                document.getElementById("EMAIL").focus();
                return false;
            }
             if(phone==="")
            {   
                //alert("User Name Can't be left blank");
                document.getElementById("PHONE").focus();
                return false;
            }
            
            if(atindex<1 || dotindex>=email.length-2 || dotindex-atindex<3)
            {
                 alert("Enter valid email");
                document.getElementById("EMAIL").focus();
                document.getElementById("EMAIL").select();
                return false;
            }
            
             if(phone.length>10 || phone.length<10)
            {   
                alert("phone no must be of 10 numbers");
                document.getElementById("PHONE").focus();
                document.getElementById("PHONE").select();
                //document.getElementById("PASSWORD").value="";
                return false;
            }
            
              
                return true;
            }
          
        </script>
    </head>
    <body>
        
<!--       <div class="main">-->
	<!---728x90--->
		<form method="post" action="InsertStudent.jsp">

    <br> <br> <br> <br>
	<div id="login-box">
	
	<div id="particles-js"></div>
<script src="js/particles.js"></script>
<script src="js/particles.min.js"></script>
<script src="js/app.js"></script>
	  <center><div class="left">
                  <h1>Insert Record</h1>
                  <!-- without beans-->
		
<!--		<input type="text" name="txtRno" placeholder="Roll_NO">
		<input type="text" name="txtName" placeholder="Name">
                    <input type="text" name="txtPh" placeholder="Phone">
                             <input type="text" name="txtEmail" placeholder="Email">
                        <input type="text" name="txtAdd" placeholder="Address">
                       
                                <input type="text" name="txtQua" placeholder="Qualification">
                            -->
                            <input type="text" name="rNo" placeholder="Roll_NO" required="" id="ROLLNO">
                            <input type="text" name="name" placeholder="Name" required="" id="NAME">
                            <input type="text" name="phone" placeholder="Phone" required="" id="PHONE">
                            <input type="text" name="email" placeholder="Email" required="" id="EMAIL">
                            <input type="text" name="address" placeholder="Address" required="" id="ADDRESS">
                       
                            <input type="text" name="qualification" placeholder="Qualification" required="" id="QUALIFICATION">
                            <input type="submit" name="signup_submit" value="Submit" onclick="return validate();">
		<input type="reset"  name="login_submit" value="Reset">
		</div>
          </center>
		
	</div>
	
	</form>
        <% 
            //without beans
//               int rno;
//            long phone;
//            String email, address, qualification ;
//             String name=null;
//            name=request.getParameter("txtName");
//            
//            if(name!=null)
//           {      
//            
//           Student s= new Student();
//          rno=Integer.parseInt(request.getParameter("txtRno"));
//          phone=Long.parseLong(request.getParameter("txtPh"));
//        // name=request.getParameter("txtName");
//          email=request.getParameter("txtEmail");
//           address=request.getParameter("txtAdd");
//            qualification=request.getParameter("txtQua");
//             //out.println(rno+ " "+ name +" "+phone + " " + email + " "+ address + " " + qualification);
//           s.setrNo(rno);
//           s.setName(name);
//           s.setEmail(email);
//           s.setPhone(phone);
//           s.setAddress(address);
//           s.setQualification(qualification);
//          
//           StudentDAO sd=new StudentDAO();
//           if( sd.insertdata(s))
//           out.println("<p id=text1>RECORD SAVED SUCCESSFULLY....</p>");
//           }
            String rollno=null;
            rollno=request.getParameter("rNo");
           
            //Student S=new Student();
            StudentDAO sd=new StudentDAO();
            if(rollno!=null)
            {
//                   rno=Integer.parseInt(rollno);
//                stud=  sd.SearchByRno(rno);
//                if(stud.getrNo()==rno)
//                {
//                    out.println("<p id=text2>Already Exist</p>");
//                }
//                else
//                {
                    if(stud1.getName()!=null)
                    {
                 if(sd.insertdata(stud1))
                  out.println("<p id=text1>RECORD SAVED SUCCESSFULLY....</p>");
                    }
                    else
                    {
                     int rno;
                     rno=Integer.parseInt(rollno);
                        Student s=new Student();
                     if(sd.SearchByRno(rno).getrNo()==rno)
                     {
                        out.println("<p id=text2>Already Exist</p>");
                     }
                         
                    }
                
                }
            //}
         
        %>

    </body>
</html>

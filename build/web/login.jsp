
<%@page import="dao.StudentDAO"%>
<%@page session="true" %>
<%@include file="header.html" %>
<!DOCTYPE html>

<head>
    <meta charset="UTF-8">
	<title>Login Page</title>
	<style>
	
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
		 
	
		background : linear-gradient(rgba(0,0,0,0.5), rgba(0,0,0,0.5)),url(pebbles.jpg);
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
	  position:relative;
	  margin :5% auto;
	  width: 350px;
	  height:350px;
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
	 input[type="submit1"]
	 
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
	
	.input[type="submit1"]:hover,
	.input[type="submit1"]:focus
	{
	 opacity:0.8;
	 box-shadow: 0 2px 4px rgba(0,0,0,0.4);
	 transition: 0.1s ease;
	
	}
	
	input[type="submit1"]:active
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
        <script>
         function validate()
            {
                 var user,pass,cpass,email,atindex,dotindex;
            user=document.getElementById("USER").value;
            email=document.getElementById("EMAIL").value;
            pass=document.getElementById("PASS").value;
             atindex=email.indexOf('@');
            dotindex=email.lastIndexOf('.');
             if(pass==="")
            {   
               // alert("Password Can't be left blank");
                document.getElementById("PASS").focus();
                return false;
            }
            if(email==="")
            {   
                //alert("User Name Can't be left blank");
                document.getElementById("EMAIL").focus();
                return false;
            }
             if(atindex<1 || dotindex>=email.length-2 || dotindex-atindex<3)
            {
                 alert("Enter valid email");
                document.getElementById("EMAIL").focus();
                document.getElementById("EMAIL").select();
                return false;
            }
            return true;
        }
        </script>
	

</head>

<form method="post" action="login.jsp">

    <br> <br> <br> <br>
	<div id="login-box" data-scroll-reveal="enter from the bottom after 0.4s">
	
	<div id="particles-js"></div>
<script src="js/particles.js"></script>
<script src="js/particles.min.js"></script>
<script src="js/app.js"></script>
	  <div class="left">
	    <h1>Log In</h1>
		
		<input type="text" name="email" placeholder="Email" id="EMAIL" required="">
		<input type="Password" name="password" placeholder="Password" id="PASS" required="">
		<input type="submit" name="signup_submit" value="Log In" onclick="return validate();">
                	</form>
<%
 String uname=null,upass=null;
              uname=request.getParameter("email");
              upass=request.getParameter("password");
              if(uname!=null && upass!=null)
              {
                  StudentDAO sd=new StudentDAO();
                  if(sd.checkLogin(uname, upass))
                      response.sendRedirect("welcome.jsp");
                  else
                      out.println("<font color=red>Invalid user name or password</font>");
              }
%>
                <form method="post" action="index.jsp">
                    <input type="submit" onclick="location.href='';" name="login_submit" value="Sign Me Up"></form>
		</div>
		
		
	</div>
	
	
	
	
	
	
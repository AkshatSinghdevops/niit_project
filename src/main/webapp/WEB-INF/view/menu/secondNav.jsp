<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="resource/css/mystyle.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<div class ="container-fluid  second_bar" style="background:#0000ff; solid; padding:20px;" >
<div class="container">
<div class="row">
 <div class="col-sm-12">
 <nav class="navbar-default">
 
 <div class="navbar-header">
 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#Tnavbar">
 <span class="icon-bar"></span>
 <span class="icon-bar"></span>
 <span class="icon-bar"></span>
 <span class="icon-bar"></span>
 </button>
 </div>
 
  <div id="Tnavbar" class="navbar-collapse collapse">
  <ul class="nav navbar-nav ">
  <li><a href="index" >Home</a></li>
  
  <li><a href="AboutUs" >About us</a></li>
  <li> <a href="contact" >Contact</a></li>
  </ul>
  
  
  
    <form class="navbar-form navbar-right">
            <div class="form-group">
              <input type="text" class="form-control" placeholder="Search">
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
          </form>
  
  
  </div>
  
  
  
   <ul class="nav navbar-nav navbar-right" >
        <button type="button" class="btn btn-success dropdown-toggle"  style="margin:8px">
       <li><a href="Mycart" style="color:#ffff00" class="social_icon" ><i class="fa fa-shopping-cart" aria-hidden="true" style="color:#fff;">My_Cart</i></a></li>
       </button>
       
       <c:if test="${not empty loginMessage }"><li><a href="logout" style=" color:#fff;">Logout</a></li></c:if>
      <c:if test="${empty loginMessage}">
      <li><a href="Registration" style=" color:#fff;"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="Login" style=" color:#fff;"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
       </c:if>
    </ul>
  
  
  
  
 </div>
</div>
</div>
</div>
</nav>
</body>
</html>
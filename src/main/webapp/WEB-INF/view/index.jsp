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
</head>
</head>
<body>

<!-- - -->
<div class="container-fluid top_bar" style="background:#f26522; padding:5px;">
<div class="container top_bar">
<div class="row">
<div class="col-sm-6">
<a href="#">Shopping_Cart</a>
   <a href="#" class="social_icon"><i class="fa fa-facebook" style="font-size:20px; color:#fff;"></i></a>
   <a href="#" class="social_icon"><i class="fa fa-twitter"  style="font-size:20px; color:#fff;"></i></a>
   <a href="#" class="social_icon"><i class="fa fa-youtube"  style="font-size:20px; color:#fff;"></i></a>
   <a href="#" class="social_icon"><i class="fa fa-google"   style="font-size:20px; color:#fff;"></i></a>

</div><!--  end of colunm 6  -->

<div class="col-sm-6 text-right contact_info">
<span class="glyphicon glyphicon-envelope">singh.akshat960@gmail.com</span>
   <span class="glyphicon glyphicon-earphone">+91-8224-9984-73</span>

</div><!--  end of colunm 6 Part 2 -->

</div>
</div>
</div>
<!--  -->
<nav class="navbar-default ">
<div class="container top_bar">
<div class="row">


<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          
          <div class = "collapse navbar-collapse" id ="navbar">
          
  <ul class="nav navbar-nav">        
<li class="active"><a href="index" >Home</a></li>


<li >
<c:if test="${empty  loginMessage}">
<a href="Login" >Login</a> </c:if></li>

 
<li><a href="Registration" >Registration</a></li>
<li><a href="#" >About us</a></li>
<li><a href="Contact">Contact</a></li>



<li class="dropdown " style="padding:5px;">
  <button type="button" class="btn btn-danger dropdown-toggle"  id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
   Menu
  </button>
  <div class="dropdown-menu"  aria-labelledby="dropdown01">
    <a class="dropdown-item" href="Product">Product</a>
    <a class="dropdown-item" href="Supplier">Supplier</a>
   
    <div class="dropdown-divider"></div>
    <a class="dropdown-item" href="Category">Category</a>
  </div>
</li>



</ul>
</div></div>
</div></nav>
<!-- -----------------------------------------=================== -->
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
  <li><a href="#" >Category</a></li>
  <li><a href="#" >Product</a></li>
  <li> <a href="#" > Supplier</a></li>
  </ul>
  
  
  
    <form class="navbar-form navbar-right">
            <div class="form-group">
              <input type="text" class="form-control" placeholder="Search">
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
          </form>
  
  
  </div>
 </div>
</div>
</div>
</div>
</nav>
<!-- ================================================================ -->
<div class="text-center ">
<h1 class="text-success"> This is Shopping Cart Site</h1>
<p class="text-danger"> you need to create account first,than use this site.</p>
<div class="text-success text-center">${msg}</div>
<div class="text-center">${loginMessage}</div>


<c:if test="${not empty loginMessage}">
<a href="logout">Logout</a> <br>

<c:if test="${isAdmin==true }">
<jsp:include page="Admin/AdminHome.jsp"></jsp:include>
 
 
</c:if>

 
 
</c:if>

</div>








<c:if test="${isUserClickedContact==true }"><jsp:include page="Contact.jsp"></jsp:include></c:if>
<c:if test="${isUserClickedLogin==true}"><jsp:include page="Login.jsp"></jsp:include></c:if>
<c:if test="${isUserClickedRegistration==true}"><jsp:include page="Registration.jsp"></jsp:include></c:if>
<c:if test="${isUserClickedMenu==true }"><jsp:include page="Menu.jsp"></jsp:include></c:if>
<c:if test="${isUserClickedindex==true }"><jsp:include page="index.jsp"></jsp:include></c:if> -->
</body>
</html>

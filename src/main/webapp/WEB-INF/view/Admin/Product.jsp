<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="resource/css/mystyle.css">
<link rel="stylesheet" href="resource/img/im.jpg">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
 
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>


Manage Product

<div class ="container-fluid  second_bar" style="background:#808080; solid; padding:20px;" >
<div class="container">







<div class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title ">Create  New Product</h3>
					</div>
					<div class="panel-body">
						
							</div>
<form action="uploadFile.do" method="post" enctype="multipart/form-data">
		<fieldset>
		<div class="form-group">
         <input class="form-control" placeholder="product_id"
		type="text" id="id" name="id">
	    </div>
	    
	    
	    <div class="form-group">
         <input class="form-control" placeholder="product_name"
		type="text" id="name" name="name">
	    </div>
	    
	    
	    
	    <div class="form-group">
         <input class="form-control" placeholder="product_description"
		type="text" id="description" name="description">
	    </div>
	    
	    
	     
	    <div class="form-group">
         <input class="form-control" placeholder="product_price"
		type="text" id="price" name="price">
	    </div>
	    
	    <div class="form-group">
         <input class="form-control" placeholder="c_id"
		type="text" id="category_id" name="category_id">
	    </div>
	    
	    <div class="form-group">
         <input class="form-control" placeholder="s_id"
		type="text" id="supplier_id" name="supplier_id">
	    </div>
	      
	    <div class="form-group">
         <input class="form-control" type="file" id="image" name="image" value="Upload">
	    </div>
	    
	    
	    
	    <input class="btn btn-lg btn-success btn-block" type="submit" value="Create-Product">
	    
	    


</fieldset></form>	    
</div></div>
</div></div>










<div class="row">
 <div class="col-sm-12">
 <nav class="navbar-default">



<table class="table">
<thead>
<tr>
<th>Id</th>
<th>Name</th>
<th>Price</th>
<th>Description</th>
<th>Action</th>
</tr>
</thead>

<tbody>

<c:forEach var="product" items="${productList}">
<tr>

<td>${product.id}</td>
<td>${product.name}</td>
<td>${product.price}</td>
<td>${product.description}</td>

<td><a href="#">Edit |</a>
                     <a href="#">Delete</a></td>

</tr>


</c:forEach>



</tbody>





</table>

</nav>
</div>
</div>
</div>
</div>




</body>
</html>
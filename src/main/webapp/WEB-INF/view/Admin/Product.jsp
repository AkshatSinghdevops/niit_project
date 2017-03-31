<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

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
<form action="#" method="post">
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
		type="text" id="description" name="description">
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
<th>Address</th>
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
<td>${product.image}</td>
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
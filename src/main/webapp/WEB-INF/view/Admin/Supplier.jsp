<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
Supplier

<h2>Manage Supplier </h2>

<div class ="container-fluid  second_bar" style="background:#00ffff; solid; padding:20px;" >
<div class="container">

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

<c:forEach var="supplier" items="${supplierList}">
<tr>

<td>${supplier.id}</td>
<td>${supplier.name}</td>
<td>${supplier.address}</td>
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
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
<body>
<div class="text-danger">
<h1>Welcome, MyCart</h1> <center> ${loginMeassage}</center></div>

<div class ="container-fluid  second_bar" style="background:#808080; solid; padding:20px;" >
<div class="container">

<div class="row">
 <div class="col-sm-12">
 <nav class="navbar-default">
 


<table class="table">
<thead>
<tr>
<th>Product Name </th>
<th>Quantity</th>
<th>Price</th>
<th>Action</th>
</tr>
</thead>

<tbody>
<c:forEach var="product" items="${productList}">
<tr>

<td></td>
<td></td>
<td></td>

</tr>
</c:forEach>
</tbody>
</table>
 
 
 
 
 
 
 
 
</nav></div></div></div></div>
 
</body>
</html>
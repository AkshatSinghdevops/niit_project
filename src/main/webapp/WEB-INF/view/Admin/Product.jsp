<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




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

</tr>


</c:forEach>



</tbody>





</table>






</body>
</html>
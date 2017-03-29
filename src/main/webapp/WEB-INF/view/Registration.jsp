<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">
	<div class="row">
		<h2>Create Acount</h2> 
        
        
        
        <form class="form-horizontal"  action="Registration" method="POST" commandName="user" >
<fieldset>
 
 
<legend>Register Here</legend>
 
 
<div class="form-group">
  <label class="col-md-4 control-label" path="name"> Name:</label>  
  <div class="col-md-4">
  <input path="name" name="name" placeholder="Insert your  Name" class="form-control input-md" required="" type="text">
  <span class="help-block"> </span>  
  </div>
</div>
 
 
<div class="form-group">
  <label class="col-md-4 control-label" path="id">User-ID:</label>  
  <div class="col-md-4">
  <input path="id" name="id" placeholder="Insert your Id Name" class="form-control input-md" required="" type="text">
  <span class="help-block"> </span>  
  </div>
</div>
 
 
<div class="form-group">
  <label class="col-md-4 control-label" path="password">Password:</label>  
  <div class="col-md-4">
  <input path="password" name="password" placeholder="Insert your Password" class="form-control input-md" required="" type="text">
  <span class="help-block"> </span>  
  </div>
</div>
 
 
 
<div class="form-group">
  <label class="col-md-4 control-label" path="mail">Email:</label>  
  <div class="col-md-4">
  <input path="mail" name="mail" placeholder="Insert your Email" class="form-control input-md" required="" type="text">
  <span class="help-block"> </span>  
  </div>
</div>
 
 
 
<div class="form-group">
  <label class="col-md-4 control-label" path="contact">Phone No:</label>  
  <div class="col-md-4">
  <input path="contact" name="contact" placeholder="Insert your Contact" class="form-control input-md" required="" type="text">
  <span class="help-block"> </span>  
  </div>
</div>
 
<div class="form-group">
  <label class="col-md-4 control-label" for="singlebutton"> </label>
  <div class="col-md-4">
    <button id="singlebutton" name="singlebutton" class="btn btn-primary">Submit</button>
  </div>
</div>
 
</fieldset>
</form>
 
	</div>
</div>
 

 

 
 
 
 
 




</body>
</html>
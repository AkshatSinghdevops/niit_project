<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- This is form section -->
<div class ="container">
<div class="text-center">
 
 <form class="form-horizontal" role="form">

 <h2> Registration Form</h2>

<!-- this is first row -->
 
 <div class="from-group">
 <label for="name" class="col-sm-3 control-label">Name:</label>
 <div class="col-sm-9">
 <input type="text" class="form-control" id="name" placeholder="Enter Full Name" autofocus>
 </div>
 </div>
 
 <!--  End of first row -->
 
  <!-- this is first row -->
 
 <div class="from-group">
 <label for="User" class="col-sm-3 control-label">User Id :</label>
 <div class="col-sm-9">
 <input type="text" class="form-control" id="User" placeholder="Enter User Id " autofocus>
 </div>
 </div>
 
 <!--  End of first row -->
 
 <!-- this is first row -->
 
 <div class="from-group">
 <label for="Email" class="col-sm-3 control-label">Email :</label>
 <div class="col-sm-9">
 <input type="text" class="form-control" id="Email" placeholder="Enter Email" autofocus>
 </div>
 </div>
 
 <!--  End of first row -->
 
  <!-- this is first row -->
 
 <div class="from-group">
 <label for="password" class="col-sm-3 control-label">Password :</label>
 <div class="col-sm-9">
 <input type="text" class="form-control" id="Email" placeholder="Enter Password" autofocus>
 </div>
 </div>
 
 <!--  End of first row -->
 
 <div class="form-group">
                    <label for="country" class="col-sm-3 control-label">Country :</label>
                    <div class="col-sm-9">
                        <select id="country" class="form-control">
                            <option>Rewa</option>
                            <option>Bhopal</option>
                               <option>Indor</option>
                                  <option>somewhere</option>
                        </select>
                    </div>
 </div>
 
 
   <div class="form-group">
                    <label class="control-label col-sm-3">Gender</label>
                    <div class="col-sm-6">
                        <div class="row">
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" id="femaleRadio" value="Female">Female
                                </label>
                            </div>
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" id="maleRadio" value="Male">Male
                                </label>
                            </div>
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" id="uncknownRadio" value="Unknown">Unknown
                                </label>
                            </div>
                        </div>
                    </div>
                </div> <!-- /.form-group -->
                
                
                
                <div class="form-group">
                    <div class="col-sm-9 col-sm-offset-3">
                        <div class="checkbox">
                            <label>
                                <input type="checkbox">I accept <a href="#">terms</a>
                            </label>
                        </div>
                    </div>
                </div> <!-- /.form-group -->
                <div class="form-group">
                    <div class="col-sm-9 col-sm-offset-3">
                        <button type="submit" class="btn btn-primary btn-block">Register</button>
                    </div>
                </div>
                
                
 </form></div></div>
 
 
 
 
 
 




</body>
</html>
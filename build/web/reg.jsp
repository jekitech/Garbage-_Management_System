<%-- 
    Document   : auth
    Created on : 08-Feb-2020, 13:33:29
    Author     : kebre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: grey;
  padding-left: 300px;
  padding-right: 300px;
}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 16px;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>
</head>
<body>

    <form action="RegisterServlet" method="post" enctype="multipart/form-data">
  <div class="container">
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

   <div class="form-group">
                            <label class="col-lg-2 control-label">First Name</label>
                            <div class="col-lg-6">
                                <input type="text" class="form-control" id="f-name" name="fname" placeholder=" " value="">
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="col-lg-2 control-label">Last Name</label>
                            <div class="col-lg-6">
                                <input type="text" class="form-control" id="l-name" name="lname" placeholder="" value="">
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="col-lg-2 control-label">User ID</label>
                            <div class="col-lg-6">
                                <input type="text" class="form-control" id="c-name" placeholder=" " name="id" value="">
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="col-lg-2 control-label">Username</label>
                            <div class="col-lg-6">
                                <input type="text" class="form-control" id="c-name" placeholder=" " name="username" value="">
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="col-lg-2 control-label">About Me</label>
                            <div class="col-lg-10">
                              <textarea name="desc" id="" class="form-control"  cols="78" rows="5" ></textarea>
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="col-lg-2 control-label">Country</label>
                            <div class="col-lg-6">
                                <input type="text" class="form-control" id="c-name" placeholder=" " name="nationality" value="">
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="col-lg-2 control-label">Place of Residence</label>
                            <div class="col-lg-6">
                                <input type="text" class="form-control" id="c-name" placeholder=" " name="residence" value="">
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="col-lg-2 control-label">Birthday</label>
                            <div class="col-lg-6">
                                <input type="date" class="form-control" id="b-day" name="dob" placeholder=" ">
                            </div>
                          </div>
                          
                          <div class="form-group">
                            <label class="col-lg-2 control-label">Email</label>
                            <div class="form-control">
                                <input type="email" class="form-control" id="email" name="email" placeholder=" " value="">
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="col-lg-2 control-label">Mobile</label>
                            <div class="col-lg-6">
                                <input type="text" class="form-control" id="mobile" name="mobile" placeholder="" value="">
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="col-lg-2 control-label">Password</label>
                            <div class="col-lg-6">
                                <input type="password" class="form-control" id="c-name" placeholder=" " name="password" value="">
                            </div>
                          </div>
                          <div class="form-group">
                              <label class="col-lg-2 control-label">Image Link</label>
                              <input type="file" id="exampleInputFile3" name="image">
                            
                          </div>
                          

                           
    <hr>
    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>

    <button type="submit" class="registerbtn">Register</button>
  </div>
  
  <div class="container signin">
    <p>Already have an account? <a href="auth.jsp">Sign in</a>.</p>
  </div>
</form>

</body>
</html>

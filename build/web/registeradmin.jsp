<%-- 
    Document   : register
    Created on : Mar 1, 2020, 2:28:01 AM
    Author     : kebre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>County Garbage Management System</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<!-- MATERIAL DESIGN ICONIC FONT -->
		<link rel="stylesheet" href="fonts4/material-design-iconic-font/css/material-design-iconic-font.min.css">
		
		<!-- STYLE CSS -->
		<link rel="stylesheet" href="css4/style.css">
	</head>

	<body>

		<div class="wrapper" style="background-image: url('images4/bg-registration-form-2.jpg');">
			<div class="inner">
                            <form action="RegisterAdmin" method="post" enctype="multipart/form-data" name="form">
					<h3>Registration Form</h3>
					<div class="form-group">
						<div class="form-wrapper">
							<label for="">Name</label>
                                                        <input type="text" class="form-control" name="name" required="">
						</div>
						<div class="form-wrapper">
							<label for="">Id No</label>
                                                        <input type="text" class="form-control" name="idno" required="">
						</div>
					</div>
					<div class="form-group">
						<div class="form-wrapper">
							<label for="">Username</label>
                                                        <input type="text" class="form-control" name="username" required="">
						</div>
						<div class="form-wrapper">
							<label for="">Mobile Number</label>
                                                        <input type="text" class="form-control" name="mobile" required="">
						</div>
					</div>
                                        <div class="form-group">
						<div class="form-wrapper">
							<label for="">Staff No</label>
                                                        <input type="text" class="form-control" name="staff" required="">
						</div>
					</div>
                                        
					<div class="form-wrapper">
						<label for="">Password</label>
                                                <input type="password" class="form-control" name="password" required="">
					</div>
					<div class="form-wrapper">
						<label for="">Confirm Password</label>
                                                <input type="password" class="form-control" required="">
					</div>
                                        <div class="form-group">
						<div class="form-wrapper">
							<label class="col-lg-2 control-label">Image Link</label>
                                                        <input type="file" id="exampleInputFile3" name="image" required="">
						</div>
						
					</div>
                                        
					<div class="checkbox">
						<label>
							<input type="checkbox"> I caccept the Terms of Use & Privacy Policy.
							<span class="checkmark"></span>
						</label>
					</div>
					<button>Register Now</button>
                                        <div class="container signin">
                                            <p>Already have an account? <a href="auth.jsp" onclick="validate(this.form)">Sign in</a>.</p>
                                          </div
				</form>
                            
                            <script language="Javascript">
                                
                                function validate(form){
                                    if(form.name.value.length < 2){
                                        alert("Name should have atleast two characters")
                                        form.name.focus();
                                    }
                                }
                            </script>
			</div>
		</div>
		
	</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>

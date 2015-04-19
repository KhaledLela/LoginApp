<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Login Example.</title>
<link rel="stylesheet"
	href="http://jqueryvalidation.org/files/demo/site-demos.css">

</head>
<body>
	<form id="loginform" action="LoginServlet" method="post">
		<label for="field">UserName: </label> 
		<input type="text" id="field"
			name="uname"> <br> 
		<label for="passwd">Password:</label>
		<input type="password" class="left" id="passwd" name="pwd"> <br>  
		<input type="submit" value="Submit"> 
	</form>

	<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
	<script
		src="http://jqueryvalidation.org/files/dist/jquery.validate.min.js"></script>
	<script
		src="http://jqueryvalidation.org/files/dist/additional-methods.min.js"></script>
	<script>
		// just for the demos, avoids form submit
		jQuery.validator.setDefaults({
			debug : false,
			success : "valid"
		});
		$("#loginform").validate({
			rules : {
				uname : {
					required : true
				},
				pwd : {
					required : true,
					number: true
				}
			}
		});
	</script>
</body>
</html>
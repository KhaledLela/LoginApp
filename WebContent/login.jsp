<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Login Example.</title>
<!-- <link rel="stylesheet"
	href="http://jqueryvalidation.org/files/demo/site-demos.css"> -->
</head>
<body>
	<form method="POST" action="LoginServlet"
		onsubmit="return checkForm(this);">
		<fieldset>
			<legend>Login Form</legend>
			<p>
				Username: <input title="Enter your username" type="text" required
					pattern="\w+" name="uname">
			</p>
			<p>
				Password: <input title="Password must contain numbers"
					type="password" required pattern="\d+" name="pwd"
					onchange="this.setCustomValidity(this.validity.patternMismatch ? this.title : '');">
			</p>
			<p>
				<input type="submit" value="Login">
			</p>
		</fieldset>
	</form>

<!-- 	<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
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
					number : true
				}
			}
		});
	</script> -->
</body>
</html>
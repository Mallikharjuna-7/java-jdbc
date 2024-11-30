<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login Page</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
}

.container {
	width: 50%;
	margin: 50px auto;
	padding: 20px;
	background-color: #fff;
	border-radius: 10px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

h2 {
	text-align: center;
	color: #333;
}

label {
	display: block;
	font-size: 16px;
	margin: 10px 0 5px;
	color: #555;
}

input[type="email"], input[type="password"] {
	width: 100%;
	padding: 10px;
	font-size: 16px;
	margin: 10px 0 20px;
	border: 1px solid #ddd;
	border-radius: 5px;
	box-sizing: border-box;
}

button {
	width: 100%;
	padding: 15px;
	background-color: #4CAF50;
	color: white;
	font-size: 18px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

button:hover {
	background-color: #45a049;
}

.form-footer {
	text-align: center;
	margin-top: 20px;
}

.form-footer a {
	color: #4CAF50;
	text-decoration: none;
}

.form-footer a:hover {
	text-decoration: underline;
}
</style>
</head>
<body>

	<div class="container">
		<h2>Login to Ad Agency</h2>

		<form action="signin" method="post">

			<div class="form-group">
				<label for="email">E-Mail:</label> <input type="email" id="email"
					name="email" placeholder="Enter your email" required>
			</div>

			<div class="form-group">
				<label for="password">Password:</label> <input type="password"
					id="password" name="password" placeholder="Enter your password"
					required>
			</div>

			<button type="submit">Login</button>
		</form>

		<div class="form-footer">
			<p>
				Don't have an account? <a href="register.jsp">Sign Up</a>
			</p>
		</div>
	</div>

	<script>
	
	
	function checkSignIn(){
		
		const mail = document.getElementById('email').value;
		const pass = document.getElementById('password').value;
		
	}
		
	</script>

</body>
</html>

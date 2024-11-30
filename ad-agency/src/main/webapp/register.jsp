<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Register Page</title>
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

input[type="text"], input[type="email"], input[type="tel"], input[type="password"],
	input[type="number"] {
	width: 100%;
	padding: 10px;
	font-size: 16px;
	margin: 10px 0 20px;
	border: 1px solid #ddd;
	border-radius: 5px;
	box-sizing: border-box;
}

input[type="number"] {
	-moz-appearance: textfield;
}

input[type="number"]::-webkit-outer-spin-button, input[type="number"]::-webkit-inner-spin-button
	{
	-webkit-appearance: none;
	margin: 0;
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

.form-group {
	margin-bottom: 15px;
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

.valid {
	color: green;
}

.invalid {
	color: red;
}
</style>
</head>
<body>

	<div class="container">
		<h2>Register to Ad Agency</h2>

		<form action="save" method="post">

			<div class="form-group">
				<label for="personname">Person Name:</label> <input type="text"
					id="personname" name="personname" placeholder="Enter your name"
					onchange="checkPersonName()" required> <br> <span
					id="out_personname"></span><br>
			</div>

			<div class="form-group">
				<label for="companyname">Company Name:</label> <input type="text"
					id="companyname" name="companyname"
					placeholder="Enter company name" onchange="checkCompanyName()" required>
					<br> <span
					id="out_companyname"></span><br>
			</div>

			<div class="form-group">
				<label for="productname">Product Name:</label> <input type="text"
					id="productname" name="productname"
					placeholder="Enter product name"  onchange="checkProductName()" required>
					<br> <span
					id="out_productname"></span><br>
			</div>

			<div class="form-group">
				<label for="contactnumber">Contact Number:</label> <input type="tel"
					id="contactnumber" name="contactnumber"
					placeholder="Enter contact number" onchange="checkContactNumber()" required pattern="\d{10}">
					<br> <span
					id="out_contactnumber"></span><br>
			</div>

			<div class="form-group">
				<label for="email">E-Mail:</label> <input type="email" id="email"
					name="email" placeholder="Enter your email" onchange="checkEmail()" required>
					<br> <span
					id="out_email"></span><br>
			</div>

			<div class="form-group">
				<label for="password">Password:</label> <input type="password"
					id="password" name="password" placeholder="Enter your password"
					onchange="checkPassword()" required>
					<br> <span id="out_password"></span><br>
			</div>

			<!-- Submit Button -->
			<button type="submit">Register</button>
		</form>

		<div class="form-footer">
			<p>
				Already have an account? <a href="signin.jsp">Sign In</a>
			</p>
		</div>
	</div>


	<script>
		//person name
		function checkPersonName() {
			const name = document.getElementById('personname').value;
			const namespan = document.getElementById('out_personname');
			if (name.length > 3) {
				namespan.innerHTML = 'Person Name :' + name;
				namespan.className = 'valid';

			} else {
				namespan.innerHTML = 'Person Name must be greater than 3 letters';
				namespan.className = 'invalid';
			}
		}
		//company name
		function checkCompanyName() {
			const name = document.getElementById('companyname').value;
			const namespan = document.getElementById('out_companyname');
			if (name.length > 3) {
				namespan.innerHTML = 'Company Name :' + name;
				namespan.className = 'valid';

			} else {
				namespan.innerHTML = 'Company Name must be greater than 3 letters';
				namespan.className = 'invalid';
			}
		}
		//product name
		function checkProductName() {
			const name = document.getElementById('productname').value;
			const namespan = document.getElementById('out_productname');
			if (name.length > 3) {
				namespan.innerHTML = 'Product Name :' + name;
				namespan.className = 'valid';

			} else {
				namespan.innerHTML = 'Product Name must be greater than 3 letters';
				namespan.className = 'invalid';
			}
		}
		//contact number
		function checkContactNumber() {
			const contact = document.getElementById('contactnumber').value;
			const contactspan = document.getElementById('out_contactnumber');
			if (contact.length == 10) {
				contactspan.innerHTML = 'Contact Number :' + contact;
				contactspan.className = 'valid';
			} else {
				contactspan.innerHTML = 'Enter valid Contact Number';
				contactspan.className = 'invalid';
			}
		}

		function checkEmail() {
			const mail = document.getElementById('email').value;
			const mailspan = document.getElementById('out_email');
			const emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/
			if (emailRegex.test(mail)) {
				mailspan.innerHTML = 'E-Mail :' + mail;
				mailspan.className = 'valid';
			} else {
				mailspan.innerHTML = 'Eenter valid E-Mail'
				mailspan.className = 'invalid';
			}

		}
		//password
		function checkPassword() {
			const password = document.getElementById('password').value;
			const passwordspan = document.getElementById('out_password');
			if (password.length >= 8) {
				passwordspan.innerHTML = 'Password :' + password;
				passwordspan.className = 'valid';
			} else {
				passwordspan.innerHTML = 'Password must be greater than 8 digits';
				passwordspan.className = 'invalid';
			}
		}
		
	</script>

</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome - Ad Agency</title>
<style>
.header {
	text-align: center;
	background-color: buttonshadow;
	padding: 20px;
	height: 150px;
}

.add {
	display: flex;
	justify-content: right;
	gap: 20px;
	margin-top: 40px;
}

/* Heading Styling */
h3 {
	color: navy;
}

/* Button Styling */
button {
	padding: 10px 20px;
	background-color: black;
	color: white;
	border: none;
	cursor: pointer;
	border-radius: 5px;
	font-size: 16px;
}

button:hover {
	background-color: #45a049;
}
</style>
</head>
<body>

	<div class="header">
		<h3>Welcome to Ad Agency</h3>

		<div class="add">
		
			<form action="view.jsp">
				<button type="submit">View</button>
			</form>


			<form action="signin.jsp">
				<button type="submit">Sign In</button>
			</form>


			<form action="register.jsp">
				<button type="submit">Sign Up</button>
			</form>
		</div>
	</div>

</body>
</html>

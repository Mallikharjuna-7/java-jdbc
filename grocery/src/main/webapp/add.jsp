<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add page</title>
</head>
<body>

<form action="save" method="post">
		<div>
			<label for="groceryname"> Grocery Name : </label> 
			<input type="text" name="groceryname" placeholder="groceryname"> <br><br>
		</div>
		<div>
			<label for="category"> Category : </label> 
			<input type="text" name="category" placeholder="category"> <br><br>
		</div>
		<div>
			<label for="quantity"> Quantity : </label> 
			<input type="number" name="quantity" placeholder="quantity"> <br><br>
		</div>
		<div>
			<label for="price"> Price : </label> 
			<input type="number" name="price" placeholder="price"> <br><br>
		</div>
		<div>
			<button>Save</button>
			<input type="reset" value="reset">
		</div>
	</form>

</body>
</html>
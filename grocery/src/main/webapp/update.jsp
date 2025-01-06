<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update page</title>
</head>
<style>


</style>
<body>

	<form action="update" method="post">
		<div>
			<h4>Enter the details to update</h4>
			<input type="hidden" id="id" name="id" value="${search.id}">
			
		</div>
		<div>
			<label for="groceryname"> Grocery Name : </label> <input type="text"
				id="groceryname" name="groceryname" placeholder="groceryname"
				value="${search.grocery_name}"> <br>
			<br>
		</div>
		<div>
			<label for="category"> Category : </label> <input type="text"
				id="category" name="category" placeholder="category"
				value="${search.category}"> <br>
			<br>
		</div>
		<div>
			<label for="quantity"> Quantity : </label> <input type="number"
				id="quantity" name="quantity" placeholder="quantity"
				value="${search.quantity}"> <br>
			<br>
		</div>
		<div>
			<label for="price"> Price : </label> <input type="number" id="price"
				name="price" placeholder="price" value="${search.price}"> <br>
			<br>
		</div>
		<div>
			<button>Update</button>

		</div>
	</form>

</body>
</html>
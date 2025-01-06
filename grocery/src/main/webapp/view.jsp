<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
  																						 
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view page</title>

<style>
table {
	border-collapse: collapse;
	margin-left: 10px;
	font-size: 13px;
	font-family: "Rubik", sans-serif;
	font-style: normal;
	
}
.delete{
		margin: 2px;
		font-size: 12px;
		font-family: monospace;
		color : white;
		background-color: red;
}
.update{
		margin: 2px;
		font-size: 12px;
		font-family: monospace;
		background-color: yellow;
}
tbody{
	background-color: rgb(243, 236, 177);
}
th{
	background-color: aqua;
}
.heading{
	color:  navy;
}
</style>
</head>
<body  >

<form action="view" method="get">
		<input type="submit" value="submit">
	</form>
	<table border="2" >
		<caption ><h2 class="heading">Grocery Details </h2></caption>
		<thead>
			<tr>
				<th>Id</th>
				<th>Grocery Name</th>
				<th>Category</th>
				<th>Quantity</th>
				<th>Price</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dto" items="${listOfGrocery}">
				<tr>
					<td>${dto.id}</td>
					<td>${dto.grocery_name}</td>
					<td>${dto.category}</td>
					<td>${dto.quantity}</td>
					<td>${dto.price}</td>
					<td>
						 <a href="delete?id=${dto.id}"><button class="delete" type="button" value="delete" > delete</button></a>
					 	 <a href="update?id=${dto.id}"><button class="update" type="button" value="update" > update</button></a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>
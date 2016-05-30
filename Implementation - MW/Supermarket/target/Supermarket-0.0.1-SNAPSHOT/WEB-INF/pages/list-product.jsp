<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

		<!-- jQuery library -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>

		<!-- Latest compiled JavaScript -->
		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="col-md-8">
			<div>
				<form class="form-horizontal">
					<fieldset>

					<!-- Form Name -->
					<legend>Product Search</legend>

					<!-- Appended Input-->
					<div class="form-group">
					  <label class="col-md-4 control-label" for="appendedtext">Search Products</label>
					  <div class="col-md-4">
						<div class="input-group">
						  <input id="appendedtext" name="appendedtext" class="form-control" placeholder="" type="text">
						  <span class="input-group-addon">Search</span>
						</div>
						
					  </div>
					</div>					
					</fieldset>
				</form>
			</div>
			<div>
				<div class="panel panel-default">
				  <!-- Default panel contents -->
				  
				  
				  
				  
			<table  class="table">
				<tr >
					<th>Product Name</th>
					<th>Brand</th>
					<th>Price</th>
					<th>Made-In</th>
					<th>Action</th>
				</tr>
				<c:if test="${!empty products}">
				<c:forEach items="${products}" var="product">
					<tr bgcolor="#E1E1E1">
						<td>${product.productName}</td>
						<td>${product.brand}</td>
						<td>${product.price}</td>
						<td>${product.madeIn}</td>
						<td><a href="<c:url value='editProduct.htm?id=${product.productId}'/>"> <button id="editProduct" name="editProduct" class="btn btn-success">Edit</button></a>
							<a href="<c:url value='deleteProduct.htm?id=${product.productId}'/>"><button id="deleteProduct" name="deleteProduct" class="btn btn-danger">Delete</button></a>
							</td>
					</tr>

				</c:forEach>
				</c:if>
			</table>
			<hr>
			<p>
				<a href="product.htm"><button id="addMore" name="addMore" class="btn btn-success">Add More Product</button></a>
			</p>
				  
				  
				  
				 
				</div>		
			</div>
		</div>
	</body>
</html>
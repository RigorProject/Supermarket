<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
			<form:form action="addProduct.htm" method="POST"
		modelAttribute="product" class="form-horizontal">
		<form:input type="hidden" path="productId" id="id"/>
				<fieldset>

				<!-- Form Name -->
				<legend>Add New Product</legend>

				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="productName">Product Name</label>  
				  <div class="col-md-4">
				  <form:input id="productName" path="productName" name="productName" type="text" placeholder="" class="form-control input-md" required=""/>
					
				  </div>
				</div>

				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="sellingPrice">Brand Name</label>  
				  <div class="col-md-4">
				  <form:input id="brand" path="brand" name="brand" type="text" placeholder="" class="form-control input-md" required=""/>
					
				  </div>
				</div>
				
				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="price">Selling Price</label>  
				  <div class="col-md-4">
				  <form:input id="price" path="price" name="price" type="text" placeholder="" class="form-control input-md" required=""/>
					
				  </div>
				</div>
				
				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="madeIn">Made-In</label>  
				  <div class="col-md-4">
				  <form:input id="madeIn" path="madeIn" name="madeIn" type="text" placeholder="" class="form-control input-md" required=""/>
					
				  </div>
				</div>

				<!-- Button (Double) -->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="addProduct"></label>
				  <div class="col-md-8">
				  <c:choose>
					<c:when test="${update}">
						<input type="submit" value="UpdateProduct" class="btn btn-success" />
						
					</c:when>
					<c:otherwise>
						<input type="submit" value="AddProduct" class="btn btn-success" />
						
					</c:otherwise>
				</c:choose>
					<input type="Reset" value="Clear"class="btn btn-primary" />
			
					
				  </div>
				</div>

				</fieldset>
			</form:form>
		</div>
	</body>
</html>
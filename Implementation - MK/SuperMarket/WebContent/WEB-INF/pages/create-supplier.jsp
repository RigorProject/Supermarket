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
			<form:form action="addSupplier.htm" method="POST"
		modelAttribute="supplier" class="form-horizontal">
		<form:input type="hidden" path="supplierId" id="id"/>
				<fieldset>

				<!-- Form Name -->
				<legend>Add New Supplier</legend>

				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="supplierName">Supplier Name</label>  
				  <div class="col-md-4">
				  <form:input id="supplierName" path="supplierName" name="supplierName" type="text" placeholder="" class="form-control input-md" required=""/>
					
				  </div>
				</div>

				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="organization">Organization</label>  
				  <div class="col-md-4">
				  <form:input id="organization" path="organization" name="organization" type="text" placeholder="" class="form-control input-md" required=""/>
					
				  </div>
				</div>				

				<!-- Button (Double) -->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="addSupplier"></label>
				  <div class="col-md-8">
				  <c:choose>
					<c:when test="${update}">
						<input type="submit" value="UpdateSupplier" class="btn btn-success" />
						
					</c:when>
					<c:otherwise>
						<input type="submit" value="AddSupplier" class="btn btn-success" />
						
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
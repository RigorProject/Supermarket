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
					<legend>Supplier Search</legend>

					<!-- Appended Input-->
					<div class="form-group">
					  <label class="col-md-4 control-label" for="appendedtext">Search Suppliers</label>
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
					<th>Supplier Id</th>
					<th>Supplier Name</th>
					<th>Organization</th>
				</tr>
				<c:if test="${!empty suppliers}">
				<c:forEach items="${suppliers}" var="supplier">
					<tr bgcolor="#E1E1E1">
						<td>${supplier.supplierName}</td>
						<td>${supplier.organization}</td>
						<td><a href="<c:url value='editSupplier.htm?id=${supplier.supplierId}'/>"> <button id="editSupplier" name="editSupplier" class="btn btn-success">Edit</button></a>
							<a href="<c:url value='deleteSupplier.htm?id=${supplier.supplierId}'/>"><button id="deleteSupplier" name="deleteSupplier" class="btn btn-danger">Delete</button></a>
							</td>
					</tr>

				</c:forEach>
				</c:if>
			</table>
			<hr>
			<p>
				<a href="supplier.htm"><button id="addMore" name="addMore" class="btn btn-success">Add More Suppliers</button></a>
			</p>
				  
				  
				  
				 
				</div>		
			</div>
		</div>
	</body>
</html>
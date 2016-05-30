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
			<form class="form-horizontal">
				<fieldset>

				<!-- Form Name -->
				<legend>Place GRN</legend>

				<!-- Select Basic -->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="selectbasic">Supplier Name</label>
				  <div class="col-md-4">
					<select id="selectbasic" name="selectbasic" class="form-control">
					  <option value="1">Option one</option>
					  <option value="2">Option two</option>
					</select>
				  </div>
				</div>
				
				<!-- Select Basic -->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="selectbasic">Product Name</label>
				  <div class="col-md-4">
					<select id="selectbasic" name="selectbasic" class="form-control">
					  <option value="1">Option one</option>
					  <option value="2">Option two</option>
					</select>
				  </div>
				</div>				
				
				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="sellingPrice">Product Quantity</label>  
				  <div class="col-md-4">
				  <input id="sellingPrice" name="sellingPrice" type="text" placeholder="" class="form-control input-md" required="">
					
				  </div>
				</div>
				
				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="sellingPrice">Unit Price (buying)</label>  
				  <div class="col-md-4">
				  <input id="sellingPrice" name="sellingPrice" type="text" placeholder="" class="form-control input-md" required="">
					
				  </div>
				</div>
				
				<!-- Button (Double) -->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="addProduct"></label>
				  <div class="col-md-8">
					<button id="addProduct" name="addProduct" class="btn btn-success">Add</button>
					<button id="clear" name="clear" class="btn btn-primary" onclick="clear();">Clear</button>
				  </div>
				</div>

				</fieldset>
			</form>
			<div>
				<div class="panel panel-default">
				  <!-- Default panel contents -->
				  <div class="panel-heading">GRN</div>
				  <table class="table">
					<tr>
						<th>Product Name</th>
						<th>Quantity</th>
						<th >Action</th>
					</tr>
					<tr>
						<td>Sunlight</td>
						<td>20</td>
						<td><button id="editProduct" name="editProduct" class="btn btn-success">Edit</button></td>
						<td><button id="deleteProduct" name="deleteProduct" class="btn btn-danger">Delete</button></td>
					</tr>
					<tr>
						<td>Sunlight</td>
						<td>10</td>
						<td><button id="editProduct" name="editProduct" class="btn btn-success">Edit</button></td>
						<td><button id="deleteProduct" name="deleteProduct" class="btn btn-danger">Delete</button></td>
					</tr>
					<tr>
						<td>Sunlight</td>
						<td>11</td>
						<td><button id="editProduct" name="editProduct" class="btn btn-success">Edit</button></td>
						<td><button id="deleteProduct" name="deleteProduct" class="btn btn-danger">Delete</button></td>
					</tr>
				  </table>
				</div>		
			</div>
			
			<!-- Button (Double) -->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="addProduct"></label>
				  <div class="col-md-8">
					<button id="addProduct" name="addProduct" class="btn btn-success">Submit GRN</button>
					<button id="clear" name="clear" class="btn btn-primary" onclick="clear();">Cancel</button>
				  </div>
				</div>
		</div>
	</body>
</html>
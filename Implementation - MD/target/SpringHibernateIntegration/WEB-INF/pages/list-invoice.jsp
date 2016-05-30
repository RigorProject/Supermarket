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
		<nav class="navbar navbar-inverse">
		  <div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
			  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			  </button>
			  <a class="navbar-brand" href="home.html">MANA</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			  <ul class="nav navbar-nav">
				<li class="dropdown">
				  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Product <span class="caret"></span></a>
				  <ul class="dropdown-menu">
					<li><a href="Add Product.html">Add Product</a></li>
					<li><a href="List Products.html">Product Search</a></li>
				  </ul>
				</li>
				<li class="dropdown">
				  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Invoice <span class="caret"></span></a>
				  <ul class="dropdown-menu">
					<li><a href="Place Invoice.html">Add Invoice</a></li>
					<li><a href="List Invoice.html">Invoice Search</a></li>
				  </ul>
				</li>
				<li><a href="Place GRN.html">Place GRN</a></li>
				<li><a href="view journal.html">View Journal</a></li>
			  </ul>
			</div><!-- /.navbar-collapse -->
		  </div><!-- /.container-fluid -->
		</nav>
		
		<div class="col-md-8">
			<div>
				<form class="form-horizontal">
					<fieldset>

					<!-- Form Name -->
					<legend>Invoice Search</legend>

					<!-- Appended Input-->
					<div class="form-group col-md-4">
					  <input type="text" class="form-control" placeholder="Search">
					</div>
					<button type="submit" class="btn btn-default">Submit</button>				
					</fieldset>
				</form>
			</div>
			<div>
				<div class="panel panel-default">
				  <!-- Default panel contents -->
				  <div class="panel-heading">Invoices</div>
				  <table class="table">
					<tr>
						<th>Invoice Id</th>
						<th>Amount (Rs.)</th>
						<th >Action</th>
					</tr>
					<tr>
						<td>1</td>
						<td>250.00</td>
						<td><button id="editInvoice" name="editInvoice" class="btn btn-success">Edit</button></td>
						<td><button id="deleteInvoice" name="deleteInvoice" class="btn btn-danger">Delete</button></td>
					</tr>
					<tr>
						<td>2</td>
						<td>1000.00</td>
						<td><button id="editInvoice" name="editInvoice" class="btn btn-success">Edit</button></td>
						<td><button id="deleteInvoice" name="deleteInvoice" class="btn btn-danger">Delete</button></td>
					</tr>
					<tr>
						<td>3</td>
						<td>5000.00</td>
						<td><button id="editInvoice" name="editInvoice" class="btn btn-success">Edit</button></td>
						<td><button id="deleteInvoice" name="deleteInvoice" class="btn btn-danger">Delete</button></td>
					</tr>
				  </table>
				</div>		
			</div>
		</div>
	</body>
</html>
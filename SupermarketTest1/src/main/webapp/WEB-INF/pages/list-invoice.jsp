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
			<form class="form-horizontal">
				<fieldset>

				<!-- Form Name -->
				<legend>Place Invoice</legend>

			

				<<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="Item_ID">Product Id</label>  
				  <div class="col-md-4">
				  <input id="productId" name="Item_ID" type="text" placeholder="" class="form-control input-md" required="">
					
				  </div>
				</div> 

				<!-- Text input-->
			 	<div class="form-group">
				  <label class="col-md-4 control-label" for="amount">Amount</label>  
				  <div class="col-md-4">
				  <input id="amount" name="amount" type="text" placeholder="" class="form-control input-md" required="">
					
				  </div>
				</div> 
				
				

				<!-- Button (Double) -->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="submit"></label>
				  <div class="col-md-8">
					<button id="submit" name="submit" class="btn btn-success">Submit</button>
					<button id="reset" name="reset" class="btn btn-danger">Reset</button>
				  </div>
				</div>

				</fieldset>
			</form>
		
		</div>
	</body>
</html>
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
			  <a class="navbar-brand" href="slider.jsp" target="someFrame">MANA</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			  <ul class="nav navbar-nav">
				<li class="dropdown">
				  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Product <span class="caret"></span></a>
				  <ul class="dropdown-menu">
					<li> <a href="<c:url value='product.htm'/>" target="someFrame">Add Product</a></li>
					<li> <a href="<c:url value='addProduct.htm'/>" target="someFrame">Product Search</a></li>
				  </ul>
				</li>
				<li class="dropdown">
				  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Supplier<span class="caret"></span></a>
				  <ul class="dropdown-menu">
					<li> <a href="<c:url value='supplier.htm'/>" target="someFrame">Add Supplier</a></li>
					<li> <a href="<c:url value='listSupplier.htm'/>" target="someFrame">Supplier Search</a></li>
				  </ul>
				</li>
				<li class="dropdown">
				  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Invoice<span class="caret"></span></a>
				  <ul class="dropdown-menu">
					<li> <a href="<c:url value='addInvoice.htm'/>" target="someFrame">Add Invoice</a></li>
					<li> <a href="<c:url value='listInvoice.htm'/>" target="someFrame">Invoice Search</a></li>
				  </ul>
				</li>
				  
					
				<li class="dropdown">
				  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Place GRN<span class="caret"></span></a>
				  <ul class="dropdown-menu">
					<li> <a href="<c:url value='addGrn.htm'/>" target="someFrame">Place GRN</a></li>
					<li> <a href="<c:url value='listGrn.htm'/>" target="someFrame">GRN Search</a></li>
				  </ul>
				</li>
				
			  </ul>
			</div><!-- /.navbar-collapse -->
		  </div><!-- /.container-fluid -->
		</nav>
		
		<iframe name="someFrame" id="someFrame" width="100%" height="1000" frameBorder="0" src="slider.jsp"> </iframe>
			
		</div>
	<!--My Adding  -->
	
	
</body>
</html>

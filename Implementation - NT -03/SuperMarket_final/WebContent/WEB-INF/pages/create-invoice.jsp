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
			<form:form action="http://localhost:8080/SuperMarket/addInvoice.htm" method="POST"
		modelAttribute="invoiceItem" class="form-horizontal">
		<form:input type="hidden" path="invoiceID" id="id"/>
				<fieldset>

				<!-- Form Name -->
				<legend>Add New Invoice</legend>

				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="itemID">Item Id</label>  
				  <div class="col-md-4">
				  <form:input id="itemID" path="itemID" name="itemID" type="text" placeholder="" class="form-control input-md" required=""/>
					
				  </div>
				</div>

				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="amount">Amount</label>  
				  <div class="col-md-4">
				  <form:input id="amount" path="amount" name="amount" type="text" placeholder="" class="form-control input-md" required=""/>
					
				  </div>
				</div>
				
				
				<!-- Button (Double) -->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="addInvoice"></label>
				  <div class="col-md-8">
				  <c:choose>
					<c:when test="${update}">
						<input type="submit" value="UpdateInvoice" class="btn btn-success" />
						
					</c:when>
					<c:otherwise>
						<input type="submit" value="AddInvoice" class="btn btn-success" />
						
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
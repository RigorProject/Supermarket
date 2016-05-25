<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



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
					<legend>Invoice Search</legend>

					<!-- Appended Input-->
					<div class="form-group">
					  <label class="col-md-4 control-label" for="appendedtext">Search Invoice</label>
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
					<th>Invoice ID</th>
					<th>Item ID</th>
					<th>Amount</th>
					
					
				</tr>
				
				
				<c:if test="${!empty invoices}">
				<c:forEach items="${invoices}" var="invoice_list">
					<tr bgcolor="#E1E1E1">
						<td>${invoice_list.invoiceID}</td>
					    <td>${invoice_list.itemID}</td> 
						<td>${invoice_list.amount}</td>
						
						<td><a href="<c:url value='/editInvoice/${invoice_list.invoiceID}'/>"> <button id="editInvoice" name="editInvoice" class="btn btn-success">Edit</button></a>
							<a href="<c:url value='/deleteInvoice/${invoice_list.invoiceID}'/>"><button id="deleteInvoice" name="deleteInvoice" class="btn btn-danger">Delete</button></a>
						</td>  
					</tr>

				</c:forEach>
				</c:if>
			</table>
			<hr>
			<p>
				<a href="http://localhost:8080/SpringHibernateIntegration/addInvoice.htm"><button id="addMore" name="addMore" class="btn btn-success">Add More Invoice</button></a>
			</p>
				  
				  
				  
				 
				</div>		
			</div>
		</div>
	</body>
</html>
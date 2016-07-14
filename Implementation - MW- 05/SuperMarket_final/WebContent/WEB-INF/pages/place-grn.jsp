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
		
		<style>
 
    .error {
        color: #ff0000;
    }
</style>
	</head>
	<body>
		<div class="col-md-8">
			<form:form action="addGrn" method="POST"
		modelAttribute="grns" class="form-horizontal">
		<form:input type="hidden" path="grnID" id="id"/>
				<fieldset>

				<!-- Form Name -->
				<legend>Place GRN</legend>

				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="supplierName">Supplier Name</label>  
				  <div class="col-md-4">
				<%--   <form:errors path="supplierName" cssClass="error"/>
				  <form:input id="supplierName" path="supplierName" name="supplierName" type="text" placeholder="" class="form-control input-md" required=""/>
				 --%>
				 <form:select class="form-control" path="supplier.supplierId">
				 <c:forEach items="${suppliers}" var="temp">
				 <option value='<c:out value="${temp.supplierId }" />'>
				 <c:out value="${temp.supplierName }"></c:out> </option>
				 </c:forEach>
				 </form:select>
				 </div>
				</div>
				
				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="productName">Product Name</label>  
				  <div class="col-md-4">
				  <form:errors path="productName" cssClass="error"/>
				  <form:input id="productName" path="productName" name="productName" type="text" placeholder="" class="form-control input-md" required=""/>
		
				  </div>
				</div>				
				
				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="quantity">Product Quantity</label>  
				  <div class="col-md-4">
				  <form:errors path="quantity" cssClass="error"/>
				  <form:input id="quantity" path="quantity" name="quantity" type="text" placeholder="" class="form-control input-md" required=""/>
				  
					
				  </div>
				</div>
				
				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="unitPrice">Unit Price (buying)</label>  
				  <div class="col-md-4">
				  <form:errors path="unitPrice" cssClass="error"/>
				  <form:input id="unitPrice" path="unitPrice" name="unitPrice" type="text" placeholder="" class="form-control input-md" required=""/>
				  
					
				  </div>
				</div>
				
				<!-- Button (Double) -->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="addGrn"></label>
				  <div class="col-md-8">
				  <c:choose>
					<c:when test="${update}">
						<input type="submit" value="UpdateGrn" class="btn btn-success" />
						
					</c:when>
					<c:otherwise>
						<input type="submit" value="AddGrn" class="btn btn-success" />
						
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
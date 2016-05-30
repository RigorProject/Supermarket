<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
	<h1>Product Creation Form</h1>
	<form:form action="addProduct.htm" method="POST"
		modelAttribute="product">
		<table>
			<tr>
				<%-- <td><label for="productName">Product Name:</label></td>
				<td><form:input path="productName" id="productName" /></td>
				<td><form:errors path="productName"></form:errors></td> --%>
			</tr>
			<tr>
				<td><label for="brand">Brand Name:</label></td>
				<td><form:input path="brand" id="brand" /></td>
				<td><form:errors path="brand"></form:errors></td>
			</tr>
			<tr>
				<td><input type="submit" value="AddProduct" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>

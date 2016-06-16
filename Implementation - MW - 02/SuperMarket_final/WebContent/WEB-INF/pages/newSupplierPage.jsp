<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
	<h1>Supplier Creation Form</h1>
	<form:form action="addSupplier.htm" method="POST"
		modelAttribute="supplier">
		<table>
			<tr>
				<%-- <td><label for="supplierName">Supplier Name:</label></td>
				<td><form:input path="supplierName" id="supplierName" /></td>
				<td><form:errors path="supplierName"></form:errors></td> --%>
			</tr>
			<tr>
				<td><label for="organization">Organization:</label></td>
				<td><form:input path="organization" id="organizatin" /></td>
				<td><form:errors path="organization"></form:errors></td>
			</tr>
			<tr>
				<td><input type="submit" value="AddSupplier" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>

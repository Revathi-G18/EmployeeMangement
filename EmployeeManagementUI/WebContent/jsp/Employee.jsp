<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee</title>
</head>
<body>
<h3 align="center">Employee Page</h3>
<c:url value="/admin/InsertCategory" var="insert"></c:url>
<form action=${insert} method="post">
	<table align="center">
		<tr>
			<td>Category Name</td>
			<td><input type="text" id="catname" name="catname" /></td>
		</tr>
		<td>Category Desc</td>
		<td><input type="text" id="catdesc" name="catdesc" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="SUBMIT" /> 
			<input type="reset" value="RESET" /></td>
		</tr>
	</table>
</form>
</body>
</html>
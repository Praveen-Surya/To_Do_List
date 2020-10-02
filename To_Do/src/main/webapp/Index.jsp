<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>Welcome!! To_Do_List</h1>

	<%
		response.setHeader("cache-control", "no-cache");
	response.setHeader("cache-control", "no-store");
	%>

	<table>
		<tr>
			<td colspan="2" style="font-weight: bold;">Available Options:</td>

		</tr>
		<tr>
			<td><a href="/CreateAList">Create a list</a></td>
		</tr>
		<tr>
			<td><a href="/FetchAList">Fetch a list</a></td>
		</tr>
		<tr>
			<td><a href="/ModifyAList">Modify a list</a></td>
		</tr>
		<tr>
			<td><a href="/LogOut">Log Out</a></td>
		</tr>
	</table>
</body>
</html>
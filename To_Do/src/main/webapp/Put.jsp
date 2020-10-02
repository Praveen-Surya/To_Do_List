<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="org.to_do.Todo"%>
<%@ page import="org.to_do.CreateAList"%>
<%@ page import="org.to_do.CreateAListObject"%>
<%@ page import="java.util.UUID"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modify A List</title>
</head>
<body>
	<h1>Update A List</h1>


	<form action="/Edit" method="post">



		<input type="hidden" name="id" value="<%=request.getParameter("id")%>">

		<label for="content">Content:</label>

		<textarea name="content" cols="40" rows="5"></textarea>

		<table>

			<tr>
				<td></td>
				<td><input type="submit" value="save"></td>
			</tr>

		</table>
	</form>
</body>
</html>
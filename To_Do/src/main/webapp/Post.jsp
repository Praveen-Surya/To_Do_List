<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create a List</title>
</head>
<body>
	<form action="/CreateAList" method="post">

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
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up Page</title>
</head>
<body>
	<h1>Sign Up</h1>
	<form action="/CreateAnAccount" method="post">
		<table>
			<tr>
				<td>UserName:</td>
				<td><input type="text" name="UserName"
					placeholder="Enter UserName"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="Password"
					placeholder="Enter Password"></td>
			</tr>
			<tr>
				<td>Email_Id:</td>
				<td><input type="text" name="EmailId"
					placeholder="Enter Email_Id"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Create"></td>
			</tr>
		</table>
	</form>
</body>
</html>
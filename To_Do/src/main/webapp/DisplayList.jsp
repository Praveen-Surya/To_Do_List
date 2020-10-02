<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display A List</title>
</head>
<body>

	<h1>Available List</h1>


	<c:forEach items="${TITLE}" var="Todo">

			
	${Todo.content} &nbsp  <a href="/Edit?id=${Todo.id}">Edit</a>
		<br>


	</c:forEach>
	<table>
		<tr>
			<td><a href="Index.jsp">Home</a></td>
		</tr>
	</table>
</body>
</html>
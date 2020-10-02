<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="org.to_do.CreateAList"%>
<%@page import="org.to_do.FetchAList"%>
<%@page import="org.to_do.Todo"%>
<%@page import="org.to_do.CreateAListObject"%>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>
<%@page import="javax.servlet.RequestDispatcher"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display A List</title>
</head>
<body>

	<h1>Available List</h1>



	<c:forEach items="${TITLE}" var="Todo">
	${Todo.content} <br>
	</c:forEach>

	<table>

		<tr>
			<td><a href="Index.jsp">Home</a></td>
		</tr>

	</table>

</body>
</html>
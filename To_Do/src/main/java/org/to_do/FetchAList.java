package org.to_do;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FetchAList")
public class FetchAList extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		HttpSession session = request.getSession();
		String emailId = (String) session.getAttribute("User");
		UserTodo userTodo = UserTodo.getInstance();

		if (UserTodo.todo1.get(emailId) == null) {
			RequestDispatcher rd = request.getRequestDispatcher("/Error1.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("TITLE", UserTodo.todo1.get(emailId));
			RequestDispatcher rd = request.getRequestDispatcher("/Get.jsp");
			rd.forward(request, response);
		}
	}
}

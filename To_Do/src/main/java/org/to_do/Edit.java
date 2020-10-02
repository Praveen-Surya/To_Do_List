package org.to_do;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Edit")

public class Edit extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		RequestDispatcher rd = request.getRequestDispatcher("/Put.jsp");
		rd.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String content = request.getParameter("content");
		String id = request.getParameter("id");

		HttpSession session = request.getSession();
		String emailId = (String) session.getAttribute("User");

		List<Todo> king = UserTodo.todo1.get(emailId);

		try {

			king.stream().forEach(user -> {

				if (id.equals(user.getId())) {
					user.setContent(content);
				}

			});
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}

		request.setAttribute("TITLE", UserTodo.todo1.get(emailId));

		RequestDispatcher rd = request.getRequestDispatcher("/Result.jsp");
		rd.forward(request, response);

	}

}

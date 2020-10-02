package org.to_do;

import java.io.IOException;
import java.util.UUID;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CreateAList")

public class CreateAList extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		RequestDispatcher rd = request.getRequestDispatcher("/Post.jsp");
		rd.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String content = request.getParameter("content");

		Todo ref = new Todo();
		ref.setContent(content);

		UUID uuid = UUID.randomUUID();
		String uuidNumber = uuid.toString();
		ref.setId(uuidNumber);

		HttpSession session = request.getSession();
		String emailId = (String) session.getAttribute("User");

		UserTodo userTodo = UserTodo.getInstance();

		if (UserTodo.todo1.containsKey(emailId)) {
			UserTodo.addTodo(emailId, ref);
		} else {
			UserTodo.createTodo(emailId, ref);
		}

		request.setAttribute("TITLE", UserTodo.todo1.get(emailId));
		RequestDispatcher rd = request.getRequestDispatcher("/Result.jsp");
		rd.forward(request, response);

	}
}

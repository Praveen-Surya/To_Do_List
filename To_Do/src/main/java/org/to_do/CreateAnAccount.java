package org.to_do;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CreateAnAccount")

public class CreateAnAccount extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		RequestDispatcher rd = request.getRequestDispatcher("/SignUp.jsp");
		rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String userName = request.getParameter("UserName");
		String password = request.getParameter("Password");
		String emailId = request.getParameter("EmailId");

		CreateAnAccountObject createAnAccountObject = CreateAnAccountObject.getInstance();
		List<UserDetails> userDetails = CreateAnAccountObject.userDetails;

		userDetails.stream().forEach(user -> {

			if (userName.equals(user.getUserName()) || emailId.equals(user.getEmailId())) {
				RequestDispatcher rd = request.getRequestDispatcher("UserAlreadyExist.jsp");
				try {
					rd.forward(request, response);
				} catch (ServletException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});

		UserDetails ref = new UserDetails();
		ref.setUserName(userName);
		ref.setPassword(password);
		ref.setEmailId(emailId);

		CreateAnAccountObject.addUserDetails(ref);

		RequestDispatcher rd1 = request.getRequestDispatcher("/Login.html");
		rd1.forward(request, response);

	}

}

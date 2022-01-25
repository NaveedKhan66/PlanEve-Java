package com.planeve;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserSignUpController
 */
@WebServlet("/UserSignUpController")
public class UserSignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSignUpController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = (String) request.getParameter("name");
		String phoneNo = (String) request.getParameter("phoneNo");
		String email = (String) request.getParameter("email");
		String username = (String) request.getParameter("username");
		String password = (String) request.getParameter("password");
		
		
		//return user object
		User user = new User(name, email, phoneNo, username, password);
		dbHandler.createUser(user);
		request.getSession().setAttribute("user", user);
		
		response.sendRedirect("/PlanEve/viewCategories.jsp");
	}

}

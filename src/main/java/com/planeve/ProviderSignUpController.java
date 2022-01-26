package com.planeve;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProviderSignUpController
 */
@WebServlet("/ProviderSignUpController")
public class ProviderSignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProviderSignUpController() {
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
		String type = (String) request.getParameter("type");
		String description = (String) request.getParameter("description");
		
		
		//return user object
		provider p = new provider(name, email, username, password, type, description);
		request.getSession().setAttribute("user", p);
		
		response.sendRedirect("/PlanEve/viewServiceProviderProfile.jsp");
	}

}

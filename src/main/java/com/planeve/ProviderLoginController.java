package com.planeve;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProviderLoginController
 */
@WebServlet("/ProviderLoginController")
public class ProviderLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProviderLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("provider success");
		
		String username = (String) request.getParameter("username");
		String password = (String) request.getParameter("password");
		
<<<<<<< HEAD
		
		//return user object
		User user = new User(name, email, phoneNo, username, password);
		request.getSession().setAttribute("user", user);
=======
		provider p = (provider) dbHandler.authenticateProvider(username, password);
		request.getSession().setAttribute("provider", p);
>>>>>>> de52011726932334fc30bdcdb97f4e74f8eb2bac
		response.sendRedirect("/PlanEve/viewServiceProviderProfile.jsp");
	}

}

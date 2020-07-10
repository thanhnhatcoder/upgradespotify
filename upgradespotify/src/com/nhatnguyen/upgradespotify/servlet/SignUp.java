package com.nhatnguyen.upgradespotify.servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nhatnguyen.upgradespotify.dao.UserDAO;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/signup")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/signup.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		UserDAO userDAO = new UserDAO() ;
		String username = (String) request.getParameter("username") ;
		String password = (String) request.getParameter("password") ;
		String email = (String) request.getParameter("email") ;
		if ( userDAO.isUserNameExists(username) == false) {
		userDAO.regist(username, password, email);
		response.sendRedirect(request.getContextPath() + "/login" );
		request.setAttribute("doneMessage","Registration successful") ;
		}
		else 
		{
			request.setAttribute("errorMessage","Already Exists") ;
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/signup.jsp");
			dispatcher.forward(request, response);
		}
	}

}

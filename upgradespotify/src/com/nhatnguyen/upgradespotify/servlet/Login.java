package com.nhatnguyen.upgradespotify.servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nhatnguyen.upgradespotify.bo.User;
import com.nhatnguyen.upgradespotify.dao.UserDAO;
import com.sun.org.apache.xerces.internal.xinclude.XInclude11TextReader;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/login.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = (String) request.getParameter("username") ;
		String password = (String) request.getParameter("password") ;
		
		UserDAO userDAO = new UserDAO() ;
		User user = userDAO.findByUserNameAndPassword(username, password) ;
		
		if(user != null ) {
			HttpSession session =request.getSession() ;
			System.out.println("NOT NUL");
			session.setAttribute("username", user.getUsername());
			session.setAttribute("role", user.getRole());
			session.setAttribute("login", user.getUsername());
			response.sendRedirect(request.getContextPath() + "/home");
			
			
		} else {
			request.setAttribute("errorMessage","Login failed");
			System.out.println(" NUL");
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/login.jsp");
			dispatcher.forward(request, response);
		}
	}
	}


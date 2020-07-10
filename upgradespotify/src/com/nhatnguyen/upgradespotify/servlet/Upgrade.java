package com.nhatnguyen.upgradespotify.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nhatnguyen.upgradespotify.bo.Spotify;
import com.nhatnguyen.upgradespotify.bo.User;
import com.nhatnguyen.upgradespotify.dao.SpotifyDAO;

/**
 * Servlet implementation class Upgrade
 */
@WebServlet("/upgrade")
public class Upgrade extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Upgrade() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SpotifyDAO spotifyDAO = new SpotifyDAO() ;
		
		request.setCharacterEncoding("UTF-8");
		String textSearch = (String) request.getParameter("textSearch") ;
		if ( spotifyDAO.isKeyExists(textSearch)== false) {
			request.setAttribute("errorMessage","Key not exists !!!") ;
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/upgrade.jsp");
			dispatcher.forward(request, response);	
			
		}
		else {
			ArrayList<Spotify> searchList = spotifyDAO.findByKey(textSearch);
			request.setAttribute("searchList", searchList);
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/upgrade.jsp") ;
			dispatcher.forward(request, response);
			String username = (String) request.getParameter("username") ;
			System.out.println("username = " + username);
			spotifyDAO.insertValues(username, textSearch);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

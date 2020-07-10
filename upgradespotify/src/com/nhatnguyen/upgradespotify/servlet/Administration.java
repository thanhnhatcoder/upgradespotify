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
import com.nhatnguyen.upgradespotify.dao.SpotifyDAO;

/**
 * Servlet implementation class Administration
 */
@WebServlet("/administration")
public class Administration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Administration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SpotifyDAO spotifyDAO = new SpotifyDAO() ;
		ArrayList<Spotify> spotifyList = spotifyDAO.getAllSpotify() ;
		
		                                                                        
	    request.setAttribute("spotifyList", spotifyList);
	    
		//VIEW
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/administration.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

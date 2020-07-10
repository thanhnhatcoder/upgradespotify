package com.nhatnguyen.upgradespotify.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nhatnguyen.upgradespotify.dao.SpotifyDAO;

/**
 * Servlet implementation class InsertKey
 */
@WebServlet("/insertKey")
@MultipartConfig(
		fileSizeThreshold = 1024 * 1024 * 10,
		maxFileSize = 1024 * 1024 * 50,
		maxRequestSize = 1024 * 1024 *100
		)
public class InsertKey extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertKey() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/insertKey.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		SpotifyDAO spotifyDAO = new SpotifyDAO() ;
		String key = (String) request.getParameter("key") ;
		String invite_link = (String) request.getParameter("invite_link") ;
		String address = (String) request.getParameter("address") ;
		String country = (String) request.getParameter("country") ;
		spotifyDAO.insertKey(key, invite_link, address, country);
		response.sendRedirect(request.getContextPath() + "/administration" );
		
		
	}

}

package com.nhatnguyen.upgradespotify.databaseconnection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class ConnectionFactory {
	public static final String URL = "jdbc:mysql://localhost:3306/spotify_upgrade?characterEncoding=UTF8";
	public static final String USER = "root" ;
	public static final String PASS = "12345678" ;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(URL, USER, PASS);
			
		}
		catch (SQLException | ClassNotFoundException e ) {
			throw new RuntimeException("ERROR CONNECTING TO THE DATABASE", e );
		}
	}
} 


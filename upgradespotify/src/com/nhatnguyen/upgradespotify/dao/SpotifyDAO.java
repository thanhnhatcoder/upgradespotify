package com.nhatnguyen.upgradespotify.dao;

import com.nhatnguyen.upgradespotify.bo.Spotify;
import com.nhatnguyen.upgradespotify.bo.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement ;
import com.nhatnguyen.upgradespotify.databaseconnection.ConnectionFactory;

import sun.net.www.content.text.plain;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SpotifyDAO { // data access object 
		
	public static ArrayList<Spotify> getAllSpotify(){
		Connection connection = null ;
		Statement statement = null; 
		ResultSet resultSet = null ;
		ArrayList<Spotify> spotifyList = new ArrayList<Spotify>();
		try {
			//search
			
			connection = ConnectionFactory.getConnection();
			String sql = "SELECT * FROM upgrade";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql) ;
			while ( resultSet.next()) {
				spotifyList.add(convertToSpotify(resultSet));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return spotifyList ;
	}

//}	
	public ArrayList<Spotify> findByKey(String key) {
		Connection connection = null ;
		Statement statement = null; 
		ResultSet resultSet = null ;
		ArrayList<Spotify> searchList = new ArrayList<Spotify>();
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "SELECT * FROM upgrade where `key` = '" + key + "'"  ;
			statement = connection.createStatement() ;
			resultSet = statement.executeQuery(sql); 
			System.out.println("====SQL : " + sql );
			while (resultSet.next()) {
				searchList.add(convertToSpotify(resultSet));
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		
	return searchList ;
	}
//	public void updateBook(int id,String name ,String author ,String publisher ,String type ,
//			String language ,String description ,int quantity){
//		Connection connection = null ;
//		Statement statement = null; 
//		try {
//			connection = ConnectionFactory.getConnection() ;
//		//	UPDATE `book_management`.`books` SET `author` = 'Nhat2' WHERE (`id` = '25');
//			String sql = " UPDATE books SET name = '" + name + "', author = '" + author + "',publisher = '" + publisher
//					+ "',type ='" + type +"',language= '"+ language +"',description= '"+ description +"',quantity= '" + quantity + "' where id = " + id  ;
//			System.out.println("====SQL : " + sql );
//			statement = connection.createStatement();
//			statement.executeUpdate(sql) ;
//		
//	}
//		catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public ArrayList<Book> searchByName(String textSearch){
//		Connection connection = null ;
//		Statement statement = null; 
//		ResultSet resultSet = null ;
//		ArrayList<Book> searchList = new ArrayList<Book>();
//		try {
//			//search
//			connection = ConnectionFactory.getConnection();
//			String sql = " SELECT * FROM books where name = '" + textSearch + "'" ;
//			statement = connection.createStatement();
//			resultSet = statement.executeQuery(sql) ;
//			while ( resultSet.next()) {
//				searchList.add(convertToBook(resultSet));
//				
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		System.out.println(searchList.size());
//		return searchList ;
//		
//	}
	public void deleteKey(String key) {
		Connection connection = null ;
		Statement statement = null; 
		
		try {
			connection = ConnectionFactory.getConnection();
			String sql = " DELETE FROM upgrade where `key` = '" + key + "'" ;
			statement = connection.createStatement();
			statement.executeUpdate(sql) ;
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
//	public static void insertKey( String key ,String invite_link ,String address ,String country ){ 
//		Connection connection = null ;
//		PreparedStatement preparedStatement = null ;
//		
//		try {
//			connection = ConnectionFactory.getConnection();
//			String insertSQL = " INSERT INTO upgrade (key,invite_link,address,country)" 
//			+ " VALUES ('a','b','c')" ;
//			preparedStatement  = connection.prepareStatement(insertSQL) ;
//		preparedStatement.setString(1, key);
//		preparedStatement.setString(2, invite_link);
//		preparedStatement.setString(3, address);
//		preparedStatement.setString(4, country);
//			System.out.println("SQL ===" + insertSQL);
//			preparedStatement.executeUpdate() ;
//			
//
//	}
//		catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
	public void insertKey( String key ,String invite_link ,String address ,String country ){ 
		Connection connection = null ;
		Statement statement = null; 
		ResultSet resultSet = null ;
		
		try {
			connection = ConnectionFactory.getConnection();
			String insertSQL = " INSERT INTO upgrade(`key`,`invite_link`,`address`,`country`)" 
			+ " VALUES ('" + key
			+ "','" + invite_link +
			"','" + address +
			"','" + country +
			"')" ;
			statement = connection.createStatement() ;
			System.out.println("====SQL : " + insertSQL );
			statement.executeUpdate(insertSQL) ;
	
			

	}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void insertValues(String username,String key) {
		Connection connection = null ;
		Statement statement = null; 
		ResultSet resultSet = null ;
		try {
		connection = ConnectionFactory.getConnection();
		String SQL = " UPDATE `upgrade` SET `username` ='"+ username +"' WHERE `key` ='" + key + "'" ;
		statement = connection.createStatement() ;
		System.out.println("====SQL : " + SQL );
		statement.executeUpdate(SQL) ;
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	public static ArrayList<Spotify> keyStore(String username) {
		Connection connection = null ;
		Statement statement = null; 
		ResultSet resultSet = null ;
		ArrayList<Spotify> spotifyList = new ArrayList<Spotify>();
		try {
			connection = ConnectionFactory.getConnection();
			String sql ="SELECT * FROM upgrade WHERE username = '"+ username+ "' ";
			statement = connection.createStatement() ;
			System.out.println("SQL=== " + sql);
			resultSet = statement.executeQuery(sql) ;
			while ( resultSet.next()) {
			spotifyList.add(convertToSpotify(resultSet)) ;	
			}
		}
			catch (SQLException e) {
				e.printStackTrace();
			}
				return spotifyList ;
		}
	public boolean isKeyExists (String key) {
		Connection connection = null ;
		Statement statement = null; 
		ResultSet resultSet = null ;
		try {
	connection = ConnectionFactory.getConnection();
	String sql ="SELECT * FROM upgrade WHERE `key` = '"+key+"'" ;
	statement = connection.createStatement() ;
	System.out.println("SQL=== " + sql);
	resultSet = statement.executeQuery(sql) ;
	
	while (resultSet.next()) {
		return true ;
	}
		}
	catch (SQLException e) {
		e.printStackTrace();
	}
		return false ;
	}
	
	private static Spotify convertToSpotify(ResultSet rs) throws SQLException{
		Spotify spotify = new Spotify();
		User user = new User() ;
		spotify.setKey(rs.getString(1));
		spotify.setInvite_link(rs.getString(2));
		spotify.setAddress(rs.getString(3));
		spotify.setCountry(rs.getString(4));
		spotify.setUsername(rs.getString(5));
		
		return spotify ;
	}
}

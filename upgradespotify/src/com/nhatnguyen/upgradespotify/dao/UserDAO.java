package com.nhatnguyen.upgradespotify.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.nhatnguyen.upgradespotify.bo.User;
import com.nhatnguyen.upgradespotify.databaseconnection.ConnectionFactory;

public class UserDAO {

	public User findByUserNameAndPassword(String username , String password) {
		Connection connection = null ;
		Statement statement = null; 
		ResultSet resultSet = null ;
	try {
		connection = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM users WHERE username = '"+username+"' and password = '"+password+"'" ;
		statement = connection.prepareStatement(sql) ;
		resultSet = statement.executeQuery(sql) ;
		while(resultSet.next()) {
			User user = convertToUser(resultSet) ;
			return user ;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null ;
	}
	
	public void regist(String username,String password,String email) {
		Connection connection = null ;
		Statement statement = null; 
	try {
		connection = ConnectionFactory.getConnection();
		String sql = "INSERT INTO users (username,password,role,email) VALUES ('"
				+ username +"','"
				+ password + "','user','"
				+ email + "')" ;
		System.out.println(sql);
		statement = connection.createStatement() ;
		statement.executeUpdate(sql) ;
	} catch (SQLException e) {
		e.printStackTrace();
		}
	}
	public boolean isUserNameExists (String username) {
		Connection connection = null ;
		Statement statement = null; 
		ResultSet resultSet = null ;
		try {
	connection = ConnectionFactory.getConnection();
	String sql ="select * from users where username='"+username+"'" ;
	statement = connection.createStatement() ;
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
	private static User convertToUser(ResultSet rs) throws SQLException{
		User user = new User();
		
		user.setId(rs.getInt(1)) ;
		user.setUsername(rs.getString(2));
		user.setPassword(rs.getString(3));
		user.setRole(rs.getString(4));
		
		return user ;
	}
}

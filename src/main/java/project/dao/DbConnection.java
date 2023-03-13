package project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import project.exception.DbException;

public abstract class DbConnection {

	public static String SCHEMA = "project";
	public static String USER = "project";
	public static String PASSWORD = "project";
	public static String HOST = "localhost";
	public static int PORT = 3306;

	public static Connection getConnection() {
		String url = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false" ,HOST,PORT,SCHEMA,USER,PASSWORD);
		
		System.out.println("Connecting with url=" + url);
		
		try {
			Connection conn = DriverManager.getConnection(url);
			System.out.println("Obtained Connection Succesfully!");
			return conn;
		} catch (SQLException e) {
			System.out.println("Error! Connection failed...");
		throw new DbException(e);
		}
		
	}

}

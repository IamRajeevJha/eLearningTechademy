package com.example.demo.dao;

import java.sql.*;


public class DatabaseConfiguration {
	Connection connection;
	
	public DatabaseConfiguration() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/elearning","root", "root");	
		}
		catch(Exception e) {
			System.out.println("Database Exception :"+e);
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	
}

package com.emp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
private static String name="sa";
private static String password="";
private static String url="jdbc:h2:tcp://localhost/~/empDB";
private static String driver="org.h2.Driver";
private DBConnection(){
	
}
public static Connection getConnection(){
	try {
		Class.forName(driver);
		return DriverManager.getConnection(url, name, password);
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} return null;
}
}

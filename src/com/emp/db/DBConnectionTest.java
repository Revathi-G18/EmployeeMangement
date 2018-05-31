package com.emp.db;

public class DBConnectionTest {
public static void main(String[] args) {
	if(DBConnection.getConnection()!=null){
		System.out.println("Connection Established...");
	}
}
}

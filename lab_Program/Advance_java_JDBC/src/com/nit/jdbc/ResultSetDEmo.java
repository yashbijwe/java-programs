package com.nit.jdbc;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetDEmo {
	public static void main(String[] args) 
				throws ClassNotFoundException, SQLException {
		
	//1. Loading DB driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver is loaded");
		
	//2. Establishing connection
		Connection con = DriverManager.getConnection(
							"jdbc:oracle:thin:@localhost:1521:ORCL",
							"yash2003", "yashu");
		System.out.println("Connection is created");
		
	//3. Creating Statement object
		Statement stmt = con.createStatement();
		System.out.println("Statement is created");

	//4. Preparing select query 
		String selectQuery = 
				"""
				SELECT course_id, course_name, course_fee
				FROM   course
				ORDER BY course_id
				""";
		
	//5. Executing the above select query and obtaining RS object 	
		ResultSet rs = stmt.executeQuery(selectQuery);
		
		PrintResult.printResult(rs);
		
		
	//7.closing connections
		rs.close();
		stmt.close();
		con.close();
		
	}
}
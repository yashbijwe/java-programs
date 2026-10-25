package com.nit.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetMetaDataDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver is loaded");

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "YASH2003", "yashu");
		System.out.println("Connection is created");

		Statement stmt = con.createStatement();
		System.out.println("Statement is created");

		String selectQuery = """
				SELECT course_id, course_name , course_fee
				FROM   course
				ORDER BY course_id
				""";

		ResultSet rs = stmt.executeQuery(selectQuery);

		ResultSetMetaData rsmd = rs.getMetaData();

		System.out.printf("%10s %-20s %10s\n", rsmd.getColumnName(1), rsmd.getColumnName(2), rsmd.getColumnName(3));

		while (rs.next()) {
			System.out.printf("%10d %-20s %10.0f\n", rs.getInt(1), rs.getString(2), rs.getDouble(3));
		}

		rs.close();
		stmt.close();
		con.close();

	}
}

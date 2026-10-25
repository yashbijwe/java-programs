package com.nit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_tables {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "yash2003", "yashu");

		System.out.println("Connected Successfully as yash2003!");

		Statement stmt = conn.createStatement();

		stmt.execute("""
				CREATE TABLE course(
		course_id	NUMBER(4)	PRIMARY KEY,
		course_name	VARCHAR2(50)	UNIQUE NOT NULL,
		course_fee	Number(7,2)	
	)
				""");
		System.out.println("course Table created successfully!");

		stmt.execute("""
				CREATE TABLE student(
		sid		NUMBER(4)	PRIMARY KEY,
		sname		VARCHAR2(20)	NOT NULL,
		course_id	NUMBER(4)	REFERENCES course(course_id),
		fee		NUMBER(7,2)	
	)
				""");
		System.out.println("student Table created successfully!");
		stmt.close();
		conn.close();

	}
}

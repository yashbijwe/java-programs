package com.nit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateUser {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "yash15");

		System.out.println("Connected Successfully as SYS!");

		Statement stmt = conn.createStatement();
		
		
		stmt.execute("ALTER SESSION SET \"_ORACLE_SCRIPT\" = true");
		stmt.execute("create user yash2003 identified by yashu");
		stmt.execute("GRANT connect, resource, unlimited tablespace to yash2003");
		System.out.println("User is created and DBA permissions are granted");

//		stmt.execute("CREATE USER c##testuse1 IDENTIFIED BY yash123");
//		System.out.println("User created successfully!");

//		stmt.execute("GRANT CONNECT, RESOURCE, UNLIMITED TABLESPACE TO c##testuse1");
//		System.out.println("Permissions granted successfully!");
		stmt.close();
		conn.close();

	}
}

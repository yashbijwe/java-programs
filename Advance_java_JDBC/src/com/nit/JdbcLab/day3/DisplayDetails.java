package com.nit.JdbcLab.day3;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DisplayDetails {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "yash2003", "yashu");

		CallableStatement cs = con.prepareCall("{call displayStudentDetails(?,?)}");
		System.out.print("Enter Student ID :");
		cs.setInt(1, sc.nextInt());
		cs.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
		cs.execute();
		ResultSet rs = (ResultSet) cs.getObject(2);
		while (rs.next()) {
			System.out.println("ID       : " + rs.getInt("stuId"));
			System.out.println("Roll No  : " + rs.getInt("stuRollNo"));
			System.out.println("Name     : " + rs.getString("stuName"));
			System.out.println("Branch   : " + rs.getString("stuBranch"));
			System.out.println("House No : " + rs.getString("stuHno"));
			System.out.println("City     : " + rs.getString("city"));
			System.out.println("Pincode  : " + rs.getInt("pincode"));
			System.out.println("Email    : " + rs.getString("mid"));
			System.out.println("Phone    : " + rs.getString("phno"));
			System.out.println("-----------------------------------------------------");
		}

		cs.close();
		rs.close();
		sc.close();

	}
}
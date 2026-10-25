package com.nit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Sample {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "yash2003", "yashu");

		PreparedStatement ps = con.prepareStatement("insert into student values (?,?,?,?)");
		System.out.println("enter student details");
		ps.setInt(1, sc.nextInt());
		sc.nextLine();
		ps.setString(2, sc.next());
		ps.setInt(3, sc.nextInt());
		ps.setDouble(4, sc.nextDouble());

		 int rows = ps.executeUpdate();
         System.out.println(rows + " record inserted successfully");
         
		ps.close();
		sc.close();
		con.close();
	}

}

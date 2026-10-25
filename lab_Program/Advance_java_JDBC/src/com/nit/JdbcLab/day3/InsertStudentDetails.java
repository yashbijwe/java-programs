package com.nit.JdbcLab.day3;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class InsertStudentDetails {
	public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in);) {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "yash2003", "yashu");
		
		CallableStatement cs = con.prepareCall("{call insertStudentDetails(?,?,?,?,?,?,?,?,?)}");
			do {
				System.out.println("Enter Student ID:");
				cs.setInt(1, sc.nextInt());
				System.out.println("Enter Student Roll no:");
				cs.setInt(2, sc.nextInt());
				sc.nextLine();
				System.out.println("Enter Student Name:");
				cs.setString(3, sc.nextLine());
				System.out.println("Enter Student Course:");
				cs.setString(4, sc.nextLine());
				System.out.println("Enter Student Apartment:");
				cs.setString(5, sc.nextLine());
				System.out.println("Enter Student City:");
				cs.setString(6, sc.nextLine());
				System.out.println("Enter Student Pincode:");
				cs.setInt(7, sc.nextInt());
				sc.nextLine();
				System.out.println("Enter Student Email:");
				cs.setString(8, sc.nextLine());
				System.out.println("Enter Student Phone Number:");
				cs.setString(9, sc.nextLine());

				cs.execute();
				System.out.println("Student details inserted successfully");
				con.close();
				System.out.println("Do you want to insert more records? (yes/no)");
			} while (sc.next().contains("yes"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

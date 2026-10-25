package com.nit.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecord {

	public static void main(String[] args) {
		
	
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				Connection con= DriverManager.getConnection
						             ("jdbc:oracle:thin:@localhost:1521:ORCL","yash2003","yashu");
				PreparedStatement ptst =  con.prepareStatement("insert into images values (?,?)");
				ptst.setString(1,args[0]);
				FileInputStream fis = new FileInputStream(args[1]);
				ptst.setBinaryStream(2, fis, fis.available());
				ptst.executeUpdate();
				System.out.println("One image is inserted.");
			} catch (ClassNotFoundException | SQLException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}

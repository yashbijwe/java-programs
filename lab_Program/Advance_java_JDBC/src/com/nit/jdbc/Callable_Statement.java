package com.nit.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.Types;
import java.sql.SQLException;

import java.util.Scanner;

public class Callable_Statement{

	public static void main(String[] args) 
										throws ClassNotFoundException,
													 SQLException{
		
		//1. Loading driver 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. Creating connection
		Connection con = 
				DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:orcl",
						"yash2003", "yashu"
				);
	
		//3. Creating CallableStatement
		CallableStatement cstmt = 
			con.prepareCall( "{call updateEmpSal(?, ?, ?, ?, ?) }");

		//4. Registering OUT parameters type
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.registerOutParameter(4, Types.DOUBLE);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		
		//5. Reading eno & incrSal from console from keyboard 
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter eno: ");
		int eno = scn.nextInt();
		
		System.out.print("Enter sal increment by: ");
		double incrSal = scn.nextDouble();

		//6. setting eno & incrSal to IN parameters in cstmt object
		cstmt.setInt(1, eno);
		cstmt.setDouble(2, incrSal);
		
		//7. executing procedure
		cstmt.execute();
		
		//8. reading OUT parameters values from CallableStatement object
		String ename 	= cstmt.getString(3);
		double sal 		= cstmt.getDouble(4);
		String dept 	= cstmt.getString(5);

		//9. printing results
		System.out.println("eno = "+ eno +" employee details after updation");
		System.out.println( "  ename: "+ ename );
		System.out.println( "    sal: "+ sal );
		System.out.println( "   dept: "+ dept );
		
		//10. closing cstmt & con objects
		cstmt.close();
		con.close();
		scn.close();
	}
}
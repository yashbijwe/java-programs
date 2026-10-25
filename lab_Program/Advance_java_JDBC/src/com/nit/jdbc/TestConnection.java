package com.nit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        

 Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "yash2003", "yashu");
 System.out.println("Connected Successfully!");
 conn.close();
    }
}   


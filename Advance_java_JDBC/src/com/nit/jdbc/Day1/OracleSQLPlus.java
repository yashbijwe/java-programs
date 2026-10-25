package com.nit.jdbc.Day1;

import java.sql.*;
import java.util.Scanner;

public class OracleSQLPlus {

	static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    static final String USER = "yash2003";
    static final String PASSWORD = "yashu";


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

            System.out.println("======================================");
            System.out.println("      Java Oracle SQL*Plus");
            System.out.println("======================================");
            System.out.println("Connected to Oracle Database");
            System.out.println("Type EXIT to close the application");
            System.out.println();

            while (true) {

                System.out.print("SQL> ");
                String sql = sc.nextLine().trim();

                if (sql.equalsIgnoreCase("EXIT") ||
                    sql.equalsIgnoreCase("QUIT")) {
                    break;
                }

                if (sql.isEmpty()) {
                    continue;
                }

                if (sql.endsWith(";")) {
                    sql = sql.substring(0, sql.length() - 1);
                }

                try {

                    String operation = sql
                            .trim()
                            .split("\\s+")[0]
                            .toUpperCase();

                    Statement stmt = con.createStatement();

                    if (operation.equals("SELECT")) {

                        ResultSet rs = stmt.executeQuery(sql);

                        ResultSetMetaData meta = rs.getMetaData();

                        int columnCount = meta.getColumnCount();

                        for (int i = 1; i <= columnCount; i++) {
                            System.out.printf(
                                    "%-20s",
                                    meta.getColumnName(i)
                            );
                        }

                        System.out.println();

                        for (int i = 1; i <= columnCount; i++) {
                            System.out.printf(
                                    "%-20s",
                                    "----------------"
                            );
                        }

                        System.out.println();

                        int rowCount = 0;

                        while (rs.next()) {

                            for (int i = 1; i <= columnCount; i++) {

                                String value = rs.getString(i);

                                if (value == null) {
                                    value = "NULL";
                                }

                                System.out.printf(
                                        "%-20s",
                                        value
                                );
                            }

                            System.out.println();

                            rowCount++;
                        }

                        System.out.println();
                        System.out.println(
                                rowCount + " row(s) selected."
                        );

                        rs.close();

                    } else if (operation.equals("INSERT") ||
                               operation.equals("UPDATE") ||
                               operation.equals("DELETE")) {

                        int rows = stmt.executeUpdate(sql);

                        System.out.println(
                                rows + " row(s) affected."
                        );

                    } else {

                        System.out.println(
                                "Only SELECT, INSERT, UPDATE and DELETE are supported."
                        );
                    }

                    stmt.close();

                } catch (SQLException e) {

                    System.out.println(
                            "SQL Error: " + e.getMessage()
                    );
                }
            }

            con.close();

            System.out.println("Disconnected from Oracle Database.");

        } catch (ClassNotFoundException e) {

            System.out.println(
                    "Oracle JDBC Driver not found."
            );

        } catch (SQLException e) {

            System.out.println(
                    "Database Connection Error: " + e.getMessage()
            );
        }

        sc.close();
    }
}
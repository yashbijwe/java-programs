package com.nit.jdbc;

import java.sql.*;
import java.util.Scanner;

public class SqlPlus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to Mini SQLPlus ===");

        System.out.print("Enter DB URL: ");
        String url = sc.nextLine();

        System.out.print("Enter DB Username: ");
        String user = sc.nextLine();

        System.out.print("Enter DB Password: ");
        String password = sc.nextLine();

        try (Connection con = DriverManager.getConnection(url, user, password)) {

            System.out.println("Connected successfully!");
            System.out.println("Type SQL commands or 'exit' to quit");

            while (true) {

                System.out.print("SQL> ");
                String sql = sc.nextLine().trim();
                if (sql.endsWith(";")) {
                    sql = sql.substring(0, sql.length() - 1);
                }

                if (sql.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting SQLPlus...");
                    break;
                }

                try (Statement stmt = con.createStatement()) {

                    // Check SELECT or DML
                    if (sql.toLowerCase().startsWith("select")) {

                        ResultSet rs = stmt.executeQuery(sql);
                        ResultSetMetaData meta = rs.getMetaData();
                        int colCount = meta.getColumnCount();

                        // Print column names
                        for (int i = 1; i <= colCount; i++) {
                            System.out.print(meta.getColumnName(i) + "\t");
                        }
                        System.out.println();

                        // Print rows
                        while (rs.next()) {
                            for (int i = 1; i <= colCount; i++) {
                                System.out.print(rs.getString(i) + "\t");
                            }
                            System.out.println();
                        }

                    } else {
                        int rows = stmt.executeUpdate(sql);
                        System.out.println(rows + " row(s) affected.");
                    }

                } catch (SQLException e) {
                    System.out.println("SQL Error: " + e.getMessage());
                }
            }

        } catch (SQLException e) {
            System.out.println("Connection Failed: " + e.getMessage());
        }

        sc.close();
    }
}
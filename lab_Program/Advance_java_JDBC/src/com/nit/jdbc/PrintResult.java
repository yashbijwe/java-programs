package com.nit.jdbc;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class PrintResult{
public static void printResult(ResultSet rs) {
	try {
		ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        int rowCount = 0;

        if (!rs.next()) {
            System.out.println("No records found in STUDENT table.");
            return;
        }

        // ---------- Print Column Headers ----------
        for (int i = 1; i <= columnCount; i++) {
            String columnName = rsmd.getColumnName(i);
            int maxGap = Math.max(rsmd.getPrecision(i), columnName.length());

            String fmt = rsmd.getColumnTypeName(i).toLowerCase().contains("varchar")
                    ? "%-" + maxGap + "s "
                    : "%" + maxGap + "s ";

            System.out.printf(fmt, columnName);
        }
        System.out.println();

        // ---------- Print Header Separator ----------
        for (int i = 1; i <= columnCount; i++) {
            String columnName = rsmd.getColumnName(i);
            int maxGap = Math.max(rsmd.getPrecision(i), columnName.length());

            String line = "-".repeat(Math.max(1, maxGap)); // repeat '-' maxGap times
            System.out.print(line + " ");
        }
        System.out.println();

        // ---------- Print Row Data ----------
        do {
            for (int i = 1; i <= columnCount; i++) {
                String columnName = rsmd.getColumnName(i);
                int maxGap = Math.max(rsmd.getPrecision(i), columnName.length());

                String fmt = rsmd.getColumnTypeName(i).toLowerCase().contains("varchar")
                        ? "%-" + maxGap + "s "
                        : "%" + maxGap + "s ";

                System.out.printf(fmt, rs.getString(i));
            }
            rowCount++;
            System.out.println();
        } while (rs.next());

        System.out.println("\nTotal Rows: " + rowCount);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
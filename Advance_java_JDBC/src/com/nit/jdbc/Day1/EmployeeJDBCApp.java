package com.nit.jdbc.Day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import com.nit.jdbc.*;


public class EmployeeJDBCApp {

    static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    static final String USER = "yash2003";
    static final String PASS = "yashu";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
           
            Class.forName("oracle.jdbc.driver.OracleDriver");

         
            Connection con = DriverManager.getConnection(URL, USER, PASS);

            int choice;

            do {
                System.out.println("\n========= EMPLOYEE MENU =========");
                System.out.println("1. Insert Employee");
                System.out.println("2. Retrieve All Employees");
                System.out.println("3. Retrieve Employees Name Starts With 'S'");
                System.out.println("4. Retrieve Employees Salary Between 10000 to 20000");
                System.out.println("5. Update Employee Salary by ID");
                System.out.println("6. Delete Employee With Maximum Salary");
                System.out.println("7. Delete Employee Name Ends With 'a'");
                System.out.println("8. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                switch (choice) {

                  
                case 1:
                    String insertSQL =
                        "INSERT INTO Employee1 (empId, empName, empSalary, "
                        + "empAddress, empMailId, empPhNo) VALUES (?,?,?,?,?,?)";

                    PreparedStatement ps1 = con.prepareStatement(insertSQL);

                    System.out.print("Enter ID: ");
                    ps1.setInt(1, sc.nextInt());
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    ps1.setString(2, sc.nextLine());

                    System.out.print("Enter Salary: ");
                    ps1.setDouble(3, sc.nextDouble());
                    sc.nextLine();

                    System.out.print("Enter Address: ");
                    ps1.setString(4, sc.nextLine());

                    System.out.print("Enter Mail ID: ");
                    ps1.setString(5, sc.nextLine());

                    System.out.print("Enter Phone No: ");
                    ps1.setString(6, sc.nextLine());

                    int rows = ps1.executeUpdate();
                    System.out.println(rows + " Employee Inserted Successfully");
                    break;   
                    
                    case 2:
                        Statement st2 = con.createStatement();
                        ResultSet rs2 =
                                st2.executeQuery("SELECT * FROM Employee1");

                        PrintResult.printResult(rs2);
                        break;

                  
                    case 3:
                        PreparedStatement ps3 =
                                con.prepareStatement(
                                        "SELECT * FROM Employee1 WHERE empName LIKE 'S%'");
                        ResultSet rs3 = ps3.executeQuery();

                        PrintResult.printResult(rs3);
                        break;

                   
                    case 4:
                        PreparedStatement ps4 =
                                con.prepareStatement(
                                        "SELECT * FROM Employee1 WHERE empSalary BETWEEN 10000 AND 20000");
                        ResultSet rs4 = ps4.executeQuery();
                        
                        PrintResult.printResult(rs4);
                        break;


                    case 5:
                        PreparedStatement ps5 =
                                con.prepareStatement(
                                        "UPDATE Employee1 SET empSalary=? WHERE empId=?");

                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();

                        System.out.print("Enter New Salary: ");
                        double sal = sc.nextDouble();

                        ps5.setDouble(1, sal);
                        ps5.setInt(2, id);

                        int count = ps5.executeUpdate();
                        if (count > 0)
                            System.out.println("Salary Updated Successfully");
                        else
                            System.out.println("Employee Not Found");
                        break;

               
                    case 6:
                        Statement st6 = con.createStatement();
                        int delMax =
                                st6.executeUpdate(
                                        "DELETE FROM Employee1 WHERE empSalary = (SELECT MAX(empSalary) FROM Employee1)");
                        System.out.println(delMax + " Employee Deleted");
                        break;

                   
                    case 7:
                        PreparedStatement ps7 =
                                con.prepareStatement(
                                        "DELETE FROM Employee1 WHERE empName LIKE '%a'");
                        int delA = ps7.executeUpdate();
                        System.out.println(delA + " Employee(s) Deleted");
                        break;

                
                    case 8:
                        System.out.println("Exiting Application...");
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }
            System.out.println("You want to continue (Yes/No)");
            } while (sc.next().contains("yes"));

            con.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



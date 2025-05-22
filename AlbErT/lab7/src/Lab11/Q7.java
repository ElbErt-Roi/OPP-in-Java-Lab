package Lab11;

import java.sql.*;
import java.util.Scanner;

public class Q7 {
    static final String DB_URL = "jdbc:mysql://localhost/Company";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            System.out.println("Connected to the database...");

            while (true) {
                System.out.println("1. Insert New Employee");
                System.out.println("2. View Employees");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Choose an Option: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        insertEmployee(conn, sc);
                        break;
                    case 2:
                        viewEmployees(conn);
                        break;
                    case 3:
                        updateEmployee(conn, sc);
                        break;
                    case 4:
                        deleteEmployee(conn, sc);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void insertEmployee(Connection conn, Scanner sc) throws SQLException {
        String sql = "INSERT INTO Employee (Eid, Name, Address, Department) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            System.out.print("Employee Eid? ");
            int eid = sc.nextInt(); sc.nextLine();
            System.out.print("Employee Name? ");
            String name = sc.nextLine();
            System.out.print("Employee Address? ");
            String address = sc.nextLine();
            System.out.print("Employee Department? ");
            String dept = sc.nextLine();

            pstmt.setInt(1, eid);
            pstmt.setString(2, name);
            pstmt.setString(3, address);
            pstmt.setString(4, dept);
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " employee(s) inserted.");
        }
    }

    static void viewEmployees(Connection conn) throws SQLException {
        String sql = "SELECT * FROM Employee";
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("\n--- Employee Records ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("Eid") +
                                   ", Name: " + rs.getString("Name") +
                                   ", Address: " + rs.getString("Address") +
                                   ", Department: " + rs.getString("Department"+ "\n"));
            }
        }
    }

    static void updateEmployee(Connection conn, Scanner sc) throws SQLException {
        String sql = "UPDATE Employee SET Name = ?, Address = ?, Department = ? WHERE Eid = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            System.out.print("Enter Eid to Update: ");
            int eid = sc.nextInt(); sc.nextLine();
            System.out.print("Enter New Name: ");
            String name = sc.nextLine();
            System.out.print("Enter New Address: ");
            String address = sc.nextLine();
            System.out.print("Enter New Department: ");
            String dept = sc.nextLine();

            pstmt.setString(1, name);
            pstmt.setString(2, address);
            pstmt.setString(3, dept);
            pstmt.setInt(4, eid);
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " employee(s) updated.");
        }
    }

    static void deleteEmployee(Connection conn, Scanner sc) throws SQLException {
        String sql = "DELETE FROM Employee WHERE Eid = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            System.out.print("Enter Eid to Delete: ");
            int eid = sc.nextInt();
            pstmt.setInt(1, eid);
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " employee(s) Deleted.");
        }
    }
}


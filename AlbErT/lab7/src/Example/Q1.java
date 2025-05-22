package Example;

import java.sql.*;
import java.util.Scanner;

public class Q1 {

    static final String DB_URL = "jdbc:mysql://localhost:/Company";
    static final String USER = "root";
    static final String PASS = ""; // Replace with your MySQL password

    static Connection conn;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to the database.");

            int choice;
            do {
                System.out.println("\n--- Employee CRUD Menu ---");
                System.out.println("1. Add Employee");
                System.out.println("2. View Employees");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1: addEmployee(); break;
                    case 2: viewEmployees(); break;
                    case 3: updateEmployee(); break;
                    case 4: deleteEmployee(); break;
                    case 5: System.out.println("Exiting..."); break;
                    default: System.out.println("Invalid choice!");
                }

            } while (choice != 5);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addEmployee() throws SQLException {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Department: ");
        String dept = scanner.nextLine();

        String query = "INSERT INTO Employee (Eid, Name, Address, Department) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, id);
        stmt.setString(2, name);
        stmt.setString(3, address);
        stmt.setString(4, dept);
        int rows = stmt.executeUpdate();

        System.out.println(rows + " employee(s) added.");
    }

    public static void viewEmployees() throws SQLException {
        String query = "SELECT * FROM Employee";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        System.out.println("\nEmployee Records:");
        while (rs.next()) {
            System.out.printf("ID: %d | Name: %s | Address: %s | Department: %s\n",
                rs.getInt("Eid"), rs.getString("Name"), rs.getString("Address"), rs.getString("Department"));
        }
    }

    public static void updateEmployee() throws SQLException {
        System.out.print("Enter Employee ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter new Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter new Department: ");
        String dept = scanner.nextLine();

        String query = "UPDATE Employee SET Name=?, Address=?, Department=? WHERE Eid=?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, name);
        stmt.setString(2, address);
        stmt.setString(3, dept);
        stmt.setInt(4, id);
        int rows = stmt.executeUpdate();

        System.out.println(rows + " employee(s) updated.");
    }

    public static void deleteEmployee() throws SQLException {
        System.out.print("Enter Employee ID to delete: ");
        int id = scanner.nextInt();

        String query = "DELETE FROM Employee WHERE Eid=?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, id);
        int rows = stmt.executeUpdate();

        System.out.println(rows + " employee(s) deleted.");
    }
}

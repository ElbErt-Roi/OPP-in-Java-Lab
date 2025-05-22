
package Lab10;


import java.sql.*;
import java.util.Scanner;
public class EmployeeCRUD  {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an Option");
        System.out.println("1. Insert New Employee ");
        System.out.println("2. Remove Employee ");
        System.out.println("3. Upadte Employee ");
        System.out.println("4. Display Employee ");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        
        switch(ch){
            case 1:
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "");
        Class.forName("com.mysql.cj.jdbc.Driver");   
        System.out.print("Enter Enter Employee id : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String ename = sc.nextLine();
        System.out.print("Enter Employee Address: ");
        String eaddr = sc.nextLine();
        System.out.print("Enter Employee Department: ");
        String edep = sc.nextLine();
            
        String sql = "INSERT INTO employee(Eid,Name,Address,Department)VALUES('"+id+"',"+"'"+ename+"',"+"'"+eaddr+"',"+"'"+edep+"')";
        Statement st = con.createStatement();
        int row = st.executeUpdate(sql);
        if(row>0) {
                System.out.println(row+" row inserted succesfully");
        }
        else {
        System.out.println("Error inserting");
        }
        break;
        
            case 2:{
         
        Connection dcon = DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "");
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.print("Enter Enter Employee id : ");
        int did = sc.nextInt();
        Statement dst = dcon.createStatement();
        String delsql = "DELETE FROM employee where (Eid)=('"+did+"')";
        int drow = dst.executeUpdate(delsql);
        if(drow>0) {
                System.out.println("Data deleted successfully");
        }
        else {
        System.out.println("Error deleting data");
        }
        dcon.close();
        break;
            
            }
            case 3:{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection upcon = DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "");
        Statement upst = upcon.createStatement();
          String upope = "Update";
                sc.nextLine();
                System.out.print("Enter the Eid to update: ");
                int upid = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter new Name: ");
                String upname = sc.nextLine();
                System.out.print("Enter new Address: ");
                String upadd = sc.nextLine();
                System.out.print("Enter new Department: ");
                String updep = sc.nextLine();
                
                String upsql = "UPDATE employee SET Name='" + upname + "', Address='" + upadd + "', Department='" + updep + "' WHERE Eid='" + upid + "'";
        int uprow = upst.executeUpdate(upsql);
        if(uprow>0) {
                System.out.println("Data updated succesfully");
        }
        else {
        System.out.println("Error while updating data");
        }
        upcon.close();  
        break;
            }
            case 4:{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection dcon = DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "");
        String dsql = "select* from employee";
        Statement dst = dcon.createStatement();
        ResultSet drs = dst.executeQuery(dsql);
        System.out.println("Eid\t\tName\t\tAddress\t\tDepartment");
        while(drs.next()) {
            int did = drs.getInt(1);
            String name = drs.getString(2);
            String address = drs.getString(3);
            String department = drs.getString(4);
            System.out.println(did+ " \t\t" + name+ " \t\t" + address+ " \t\t" +department);
        }
        dcon.close();
            
            }
        }
    }
}

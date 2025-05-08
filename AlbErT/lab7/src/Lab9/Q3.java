package Lab9;

import java.util.Scanner;
import java.io.*;

class Student implements Serializable{
    int roll;
    String name, address;
    long phone;
    public Student(int r, String n, String add, long ph){
        roll = r;
        name = n;
        address = add;
        phone = ph;
    }
}
public class Q3 {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        Student [] st = new Student[3];
        FileOutputStream fout = new FileOutputStream("Student.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        for(int i=0;i<3;i++){
            System.out.print("Enter Roll: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Address: ");
            String address = sc.nextLine();
            System.out.print("Enter Phone Number: ");
            long phone = sc.nextLong();
            st[i] = new Student(roll, name, address, phone);
            out.writeObject(st[i]);
            System.out.println();
        }
        fout.close();
        out.close();
        System.out.println("File Written Successfully.");
        
        FileInputStream fin = new FileInputStream("Student.txt");
        ObjectInputStream oin = new ObjectInputStream(fin);
        Student [] sttemp = new Student[3];
        System.out.println("\nStudent Records:");
        for(int i=0;i<3;i++){
            sttemp[i] = (Student)oin.readObject();
            if(sttemp[i].address.equalsIgnoreCase("kritipur")){
                System.out.print(sttemp[i].roll+"\t"+sttemp[i].name+"\t"+sttemp[i].address+"\t"+sttemp[i].phone);
                System.out.println();
            }
        }
        fin.close();
        oin.close();
    }
}


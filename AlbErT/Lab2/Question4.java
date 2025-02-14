import java.util.Scanner;
public class Question4
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter Sub1 Marks: ");
double sub1=sc.nextDouble();

System.out.println("Enter Sub2 Marks: ");
double sub2=sc.nextDouble();

System.out.println("Enter Sub3 Marks: ");
double sub3=sc.nextDouble();

System.out.println("Enter Sub4 Marks: ");
double sub4=sc.nextDouble();

System.out.println("Enter Sub5 Marks: ");
double sub5= sc.nextDouble();

double total= sub1+sub2+sub3+sub4+sub5;
double avg= total/5;

System.out.println("Total Marks=" +total);
System.out.println("Average marks= " +avg);
sc.close();
}
}



import java.util.Scanner;
public class Question2_1
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter Num1: ");
int a=sc.nextInt();

System.out.println("Enter Num2: ");
int b=sc.nextInt();

int c= a;
a= b;
b= c;

System.out.println("Num1=" +a);
System.out.println("Num2=" +b);
sc.close();
}
}
import java.util.Scanner;
public class Question3
{
public static void main(String[]args)
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter Num1: ");
int a=sc.nextInt();

System.out.println("Enter Num2: ");
int b= sc.nextInt();

System.out.println("Enter Num3: ");
int c= sc.nextInt();

int larg= (a>b)?((a>c)? a:c):((b>c)? b:c);
int smal= (a<b)?((a<c)? a:c): ((b<c)? b:c);

System.out.println("Largest: " +larg);
System.out.println("Smallerst: " +smal);
sc.close(); 
}
}
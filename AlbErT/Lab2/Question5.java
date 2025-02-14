import java.util.Scanner;
public class Question5
{
public static void main(String[]args)
{

Scanner sc=new Scanner(System.in);

System.out.println("Enter num1");
int a= sc.nextInt();

System.out.println("Enter num2");
int b= sc.nextInt();

int and= a & b;
int or= a | b;
int xor= a ^ b ;
int Lsift= a << 2;
int Rsift= a >> 1;
int not= ~b;


System.out.println("Bitwise AND: " +and);
System.out.println("Bitwise OR: "+or);
System.out.println("Bitwise XOR: " +xor);
System.out.println("Bitwise Left Shift: " +Lsift);
System.out.println("Bitwise Right Shift: " +Rsift);
System.out.println("Bitwise NOT: " +not);

sc.close();
}
}

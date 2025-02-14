public class Question1
{
public static void main(String[]args)
{
int a=9;
int b=13;
int c=3;

double x=a-b/3.0+c*2-1;
double y=a-(float)b/(3+c)*(2-1);
double z=a-((float)b/(3+c)*2)-1;

System.out.println("Value of X="+x);
System.out.println("Value of Y=" +y);
System.out.println("Value of Z=" +z);
}
}


import java.util.Scanner;

public class Question3 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Num: ");
        int n = sc.nextInt();
        int temp = n;
        int count = 0, rem, sum = 0, mul = 1;
        while (n != 0) {
            count++;
            n /= 10;
        }
        n = temp;
        int c = count;
        while (n != 0) {
            rem = n % 10;
            while (count > 0) {
                mul *= rem;
                count--;
            }
            sum = sum + mul;
            count = c;
            n /= 10;
            mul = 1;
        }

        if (sum == temp) {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not Armstrong Number");
        }
        sc.close();
    }
}
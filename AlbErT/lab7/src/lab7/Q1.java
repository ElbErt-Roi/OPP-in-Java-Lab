/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Q1 {
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find the factorial: ");
        int numFactorial = scanner.nextInt();
        System.out.println("Factorial of " + numFactorial + " is: " + fact(numFactorial));

        System.out.print("Enter a number to find the nth Fibonacci term: ");
        int numFibonacci = scanner.nextInt();
        System.out.println("The " + numFibonacci + "th Fibonacci term is: " + fibo(numFibonacci));
        
        scanner.close();
    }
}


package lab7;

interface Addition {
    double add(double a, double b);
}

interface Subtraction {
    double subtract(double a, double b);
}

interface Multiplication {
    double multiply(double a, double b);
}

interface Division {
    double divide(double a, double b);
}

class Calculator implements Addition, Subtraction, Multiplication, Division {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double num1 = 10;
        double num2 = 5;

        System.out.println("Addition: " + num1 + " + " + num2 + " = " + calc.add(num1, num2));

        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + calc.subtract(num1, num2));

        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + calc.multiply(num1, num2));

        System.out.println("Division: " + num1 + " / " + num2 + " = " + calc.divide(num1, num2));

        double num3 = 0;
        System.out.println("Division by zero: " + num1 + " / " + num3 + " = " + calc.divide(num1, num2));
    }
}

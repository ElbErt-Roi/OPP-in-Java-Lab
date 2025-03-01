public class Question5 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=50; i++) {
            if (i % 2 == 0)
                continue;
            sum += i;
        }
        System.out.println("Sum of odd numbers (1 to 50) = " + sum);
    }
}
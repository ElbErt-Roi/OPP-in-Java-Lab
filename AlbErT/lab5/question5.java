public class question5 {
    public static void main(String[] args) {
     
        int[][] jaggedArray = {
            {1, 5, 3},
            {6, 27},
            {10, 11, 8, 18}
        };

	System.out.println("Jagged array with sum of individual Row is:");
        for (int i = 0; i < jaggedArray.length; i++) {
            int rowSum = 0;
            System.out.print(" ");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
                rowSum += jaggedArray[i][j];
            }
            System.out.println("   => Sum of Row " + (i + 1) + ": " + rowSum);
        }
    }
}

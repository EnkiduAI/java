public class Task9 {
    public static void sol() {
        int n = 4;
        int maxSum = 0;
        int sum = 0;
        int row = 0;
        int maxColumn = 0;
        int[][] array = new int[n][n];
        matrixWork.createMatrix(array);
        for (int i = 0; i < n; i++) {
            row = 0;
            sum = 0;
            while (row < n) {
                sum += array[row][i];
                row++;
            }
            System.out.print("|" + sum + "| ");
            if (sum > maxSum) {
                maxSum = sum;
                maxColumn = i;
            }
        }
        System.out.println("Максимальная сумма в "+maxColumn+" столбце");
        System.out.println();
    }
}

public class Task2 {
    public static void sol() {
        int m = 5;
        int n = 5;
        int count = 0;
        int[][] array = new int[m][n];
        matrixWork.createMatrix(array);
        for (int i =0; i < m; i++) {
            System.out.print(array[i][count]+" ");
            count++;
        }
        System.out.println();
        System.out.println();
    }
}

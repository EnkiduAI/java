public class Task12 {
    public static void sol() {
        int n = 6;
        int[][] array = new int[n][n];
        matrixWork.createMatrix(array);
        int buffer;
        System.out.println();
        System.out.println("По возрастанию");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i][j] > array[i][k]) {
                        buffer = array[i][k];
                        array[i][k] = array[i][j];
                        array[i][j] = buffer;
                    }
                }
            }
        }
        matrixWork.printMatrix(array);
        System.out.println();
        System.out.println("По убыванию");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i][j] < array[i][k]) {
                        buffer = array[i][k];
                        array[i][k] = array[i][j];
                        array[i][j] = buffer;
                    }
                }
            }
        }
        matrixWork.printMatrix(array);
        System.out.println();
        System.out.println();
    }
}

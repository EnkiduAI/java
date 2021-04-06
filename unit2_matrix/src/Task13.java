public class Task13 {
    public static void sol() {
        int n = 6;
        int[][] array = new int[n][n];
        matrixWork.createMatrix(array);
        int buffer;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (array[j][i] < array[k][i]){
                        buffer = array[j][i];
                        array[j][i] = array[k][i];
                        array[k][i] = buffer;
                    }
                }
            }
        }
        System.out.println("По убыванию");
        matrixWork.printMatrix(array);
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (array[j][i] > array[k][i]){
                        buffer = array[j][i];
                        array[j][i] = array[k][i];
                        array[k][i] = buffer;
                    }
                }
            }
        }
        System.out.println("По возрастанию");
        matrixWork.printMatrix(array);
        System.out.println();
    }
}

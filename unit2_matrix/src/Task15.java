public class Task15 {
    public static void sol(){
        int n = 5;
        int [][] array = new int[n][n];
        matrixWork.createMatrix(array);
        int max = 0;
        for (int i = 0; i < n; i++){
            for (int j =0; j < n; j++){
                if (array[i][j]>max);
                max = array[i][j];
            }
        }
        System.out.println("Наибольший элемент:"+ max);
        for (int i =0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (array[i][j] % 2 != 0){
                    array[i][j] = max;
                }
            }
        }
        matrixWork.printMatrix(array);
        System.out.println();
    }
}

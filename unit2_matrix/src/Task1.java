public class Task1 {
    public static void sol(){
        int m = 3;
        int n = 6;
        int [][] array = new int [m][n];
        matrixWork.createMatrix(array);
        System.out.println();
        for (int i = 0; i < m ; i++){
            for(int j = 0; j < n; j++){
                if (j % 2 != 0){
                    if (array[0][j] > array[m-1][j]){
                        System.out.print("array ["+i+"] ["+j+"] = "+ array[i][j]+ " ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

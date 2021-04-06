public class Task10 {
    public static void sol(){
        int n = 5;
        int [][] array = new int[n][n];
        int j = -1;
        matrixWork.createWithNegative(array);
        for (int i = 0; i < n; i++){
            j++;
            if(array[i][j]>0){
                System.out.print("|"+array[i][j]+"| ");
            }
        }
        System.out.println();
        System.out.println();
    }
}

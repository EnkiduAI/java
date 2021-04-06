public class Task14 {
    public static void sol(){
        int n = 6;
        int m = 7;
        int [][] array = new int [n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (j > i){
                    array[i][j] = 1;
                }else{
                    array[i][j] = 0;
                }
                System.out.print("|a["+i+"]["+j+"]="+array[i][j]+"| ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

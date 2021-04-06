public class Task4 {
    public static void sol(){
        int n = 6;
        int count = 0;
        int [][] array = new int[n][n];
        for (int i = 0; i<n; i++){
            if (i % 2==0){
                for (int j = 0; j < n; j++){
                    count++;
                    array[i][j] = count;
                    System.out.print("array["+i+"]["+j+"]="+array[i][j]+" ");
                }
            }else{
                for (int j = 0; j < n; j++){
                    array[i][j] = count;
                    count--;
                    System.out.print("array["+i+"]["+j+"]="+array[i][j]+" ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }
}

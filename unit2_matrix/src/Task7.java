public class Task7 {
    public static void sol(){
        int n =4;
        double [][] array = new double [n][n];
        int counter = 0;
        for ( int i =0; i < n; i++){
            for (int j = 0; j < n; j++){
                array[i][j] = Math.sin((Math.pow(i,2) - Math.pow(j,2))/n);
                System.out.print("|"+array[i][j]+"| ");
                if (array[i][j] > 0){
                    counter++;
                }
            }
            System.out.println();
        }
        System.out.print("Положительных элементов: "+counter);
        System.out.println();
        System.out.println();
    }
}

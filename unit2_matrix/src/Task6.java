public class Task6 {
    public static void sol() {
        int n = 8;
        int[][] array = new int[n][n];
        int first = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( i >= j && j + i >= n - 1||
                        i <= j && j + i<= n - 1) {
                    array[i][j] = 1;

                } else {
                    array[i][j] =0  ;
                }
                System.out.print("|array[" + i + "][" + j + "]=" + array[i][j] + "| ");
            }
            System.out.println();
            first++;
            count++;
        }
        System.out.println();
    }
}

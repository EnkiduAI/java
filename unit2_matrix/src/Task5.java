public class Task5 {
    public static void sol() {
        int n = 6;
        int number = 1;
        int counter =0;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - counter; j++) {
                array[i][j] = number;
                System.out.print(array[i][j] + " ");
                if (j + number == n ) {
                    for (int k = n - counter; k < n; k++) {
                        array[i][k] = 0;
                        System.out.print(array[i][k] + " ");
                    }
                }

            }
            counter++;
            number++;
            System.out.println();
        }
        System.out.println();
    }
}

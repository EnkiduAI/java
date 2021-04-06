public class Task16 {
    public static void sol() {
        int n = 7;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int)(1 + ((i + j - 1 + (n - 2) / 2) % n) * n + ((i + 2 * j + 2) % n));
                System.out.print("|"+array[i][j]+"| ");
            }
            System.out.println();
        }
    }
}

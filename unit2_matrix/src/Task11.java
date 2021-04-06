import java.util.Random;

public class Task11 {
    public static void sol() {
        int[][] array = new int[10][20];
        Random rand = new Random();
        int counter = 0;
        int maxRow = 0;
        String s = "Строки: ";
        for (int i = 0; i < 10; i++) {
            counter = 0;
            for (int j = 0; j < 20; j++) {
                array[i][j] = rand.nextInt(15) + 1;
                System.out.print("|" + array[i][j] + "| ");
                if (array[i][j] == 5) {
                    counter++;
                }
            }
            if (counter >= 3) {
                maxRow = i;
                s = s + maxRow + "\t";
            }
            System.out.println();
        }
        System.out.println(s);
        System.out.println();
    }
}

import java.util.Random;

public class matrixWork {
    public static void createMatrix(int [][] m){
        Random rand = new Random();
        for (int i = 0; i < m.length; i++){
            for(int j =0; j< m[i].length; j++){
                m[i][j] = rand.nextInt(9)+1;
                System.out.print("|array ["+i+"] ["+j+"] = "+ m[i][j]+ "| ");
            }
            System.out.println();
        }
    }
    public static void printMatrix(int [][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("|array [" + i + "] [" + j + "] = " + m[i][j] + "| ");
            }
            System.out.println();
        }
    }
    public static void createWithNegative(int m[][]){
        Random rand = new Random();
        for (int i = 0; i < m.length; i++){
            for(int j =0; j< m[i].length; j++){
                m[i][j] = rand.nextInt(10)-5;
                System.out.print("|array ["+i+"] ["+j+"] = "+ m[i][j]+ "| ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Task3 {
    public static void sol(){
        int k;
        int p;
        int m = 5;
        int n = 5;
        int [][] array = new int[m][n];
        matrixWork.createMatrix(array);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку и столбец: ");
        k = in.nextInt();
        p = in.nextInt();
        while (k > m || p > n && k > n || p > m){
            System.out.println("Вы вышли за пределы массива!");
            k = in.nextInt();
            p = in.nextInt();
        }
        System.out.print("Столбец p =  "+p+"| ");
        for (int i = 0; i <m; i++){
            System.out.print(array[i][p]+" ");
        }
        System.out.println();
        System.out.print("Строка k = "+k+"| ");
        for(int i =0; i<m; i++){
            System.out.print(array[k][i]+" ");
        }
        System.out.println();
        System.out.println();
    }
}

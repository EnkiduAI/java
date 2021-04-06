import java.util.Scanner;

public class Task8 {
    public static void sol(){
        int n = 6;
        int [][] array = new int [n][n];
        matrixWork.createMatrix(array);
        int p;
        int k;
        int buff;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номера столбцов:");
        p = in.nextInt();
        k = in.nextInt();
        while(p > n || k > n){
            System.out.println("Выход за пределы массива");
            p = in.nextInt();
            k = in.nextInt();
        }
        for (int i = 0; i < n; i++){
            buff = array[i][p];
            array[i][p] = array[i][k];
            array[i][k] = buff;
        }
        matrixWork.printMatrix(array);
        System.out.println();

    }
}

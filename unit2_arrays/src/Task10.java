import java.util.Arrays;

public class Task10 {
    public static void sol() {
        int n = 10;
        int[] array = new int[n];
        int count = 1;
        arrayWork.randArray(array);
        arrayWork.printArr(array);
        System.out.println();
        for(int i=1;i<n; i++)
            for(int j = i; j<n - 1; j++){
                array[j] = array[j + 1];
                array[j + 1] = 0;
            }
        arrayWork.printArr(array);
        System.out.println();
    }
}

import java.text.DecimalFormat;

public class Task2 {
    public static void sol() {
        DecimalFormat df = new DecimalFormat("##.##");
        double[] array;
        double z = 1.0;
        int count = 0;
        array = new double[5];
        arrayWork.doubleArr(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] < z) {
                System.out.println("array ["+ i +"] = "+ z);
                count++;
            }else{
                System.out.println("array [" + i + "] = " + df.format(array[i]));
            }
        }
        System.out.println(count);
        System.out.println();
    }
}

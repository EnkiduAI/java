public class Task7 {
    public static void sol() {
        double[] array = new double[20];
        arrayWork.doubleArr(array);
        double max = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            if (max < array[i] + array[array.length -i - 1]) {
                max = array[i] + array[array.length - i - 1];
            }
        }
        System.out.println(max);
        System.out.println();
    }
}

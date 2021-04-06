public class Task4 {
    public static void sol() {
        double array[];
        array = new double[5];
        int minInd = 0;
        int maxInd = 0;
        double min = 0;
        double max = 0;
        double buff;
        arrayWork.doubleArr(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println("array [" + i + "] = " + array[i]);
            if (array[i] < min) {
                min = array[i];
                minInd = i;
            }
            if (array[i] > max) {
                max = array[i];
                maxInd = i;
            }
        }
        buff = array[minInd];
        array[minInd] = array[maxInd];
        array[maxInd] = buff;
        System.out.println();
        arrayWork.printArr(array);
        System.out.println();
    }
}

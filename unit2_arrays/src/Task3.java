import org.w3c.dom.ls.LSOutput;

public class Task3 {
    public static void sol() {
        double[] array;
        array = new double[5];
        int zero = 0;
        int neg = 0;
        int pos = 0;
        arrayWork.doubleArr(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("array ["+ i +"] = " +array[i]);
            if (array[i] > 0) {
                pos++;
            }
            if(array[i]<0){
                neg++;
            }
            if(array[i] == 0){
                zero++;
            }
        }
        System.out.println("Положительных: " +pos);
        System.out.println("Отрицательных: "+ neg);
        System.out.println("Нули: "+ zero);
        System.out.println();
    }
}

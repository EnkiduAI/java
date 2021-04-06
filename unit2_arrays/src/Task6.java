public class Task6 {
    public static void sol() {
        double array[] = new double[20];
        double sum =0;
        boolean flag =false;
        arrayWork.doubleArr(array);
        for (int i = 2; i < array.length; i++) {
            for (int j = 2; j < i; j++){
                if (i % j != 0){
                    flag = true;

                }else{
                    flag = false;
                    break;
                }
            }
            if (i == 2 || flag){
                System.out.print("|"+array[i]+" ");
                System.out.println("array ["+ i + "] = " +array[i]);
                sum += array[i];
            }
        }
        System.out.println(sum);
        System.out.println();
    }
}

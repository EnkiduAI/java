import java.util.Random;

public class arrayWork {
    public static void randArray(int[]m){
        Random rand = new Random();
        for(int i =0; i < m.length; i++){
            m[i] = rand.nextInt(20)-5;
        }
    }
    public static void doubleArr(double[]m){
        Random rand = new Random();
        for (int i = 0; i< m.length; i++){
            m[i] = (rand.nextDouble()* 10) -5;

        }
    }
    public static void printArr(double[]m){
        for(int i = 0; i< m.length; i++){
            System.out.println("array ["+ i +"] = " + m[i]);
        }
    }
    public static void printArr(int[]m){
        for(int i = 0; i< m.length; i++){
            System.out.println("array ["+ i +"] = " + m[i]);
        }
    }
}

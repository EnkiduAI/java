public class Task1 {
    public static void sol(){
        int arr[];
        int sum = 0;
        int k = 2;
        arr = new int[5];
        arrayWork.randArray(arr);
        System.out.print("Массив: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
            if( arr[i] % k ==0){
                sum += arr[i];
            }
        }
        System.out.println();
        System.out.println(sum);
        System.out.println();
    }
}

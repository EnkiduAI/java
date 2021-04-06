public class Task5 {
    public static void sol (){
        int arr[] = new int[5];
        arrayWork.randArray(arr);
        for(int i = 0; i < arr.length; i++){
            if (arr[i]> i){
                System.out.println("arr ["+ i +"] = "+ arr[i]);
            }
        }
        System.out.println();
    }
}

public class Task8 {
    public static void sol(){
        int [] arr = new int[10];
        int [] newArr = new int[10];
        arrayWork.randArray(arr);
        int min = arr[0];
        int buffer;
        for (int i = 0, j = 0; i < arr.length; i++){
            System.out.println("arr ["+i+"] = "+ arr[i]);
            if(min>arr[i]){
                min = arr[i];
                newArr[j] = min;
                j++;
            }
        }
        System.out.println();
        for(int j = 0; j < newArr.length; j++){
            System.out.println("newArr ["+j+"] = " + newArr[j]);
        }
        System.out.println();
    }
}

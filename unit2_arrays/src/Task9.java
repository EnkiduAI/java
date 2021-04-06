public class Task9 {
    public static void sol() {
        int[] array = new int[10];
        int[] popArray = new int[array.length];
        int popNumberCounter = 2;
        int numberCounter = 0;
        int highestCounter = 0;
        int number = 0;
        arrayWork.randArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("array [" + i + "] = " + array[i]);
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    numberCounter++;
                }
                if (numberCounter >= popNumberCounter) {
                    popArray[i] = array[i];
                }
            }
            numberCounter = 0;
        }
        for (int i = 0; i < popArray.length; i++) {
            for (int j = 0; j < popArray.length; j++) {
                if (popArray[i] == popArray[j] && popArray[i] != 0) {
                    numberCounter++;
                }
                if (numberCounter > highestCounter) {
                    highestCounter = numberCounter;
                    number = popArray[i];
                }
                if (highestCounter == numberCounter && number < popArray[i]){
                    number = popArray[i];
                }
            }
            numberCounter = 0;

        }
        System.out.println();
        for (int i = 0; i < popArray.length; i++) {
            System.out.println("popArray [" + i + "] = " + popArray[i]);
        }
        System.out.println();
        System.out.println(number);
        System.out.println();
    }
}

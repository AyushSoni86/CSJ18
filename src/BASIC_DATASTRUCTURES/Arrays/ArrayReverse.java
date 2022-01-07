package BASIC_DATASTRUCTURES.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 10, 6, 3, 4, 5};
        printArray(arr);
        reverseArray(arr);
        printArray(arr);
    }

    static void printArray(int[] arr ){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void reverseArray(int[] arr){
        int low = 0;
        int high = arr.length-1;

        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++ ;
            high--;
        }
    }

}



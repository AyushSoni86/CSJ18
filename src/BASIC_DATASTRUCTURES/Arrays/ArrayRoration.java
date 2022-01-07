package BASIC_DATASTRUCTURES.Arrays;

public class ArrayRoration {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 10, 6, 3, 4, 5};
        printArray(arr);
        leftRotateByOne(arr);
        printArray(arr);
        leftRotateBy_n_times(arr, 4);
        printArray(arr);
    }


    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    static void leftRotateByOne(int[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }

    static void leftRotateBy_n_times(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            leftRotateByOne(arr);
        }
    }
}

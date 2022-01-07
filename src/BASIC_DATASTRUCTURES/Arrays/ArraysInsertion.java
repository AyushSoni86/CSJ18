package BASIC_DATASTRUCTURES.Arrays;

public class ArraysInsertion {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 6, 10, 6, 3, 4, 5};
        printArray(arr);
        insertAtFirst(arr , 34);

        printArray(arr);
    }


    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void insertAtFirst(int[] arr ,int key ){
        for (int i = arr.length-2; i >= 0 ; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = key ;

    }
}



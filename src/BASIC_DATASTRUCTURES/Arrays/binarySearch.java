package BASIC_DATASTRUCTURES.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 13, 4, 6, 10, 16, 3, 14, 5, 113};
        bubbleSort(arr);
        printArray(arr);
        int key = 3;
        int index = binarySearch(arr, key);
        System.out.println((index == -1) ? key + " not available in the array " : key + " found at index " + index);
    }


    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

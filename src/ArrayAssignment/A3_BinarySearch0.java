package ArrayAssignment;

public class A3_BinarySearch0 {


    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void bubble_Sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static int binarySearch(int[] arr, int key) {
        bubble_Sort(arr);
        printArray(arr);
        int low = 0;

        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {12, 34, 567, 23, 6, 5, 234, 356};
        bubble_Sort(arr);
        int key = 2324;
        int index = binarySearch(arr,key);
        System.out.println((key == -1) ? key + " found at index "+ index : key + " not available in the array");
    }

}

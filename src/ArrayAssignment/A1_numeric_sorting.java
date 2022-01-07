package ArrayAssignment;

public class A1_numeric_sorting {
    public static void main(String[] args) {
        int[] arr = {23, 56, 34, 78, 98, 43, 21, 234, 45};
        System.out.println("Array before sort : ");
        printArray(arr, arr.length);
        System.out.println();
        bubbleSort(arr, arr.length);
        System.out.println("Array after sorting : ");
        printArray(arr, arr.length);
    }

    private static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

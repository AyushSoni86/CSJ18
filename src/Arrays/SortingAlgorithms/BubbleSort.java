package Arrays.SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 10, 6, 3, 4, 5};
        System.out.println("Array before Sorting");
        PrintArray(arr, arr.length);
        System.out.println();
        Bubble_Sort(arr, arr.length);
        System.out.println("Array after sorting ");
        PrintArray(arr, arr.length);
    }

    static void PrintArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void Bubble_Sort(int[] arr, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            System.out.println("working on pass number " + (i + 1));

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

}

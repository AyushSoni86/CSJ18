package Arrays.SortingAlgorithms;

import java.util.Collection;

public class BubbleSortAdaptive {


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 10, 6, 3, 4, 5};
        System.out.println("Array before Sorting");
        PrintArray(arr, arr.length);
        System.out.println();
        Adaptive_Bubble_Sort(arr, arr.length);
        System.out.println("Array after sorting ");
        PrintArray(arr, arr.length);
    }

    static void PrintArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void Adaptive_Bubble_Sort(int[] arr, int n) {
        int temp;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            flag = true;
            System.out.println("working on pass number " + (i + 1));
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                return;
            }

        }
    }
}



package Arrays.SortingAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {23, 3, 5, 1, 154};
        System.out.println("Array before Sorting");
        PrintArray(arr, arr.length);
        System.out.println();
        Selection_Sort(arr, arr.length);
        System.out.println("Array after sorting ");
        PrintArray(arr, arr.length);
    }

    static void PrintArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void Selection_Sort(int[] arr, int n) {
        int IndexOfMin, temp;
        for (int i = 0; i < n - 1; i++) {
            IndexOfMin = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[IndexOfMin]) {
                    IndexOfMin = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[IndexOfMin];
            arr[IndexOfMin] = temp;
        }
    }
}


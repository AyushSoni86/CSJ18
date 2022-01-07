package Arrays.SortingAlgorithms;

public class QuickSort {
    static void PrintArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int Partitin(int a[], int low, int high) {
        int pivot = a[low];
        int i = low + 1;
        int j = high;
        int temp;

        do {
            while (a[i] <= pivot)
                i++;
            while (a[j] > pivot)
                j--;
            if (i < j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        } while (i < j);

        temp = a[low];
        a[low] = a[j];
        a[j] = temp;

        return j;
    }

    static void QuickSort(int a[], int low, int high) {
        int partitionIndex;
        if (low < high) {
            partitionIndex = Partitin(a, low, high);
            QuickSort(a, low, partitionIndex - 1);
            QuickSort(a, partitionIndex + 1, high);
        }

    }

    public static void main(String[] args) {
        int[] arr = {2,45,32,67,23,78,4,6,23,89,21,34,3,334};
        System.out.println("Array before Quick Sorting ");
        PrintArray(arr, arr.length);
        System.out.println();
        System.out.println("Array after Quick Sorting ");
        QuickSort(arr,0, arr.length-1);
        PrintArray(arr, arr.length);
    }
}

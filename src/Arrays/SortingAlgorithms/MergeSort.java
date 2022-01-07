package Arrays.SortingAlgorithms;

public class MergeSort {
    static void PrintArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void Merge(int a[], int low, int mid, int high) {
        int i, j, k;
        int b[] = new int[100];
        i = low;
        j = mid + 1;
        k = low;
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                b[k] = a[i];
                i++;
                k++;
            } else {
                b[k] = a[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            b[k] = a[i];
            k++;
            i++;
        }
        while (j <= mid) {
            b[k] = a[j];
            k++;
            j++;
        }
    }

    static void MergeSort(int[] a, int low, int high) {
        int mid;
        if (low < high) {
            mid = (low + high) / 2;
            MergeSort(a, low, mid);
            MergeSort(a, mid + 1, high);
            Merge(a, mid, low, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {23,45,1,67,3,78,324,87,124,12};
        System.out.println("Array before Quick Sorting ");
        PrintArray(arr, arr.length);
        System.out.println();
        System.out.println("Array after Quick Sorting ");
        MergeSort(arr,0, arr.length-1);
        PrintArray(arr, arr.length);
    }
}

package Arrays.SortingAlgorithms;

public class InsertionSort {
    static void printArray(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void insertionSort( int[] A,int n){
        int key, j;
        // Loop for passes
        for (int i = 0; i < n; i++)
        {
            key = A[i];
            j = i-1;
            // Loop for each pass
            while(j>=0 && A[j] > key){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {23,56,3,567,789,234,5,8,-76,231,67,612,345,786};
        System.out.println("Array before sort............");
        printArray(arr,arr.length);
        System.out.println();
        insertionSort(arr, arr.length);
        System.out.println("Array after sort............");
        printArray(arr,arr.length);
    }
}

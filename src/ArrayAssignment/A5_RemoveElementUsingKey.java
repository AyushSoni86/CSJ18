package ArrayAssignment;

public class A5_RemoveElementUsingKey {
    static void RemoveElement(int arr[] , int index){
        for (int i = index; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1]=0;
    }

    static void printArray(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ") ;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {23, 56, 34, 78, 98, 43, 21, 234, 45};
        printArray(arr, arr.length);
        RemoveElement(arr,5);
        printArray(arr, arr.length-1);
    }
}

package ArrayAssignment;

public class A6_CopyAnArray {
    static void CopyArray(int arr[], int[] arr2){
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];
        }
    }

    static void printArray(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
       int[] arr = {23, 56, 34, 78, 98, 43, 21, 234, 45};
       int[] arr2 = new int[arr.length];
       System.out.println("The first array is : ");
       printArray(arr);
        System.out.println();
       CopyArray(arr,arr2);
       System.out.println("The copied array is : ");
       printArray(arr2);
    }
}

package ArrayAssignment;

public class A2_SumOfElements {
    static void SumOfElements(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        System.out.println("The sum of elements of array is "+ sum);
    }

    public static void main(String[] args) {
        int[] arr = {23, 56, 34, 78, 98, 43, 21, 234, 45};
        SumOfElements(arr, arr.length);
    }
}

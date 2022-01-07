package ArrayAssignment;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, -23, 24, 5, -34, 8};
        int maxSum = maxSubArray(arr);
        System.out.println(maxSum);
    }

    static int maxSubArray(int[] arr) {
        int maxSum = 0;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}

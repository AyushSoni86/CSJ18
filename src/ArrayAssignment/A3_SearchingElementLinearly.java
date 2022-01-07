package ArrayAssignment;

public class A3_SearchingElementLinearly {
    static void linear_search(int[] arr, int n, int key) {
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                flag = true;
                index = i;
                break;
            }

        }
        System.out.println(key + " found at index " + index);

    }

    public static void main(String[] args) {
        int[] arr = {23, 56, 34, 78, 98, 43, 21, 234, 45};
        linear_search(arr, arr.length, 78);
    }
}

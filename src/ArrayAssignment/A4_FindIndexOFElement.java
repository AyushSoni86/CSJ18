package ArrayAssignment;

public class A4_FindIndexOFElement {
    static void IndexOf(int[] arr, int n, int key) {
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (key == arr[i]) {
                index = i;
                break;
            }
        }
        System.out.println(key + " is at index " + index);
    }

    public static void main(String[] args) {
        int[] arr = {23, 56, 34, 78, 98, 43, 21, 234, 45};
        int key = 98;
       IndexOf(arr, arr.length, key);
    }
}

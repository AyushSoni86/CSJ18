package ArrayAssignment;

public class A3_BinarySearch {


    public static void main(String[] args) {
        int[] arr = {12, 34, 567, 23, 6, 5, 234, 356};
        int key = 233;
        int low = 0;
        int high = arr.length - 1;
        int mid;
        boolean flag = false;
        mid = (low + high) / 2;
        while (low < high) {
            if (key < arr[mid]) {
                high = mid;
                mid = (low + high) / 2;
            } else if (key >arr[mid] ) {
                low = mid;
                mid = (low + high) / 2;
            } else if (arr[mid] == key) {
                flag = true;
                break;
            }
        }
        System.out.println((flag) ? key + " element found at index "+ mid : "element not found");
    }

}

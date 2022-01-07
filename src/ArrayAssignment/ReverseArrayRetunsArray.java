package ArrayAssignment;

public class ReverseArrayRetunsArray {
    public static void main(String[] args) {
//       reverseArray();
       printArray(reverseArray());
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        //  System.out.println(reverseArray());
    }

    static int[] reverseArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // two sums problem from leet code-->
        // target = 10, int[] index = { 3, 5 }
        // you have to return the index

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

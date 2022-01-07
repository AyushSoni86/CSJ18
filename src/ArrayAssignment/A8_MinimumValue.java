package ArrayAssignment;

public class A8_MinimumValue {
    static int minimumValue(int[] arr){
        int min  = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min ;
    }

    public static void main(String[] args) {
        int[] arr = {21,34,56,78,54,23,78,-867,45};
        System.out.println("Minimum element is " + minimumValue(arr));
    }
}

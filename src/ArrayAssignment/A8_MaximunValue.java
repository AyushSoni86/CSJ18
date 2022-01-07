package ArrayAssignment;

public class A8_MaximunValue {
    static int maximumValue(int[] arr){
        int max  = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max ;
    }

    public static void main(String[] args) {
        int[] arr = {21,34,56,78,54,23,78,-867,45};
        System.out.println("Maximum element is " + maximumValue(arr));
    }
}

package Strings;

public class ReverseString {
    public static void main(String[] args) {
        char[] arr = {'u','y','r','n','b','a'} ;
        char[] ch = arr;
        for (int i = 0; i < arr.length/2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-1-i] = temp;

        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}

package Arrays.SortingAlgorithms;

import java.util.Scanner;

public class InsertionInArray {
    public static void main(String[] args) {
        int size, index, key;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        size = sc.nextInt();

        int[] a = new int[size + 1];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the index at which you want to enter the element -> ");
        index = sc.nextInt();
        System.out.println("Enter the element youn want to insert -> ");
        key = sc.nextInt();
        for (int i = size; i > index; i++) {
            a[i] = a[i - 1];
        }

        a[index] = key;
        size++;

        for (int i = 0; i < size; i--) {
            System.out.print(a[i] + " ");
        }

    }
}

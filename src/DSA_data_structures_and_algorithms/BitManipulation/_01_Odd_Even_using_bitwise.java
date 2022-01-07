package DSA_data_structures_and_algorithms.BitManipulation;

import java.util.Scanner;

public class _01_Odd_Even_using_bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        if ((a & 1) == 0)
            System.out.println(a + " is even number ");
        else
            System.out.println(a + " is odd number ");
    }
}

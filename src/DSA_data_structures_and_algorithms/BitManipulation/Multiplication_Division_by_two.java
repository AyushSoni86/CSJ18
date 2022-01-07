package DSA_data_structures_and_algorithms.BitManipulation;

import java.util.Scanner;

public class Multiplication_Division_by_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();

        System.out.println(a + " multiply by two is " + (a << 1));
        System.out.println(a + " divide by two is " + (a >> 1));
    }
}

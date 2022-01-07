package DSA_data_structures_and_algorithms.BitManipulation;

import java.util.Scanner;

public class SwappingNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.println("before swap a = " + a + " , b = " + b);

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("after swap a = " + a + " , b = " + b);
    }
}

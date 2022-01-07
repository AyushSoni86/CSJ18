package DSA_data_structures_and_algorithms.Number_Theory_Algorithms;

import java.util.Scanner;

public class Trailing_zeroes_in_Factorial {
    static int Trailing_zeroes(int num) {
        int result = 0;
        for (int i = 5; i <= num; i = i * 5) {
            result = result + num / i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want the trailing zeroes : ");
        int number = sc.nextInt();
        System.out.println("The trailing zeroes present are : " + Trailing_zeroes(number));
    }
}

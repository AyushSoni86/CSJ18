package DSA_data_structures_and_algorithms.Number_Theory_Algorithms;

import java.util.Scanner;

public class Palindrome_number {

    public static boolean isPalindrome(int num) {
        int sum = 0;
        int digit = 0;
        int temp = num;
        while (num > 0) {
            digit = num % 10;
            sum = sum * 10 + digit;
            num = num / 10;
        }
        if (temp == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();
        System.out.println((isPalindrome(number) ? "Number is palindrome " : "Not a palindrome "));
    }
}

package DSA_data_structures_and_algorithms.Number_Theory_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve_of_Eratosthenes {
    static boolean[] sieve_of_Eratosthenes(int n) {
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        boolean isPrime[] = sieve_of_Eratosthenes(number);
        for (int i = 0; i <= number; i++) {
            System.out.println(i + " " + isPrime[i]);
        }
    }
}

package PatternProblems;

import java.util.Scanner;

public class PatternProblem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 0;
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int c = n * 2 - 1;
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= c; j++) {
                if (j == i || j == c - i + 1) {
                    System.out.print((k < n) ? n - k - 1 + " " : k - n + 1 + " ");
                } else {
                    System.out.print("  ");
                }
            }
            k++;
            System.out.println();
        }
    }
}

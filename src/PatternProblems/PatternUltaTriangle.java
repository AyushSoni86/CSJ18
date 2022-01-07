package PatternProblems;

import java.util.Scanner;

public class PatternUltaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(n - i + " ");
            }
            System.out.println();
        }
    }
}

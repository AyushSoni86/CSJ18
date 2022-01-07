package PatternProblems;

import java.util.Scanner;

public class PlusPattern {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter any` odd number : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j==n/2 || i==n/2){
                    System.out.print("+ ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}

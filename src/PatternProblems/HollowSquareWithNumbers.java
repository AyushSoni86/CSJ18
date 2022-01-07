package PatternProblems;

import java.util.Scanner;

public class HollowSquareWithNumbers {
    public static void main(String[] args) {
        int a = 1 ;
        System.out.println("Enter the value of : ");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i==0 || j==0 || i==n || j==n){
                    System.out.print("*  ");
                }
                else{
                    System.out.print(""+a+"  ");
                    a++;
                }
            }
            System.out.println();
        }
    }
}

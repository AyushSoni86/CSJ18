package Test_Code;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print((Magic_Number(i))? i+" " : "");
//            System.out.print("");
        }
    }
    static Boolean Magic_Number(int num){
        int sum = 0 ;
        int n = num ;
        int digit  = 0;
        while(num > 9){
            while(num > 0){
                digit = num % 10 ;
                sum += digit*digit;
                num = num / 10 ;
            }
            num  = sum ;
            sum = 0;
        }
        if (num == 1)
            return true ;
        else
            return false;
//        System.out.println((num == 1)?"YES" : "NO");
    }
}

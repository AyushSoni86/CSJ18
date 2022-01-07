package CST_Demo_codes;

import java.util.Scanner;

public class DistinctionClass {
    public static void main(String[] args) {
        int English = 80;
        int Hindi = 70;
        int Maths = 60;

        if (English >= 60 && English < 70) {
            System.out.println("English passed with first class ");
        } else if (English > 70) {
            System.out.println("English passed with Distinction");
        }

        if (Hindi >= 60 && Hindi < 70) {
            System.out.println("Hindi passed with first class ");
        } else if (Hindi >= 70) {
            System.out.println("Hindi passed with Distinction");
        }

        if (Maths >= 60 && Maths < 70) {
            System.out.println("Maths passed with first class ");
        } else if (Maths >= 70) {
            System.out.println("Maths passed with Distinction");
        }
    }
}

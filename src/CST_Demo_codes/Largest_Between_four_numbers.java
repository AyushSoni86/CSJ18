package CST_Demo_codes;

public class Largest_Between_four_numbers {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30, d = 10;
        if (a > b && a > c && a > d) {
            System.out.println("a = " + a + " is the largest number");
        } else if (b > a && b > c && b > d) {
            System.out.println("b = " + b + " is the largest number");
        } else if (c > b && c > a && c > d) {
            System.out.println("c = " + c + " is the largest number");
        } else {
            System.out.println("d = " + d + " is the largest number ");
        }
    }
}

package Strings;

public class PalindromeString {
    public static void main(String[] args) {
        char[ ] ch = {'a','b','c','d','c','b','a'};
        char[] rev = new char[ch.length];
        for (int i = 0; i < ch.length/2; i++) {
            char temp = ch[i];
            ch[i]= ch[ch.length-1-i];
            ch[ch.length-1-i]= temp;
        }
    }
}

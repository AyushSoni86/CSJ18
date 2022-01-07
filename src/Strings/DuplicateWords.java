package Strings;

import java.util.Locale;

public class DuplicateWords {
    public static void main(String[] args) {
        String string = "hello world hello world";
        int count = 0;
        string = string.toLowerCase();

//        String s = ;
        String[] words = string.split(" ");
        System.out.println("Duplicate words are : ");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j]="0";
                }
            }
            if (words[i]!= "0" && count >0){
                System.out.print(  words[i]+ ", ");
            }
        }
    }
}

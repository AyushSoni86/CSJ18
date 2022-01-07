package Strings;

public class StringImmutability {
    public static void main(String[] args) {
//        String s1 = new String("Ayush");
//        s1 = "Soni";
//        s1 = new String("Hello");
//        s1 = s1.concat(" World");
//        System.out.println(s1);
        String str = "Knowledge ";
        String s = str;
        str = str.concat("base");
//        System.out.println(str);
        String s1 = "java ";
        s1= s1.concat("rules");
        System.out.println("S1 refers to " + s1);

    }
}

package Strings;

public class DuplicateOfStrings {
    public static void main(String[] args) {
        char[] ch = {'a','d','h','r','t','y','b','n'};
        char key = '/';
        boolean flag  = false ;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]==key){
                flag = true;
                break;
            }
        }
        System.out.println((flag)?" Duplicate Found " : " Duplicate not Found ");
    }
}

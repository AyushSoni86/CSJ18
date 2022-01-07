package Strings;

public class OnlyNumbers {
    static boolean OnlyNumbers(String str, int n){
        for (int i = 0; i < n ; i++) {
            if (str.charAt(i)>='0' && str.charAt(i)<='9'){
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "12345678";
        System.out.println(OnlyNumbers(str,str.length()));
    }
}

package ArrayAssignment;

public class A1_String_sort {

    static void printString(char[] ch, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(ch[i] + " ");
        }
        System.out.println();
    }
    static void string_sort(char[] ch, int n){
        for (int i = 0; i < n; i++) {
            for (int  j = i+1; j < n; j++) {
                if (ch[j] < ch[i]){
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String string = "BJSDAyushlalchadnsomni";
        char[] ch = string.toCharArray();
        int length = ch.length;
        System.out.println("String before sorting : ");
        printString(ch,length);
        System.out.println();
        string_sort(ch,length);
        System.out.println("String after sorting : ");
        printString(ch,length);
    }
}

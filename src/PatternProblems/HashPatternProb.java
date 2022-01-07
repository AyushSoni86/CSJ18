package PatternProblems;

public class HashPatternProb {
    public static void main(String[] args) {
        System.out.println(printPattern());
    }
    static int printPattern(){
        try{
            return 1;
        }
        catch(Exception  e) {
            return 2;
        }
        finally{
            return 3;
        }
    }
}

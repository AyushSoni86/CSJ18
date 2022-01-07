package TestCasesPrograms;

import java.util.Stack;

public class  ParenthesisMatching {
    static String isBalanced(String s) {
        if (null == s) {
            return "";
        }
        Stack<Character> bracketStack = new Stack<>();

        int length = s.length();

        if (length < 2 || length > 1000) {
            return "Error";
        }

        for (int i = 0; i < length; i++) {
            Character c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{'){
                bracketStack.push(c);
            }
            else{
                if (!bracketStack.isEmpty()){
                    char cPop = bracketStack.pop();

                    if (c == ']' && cPop!= '['){
                        return "Error";
                    }
                    if (c == ')' && cPop!= '('){
                        return "Error";
                    }
                    if (c == '}' && cPop!= '{'){
                        return "Error";
                    }

                }
                else{
                    return "Error";
                }
            }
        }
        if(bracketStack.isEmpty()){
            return "Parenthesis Match Successfully";
        }
        else{
            return "Error";
        }
    }

    public static void main(String[] args) {
        String str = "{([{([])}])}";


        System.out.println(isBalanced(str));
    }
}

package Stacks;
import java.util.Stack;

public class prefixToInfix {
    public static void main(String[] args) {
        String prefix = "-9/*+5348";   // Infix is : (9-(((5+3)*4)/8))
        System.out.println("Prefix is : " + prefix);
        int n = prefix.length();
        Stack<String> val = new Stack<>();
        for(int i = n-1; i >= 0; i--) {
            char ch = prefix.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57) {
                val.push(ch+"");
            }else{
                String v1 = val.pop();
                String v2 = val.pop();
                char ope = ch;
                // v1 ope v2
                String t = "(" + v1 + ope + v2 + ")";
                val.push(t);
            }
        }
        System.out.println("Infix is : "+val.peek());
    }
}

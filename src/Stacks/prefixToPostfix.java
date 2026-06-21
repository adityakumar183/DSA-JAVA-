package Stacks;
import java.util.Stack;

public class prefixToPostfix {
    public static void main(String[] args) {
        String prefix = "-9/*+5348";   // Postfix is : 953+4*8/-
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
                // v1 v2 ope
                String t = v1 + v2 + ope;
                val.push(t);
            }
        }
        System.out.println("Postfix is : "+val.peek());
    }
}

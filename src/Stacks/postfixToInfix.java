package Stacks;

import java.util.Stack;

public class postfixToInfix {
    public static void main(String[] args) {
        String postfix = "953+4*8/-";   // Infix is : (9-(((5+3)*4)/8))
        System.out.println("Postfix is : " + postfix);
        Stack<String> val = new Stack<>();
        for(int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57) {
                val.push(ch+"");
            }else{
                String v2 = val.pop();
                String v1 = val.pop();
                char ope = ch;
                // v1 ope v2
                String t = "(" + v1 + ope + v2 + ")";
                val.push(t);
            }
        }
        System.out.println("Infix is : "+val.peek());
    }
}

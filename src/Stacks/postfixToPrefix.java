package Stacks;
import java.util.Stack;

public class postfixToPrefix {
    public static void main(String[] args) {
        String postfix = "953+4*8/-";   // Prefix is : -9/*+5348
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
                // v1 v2 ope
                String t = ope + v1 + v2;
                val.push(t);
            }
        }
        System.out.println("Prefix is : "+val.peek());
    }
}

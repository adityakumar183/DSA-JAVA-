package Stacks;

import java.util.Stack;

public class pushOperation {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());

        System.out.println("size of stack is : " + st.size());
        System.out.println(st);
        st.push(1);
        System.out.println("size of stack is : " + st.size());
        System.out.println(st);
        st.push(23);
        System.out.println("size of stack is : " + st.size());
        System.out.println(st);
        st.push(95);
        System.out.println("size of stack is : " + st.size());
        System.out.println(st);
        st.push(45);
        System.out.println("size of stack is : " + st.size());
        System.out.println(st);
        st.push(65);
        System.out.println("size of stack is : " + st.size());
        System.out.println(st);

        System.out.println(st.isEmpty());
    }
}

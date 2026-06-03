package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class moveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.print("Stack is : ");
        System.out.println(st);

        // reverse order
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
//            int x = st.peek();
//            rt.push(x);
//            st.pop();
            rt.push(st.pop());
        }
        System.out.print("Reverse Stack is : ");
        System.out.println(rt);

        // copy stack
        Stack<Integer> ct = new Stack<>();
        while(rt.size()>0){
            ct.push(rt.pop());
        }
        System.out.print("Copy Stack is : ");
        System.out.println(ct);
    }
}


// time complexity for copy stack is   O(2n) ~ O(n)
// time Complexity of reverse the element in same stack is  O(3n) ~ O(n)
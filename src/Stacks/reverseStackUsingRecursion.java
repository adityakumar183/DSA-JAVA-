package Stacks;
import java.util.Stack;

public class reverseStackUsingRecursion {
    public static void displayReverse(Stack<Integer> st){
        if(st.size()==0) return;
        int top =st.pop();
        System.out.print(top+" ");
        displayReverse(st);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayReverse(st);
    }
}

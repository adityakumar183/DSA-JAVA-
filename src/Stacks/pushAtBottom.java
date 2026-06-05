package Stacks;
import java.util.Stack;

public class pushAtBottom {
    public static void pushBottom(Stack<Integer> st, int x) {
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushBottom(st,x);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("original stack is : " + st);
        pushBottom(st,6);
        System.out.println("After pushing 6 at bottom , stack is : " + st);
    }
}

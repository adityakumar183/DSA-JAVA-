package Stacks;
import java.util.Stack;

public class basicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        // push operation :-
        st.push(1);
        st.push(23);
        st.push(34);
        st.push(56);
        st.push(78);

        // peek operation:-
        System.out.println(st.peek());
        System.out.println(st);

        // pop operation:-
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);

        // size of stack:-
        System.out.println("size is " + st.size());

        // print 1st element:-
        while(st.size() > 1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
    }
}


// time complexity is O(n) for all the operation in stack

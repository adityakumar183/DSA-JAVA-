package Stacks;
import java.util.Stack;

public class removeFromStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

//        // remove from bottom:-
//        Stack<Integer> temp = new Stack<>();
//        while(st.size()>1){
//            temp.push(st.pop());
//        }
//        st.pop();
//        while(temp.size()>0){
//            st.push(temp.pop());
//        }
//        System.out.println(st);

        // remove from any idx:
        Stack<Integer> temp2 = new Stack<>();
        int idx = 3;
        while(st.size()>idx){
            temp2.push(st.pop());
        }
        st.pop();
        while(temp2.size()>0){
            st.push(temp2.pop());
        }
        System.out.println(st);
    }
}

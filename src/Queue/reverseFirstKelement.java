package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseFirstKelement {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        int k = 3;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);

        Stack<Integer> st = new Stack<>();
        for(int i=0;i<k;i++){
            st.push(q.poll());
        }

        while(st.size()>0){
            q.add(st.pop());
        }

        for(int i=0;i<q.size()-k;i++){
            q.add(q.poll());
        }
        System.out.println(q);
    }
}

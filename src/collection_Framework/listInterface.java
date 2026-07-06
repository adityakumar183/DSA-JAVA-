package collection_Framework;
import java.util.*;

public class listInterface {
    public static void ArrayListExample(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l);   // 1 2 3 4 5
        System.out.println(l.get(1));    // 0-based indexing => 2
        l.set(1, 6);
        System.out.println(l);  // 1 6 3 4 5
        System.out.println(l.contains(6));   // true
    }

    public static void LinkedListExample(){
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l);   // [1, 2, 3, 4, 5]
        System.out.println(l.contains(4));    // true
    }

    public static void stackExample(){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);           // [1, 2, 3, 4, 5]
        st.pop();
        System.out.println(st);           // [1, 2, 3, 4]
        System.out.println(st.peek());    // 4
        System.out.println(st.size());    //  4
        System.out.println(st.isEmpty());   // false
    }

    public static void main(String[] args) {
        ArrayListExample();
        LinkedListExample();
        stackExample();
    }
}

package Queue;


import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        // add, remove, peek
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);
        dq.addFirst(6);
        System.out.println(dq);  // [6, 1, 2, 3, 4, 5]
        dq.removeFirst();
        System.out.println(dq);  // [1, 2, 3, 4, 5]
        dq.removeLast();
        System.out.println(dq);  //  [1, 2, 3, 4]
        System.out.println(dq.getFirst());  // 1
        System.out.println(dq.getLast());  // 4

        dq.addLast(5);
        System.out.println(dq);  // [1, 2, 3, 4, 5]

        dq.add(7);  // add means addLast in deque
        System.out.println(dq);// [1, 2, 3, 4, 5, 7]

        dq.remove();  // remove means removeFirst in deque
        System.out.println(dq);  // [2, 3, 4, 5, 7]

     //   dq.removeAll(dq);  // remove everything
        System.out.println(dq);  // []

        dq.addLast(3);
        System.out.println(dq);  // [2, 3, 4, 5, 7, 3]

    //     dq.removeFirstOccurrence(3);
        System.out.println(dq);     // [2, 4, 5, 7, 3]

        dq.removeLastOccurrence(3);
        System.out.println(dq);   // [2, 3, 4, 5, 7]
    }
}

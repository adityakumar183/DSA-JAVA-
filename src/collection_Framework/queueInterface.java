package collection_Framework;
import java.util.*;

public class queueInterface {
    public static void queueExample(){
        LinkedList<Integer> q = new LinkedList<Integer>();
        q.offer(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);    // [1, 2, 3, 4, 5]
        q.remove();     // throw exception when queue is empty
        q.poll();
        System.out.println(q);    // [3, 4, 5]
        System.out.println(q.element()); // 3    throw exception when queue is empty
        System.out.println(q.peek());    // 3
        System.out.println(q.isEmpty());   // false
    }

    public static void priorityQueueExample(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();   // by-default Min pq
      //  PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());      // MAX pq
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek());   // 5
        System.out.println(pq);   // [5, 10, 7]   (topmost priority ele will be processed first)
        System.out.println(pq.poll());   // 5
        System.out.println(pq);
        System.out.println(pq.poll());   // 7
    }

    public static void DequeExample(){
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(10);
        dq.addFirst(5);
        dq.addLast(7);
        dq.addLast(8);
        System.out.println(dq);  // [5, 10, 7, 8]
        System.out.println(dq.pollLast());   // 8
        System.out.println(dq.pollFirst());    // 5
        System.out.println(dq);     // [10, 7]
    }
    public static void main(String[] args) {
        queueExample();
        priorityQueueExample();
        DequeExample();
    }
}

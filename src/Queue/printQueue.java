package Queue;
import java.util.ArrayDeque;
import java.util.Queue;

public class printQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // rear <- 5 4 3 2 1 -> front

        Queue<Integer> temp = new ArrayDeque<>();
        while(q.size()>0){
            System.out.print(q.peek()+" ");
            temp.add(q.poll());
        }
        while(temp.size()>0){
            q.add(temp.poll());
        }
    }
}

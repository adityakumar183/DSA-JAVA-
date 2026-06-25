package Queue;
import java.util.ArrayDeque;
import java.util.Queue;


public class basicSTL {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();    // queue initialize
//        Queue<Integer> q1 = new LinkedList<>();    // queue ko linkedlist se v initialize kar sakte hai
        q.add(1);     // stack me push hota tha isme add hoga
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.remove();      // stack me pop hota tha isme remove or poll hoga
        System.out.println(q);
        q.poll();    // ye v element ko remove karta hai
        System.out.println(q);
        System.out.println(q.element());  //    stack me peek hota tha isme peek or element hota hai
        System.out.println(q.peek());
        System.out.println(q.size());   // size operation dono me same work karta hai
    }
}


/*
// Stack me push(), pop() or peek() teen basic operation hote the
// Queue me v add(), remove() or peek() teen basic operations honge
                        |          |
                     poll()    element()

 */
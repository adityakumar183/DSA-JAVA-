package Linkedlist;

public class ShallowCopyOfANode {
    public static void displayrecursive(Node head) {
        if (head == null) return;         // base case
        System.out.println(head.val);    // self work
        displayrecursive(head.next);    // recursive work
    }

    public static void main(String[] args) {
//        Node a = new Node(100);
//        System.out.println(a.val);
//        Node temp = a;         // shallow copy
//        // Node temp = new Node(100);  // deep copy
//        System.out.println(temp.val);
//
//        temp.val = 12;
//        System.out.println(a.val);

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        displayrecursive(a);

//        // traversing in linked list:->
//        Node temp = a;
//        while(temp!= null){
//            System.out.println(temp.val);
//            temp = temp.next;
//        }
    }

}

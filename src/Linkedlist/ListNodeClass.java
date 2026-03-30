package Linkedlist;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

public class ListNodeClass {
    public static void main(String[] args) {
        Node a = new Node(10);  // head
        System.out.println(a);                // Linkedlist.Node@8efb846

        Node b = new Node(20);
        System.out.println(b.next);          // null

        Node c = new Node(30);
        System.out.println(c.val);        // 30

        a.next = b;                   // linking => a->b

        System.out.println(b);          // Linkedlist.Node@2a84aee7
        System.out.println(a.next);     // Linkedlist.Node@2a84aee7 (both are same)


        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);
        d.next = e;     // 40->50
        e.next = f;    // 40->50->60
        f.next = g;   // 40->50->60->70

        System.out.println(d.val);
        System.out.println(d.next.val);
        System.out.println(d.next.next.val);
        System.out.println(d.next.next.next.val);
    }
}

package LeetCode;

public class flattenAMultilevelDoublyLinkedList_430 {
    public static Node flatten(Node head) {
        Node temp = head;
        while(temp!=null){
            Node t = temp.next;
            if(temp.child != null){
                Node c = flatten(temp.child);
                temp.next = c;
                c.prev = temp;
                while(c.next != null){
                    c = c.next;
                }
                c.next = t;
                if(t!=null) t.prev = c;
            }
            temp.child = null;
            temp = t;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;

        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;

        head.next.next.next.next = new Node(5);
        head.next.next.next.next.prev = head.next.next.next;

        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.prev = head.next.next.next.next;

        // Child list for node 3
        Node c7 = new Node(7);
        Node c8 = new Node(8);
        Node c9 = new Node(9);
        Node c10 = new Node(10);
        c7.next = c8; c8.prev = c7;
        c8.next = c9; c9.prev = c8;
        c9.next = c10; c10.prev = c9;
        head.next.next.child = c7; // node 3 → child 7

        // Child list for node 8
        Node c11 = new Node(11);
        Node c12 = new Node(12);
        c11.next = c12; c12.prev = c11;
        c8.child = c11; // node 8 → child 11

        // Flatten the list
        Node flatHead = flatten(head);

        // Print flattened list
        Node curr = flatHead;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}

package LeetCode;
class Node {
    int val;
    Node next;
    Node random;
    Node child;
    Node prev;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class copyListWithRandomPointer_138 {
    public static Node deepCopy(Node head){
        Node head2 = new Node(head.val);
        Node t1 = head.next;
        Node t2 = head2;
        while(t1!=null){
            Node temp = new Node(t1.val);
            t2.next = temp;
            t2 = t2.next;
            t1 = t1.next;
        }
        return head2;
    }
    public static void connectAlternatively(Node head, Node head2){
        Node t1 = head;
        Node t2 = head2;
        Node dummy = new Node(-1);
        Node t = dummy;
        while(t1!=null && t2!=null){
            t.next = t1;
            t1 = t1.next;
            t = t.next;
            t.next = t2;
            t2 = t2.next;
            t = t.next;
        }
    }
    public static void assignRandom(Node head, Node head2){
        Node t1 = head;
        Node t2 = head2;
        while(t1!=null){
            t2 = t1.next;
            if(t1.random!=null) t2.random = t1.random.next;
            t1 = t1.next.next;
        }
    }
    public static void split(Node head, Node head2){
        Node t1 = head;
        Node t2 = head2;
        while(t1!=null){
            t1.next = t2.next;
            t1 = t1.next;
            if(t1==null) break;
            t2.next = t1.next;
            t2 = t2.next;
        }
    }

    public static Node copyRandomList(Node head) {
        if(head==null) return null;
        // step 1 : Create deep copy
        Node head2 = deepCopy(head);
        // step 2 : Join head and head2 alternatively
        connectAlternatively(head,head2);
        // step 3 : Assign random pointer
        assignRandom(head,head2);
        // step 4 : Split the Linked List
        split(head,head2);

        return head2;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            int randomVal = (curr.random != null) ? curr.random.val : -1;
            System.out.println("Node: " + curr.val + ", Random: " + randomVal);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(7);
        head.next = new Node(13);
        head.next.next = new Node(11);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(1);

        // Assign random pointers
        head.random = null;
        head.next.random = head;                        // 13 → 7
        head.next.next.random = head.next.next.next.next; // 11 → 1
        head.next.next.next.random = head.next.next;    // 10 → 11
        head.next.next.next.next.random = head;         // 1 → 7

        Node CopiedHead = copyRandomList(head);
        System.out.println("Original List:");
        printList(head);
        System.out.println("Copied List:");
        printList(CopiedHead);
    }
}
